package com.Tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.Pages.PageLogin;
import com.Pages.PageSearch;

public class TestSearch {
	
	WebDriver driver;
	PageSearch pageSearch;
	PageLogin pageLogin;
	
	@BeforeEach
	public void setUp () throws InterruptedException
	{
		pageSearch = new PageSearch(driver);
		driver = pageSearch.chromeDriverConnection();
		pageSearch.link("http://testing.ctd.academy/");
		pageLogin = new PageLogin(null);
		pageLogin.loginUser();
	}

	@Test
	public void test() throws InterruptedException
	{		
		pageSearch.search();
	}
	@Test
	public void test2() throws InterruptedException
	{
		pageSearch.search2();
	}
	
	@AfterEach
	public void tearDown() {
		driver.quit();
	}
	

}
