package Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Activity2 {
		WebDriver driver;
		
		@BeforeClass
		public void setUp() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://alchemy.hguy.co/jobs");
		}
			
			@Test
			  public void pageheading() {
				String heading=driver.findElement(By.xpath("//h1[text()=\"Welcome to Alchemy Jobs\"]")).getText();			
				Assert.assertEquals(heading,"Welcome to Alchemy Jobs");
			  }
			
			
			 @AfterClass
			  public void closebrowser() {
				 driver.close();
			  }


	}

