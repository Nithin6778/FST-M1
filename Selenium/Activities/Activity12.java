package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get(" https://v1.training-support.net/selenium/dynamic-controls");
		System.out.println(driver.getTitle());
		WebElement textbox=driver.findElement(By.id("input-text"));
		System.out.println("Textbox is enabled?:"+ textbox.isEnabled());
		WebElement enablebotton=driver.findElement(By.id("toggleInput"));
		enablebotton.click();
		System.out.println("Textbox is enabled? : "+ textbox.isEnabled());
//		
		

	}

}