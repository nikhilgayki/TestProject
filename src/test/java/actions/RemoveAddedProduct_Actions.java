package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.ProductsPage_Locators;
import locators.YourCart_Locators;

public class RemoveAddedProduct_Actions {
	
	WebDriver driver = null;
	WebElement element = null;
	ProductsPage_Locators productPage = null;
	YourCart_Locators yourCart = null;
	
	public RemoveAddedProduct_Actions(WebDriver driver) {
		this.driver = driver;
		productPage = new ProductsPage_Locators(driver);
		yourCart = new YourCart_Locators(driver);
	}
	
	public void removeProduct() {
		productPage.getCart().click();
		yourCart.getRemoveBtn().click();
		productPage.getBurgerButton().click();
		productPage.getAllItemBtn().click();
	}
	
	public RemoveAddedProduct_Actions removeProductFromCart() {
		RemoveAddedProduct_Actions remove = null;
		try {
			removeProduct();
		} catch (Exception e) {
			e.getMessage();
		}
		return remove;
	}
}
