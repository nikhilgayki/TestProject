package tests;

import org.testng.annotations.Test;
import actions.LoginPage_Actions;
import actions.Logout_Actions;
import common_Functions.BaseClass;
import org.apache.log4j.*;

public class Login_Test extends BaseClass {
	
	Logger log = LogManager.getLogger(Login_Test.class);

	@Test
	public void loginSuccessful_TC() {
		
		log.info("Starting TestCase: loginSuccessful_TC");
		LoginPage_Actions loginAct = new LoginPage_Actions(driver);
		loginAct.LoginPage("standard_user", "secret_sauce");
		log.info("Successfully LoggedIn");
	}

	@Test
	public void logoutSuccessful_TC() {
		log.info("Starting TestCase: logoutSuccessful_TC");
		LoginPage_Actions loginAct = new LoginPage_Actions(driver);
		loginAct.LoginPage("standard_user", "secret_sauce");
		log.info("Successfully LoggedIn");
		
		Logout_Actions loge = new Logout_Actions(driver);
		loge.logout();
		log.info("Successfully LoggedOut");
	}



}
