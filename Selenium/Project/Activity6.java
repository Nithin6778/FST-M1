package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity6 {
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
	  public void login() throws InterruptedException  {
		//open the page
		  driver.get("https://alchemy.hguy.co/lms/");
		  driver.findElement(By.xpath("//nav"));
		  driver.findElement(By.linkText("My Account")).click();
		//  WebElement myaccount = driver.findElement(By.xpath("//h1"));
		  String ActualTitle = driver.getTitle();
		  System.out.println(ActualTitle);
		  //Find login button and click it
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  driver.findElement(By.xpath("//a[contains(text(),\'Login\')]")).click();
		  driver.findElement(By.id("user_login")).sendKeys("root");
		  //Find and enter password
		  driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		  //click on login button
		  driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		  Thread.sleep(5000);
		  //verify if user logged in
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='wp-admin-bar-my-account']")));
		  
	  }
	  
	  @AfterClass
	  public void tearDown() {
		  //close driver
		  driver.close();
	  }
}
