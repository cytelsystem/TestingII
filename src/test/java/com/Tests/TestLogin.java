package com.Tests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import com.Pages.PageLogin;

public class TestLogin {
	
	private WebDriver driver;
	PageLogin pageLogin;
	
	@BeforeEach
	public void setUp() throws Exception {
		pageLogin = new PageLogin(driver);
		driver =pageLogin.chromeDriverConnection();
		pageLogin.link("http://testing.ctd.academy/");
	
	}
	@AfterEach
	public void tearDown() throws Exception {
		driver.quit();
	}

	//@RepeatedTest(3)
	//@ParameterizedTest
	//@ValueSource(strings = {"edisson.g.p@hotmail.com","edisson1.g.p@hotmail.com"})
	@Test
	public void test() throws InterruptedException {
		//String correo = strings;
		pageLogin.loginUser();
	}
	@Test
	public void test1()throws InterruptedException {
		//pageLogin.loginUser();
	}
	@Test
	public void test2() throws InterruptedException {
		pageLogin.loginUserFail();
	}

}
