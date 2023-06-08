package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageOpenCart extends BasePage {
    By myAccount = By.className("caret");
    By register = By.xpath("//*[@id=\'top-links\']/ul/li[2]/ul/li[1]/a");

    public PageOpenCart(WebDriver driver) {
        super();
    }

    public void registerOpenCart(){
        oprimir(myAccount);
        oprimir(register);
    }

}
