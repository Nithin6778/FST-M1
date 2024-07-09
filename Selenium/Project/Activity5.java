package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity5 {
WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	}
		
		@Test
		  public void jobtitle() {
			driver.findElement(By.linkText("Jobs")).click();
			Assert.assertEquals(driver.getTitle(),"Jobs – Alchemy Jobs");
		  }
		
		
		 @AfterClass
		  public void closebrowser() {
			 driver.close();
		  }


}


