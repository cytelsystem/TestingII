package com.Tests;


import com.Pages.Procesoderegistro;
import com.Reports.reports;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestProcesoderegistro {
    WebDriver driver;
    Procesoderegistro procesoderegistro;
    public ExtentReports report;
    public ExtentTest test;

    @BeforeEach
    public void setUp (){
        procesoderegistro = new Procesoderegistro(driver);
        driver = procesoderegistro.chromeDriverConnection();
        procesoderegistro.link("http://opencart.abstracta.us/index.php?route=common/home");
        report = reports.getIntance();
    }
    @AfterEach
    public void tearDown (){
        report.endTest(test);
        report.flush();
//        driver.quit();
    }
    @Test
    @Tag("EjecucionRegresion")
    public void Test01(){
        test = report.startTest("Registro correcto");
        test.log(LogStatus.INFO,"Se inicia test");
        procesoderegistro.register();
        test.log(LogStatus.PASS, "Test Finalizado Correctamente");
    }
    @Test
    @Tag("EjecucionRegresion")
    public void Test02(){
        test = report.startTest("Registro con correo ya registrado");
        test.log(LogStatus.INFO,"Se inicia test");
        procesoderegistro.registerFail();
        test.log(LogStatus.PASS, "Test Finalizado Correctamente");
    }
}
