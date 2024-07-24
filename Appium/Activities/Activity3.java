package examples;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity3 {
	AndroidDriver driver;

	@BeforeClass
	public void setup() throws MalformedURLException {
		UiAutomator2Options options=new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.google.android.keep");
		options.setAppActivity(".activities.BrowseActivity");
		options.noReset();
		@SuppressWarnings("deprecation")
		URL serverURL=new URL("http://localhost:4723/");
		driver=new AndroidDriver(serverURL,options);
	}

		
		@Test
	public void authOperations() {
			driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_5")).click();
			driver.findElement(AppiumBy.accessibilityId("plus")).click();
			driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_9")).click();
			driver.findElement(AppiumBy.accessibilityId("equals")).click();
			String result=driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final")).getText();
			System.out.println("addition of 5+9 : " + result);
			Assert.assertEquals(result, "14");
		}

			@Test
		public void subtraction() {
			driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_1")).click();
			driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_0")).click();
			driver.findElement(AppiumBy.accessibilityId("minus")).click();
			driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_5")).click();
			driver.findElement(AppiumBy.accessibilityId("equals")).click();
			String subtract=driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final")).getText();
			System.out.println("Subtraction of 10-5 is : " +subtract);
			Assert.assertEquals(subtract, "5");
			}

			@Test
		public void multiplication() {
			driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_5")).click();
			driver.findElement(AppiumBy.accessibilityId("multiply")).click();
			driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_1")).click();
			driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_0")).click();
			driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_0")).click();
			driver.findElement(AppiumBy.accessibilityId("equals")).click();
			String multiply=driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final")).getText();
			System.out.println("Multiplication of 5*100 is : " + multiply);
			Assert.assertEquals(multiply, "500");
			}
			@Test
			public void division() {
			driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_5")).click();
			driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_0")).click();
			driver.findElement(AppiumBy.accessibilityId("divide")).click();
			driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_2")).click();
			driver.findElement(AppiumBy.accessibilityId("equals")).click();
			String division=driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final")).getText();
			System.out.println("division of 50/2 is : " +division);
			Assert.assertEquals(division, "25");
			
			

}
}
