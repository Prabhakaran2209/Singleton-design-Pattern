package selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverinit {
	private static Driverinit instancedriver = null;;
	public WebDriver driver;
	
	private Driverinit() {
		
	}
	
	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;	
	}
	
	public static Driverinit getInstance() {
		if(instancedriver == null) {
			instancedriver = new Driverinit();
		}
		return instancedriver;
	}

}
