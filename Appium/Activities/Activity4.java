package examples;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity4 {
	AndroidDriver driver;

	@BeforeClass
	public void setup() throws MalformedURLException {
		UiAutomator2Options options=new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.google.android.contacts");
		options.setAppActivity("com.android.contacts.activities.PeopleActivity");
		options.noReset();
		@SuppressWarnings("deprecation")
		URL serverURL=new URL("http://localhost:4723/");
		driver=new AndroidDriver(serverURL,options);
	}
	@Test
	public void addcontact() throws InterruptedException {
		driver.findElement(AppiumBy.id("com.google.android.contacts:id/floating_action_button")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"First name\"]")).sendKeys("Appium");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Last name\"]")).sendKeys("test");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Phone\"]")).sendKeys("998898989");
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.google.android.contacts:id/toolbar_button\"]")).click();
		String contact=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.contacts:id/large_title\"]")).getText();
		Assert.assertEquals(contact, "Appium test");
}
}
