package Tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TestGoogle {

    WebDriver driver;
    By textBox = By.name("q");
    By botonSearch = By.name("btnk");

    @BeforeEach
    public void setUp() {

        System.setProperty("webdriver.chrome.driver",".\\src\\test\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com/");
    }
    @Test
    public void search() throws InterruptedException {
        driver.quit();
    }

}