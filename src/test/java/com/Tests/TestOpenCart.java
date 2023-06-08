package com.Tests;

import com.Pages.PageOpenCart;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

public class TestOpenCart {
    WebDriver driver;
    PageOpenCart pageOpenCart;
    public ExtentReports report;
    public ExtentTest test;

    @BeforeEach
    public void setUp (){
        pageOpenCart = new PageOpenCart(driver);
        driver = pageOpenCart.chromeDriverConnection();
        pageOpenCart.link("https://opencart.abstracta.us/");
    }
    @AfterEach
    public void tearDown (){
        driver.quit();
    }
    @Test
    public void Test01(){
        pageOpenCart.registerOpenCart();
    }
}
