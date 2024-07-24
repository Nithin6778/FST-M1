package Activities1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		Actions act=new Actions(driver);
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		System.out.println("Title of the Home page is :"+driver.getTitle());
		WebElement football=driver.findElement(By.id("draggable"));
		WebElement dropzone1=driver.findElement(By.id("droppable"));
		WebElement dropzone2=driver.findElement(By.id("dropzone2"));
		
		act.clickAndHold(football).moveToElement(dropzone1).pause(2000).release(football).build().perform();
		String verifydropzone1=driver.findElement(By.tagName("p")).getText();
		if(verifydropzone1.equals("Dropped!"))
		System.out.println("Ball Dropped at dropzone1");
			
		act.dragAndDrop(football, dropzone2).build().perform();
		String verifydropzone2=driver.findElement(By.tagName("p")).getText();
		if(verifydropzone2.equals("Dropped!"))
		System.out.println("Ball Dropped at dropzone2");
	}

}
