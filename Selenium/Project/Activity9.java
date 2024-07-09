package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity9 {
	WebDriver driver;
	WebDriver javaScriptExecuter;
	
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
	}
		
		@Test(priority=1)
		  public void login() {
			driver.findElement(By.id("user_login")).sendKeys("root");
			driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
			driver.findElement(By.id("wp-submit")).click();
			driver.findElement(By.xpath("//div[text()=\"Job Listings \"]")).click();
			driver.findElement(By.linkText("Add New")).click();
			
		}
		@Test(priority=2)
		public void pagedown() {
			driver.findElement(By.xpath("//textarea[@id='post-title-0']")).sendKeys("Fullstacktester");
			driver.findElement(By.tagName("p")).sendKeys("ibm");
			driver.findElement(By.id("job_listing_data")).click();
			JavascriptExecutor js = (JavascriptExecutor)driver;			
			js.executeScript("window.scrollBy(0,3000)");
		}
		@Test(priority=3)
		public void details() throws InterruptedException {
			driver.findElement(By.name("_company_website")).sendKeys("www.ibm.com");
			driver.findElement(By.name("_company_twitter")).sendKeys("sri@ibm");
			driver.findElement(By.name("_job_location")).sendKeys("hyderabad");
			driver.findElement(By.name("_company_name")).sendKeys("IBM");
			driver.findElement(By.name("_company_tagline")).sendKeys("Big Blue");
			driver.findElement(By.name("_company_name")).sendKeys("IBM");
			driver.findElement(By.name("_company_video")).sendKeys("C:\\Users\\SriLakshmiPoka\\Downloads\\ibm.mp4");
			driver.findElement(By.id("_filled")).click();
			driver.findElement(By.id("_featured")).click();
			driver.findElement(By.id("_job_expires")).sendKeys("07/29/2024");
			driver.findElement(By.xpath("//button[contains(text(),'Publish…')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div/button")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//a[@class='components-button is-secondary' and contains(text(), 'View Job')]")).click();
			String header=driver.findElement(By.className("entry-title")).getText();
			System.out.println(header);
			
		}
		@AfterClass
		public void closebrowser() {
			driver.close();
		}


}
