package tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import actions.AddProductToCart_Actions;
import actions.LoginPage_Actions;
import actions.Logout_Actions;
import actions.RemoveAddedProduct_Actions;
import common_Functions.BaseClass;

public class Product_Test extends BaseClass {
	
	Logger log = LogManager.getLogger(Product_Test.class);

	@Test
	public void addProductToCart_TC() {
	
		log.info("Starting TestCase: addProductToCart_TC");
		LoginPage_Actions loginAct = new LoginPage_Actions(driver);
		loginAct.LoginPage("standard_user", "secret_sauce");
		log.info("Successfully LoggedIn");

		AddProductToCart_Actions inCart = new AddProductToCart_Actions(driver);
		inCart.addProductToCart(prop.getProductName());
		log.info("Product added to the cart");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Logout_Actions loge = new Logout_Actions(driver);
		loge.logout();
		log.info("Successfully LoggedOut");

	}
	
	@Test
	public void RemoveProductFromCart_TC() {
		
		log.info("Starting TestCase: RemoveProductFromCart_TC");
		LoginPage_Actions loginAct = new LoginPage_Actions(driver);
		loginAct.LoginPage("standard_user", "secret_sauce");
		log.info("Successfully LoggedIn");
		
		AddProductToCart_Actions inCart = new AddProductToCart_Actions(driver);
		inCart.addProductToCart(prop.getProductName());
		log.info("Product added to the cart");
		
		RemoveAddedProduct_Actions remove = new RemoveAddedProduct_Actions(driver);
		remove.removeProductFromCart();
		log.info("Product removed from the cart");
		
		Logout_Actions loge = new Logout_Actions(driver);
		loge.logout();
		log.info("Successfully LoggedOut");
	}
	
}
