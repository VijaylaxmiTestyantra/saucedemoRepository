package com.saucedemo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id ="add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement tshirtToCart;
	@FindBy(id ="shopping_cart_container")
	private WebElement CartButton;
	@FindBy(id ="continue-shopping")
	private WebElement continueShopping;
	@FindBy(id ="add-to-cart-sauce-labs-backpack")
	private WebElement bagToCart;
	@FindBy(id ="shopping_cart_container")
	private WebElement continueShopping1;
	@FindBy(id ="remove-sauce-labs-bolt-t-shirt")
	private WebElement removeTshirtFromCart;
	@FindBy(id ="checkout")
	private WebElement checkout;
	@FindBy(id ="first-name")
	private WebElement firstName;
	@FindBy(id ="last-name")
	private WebElement lastName;
	@FindBy(id ="postal-code")
	private WebElement postalCode;
	@FindBy(id ="continue")
	private WebElement continueBtn;
	@FindBy(id ="finish")
	private WebElement finishBtn;
	@FindBy(id ="back-to-products")
	private WebElement backToProducts;
	@FindBy(id ="react-burger-menu-btn")
	private WebElement burgerMenu;
	@FindBy(id ="logout_sidebar_link")
	private WebElement logoutBtn;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTshirtToCart() {
		return tshirtToCart;
	}

	public WebElement getCartButton() {
		return CartButton;
	}

	public WebElement getContinueShopping() {
		return continueShopping;
	}

	public WebElement getBagToCart() {
		return bagToCart;
	}

	public WebElement getContinueShopping1() {
		return continueShopping1;
	}

	public WebElement getRemoveTshirtFromCart() {
		return removeTshirtFromCart;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getFinishBtn() {
		return finishBtn;
	}

	public WebElement getBackToProducts() {
		return backToProducts;
	}

	public WebElement getBurgerMenu() {
		return burgerMenu;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
	
}
