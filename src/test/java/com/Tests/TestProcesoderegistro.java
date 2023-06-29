package com.Tests;


import com.Pages.Procesoderegistro;
import com.Pages.ProcesoderegistroAnterior;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestProcesoderegistro {
    WebDriver driver;
    Procesoderegistro procesoderegistro;


    @BeforeEach
    public void setUp (){
        procesoderegistro = new Procesoderegistro(driver);
        driver = procesoderegistro.chromeDriverConnection();
        procesoderegistro.link("https://parabank.parasoft.com/parabank/index.htm");

    }
//    @AfterEach
//    public void tearDown (){
//        driver.quit();
//    }
    @Test
    @Tag("EjecucionRegresion")
    public void Test01(){

        procesoderegistro.register();
    }




}
