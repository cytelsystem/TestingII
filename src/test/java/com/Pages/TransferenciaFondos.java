package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferenciaFondos extends BasePage {
    By TestUserName = By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input");
    By TestPassword = By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input");
    By LoginIn = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");

    By BtnTransferFounds = By.xpath("//*[@id=\"leftPanel\"]/ul/li[3]/a");

    By resultadoOk1 = By.xpath("//*[@id=\"rightPanel\"]/div/div/h1"); // Transfer Funds

    By Monto = By.xpath("//*[@id=\"amount\"]");
    By Cta1 = By.xpath("//*[@id=\"fromAccountId\"]/option[1]");
    By Cta2 = By.xpath("//*[@id=\"fromAccountId\"]/option[2]");

    By BtnTransfer = By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[2]/font/font/input");

    By resultadoOk = By.xpath("//*[@id=\"rightPanel\"]/div/div/h1"); // Transfer Complete!


    public TransferenciaFondos(WebDriver driver) {
        super();
    }


    public void register(){
        teclear("hectorjm11111",TestUserName);
        teclear("123456711111",TestPassword);
        oprimir(LoginIn);
        oprimir(BtnTransferFounds);
        esperaExplicta(5,resultadoOk1,"Transfer Funds");
        comparar(resultadoOk1,"Transfer Funds");
        teclear("50000",Monto);
        oprimir(Cta1);
        oprimir(Cta2);
        oprimir(BtnTransfer);

        esperaExplicta(5,resultadoOk,"Transfer Complete!");
        comparar(resultadoOk,"Transfer Complete!");
    }

}
