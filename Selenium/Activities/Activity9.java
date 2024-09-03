package Activities1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://v1.training-support.net/selenium/ajax");
		driver.getTitle();
		driver.findElement(By.xpath("//button[text()=\"Change Content\"]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
		String printhello=driver.findElement(By.tagName("h1")).getText();
		System.out.println(printhello);
		String delayedtext=driver.findElement(By.xpath("//h3[1]")).getText();
		System.out.println(delayedtext);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));
		String latetext=driver.findElement(By.xpath("//h3")).getText();
		System.out.println(latetext);

	}

}
