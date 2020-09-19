package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage_Locators {

	WebDriver driver = null;

	public ProductsPage_Locators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@class='inventory_item']/div[2]/a/div")
	private WebElement ProductNames;

	public WebElement getProductNames() {
		return ProductNames;
	}

	@FindBy(xpath = "//*[@class='btn_primary btn_inventory']")
	private WebElement AddtoCartBtn;

	public WebElement getAddtoCartBtn() {
		return AddtoCartBtn;
	}

	@FindBy(xpath = "//*[@class='shopping_cart_container']/a")
	private WebElement Cart;

	public WebElement getCart() {
		return Cart;
	}

	@FindBy(xpath = "//*[@class='fa-layers-counter shopping_cart_badge']")
	private WebElement addedItems;

	public WebElement getAddedItems() {
		return addedItems;
	}

	@FindBy(xpath = "//*[@id='page_wrapper']/div[1]/div/div[3]/div/button")
	private WebElement burgerBtn;

	public WebElement getBurgerButton() {
		return burgerBtn;
	}
	
	@FindBy(id = "inventory_sidebar_link")
	private WebElement allItemBtn;

	public WebElement getAllItemBtn() {
		return allItemBtn;
	}
	
	@FindBy(id = "logout_sidebar_link")
	private WebElement logoutBtn;

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
}
