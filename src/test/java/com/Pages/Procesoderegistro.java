package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Procesoderegistro extends BasePage {
     By buttomMyAccount = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");
    By LinkRegister = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
    By Nombre = By.id("input-firstname");
    By Apellido = By.id("input-lastname");

    By Correo = By.cssSelector("#input-email");

    By Telefono = By.id("input-telephone");

    By password = By.id("input-password");
    By passwordConfirm = By.id("input-confirm");
    By SuscribeNo = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
    By SuscribePrivacyPolicy = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
    By Continuar = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");

    By resultadoOk = By.xpath("//*[@id=\"content\"]/p[1]"); // Congratulations! Your new account has been successfully created!
    By resultadoUsuarioExistente = By.xpath("//*[@id=\"account-register\"]/div[1]");; //  Warning: E-Mail Address is already registered!

    public Procesoderegistro(WebDriver driver) {
        super();
    }

    public void register(){
        oprimir(buttomMyAccount);
        oprimir(LinkRegister);
        teclear("xxxxxxxxxxxxxxx",Nombre);
        teclear("xxxxxxxxxxxxxxx",Apellido);
        teclear("xxxxxxxxxxxxxxx@hotmail.com",Correo);
        teclear("xxxxxxxxxxxxxxx",Telefono);
        teclear("xxxxxxxxxxxxxxx",password);
        teclear("xxxxxxxxxxxxxxx",passwordConfirm);
        oprimir(SuscribeNo);
        oprimir(SuscribePrivacyPolicy);
        oprimir(Continuar);
        esperaExplicta(5,resultadoOk,"Congratulations! Your new account has been successfully created!");
        comparar(resultadoOk,"Congratulations! Your new account has been successfully created!");
    }
    public void registerFail(){
        oprimir(buttomMyAccount);
        oprimir(LinkRegister);
        teclear("xxxxxxxxxxxxxxx",Nombre);
        teclear("xxxxxxxxxxxxxxx",Apellido);
        teclear("xxxxxxxxxxxxxxx@hotmail.com",Correo);
        teclear("xxxxxxxxxxxxxxx",Telefono);
        teclear("xxxxxxxxxxxxxxx",password);
        teclear("xxxxxxxxxxxxxxx",passwordConfirm);
        oprimir(SuscribeNo);
        oprimir(SuscribePrivacyPolicy);
        oprimir(Continuar);
        esperaExplicta(10,resultadoUsuarioExistente,"Warning: E-Mail Address is already registered!");
        obtenerTexto(resultadoUsuarioExistente);
        comparar(resultadoUsuarioExistente,"Warning: E-Mail Address is already registered!");
    }
}
