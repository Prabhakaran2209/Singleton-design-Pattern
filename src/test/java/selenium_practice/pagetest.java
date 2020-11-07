package selenium_practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class pagetest {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		Driverinit instancedriver = Driverinit.getInstance();
		driver = instancedriver.openBrowser();
		}
	
	@Test
	public void test() {
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	

}
