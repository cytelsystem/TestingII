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
	By resultado2 = By.xpath("//*[@id=\"product-search\"]/div[1]/a[1]");

	By resultado3 = By.xpath("//*[@id=\"product-search\"]/div[1]/a[2]");



	public Busquedayadiciondelproductoalacesta(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public void search () throws InterruptedException {
		teclear("Iphone",searchBox);
		oprimir(bottonSearch);
		//Thread.sleep(3000);
		esperaExplicta(10,redirigirBusqueda,"Search - Iphone");
		oprimir(bottonAddCart);
		Thread.sleep(5000);
		comparar(resultado,"Success: You have added iPhone to your shopping cart!");
//		comparar(resultado2,"iPhone");
//		comparar(resultado3,"shopping cart");
//		obtenerTextoConcatenado(resultado1,resultado2,resultado3);

	}
//	public void search2 () throws InterruptedException {
//		teclear("Punta del este",searchBox);
//		tecla(searchBox,"ENTER");
//		Thread.sleep(2000);
//		oprimir(bottonSearch);
//		obtenerTexto(resultado);
//		Thread.sleep(2000);
//		comparar(resultado,"Villa Kantounes Studio Ostria123");
//		Thread.sleep(2000);
//	}

}

