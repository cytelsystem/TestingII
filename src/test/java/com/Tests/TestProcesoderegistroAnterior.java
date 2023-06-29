package com.Tests;


import com.Pages.ProcesoderegistroAnterior;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestProcesoderegistroAnterior {
    WebDriver driver;
    ProcesoderegistroAnterior procesoderegistro;


    @BeforeEach
    public void setUp (){
        procesoderegistro = new ProcesoderegistroAnterior(driver);
        driver = procesoderegistro.chromeDriverConnection();
        procesoderegistro.link("http://opencart.abstracta.us/index.php?route=common/home");
    }
    @AfterEach
    public void tearDown (){
        driver.quit();
    }
    @Test
    @Tag("EjecucionRegresion")
    public void Test01(){
        procesoderegistro.register();
    }
    @Test
    @Tag("EjecucionRegresion")
    public void Test02(){
        procesoderegistro.registerFail();
    }
}
