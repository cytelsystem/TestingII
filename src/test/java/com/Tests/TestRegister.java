package com.Tests;

import com.Pages.PageRegister;
import com.Reports.reports;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

public class TestRegister {
    WebDriver driver;
    PageRegister pageRegister;
    public ExtentReports report;
    public ExtentTest test;

    @BeforeEach
    public void setUp (){
        pageRegister = new PageRegister(driver);
        driver = pageRegister.chromeDriverConnection();
        pageRegister.link("http://testing.ctd.academy/");
        report = reports.getIntance();
    }
    @AfterEach
    public void tearDown (){
        report.endTest(test);
        report.flush();
        driver.quit();
    }
    @Test
    @Tag("EjecucionRegresion")
    public void Test01(){
        test = report.startTest("Registro correcto");
        test.log(LogStatus.INFO,"Se inicia test");
        pageRegister.register();
        test.log(LogStatus.PASS, "Test Finalizado Correctamente");
    }
    @Test
    @Tag("EjecucionRegresion")
    public void Test02(){
        test = report.startTest("Registro con correo ya registrado");
        test.log(LogStatus.INFO,"Se inicia test");
        pageRegister.registerFail();
        test.log(LogStatus.PASS, "Test Finalizado Correctamente");
    }
}
