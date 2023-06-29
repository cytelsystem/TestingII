package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResumenCuenta extends BasePage {
    By TestUserName = By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input");
    By TestPassword = By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input");
    By LoginIn = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");

    By BtnAccountOverview = By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a");
    By resultadoOk = By.xpath("//*[@id=\"rightPanel\"]/div/div/p[1]"); // *Balance includes deposits that may be subject to holds

    public ResumenCuenta(WebDriver driver) {
        super();
    }


    public void register(){
        teclear("hectorjm11111",TestUserName);
        teclear("123456711111",TestPassword);
        oprimir(LoginIn);
        oprimir(BtnAccountOverview);
        esperaExplicta(5,resultadoOk,"*Balance includes deposits that may be subject to holds");
        comparar(resultadoOk,"*Balance includes deposits that may be subject to holds");
    }

}
