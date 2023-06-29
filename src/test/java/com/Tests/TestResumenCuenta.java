package com.Tests;


import com.Pages.ResumenCuenta;
import com.Pages.Procesoderegistro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestResumenCuenta {
    WebDriver driver;
    ResumenCuenta ResumenCuenta;



    @BeforeEach
    public void setUp (){
        ResumenCuenta = new ResumenCuenta(driver);
        driver = ResumenCuenta.chromeDriverConnection();
        ResumenCuenta.link("https://parabank.parasoft.com/parabank/index.htm");


    }
//    @AfterEach
//    public void tearDown (){
//        driver.quit();
//    }
    @Test
    @Tag("EjecucionRegresion")
    public void Test01(){

        ResumenCuenta.register();
    }




}
