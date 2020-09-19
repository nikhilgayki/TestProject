package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.log4j.*;

public class TestCodeClass {
	
	public static Logger log = LogManager.getLogger(Login_Test.class);

	@Test
	public static void code() {
		
		log.info("Test name");
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\" + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("btn_action")).click();
		driver.findElement(By.xpath("//*[@id='page_wrapper']/div[1]/div/div[3]/div/button")).click();
		driver.close();
	}
}
