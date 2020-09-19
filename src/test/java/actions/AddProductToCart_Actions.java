package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import locators.ProductsPage_Locators;
import locators.YourCart_Locators;

public class AddProductToCart_Actions {
	
	WebDriver driver = null;
	WebElement element = null;
	ProductsPage_Locators productPage = null;
	YourCart_Locators yourCart = null;
	
	public AddProductToCart_Actions(WebDriver driver) {
		this.driver=driver;
		productPage = new ProductsPage_Locators(driver);
		yourCart = new YourCart_Locators(driver);
	}
	
	public void viewProductDetails(String productName) {
		
		List<WebElement> li = driver.findElements(By.xpath("//*[@class='inventory_item']/div[2]/a/div"));
		for (int i = 1; i <= li.size(); i++) {
			WebElement text = driver.findElement(By.xpath("//*[@class='inventory_item'][" + i + "]/div[2]/a/div"));
			if (text.getText().equalsIgnoreCase(productName)) {
				text.click();
				break;
			}
		}
	}
	
	public void addToCart() {
		productPage.getAddtoCartBtn().click();
	}
	
	public void viewCart() {
		productPage.getCart().click();
	}
	
	public void continueShopping() {
		yourCart.getContinueShoppingBtn().click();	
	}
	
	public void getAddedItemCount() {
		System.out.println("Total Added Items are: "+productPage.getAddedItems().getText());
	}
	
	public AddProductToCart_Actions addProductToCart(String productName) {
		AddProductToCart_Actions inCart = null;
		try {
			viewProductDetails(productName);
			addToCart();
			viewCart();
			continueShopping();
			getAddedItemCount();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return inCart;
	}

}
