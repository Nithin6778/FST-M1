package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity1 {
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	}
		
		@Test
		  public void websitetitle() {
			Assert.assertEquals(driver.getTitle(),"Alchemy Jobs – Job Board Application");
		  }
		
		
		 @AfterClass
		  public void closebrowser() {
			 driver.close();
		  }


}
