package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity6 {
WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		driver.manage().window().maximize();
	}
		
		@Test
		  public void websitetitle() throws InterruptedException {
			driver.findElement(By.linkText("Jobs")).click();
			driver.findElement(By.id("search_keywords")).sendKeys("Banking");
			driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//h3[text()=\"SAP Testing\"]")).click();
			driver.findElement(By.xpath("//input[@value='Apply for job']")).click();
			Thread.sleep(5000);
			String mail=driver.findElement(By.linkText("abc@gmail.com")).getText();
	
			System.out.println(mail);
			
			
			
			
		  }
		
		
		 @AfterClass
		  public void closebrowser() {
			// driver.close();
		  }


}


