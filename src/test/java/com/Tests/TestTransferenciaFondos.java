package com.Tests;


import com.Pages.TransferenciaFondos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestTransferenciaFondos {
    WebDriver driver;
    TransferenciaFondos TransferenciaFondos;



    @BeforeEach
    public void setUp (){
        TransferenciaFondos = new TransferenciaFondos(driver);
        driver = TransferenciaFondos.chromeDriverConnection();
        TransferenciaFondos.link("https://parabank.parasoft.com/parabank/index.htm");


    }
//    @AfterEach
//    public void tearDown (){
//        driver.quit();
//    }
    @Test
    @Tag("EjecucionRegresion")
    public void Test01(){

        TransferenciaFondos.register();
    }




}
