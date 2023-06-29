package com.Tests;


import com.Pages.Procesoderegistro;
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
