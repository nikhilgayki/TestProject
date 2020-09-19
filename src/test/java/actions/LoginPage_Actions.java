package actions;

import org.apache.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import common_Functions.WebBoxEdit;
import common_Functions.WebButton;
import locators.LoginPage_Locators;
import tests.Login_Test;

public class LoginPage_Actions {
	
	WebDriver driver= null;
	WebElement element = null;
	LoginPage_Locators loginLocate = null;
	public Logger log = LogManager.getLogger(Login_Test.class);
	
	public LoginPage_Actions(WebDriver driver) {
		this.driver = driver;
		loginLocate = new LoginPage_Locators(driver);
	}
	
	public void enterUsername(String Username) {
		element = loginLocate.getUsername();
		if(element.isDisplayed()) {
			if(element.isEnabled()) {
				WebBoxEdit.sendInput(element, Username);
				log.info("Entered Username is: "+Username);
			}else {
				System.out.println("Element is not Enable.");
			}
		}else {
			System.out.println("Element is not displayed.");
		}
		
	}
	
	public void enterPassword(String Password) {
		element = loginLocate.getPassword();
		if(element.isDisplayed()) {
			if(element.isEnabled()) {
				WebBoxEdit.sendInput(element, Password);
				log.info("Entered password is: ********");
			}else {
				System.out.println("Element is not Enable.");
			}
		}else {
			System.out.println("Element is not displayed.");
		}
	}
	
	public void clickLoginBtn() {
		element = loginLocate.getLoginButton();
		if(element.isDisplayed()) {
			if(WebButton.IsClickable(element, driver)) {
				WebButton.clickElement(element);
			}else {
				System.out.println("Element is not Enable.");
			}
		}else {
			System.out.println("Element is not displayed.");
		}
	}
	
	public LoginPage_Actions LoginPage(String username,String password) {
		
		LoginPage_Actions login = null;
		try {
			enterUsername(username);
			enterPassword(password);
			clickLoginBtn();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return login;
	}
}
