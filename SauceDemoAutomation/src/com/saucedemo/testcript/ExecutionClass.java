package com.saucedemo.testcript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.saucedemo.generic.BaseClass;
import com.saucedemo.pom.HomePage;
@Listeners(com.saucedemo.generic.ListenerImplementation.class)
public class ExecutionClass extends BaseClass {
	@Test
	public void addAndDeleteCart() throws InterruptedException {
		Thread.sleep(10000);
		h = new HomePage(driver);
		h.getTshirtToCart().click();
		Thread.sleep(2000);
		h.getCartButton().click();
		Thread.sleep(2000);
		h.getContinueShopping().click();Thread.sleep(2000);
		h.getBagToCart().click();Thread.sleep(2000);
		h.getContinueShopping1().click();Thread.sleep(2000);
		h.getRemoveTshirtFromCart().click();
		h.getCheckout().click();
		h.getFirstName().sendKeys("abc");
		h.getLastName().sendKeys("xyz");
		h.getPostalCode().sendKeys("560068");
		h.getContinueBtn().click();
		h.getFinishBtn().click();
		h.getBackToProducts().click();
		h.getBurgerMenu().click();
		h.getLogoutBtn().click();
	}


}
