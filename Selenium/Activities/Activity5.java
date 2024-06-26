package selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		Actions act=new Actions(driver);
		driver.get(" https://v1.training-support.net/selenium/input-events");
		System.out.println("Title of the Home page is :"+driver.getTitle());		
		act.click().pause(2000).build().perform();
		System.out.println("Left Click :" +driver.findElement(By.className("active")).getText());
		act.doubleClick().pause(2000).build().perform();
		System.out.println("double click :" + driver.findElement(By.className("active")).getText());
		act.contextClick().click().pause(2000).build().perform();
		System.out.println("rightclick  :" +driver.findElement(By.className("active")).getText());
		
		
		
	}

}
