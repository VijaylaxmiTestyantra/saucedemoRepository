package com.saucedemo.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.saucedemo.pom.HomePage;
import com.saucedemo.pom.LoginPage;


public class BaseClass {
	public FileLib f = new FileLib();
	public static WebDriver driver;
	public HomePage h;
@BeforeTest
	public void openBrowser() throws IOException {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 String url = f.readDataFromProperty("url");
		 driver.get(url);
	}

@BeforeMethod
public void login() throws IOException {
	LoginPage l = new LoginPage(driver);
	String un = f.readDataFromProperty("username");
	String pwd = f.readDataFromProperty("password");
	l.login(un, pwd);
//	driver.findElement(By.id("user-name")).sendKeys("standard_user");
//	driver.findElement(By.id("password")).sendKeys("secret_sauce");
//	driver.findElement(By.id("login-button")).click();
}

@AfterMethod
public void logout() {
	h.getBurgerMenu().click();
	h.getLogoutBtn().click();
//	driver.findElement(By.id("react-burger-menu-btn")).click();
//	driver.findElement(By.id("logout_sidebar_link")).click();
}

@AfterTest
public void closeBrowser() {
	driver.manage().window().minimize();
	driver.quit();
}
}
