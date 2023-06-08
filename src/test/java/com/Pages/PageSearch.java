package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.Base.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageSearch extends BasePage{
	
	By searchBox = By.cssSelector("#ciudad");
	//html/body/div/main/div[1]/form/div/div[1]/div/div[1]/div[2]/input
   //*[@id="ciudad"]
   //*[@id="ciudad"]
	//#ciudad
	By dates = By.xpath("//*[@id=\'buscador\']/div/div[2]/div[1]/div/input");
	By checkIn = By.xpath("//*[@id=\'buscador\']/div/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/div[2]/div[2]");
	By checkOut = By.xpath("//*[@id=\'buscador\']/div/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/div[2]/div[6]");
	By bottonSearch = By.id("btn-buscador");
	By resultado = By.className("card-list");
	
	public PageSearch(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public void search () throws InterruptedException {
		teclear("Punta del este",searchBox);
		tecla(searchBox,"ENTER");
		oprimir(bottonSearch);
		//Thread.sleep(3000);
		esperaExplicta(10,resultado,"Villa Kantounes Studio Ostria");
		obtenerTexto(resultado);
		comparar(resultado,"Villa Kantounes Studio Ostria");
	}
	public void search2 () throws InterruptedException {
		teclear("Punta del este",searchBox);
		tecla(searchBox,"ENTER");
		Thread.sleep(2000);
		oprimir(bottonSearch);
		obtenerTexto(resultado);
		Thread.sleep(2000);
		comparar(resultado,"Villa Kantounes Studio Ostria123");
		Thread.sleep(2000);
	}

}

