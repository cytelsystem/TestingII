package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageRegister extends BasePage {
    By buttomCrearCuenta = By.xpath("//*[@id=\'root\']/header/nav/a[1]");
    By nombre = By.name("firstName");
    //*[@id="firstName"]
    //html/body/div/main/div/form/div[1]/div[1]/input
    By apellido = By.id("lastName");
    By correo = By.cssSelector("#email");
    By contrasena = By.xpath("/html/body/div/main/div/form/div[3]/input");
    By cccontraseña = By.id("repassword");
    By buttonRegistrarse = By.xpath("//*[@id=\'root\']/main/div/form/button");
    By resultado = By.className("txt-gracias");
    By resultadoRegistroFail = By.className("form-feedback");

    public PageRegister(WebDriver driver) {
        super();
    }

    public void register(){
        oprimir(buttomCrearCuenta);
        teclear("Jose",nombre);
        teclear("Pinzon",apellido);
        teclear("prueba243@hotmail.com",correo);
        teclear("123456",contrasena);
        teclear("123456",cccontraseña);
        oprimir(buttonRegistrarse);
        esperaExplicta(5,resultado,"¡Cuenta registrada con éxito!");
        comparar(resultado,"¡Cuenta registrada con éxito!");
    }
    public void registerFail(){
        oprimir(buttomCrearCuenta);
        teclear("Jose",nombre);
        teclear("Pinzon",apellido);
        teclear("prueba11@hotmail.com",correo);
        teclear("123456",contrasena);
        teclear("123456",cccontraseña);
        oprimir(buttonRegistrarse);
        esperaExplicta(10,resultadoRegistroFail,"Ese email ya se encuentra registrado");
        obtenerTexto(resultadoRegistroFail);
        comparar(resultadoRegistroFail,"Ese email ya se encuentra registrado");
    }
}
