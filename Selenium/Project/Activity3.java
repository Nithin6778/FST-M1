package Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity3 {
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://alchemy.hguy.co/jobs");
	}
		
		@Test
		  public void imageurl() {
			String imageurl=driver.findElement(By.xpath("//img[@class='attachment-large size-large wp-post-image']")).getAttribute("src");		
			System.out.println(imageurl);
		  }
		
		
		 @AfterClass
		  public void closebrowser() {
			 driver.close();
		  }


}