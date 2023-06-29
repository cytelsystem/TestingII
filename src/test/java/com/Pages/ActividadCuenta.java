package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActividadCuenta extends BasePage {
    By TestUserName = By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input");
    By TestPassword = By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input");
    By LoginIn = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");

    By BtnAccountOverview = By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a");
    By resultadoOk = By.xpath("//*[@id=\"rightPanel\"]/div/div/p[1]"); // *Balance includes deposits that may be subject to holds
    By BtnAccount2 = By.xpath("//*[@id=\"accountTable\"]/tbody/tr[2]/td[1]/a");
    By resultadoOk2 = By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/h1"); // Account Details

    By BtnPeriodo1 = By.xpath("//*[@id=\"month\"]");
    By BtnPeriodo2 = By.xpath("//*[@id=\"month\"]/option[1]");
    By BtnPeriodo3 = By.xpath("//*[@id=\"transactionType\"]");
    By BtnPeriodo4 = By.xpath("//*[@id=\"transactionType\"]/option[1]");
    By BtnPeriodo5 = By.xpath("//*[@id=\"rightPanel\"]/div/div[2]/form/table/tbody/tr[3]/td[2]/font/font/input");


    public ActividadCuenta(WebDriver driver) {
        super();
    }


    public void register(){
        teclear("hectorjm11111",TestUserName);
        teclear("123456711111",TestPassword);
        oprimir(LoginIn);
        oprimir(BtnAccountOverview);
        esperaExplicta(5,resultadoOk,"*Balance includes deposits that may be subject to holds");
        comparar(resultadoOk,"*Balance includes deposits that may be subject to holds");
        oprimir(BtnAccount2);
        esperaExplicta(5,resultadoOk2,"Account Details");
        comparar(resultadoOk2,"Account Details");
        oprimir(BtnPeriodo1);
        oprimir(BtnPeriodo2);
        oprimir(BtnPeriodo3);
        oprimir(BtnPeriodo4);
        oprimir(BtnPeriodo5);
    }

}
