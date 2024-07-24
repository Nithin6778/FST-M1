package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity8 {
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	}
		
		@Test(priority=1)
		  public void login() {
			driver.findElement(By.id("user_login")).sendKeys("root");
			driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
			driver.findElement(By.id("wp-submit")).click();
			Assert.assertEquals(driver.getTitle(), "Dashboard ‹ Alchemy Jobs — WordPress");
		}
		
		@AfterClass
		public void closebrowser() {
			driver.close();
		}


}
