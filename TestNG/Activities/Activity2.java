package Activities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class Activity2 {
	WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.firefoxdriver().setup();
	  driver=new FirefoxDriver();
	  driver.get(" https://v1.training-support.net/selenium/target-practice");
  }
  @Test(priority=1)
  public void titleofpage() {
	  Assert.assertEquals(driver.getTitle(), "Target Practice");
	  
  }
  @Test(priority=2)
  public void blackButton() {
	  String text=driver.findElement(By.xpath("//button[text()=\"Black\"]")).getText();
	  Assert.assertEquals(text, "black");
  }
  @Test(priority=3,enabled=false)
  public void skiptest() {
	  String tagname=driver.findElement(By.xpath("//h1[text()=\"First header\"]")).getTagName();
	  Assert.assertEquals(tagname, "h1");
	  
	  System.out.println("This Test is Skipped.....");
  }
  @Test(priority=4)
  public void Skipexceptiontest() {
  throw new SkipException("Skipping test case");   
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
