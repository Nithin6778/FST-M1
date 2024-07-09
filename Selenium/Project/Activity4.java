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
public class Activity4 {
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
		  public void secondMostPopularCourse() {
			//open the page
			  driver.get("https://alchemy.hguy.co/lms/");
			  //find the second popular course
			  WebElement secondPopularCourse = driver.findElement(By.xpath("(//h3)[5]"));
			  String course=secondPopularCourse.getText();
			  Assert.assertEquals(course,"Email Marketing Strategies");
		  }
		  
		  @AfterClass
		  public void tearDown() {
			  //Close browser
			  driver.quit();
		  }


}
