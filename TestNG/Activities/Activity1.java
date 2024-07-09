package Activities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity1 {
	WebDriver driver;
  @Test(priority=1)
  public void homepageTest () {
	  Assert.assertEquals(driver.getTitle(),"Training Support");
	  driver.findElement(By.id("about-link")).click();
	  
  }
  @Test(priority=2)
  public void aboutpageTest () {
	  Assert.assertEquals(driver.getTitle(),"About Training Support");
  }
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.firefoxdriver().setup();
	  driver=new FirefoxDriver();
	  driver.get(" https://v1.training-support.net");
  }

  @AfterClass
  public void teardown() {
	  driver.close();
  }

}
