package initializer_Functions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationManager {


	public String read_ConfigurationFile(String scriptname) {
		String property = null;
		try {
			Properties prop = new Properties();
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\resources\\ApplicationConfig.properties");
			prop.load(file);
			property = prop.getProperty(scriptname);
			
		} catch (FileNotFoundException e) {
			System.out.println("Unable to find the file for properties");
		} catch (IOException e) {
			e.getMessage();
		}

		return property;
	}

}
