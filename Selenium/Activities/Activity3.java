package Activities1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get(" https://v1.training-support.net");
		System.out.println("Title of the Home page is :"+driver.getTitle());
		driver.findElement(By.xpath("//a[@id=\"about-link\"]")).click();
		System.out.println("Title of the new page is :"+driver.getTitle());
		driver.close();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://v1.training-support.net/selenium/login-form");
		System.out.println("Title of the Home page is :"+driver1.getTitle());
		driver1.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("Admin");
		driver1.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("password");
		//driver1.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button")).click();
		driver1.findElement(By.xpath("//button[@onclick=\"signIn()\"]")).click();
		driver1.close();
		

	}

}
