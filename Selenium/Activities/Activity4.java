package Activities1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/target-practice");
		System.out.println("Title of the Home page is :"+driver.getTitle());
		String text=driver.findElement(By.xpath("//h3[@id=\"third-header\"]")).getText();
		System.out.println(text);
		String fifththheadercolour=driver.findElement(By.xpath("//h5[text()=\"Fifth header\"]")).getCssValue("color");
		System.out.println(fifththheadercolour);
		String properties= driver.findElement(By.xpath("//button[text()=\"Violet\"]")).getAttribute("class");
		System.out.println(properties);
		String greybuttontext=driver.findElement(By.xpath("//button[text()=\"Grey\"]")).getText();
		System.out.println(greybuttontext);
		driver.close();
		
		
		
	}

}
