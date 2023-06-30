package com.Pages;

import com.Base.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Procesoderegistro extends BasePage {

//***********************************************************************************//

    public String nombreUsuario = "hectorjm1";
    public String passwordUsuario = "12345671";


//***********************************************************************************//


     By LinkRegister = By.xpath("//*[@id=\"loginPanel\"]/p[2]/a");

    By Nombre = By.id("customer.firstName");
    By Apellido = By.id("customer.lastName");
    By Direccion = By.id("customer.address.street");
    By Ciudad = By.id("customer.address.city");
    By Estado = By.id("customer.address.state");
    By ZipCode = By.id("customer.address.zipCode");
    By Telefono = By.id("customer.phoneNumber");
    By Ssn = By.id("customer.ssn");
    By Usuario = By.id("customer.username");
    By password = By.id("customer.password");
    By passwordConfirm = By.id("repeatedPassword");
    By Registrar = By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");
    By resultadoOk = By.xpath("//*[@id=\"rightPanel\"]/p"); // Your account was created successfully. You are now logged in.

    public Procesoderegistro(WebDriver driver) {
        super();
    }

    public void register(){
        oprimir(LinkRegister);
        teclear("hectorj",Nombre);
        teclear("Moreno",Apellido);
        teclear("Av quito y pongo",Direccion);
        teclear("Bogota",Ciudad);
        teclear("Cundinamarca",Estado);
        teclear("0000",ZipCode);
        teclear("34015616",Telefono);
        teclear("0000",Ssn);
        teclear(nombreUsuario,Usuario);
        teclear(passwordUsuario,password);
        teclear(passwordUsuario,passwordConfirm);
        oprimir(Registrar);
        esperaExplicta(5,resultadoOk,"Your account was created successfully. You are now logged in.");
        comparar(resultadoOk,"Your account was created successfully. You are now logged in.");
    }

}
