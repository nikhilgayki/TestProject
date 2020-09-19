package common_Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebButton {
	
	public static boolean IsClickable(WebElement ele, WebDriver driver) 
    {

        try{
            WebDriverWait wait = new WebDriverWait(driver, 6);
            wait.until(ExpectedConditions.elementToBeClickable(ele));
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
	
	public static void clickElement(WebElement element) {
		element.click();
	}

}
