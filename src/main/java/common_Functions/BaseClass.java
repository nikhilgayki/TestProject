package common_Functions;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import initializer_Functions.LocalBrowserFactory;
import initializer_Functions.PropertyFileReader;

public class BaseClass {
	
	public WebDriver driver;
	public PropertyFileReader prop;
	public Logger log = LogManager.getLogger(BaseClass.class);
	
	@BeforeMethod
	public void LaunchBrowser() {
		prop = new PropertyFileReader();
		log.info("Launching Browser.........");
		this.driver = LocalBrowserFactory.createInstance(prop.getBrowserName());
		log.info("Launched Browser is: "+ prop.getBrowserName());	
	}
	
	@AfterMethod
	public void closeBrowser(){
		log.info("Closing Browser.........");
		LocalBrowserFactory.tearDown();
		log.info("Browser is closed");
	}
}
