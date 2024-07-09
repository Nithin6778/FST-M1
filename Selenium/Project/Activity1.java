package Project;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity1 {

	WebDriver driver;
	@BeforeClass
	public void setUp() {
		//Setup Edge driver
		  WebDriverManager.edgedriver().setup();
		  //Initialize driver
		  driver = new EdgeDriver();
		  
	  }

	  @Test
	  public void verifyWebsiteTitle() {  
		//open the page
		  driver.get("https://alchemy.hguy.co/lms/");
		  String title=driver.getTitle();
		  System.out.println(title);
		//Assert page
		  Assert.assertEquals(driver.getTitle(), "Alchemy LMS – An LMS Application");
		  
	  }
	  
	  @AfterClass
	  public void tearDown() {
		 //Close driver
		  driver.quit();  
		  }

	}
