package actions;

import org.openqa.selenium.WebDriver;

import locators.ProductsPage_Locators;
import locators.YourCart_Locators;

public class CheckoutPage_Actions {
	
	WebDriver driver = null;
	YourCart_Locators yourCart = null;
	ProductsPage_Locators productPage = null;
	
	public CheckoutPage_Actions(WebDriver driver) {
		this.driver=driver;
		yourCart = new YourCart_Locators(driver);
		productPage = new ProductsPage_Locators(driver);
	}
	
	public void getTotalItemsInCart() {
		Integer i = Integer.parseInt(productPage.getAddedItems().getText());  
		if(i==0) {
			System.out.println("Your Cart is empty");
		}else {
			System.out.println("Total Added Items are: "+productPage.getAddedItems().getText());
			productPage.getCart();
			yourCart.getCheckoutBtn().click();
			yourCart.getFirstName().sendKeys("Nikhil");
			yourCart.getLastName().sendKeys("Nikhil");
			yourCart.getPostalCode().sendKeys("411045");
			yourCart.getContinueBtn().click();
			yourCart.getFinishBtn().click();
		}	
	}
	
	public CheckoutPage_Actions checkoutAction() {
		CheckoutPage_Actions checkout = null;
		try {
			getTotalItemsInCart();
		} catch (Exception e) {
			e.getMessage();
		}
		return checkout;
	}

}
