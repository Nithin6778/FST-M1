package Project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity8 {
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
	  public void contactUs() throws InterruptedException {
		//open the page
		  driver.get("https://alchemy.hguy.co/lms/");
		  //find navigation
		  driver.findElement(By.xpath("//nav"));
		  //Find contact us in navigation bar
		  driver.findElement(By.linkText("Contact")).click();
		  //Find the Full name field in page
		  driver.findElement(By.xpath("//input[@id='wpforms-8-field_0']")).sendKeys("Mahesh Babu Mandalapu");
		  driver.findElement(By.xpath("//input[@id='wpforms-8-field_1']")).sendKeys("Mahesh@gmail.com");
		  driver.findElement(By.xpath("//input[@id='wpforms-8-field_3']")).sendKeys("Physics");
		  driver.findElement(By.xpath("//textarea[@id='wpforms-8-field_2']")).sendKeys("Hey, you are logged in");
		 //click submit button
		  driver.findElement(By.xpath("//button[@id='wpforms-submit-8']")).click();
		  Thread.sleep(5000);
		//Find the text after submission
		  String message = driver.findElement(By.xpath("//p[text()='Thanks for contacting us! We will be in touch with you shortly.']")).getText();
		  System.out.println(message);
		 
	  }
	  
	  @AfterClass
	  public void tearDown() {
		  //close driver
		  driver.close();
	  }
}
