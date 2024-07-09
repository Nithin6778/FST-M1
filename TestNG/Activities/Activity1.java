package Activities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
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
	  //open the page
	  driver.get("https://v1.training-support.net");
  }
  
  @Test(priority = 1)
  public void homePageTest() {
	  //Assert page
	  Assert.assertEquals(driver.getTitle(), "Training Support");
	  
	  //Find an click about us page
	  driver.findElement(By.id("about-link")).click();
  }
 

  @AfterClass
  public void afterClass() {
	  //Close browser
	  driver.quit();
  }

}
