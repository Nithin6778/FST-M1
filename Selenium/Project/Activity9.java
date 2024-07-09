package Project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity9 {
	 WebDriver driver;
	  @BeforeClass
	  public void setUp() {
		//Setup Edge driver
		  WebDriverManager.edgedriver().setup();
		  //Initialize driver
		  driver = new EdgeDriver();
		  driver.manage().window().maximize();
	  }
	  
	  @Test(priority = 1)
	  public void myAccount() {
		//open the page
		  driver.get("https://alchemy.hguy.co/lms");
		//find navigation
		  driver.findElement(By.xpath("//nav"));
		  driver.findElement(By.linkText("My Account")).click();
			  String ActualTitle = driver.getTitle();
			  System.out.println(ActualTitle);
	  }
	@Test(priority = 2)
	public void login() {
			  //Find login button and click it
			  
			  driver.findElement(By.xpath("//a[contains(text(),\'Login\')]")).click();
			  driver.findElement(By.id("user_login")).sendKeys("root");
			  //Find and enter password
			  driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
			  //click on login button
			  driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
			  System.out.println("Login successfull");
	}
	@Test(priority = 3)	
	public void allCourse() {
			//find navigation
			  driver.findElement(By.xpath("//nav"));
			//Find all courses in navigation bar
			  driver.findElement(By.linkText("All Courses")).click();
	}
	@Test(priority =4)
	public void selectCourse() {
			 driver.findElement(By.xpath("(//a[text()='See more...'])[1]")).click();
			 driver.findElement(By.xpath("//div[@class='ld-item-title']")).click();
			  //verifying the title of the course
			  String courseTitle = driver.findElement(By.xpath("//div[@class='ld-focus-content']/h1")).getText();
			  System.out.print("Course Title is : " + courseTitle);
			  Assert.assertEquals(courseTitle, "Developing Strategy");
			  String status = driver.findElement(By.xpath("//span[@class='ld-lesson-list-progress']")).getText();
			  Assert.assertEquals(status, "100% COMPLETE");
			
	}
		  

	  
	  @AfterClass
	  public void tearDown() {
		  //close driver
		  driver.close();
	  }
}
