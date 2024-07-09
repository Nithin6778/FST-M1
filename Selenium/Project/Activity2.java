package Project;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity2 {
	WebDriver driver;

	  @BeforeClass
	  public void setUp() {
		//Setup Edge driver
		  WebDriverManager.edgedriver().setup();
		  //Initialize driver
		  driver = new EdgeDriver();
		  
	  }

	  @Test
	  public void heading() {  
		//open the page
		  driver.get("https://alchemy.hguy.co/lms/");
		//Find the heading  
		 WebElement heading = driver.findElement(By.xpath("//h1"));
		 String acutalheading = heading.getText();
		  Assert.assertEquals(acutalheading, "Learn from Industry Experts");	  
	  }

	  
	  @AfterClass
	  public void tearDown() {
		  //Browser Close
		  driver.close();
	  }

	}

