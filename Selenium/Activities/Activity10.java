package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get(" https://v1.training-support.net/selenium/dynamic-controls");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("toggled")).click();
		WebElement checkbox=driver.findElement(By.className("willDisappear"));
		
		System.out.println("CheckBox is visible?:"+ checkbox.isDisplayed());
		WebElement botton=driver.findElement(By.id("toggleCheckbox"));
		botton.click();
		
		System.out.println("Remove checkbox is visible : "+ checkbox.isDisplayed());
		
		

	}

}
