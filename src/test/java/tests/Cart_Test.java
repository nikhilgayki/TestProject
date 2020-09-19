package tests;

import org.testng.annotations.Test;
import org.apache.log4j.*;
import actions.AddProductToCart_Actions;
import actions.CheckoutPage_Actions;
import actions.LoginPage_Actions;
import actions.Logout_Actions;
import common_Functions.BaseClass;

public class Cart_Test extends BaseClass {
	
	Logger log = LogManager.getLogger(Login_Test.class);
	
	@Test
	public void checkout_TC() {

		log.info("Starting TestCase: checkout_TC");
		LoginPage_Actions loginAct = new LoginPage_Actions(driver);
		loginAct.LoginPage("standard_user", "secret_sauce");
		log.info("Successfully LoggedIn");
		
		AddProductToCart_Actions inCart = new AddProductToCart_Actions(driver);
		inCart.addProductToCart(prop.getProductName());
		log.info("Product added to the cart");
		
		CheckoutPage_Actions check = new CheckoutPage_Actions(driver);
		check.checkoutAction();
		log.info("Product checkout successfully");
		
		Logout_Actions loge = new Logout_Actions(driver);
		loge.logout();
		log.info("Successfully LoggedOut");
	}

}
