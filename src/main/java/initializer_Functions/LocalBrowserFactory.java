package initializer_Functions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LocalBrowserFactory {
	public static WebDriver driver = null;
	public static PropertyFileReader pro = null;
	static String path = System.getProperty("user.dir")+"\\src\\main\\resources\\";

	public LocalBrowserFactory() {
		pro = new PropertyFileReader();
	}

	public static WebDriver createInstance(String browserName) {
		
		switch (browserName.toLowerCase()) {
		case "ie":
			File a = new File(path + "IEDriverServer.exe");
			if (a != null) {
				System.setProperty("webdriver.geckodriver.driver", path + "IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.get(pro.getUrl());
				driver.manage().window().maximize();
				break;
			}

		default:
			File b = new File(path + "chromedriver.exe");
			if (b != null) {
				System.setProperty("webdriver.chrome.driver", path + "chromedriver.exe");
				driver = new ChromeDriver();
				pro = new PropertyFileReader();
				//driver.get(pro.getUrl());
				driver.get("https://www.saucedemo.com/");
				driver.manage().window().maximize();
				break;
			}

		}

		return driver;
	}

	public static void tearDown() {
		driver.quit();
	}

}
