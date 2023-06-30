package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.Pages.Procesoderegistro;


public class AbrirNuevaCuenta extends BasePage {

//***********************************************************************************//

    public String nombreUsuario = "hectorjm";
    public String passwordUsuario = "1234567";


//***********************************************************************************//



    By TestUserName = By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input");
    By TestPassword = By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input");
    By LoginIn = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");

    By OpenNewAccount = By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a");
    By Select1 = By.xpath("//*[@id=\"type\"]");
    By Select2 = By.xpath("//*[@id=\"type\"]/option[2]");

    By OpenNewAccountBtn = By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input");


    By resultadoOk = By.xpath("//*[@id=\"rightPanel\"]/div/div/p[1]"); // Congratulations, your account is now open.

    public AbrirNuevaCuenta(WebDriver driver) {
        super();
    }


    public void register(){
        teclear(nombreUsuario,TestUserName);
        teclear(passwordUsuario,TestPassword);
        oprimir(LoginIn);
        oprimir(OpenNewAccount);
        oprimir(Select1);
        oprimir(Select2);
        oprimir(OpenNewAccountBtn);
        esperaExplicta(5,resultadoOk,"Congratulations, your account is now open.");
        comparar(resultadoOk,"Congratulations, your account is now open.");
    }

}
