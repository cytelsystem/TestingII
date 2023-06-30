package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActividadCuenta extends BasePage {

//***********************************************************************************//

    public String nombreUsuario = "hectorjm";
    public String passwordUsuario = "1234567";


    //***********************************************************************************//
    By TestUserName = By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input");
    By TestPassword = By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input");
    By LoginIn = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");

    By BtnAccountOverview = By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a");
    By resultadoOk = By.xpath("//*[@id=\"accountTable\"]/tfoot/tr/td"); // *Balance includes deposits that may be subject to holds
    By BtnAccount1 = By.xpath("//*[@id=\"accountTable\"]/tbody/tr[1]/td[1]/a");
    By resultadoOk2 = By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/h1"); // Account Details
    By BtnPeriodo2 = By.xpath("//*[@id=\"month\"]/option[1]");
    By BtnPeriodo4 = By.xpath("//*[@id=\"transactionType\"]/option[1]");
    By BtnGo = By.xpath("//*[@id=\"rightPanel\"]/div/div[2]/form/table/tbody/tr[3]/td[2]/input");


    public ActividadCuenta(WebDriver driver) {
        super();
    }


    public void register() throws InterruptedException {
        teclear(nombreUsuario,TestUserName);
        teclear(passwordUsuario,TestPassword);
        oprimir(LoginIn);
        oprimir(BtnAccountOverview);
        esperaExplicta(20,resultadoOk,"*Balance includes deposits that may be subject to holds");
        comparar(resultadoOk,"*Balance includes deposits that may be subject to holds");
        Thread.sleep(2000);
        oprimir(BtnAccount1);
        esperaExplicta(5,resultadoOk2,"Account Details");
        comparar(resultadoOk2,"Account Details");
        oprimir(BtnPeriodo2);
        oprimir(BtnPeriodo4);
        oprimir(BtnGo);
    }

}
