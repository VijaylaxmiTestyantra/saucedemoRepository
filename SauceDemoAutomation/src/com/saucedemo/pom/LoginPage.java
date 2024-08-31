package com.saucedemo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id ="user-name")
private WebElement unTbx;
@FindBy(id ="password")
private WebElement pwdTbx;
@FindBy(id ="login-button")
private WebElement loginBtn;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void login(String un, String pwd) {
	unTbx.sendKeys(un);
	pwdTbx.sendKeys(pwd);
	loginBtn.click();
}
}
