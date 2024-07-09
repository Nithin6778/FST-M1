package Project;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity5 {
	WebDriver driver;
	  @BeforeClass
	  public void setUp() {
		//Setup Edge driver
		  WebDriverManager.edgedriver().setup();
		  //Initialize driver
		  driver = new EdgeDriver();
		  driver.manage().window().maximize();
	  }

	@Test
	public void myAccount() throws InterruptedException {
		//open the page
		  driver.get("https://alchemy.hguy.co/lms/");
		  //find navigation
		  driver.findElement(By.xpath("//nav"));
		  //Find my account in navigation bar
		  driver.findElement(By.linkText("My Account")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//h1"));
		  String ActualTitle = driver.getTitle();
		  System.out.println(ActualTitle);
		 Assert.assertEquals(ActualTitle, "My Account – Alchemy LMS");
	}

	  

	  @AfterClass
	  public void tearDown() {
		  //close driver
		  driver.close();
	  }

}
