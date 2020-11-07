package selenium_practice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Practice.constants;
import Practice.testBase;

public class fb_test {
	
	@BeforeMethod
	public void setup() {
		testBase.init();
	}
	
	@Test (priority=1)
	public void verifytitle() {
		String title = testBase.driver.getTitle();
		//System.out.println(title);
		Assert.assertEquals(title, constants.pagetitle);	
	}
	@Test (priority=2)
	public void login() {
		WebElement username = testBase.driver.findElement(By.id("email"));
		WebElement password =  testBase.driver.findElement(By.id("pass"));
		username.sendKeys("93prabha@gmail.com");
		password.sendKeys("22091993");
		WebElement login = testBase.driver.findElement(By.id("loginbutton"));
		login.click();
		System.out.println(testBase.driver.getTitle());
	}
	
	@AfterMethod
	public void teardown() {
		testBase.quit();
	}

}
