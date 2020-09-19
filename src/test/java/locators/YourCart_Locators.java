package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCart_Locators {
	
	WebDriver driver = null;
	
	public YourCart_Locators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@class='cart_footer']/a")
	private WebElement ContinueShoppingBtn;
	
	public WebElement getContinueShoppingBtn() {return ContinueShoppingBtn;}
	
	@FindBy(xpath ="//*[@class='btn_action checkout_button']")
	private WebElement checkoutBtn;
	
	public WebElement getCheckoutBtn() {return checkoutBtn;}
	
	@FindBy(id="first-name")
	private WebElement firstName;
	
	public WebElement getFirstName() {return firstName;}
	
	@FindBy(id="last-name")
	private WebElement lastName;
	
	public WebElement getLastName() {return lastName;}
	
	@FindBy(id="postal-code")
	private WebElement postalCode;
	
	public WebElement getPostalCode() {return postalCode;}
	
	@FindBy(xpath = "//*[@class='checkout_buttons']/input")
	private WebElement continueBtn;
	
	public WebElement getContinueBtn() {return continueBtn;}
	
	@FindBy(xpath = "//*[@class='cart_footer']/a[2]")
	private WebElement finishBtn;
	
	public WebElement getFinishBtn() {return continueBtn;}

	@FindBy(xpath = "//*[@class='btn_secondary btn_inventory']")
	private WebElement removeBtn;
	
	public WebElement getRemoveBtn() {return removeBtn;}
}
