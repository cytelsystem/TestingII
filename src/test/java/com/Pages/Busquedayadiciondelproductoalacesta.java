package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Busquedayadiciondelproductoalacesta extends BasePage{

	By searchBox = By.name("search");
	By bottonSearch = By.xpath("//*[@id=\"search\"]/span/button");
	By redirigirBusqueda = By.xpath("//*[@id=\"content\"]/h1");
	By bottonAddCart = By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]");
	By resultado = By.xpath("//*[@id=\"product-search\"]/div[1]");



	public Busquedayadiciondelproductoalacesta(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public void search () throws InterruptedException {
		teclear("Iphone",searchBox);
		oprimir(bottonSearch);
		esperaExplicta(10,redirigirBusqueda,"Search - Iphone");
		oprimir(bottonAddCart);
		Thread.sleep(5000);
		comparar(resultado,"Success: You have added iPhone to your shopping cart!");

	}


}

