package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.Base.BasePage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class PageLogin extends BasePage {

	By email = By.name("email");
	By password = By.name("password");
	By buttomLogin = By.xpath("//*[@id=\'root\']/header/nav/a[2]");
	By buttomFinish = By.xpath("//*[@id=\'root\']/main/div/form/button");
	By resultado= By.xpath("//*[@id='root']/header/nav/div/div/div/p[2]");
	By resFail = By.xpath("//*[@id=\'root\']/main/div/form/p[1]");

	
	public PageLogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	
	public void loginUser() throws InterruptedException {
		/*new WebDriverWait(driver,Duration.ofSeconds(10)).
				until(ExpectedConditions.visibilityOfElementLocated(bottomLogin));*/
		oprimir(buttomLogin);
		teclear("edisson.g.p@hotmail.com",email);
		teclear("pass123",password);
		oprimir(buttomFinish);
		//Thread.sleep(3000);
		esperaExplicta(10,resultado,"edisson esteban gomez pinzon");
		obtenerTexto(resultado);
		comparar(resultado,"edisson esteban gomez pinzon");
		
	}
	public void loginUserFail() throws InterruptedException {
		oprimir(buttomLogin);
		teclear("prueba6@prueba.com",email);
		Thread.sleep(2000);
		teclear("321546",password);
		Thread.sleep(2000);
		oprimir(buttomFinish);
		Thread.sleep(2000);
		obtenerTexto(resFail);
		comparar(resFail,"Sus credenciales son inválidas. Por favor, vuelva a intentarlo");
		
	}
}
