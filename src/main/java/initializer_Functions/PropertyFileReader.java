package initializer_Functions;

public class PropertyFileReader {
	
	ConfigurationManager config = new ConfigurationManager();
	
	public String getUrl(){
		return config.read_ConfigurationFile("URL");
	}
	
	public String getBrowserName(){
		return config.read_ConfigurationFile("BROWSER");
	}
	
	public String getProductName() {
		return config.read_ConfigurationFile("PRODUCT");
	}
}
