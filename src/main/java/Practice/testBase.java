package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testBase {
	public static WebDriver driver = null;
	
	public static void init() {
		if (driver == null) 
			if(constants.browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(constants.url);
	}
	
	public static void quit() {
		System.out.println("Quitting the browser");
		driver.quit();
		driver=null;
	}
	
}
	
