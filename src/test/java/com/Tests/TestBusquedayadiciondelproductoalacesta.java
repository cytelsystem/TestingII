package com.Tests;

import com.Pages.Busquedayadiciondelproductoalacesta;
import com.Pages.PageLogin;
import com.Pages.PageSearch;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestBusquedayadiciondelproductoalacesta {
	
	WebDriver driver;
	Busquedayadiciondelproductoalacesta busquedayadiciondelproductoalacesta;
	PageLogin pageLogin;
	
	@BeforeEach
	public void setUp () throws InterruptedException
	{
		busquedayadiciondelproductoalacesta = new Busquedayadiciondelproductoalacesta(driver);
		driver = busquedayadiciondelproductoalacesta.chromeDriverConnection();
		busquedayadiciondelproductoalacesta.link("http://opencart.abstracta.us/index.php?route=common/home");
	}

	@Test
	public void test() throws InterruptedException
	{
		busquedayadiciondelproductoalacesta.search();
	}
//	@Test
//	public void test2() throws InterruptedException
//	{
//		busquedayadiciondelproductoalacesta.search2();
//	}
//
	@AfterEach
	public void tearDown() {

//		driver.quit();
	}
	

}
