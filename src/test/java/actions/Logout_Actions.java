package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.ProductsPage_Locators;
import locators.YourCart_Locators;

public class Logout_Actions {
	
	WebDriver driver = null;
	WebElement element = null;
	ProductsPage_Locators productPage = null;
	YourCart_Locators yourCart = null;
	
	public Logout_Actions(WebDriver driver) {
		this.driver=driver;
		productPage = new ProductsPage_Locators(driver);
		yourCart = new YourCart_Locators(driver);
	}
	
	public void userLogout() {
		productPage.getBurgerButton().click();
		productPage.getLogoutBtn().click();
	}
	
	public Logout_Actions logout() {
		Logout_Actions out = null;
		userLogout();
		return out;
	}

}
