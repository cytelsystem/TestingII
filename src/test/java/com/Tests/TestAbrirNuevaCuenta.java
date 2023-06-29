package com.Tests;


import com.Pages.AbrirNuevaCuenta;
import com.Pages.Procesoderegistro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestAbrirNuevaCuenta {
    WebDriver driver;
    AbrirNuevaCuenta AbrirNuevaCuenta;

    Procesoderegistro procesoderegistro;


    @BeforeEach
    public void setUp (){
        AbrirNuevaCuenta = new AbrirNuevaCuenta(driver);
        driver = AbrirNuevaCuenta.chromeDriverConnection();
        AbrirNuevaCuenta.link("https://parabank.parasoft.com/parabank/index.htm");


    }
//    @AfterEach
//    public void tearDown (){
//        driver.quit();
//    }
    @Test
    @Tag("EjecucionRegresion")
    public void Test01(){

        AbrirNuevaCuenta.register();
    }




}
