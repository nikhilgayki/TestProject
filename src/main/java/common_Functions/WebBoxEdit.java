package common_Functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class WebBoxEdit {
	
	public static void clearTextbox(WebElement textbox) {
		textbox.clear();
	}
	
	public static void sendInput(WebElement textbox, String text) {
		textbox.sendKeys(text);
	}
	
	public static void selectValueFromDropDown(WebElement dropDown, String visibleText) {
		Select dropdown = new Select(dropDown);
		dropdown.selectByVisibleText(visibleText);
	}
	

}
