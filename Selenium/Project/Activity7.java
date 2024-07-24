package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Activity7 {
WebDriver driver;
WebDriver javaScriptExecuter; 
	
@BeforeClass
public void setUp() {
	WebDriverManager.firefoxdriver().setup();
	driver=new ChromeDriver();
	driver.get("https://alchemy.hguy.co/jobs");
	driver.manage().window().maximize();
}
	
	@Test(priority=1)
	  public void postingjob() {
		driver.findElement(By.linkText("Post a Job")).click();
	  }
	@Test(priority=2)
	public void filldetails() {
		driver.findElement(By.id("create_account_email")).sendKeys("srilakshmipokas32@gmail.com");
		driver.findElement(By.id("job_title")).sendKeys("Qualityengineer@ibm");
		driver.findElement(By.id("job_location")).sendKeys("india");
		WebElement dropdown=driver.findElement(By.id("job_type"));
		Select select=new Select(dropdown);
		select.selectByIndex(1);		
		driver.switchTo().frame("job_description_ifr");
		
		driver.findElement(By.xpath("//body[@data-id=\"job_description\"]")).sendKeys("description");
		driver.switchTo().defaultContent();
		JavascriptExecutor js = (JavascriptExecutor)driver;			
		js.executeScript("window.scrollBy(0,3000)");
		
		driver.findElement(By.xpath("//*[@id=\"application\"]")).sendKeys("sri@ibm.com");
		
	}
		@Test(priority=3)
		public void companydetails() {	
		driver.findElement(By.id("company_name")).sendKeys("IBM");
		driver.findElement(By.id("company_website")).sendKeys("ibm.com");
		driver.findElement(By.id("company_tagline")).sendKeys("BIG BLUE");
		driver.findElement(By.id("company_video")).sendKeys("C:\\Users\\SriLakshmiPoka\\Downloads\\ibm.mp4");
		driver.findElement(By.id("company_twitter")).sendKeys("sri@ibm");
		driver.findElement(By.id("company_logo")).sendKeys("C:\\Users\\SriLakshmiPoka\\Desktop\\ibm.png");
		driver.findElement(By.name("submit_job")).click();
		driver.findElement(By.id("job_preview_submit_button")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.linkText("Jobs")).click();
		driver.findElement(By.id("search_keywords")).sendKeys("Qualityengineer@ibm");
		driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
		
		
		
	}
	
	 @AfterClass
	  public void closebrowser() {
		driver.quit();
	  }


}