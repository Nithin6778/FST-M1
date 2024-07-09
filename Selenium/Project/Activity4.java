package Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity4 {
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	}
		
		@Test
		  public void secondeheading() {
			String secondheading=driver.findElement(By.xpath("//h2[text()=\"Quia quis non\"]")).getText();			
			Assert.assertEquals(secondheading,"Quia quis non");
		  }
		
		
		 @AfterClass
		  public void closebrowser() {
			 driver.close();
		  }


}