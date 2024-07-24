package examples;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity1 {
	AndroidDriver driver;
	
	
	@BeforeClass
	public void setup() throws MalformedURLException {
		UiAutomator2Options options=new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.google.android.calculator");
		options.setAppActivity("com.android.calculator2.Calculator");
		options.noReset();
		@SuppressWarnings("deprecation")
		URL serverURL=new URL("http://localhost:4723/");
		driver=new AndroidDriver(serverURL,options);
	}
		
		@Test
		public void multiply() {
			driver.findElement(AppiumBy.id("digit_9")).click();
			driver.findElement(AppiumBy.accessibilityId("multiply")).click();
			driver.findElement(AppiumBy.id("digit_5")).click();
			driver.findElement(AppiumBy.accessibilityId("equals")).click();
			String Result=driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final")).getText();
			Assert.assertEquals(Result, "45");			
			
		}
	
	}
	


