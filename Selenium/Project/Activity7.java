package Project;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Activity7 {
	WebDriver driver;
	  @BeforeClass
	  public void setUp() {
		//Setup Edge driver
		  WebDriver.edgedriver().setup();
		  //Initialize driver
		  driver = new EdgeDriver();
		  driver.manage().window().maximize();
	  }
	  @Test
	  public void noOfCourse() {
			//open the page
		  driver.get("https://alchemy.hguy.co/lms/");
		  //find navigation
		  driver.findElement(By.xpath("//nav"));
		  //Find all courses in navigation bar
		  driver.findElement(By.linkText("All Courses")).click();
		  //Find the courses in page
		  List<WebElement> course = driver.findElements(By.xpath("//div[@class='ld_course_grid col-sm-8 col-md-4 ']"));
		  int noOfCourses = course.size();
		  System.out.println("Number of courses: "+noOfCourses);
		  
	  }
	  
	  @AfterClass
	  public void tearDown() {
		  //close driver
		  driver.close();
	  }
}
