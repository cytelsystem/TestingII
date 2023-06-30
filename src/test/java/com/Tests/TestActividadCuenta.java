package com.Tests;


import com.Pages.ActividadCuenta;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestActividadCuenta {
    WebDriver driver;
    ActividadCuenta ActividadCuenta;



    @BeforeEach
    public void setUp (){
        ActividadCuenta = new ActividadCuenta(driver);
        driver = ActividadCuenta.chromeDriverConnection();
        ActividadCuenta.link("https://parabank.parasoft.com/parabank/index.htm");


    }
    @AfterEach
    public void tearDown (){
        driver.quit();
    }
    @Test
    @Tag("EjecucionRegresion")
    public void Test01() throws InterruptedException {

        ActividadCuenta.register();
    }




}
