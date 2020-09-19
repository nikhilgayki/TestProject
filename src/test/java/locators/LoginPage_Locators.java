package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Locators {
	
	WebDriver driver = null;
	
	public LoginPage_Locators(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "user-name")
	private WebElement Username;
	
	public WebElement getUsername() {return Username;}
	
	@FindBy(id="password")
	private WebElement Password;
	
	public WebElement getPassword() {return Password;}
	
	@FindBy(className = "btn_action")
	private WebElement LoginButton;
	
	public WebElement getLoginButton() {return LoginButton;}


}
