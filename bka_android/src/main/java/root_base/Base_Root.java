package root_base;

import java.net.URL;

import java.util.HashMap;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public abstract class Base_Root <T> {

	public static AndroidDriver driver;
	
	public T clickonView(WebElement Btn) { // This method can be used to click function
		WebDriverWait wait = new WebDriverWait(driver, 60);
		try {
		wait.until(ExpectedConditions.visibilityOf(Btn));
		Btn.click();
		}catch(Exception e) {
			System.out.println("Button not found");
		}
		return (T) this;
	}
	
	public T Assertvalues(String Actual, String Expected) { // This method can be used for Asserts function
		WebDriverWait wait = new WebDriverWait(driver, 60);
		Assert.assertEquals(Actual, Expected);
		return (T) this;
	}
	
	public T ScrollDown() { // This Method can be used for scroll down function
	
		Dimension size = driver.manage().window().getSize();
		int starty = (int) (size.height*0.8);
		int endy = (int) (size.height*0.2);
		int startx = size.width/2;
		new TouchAction(driver).press(startx, starty).waitAction(300).moveTo(startx, endy).release().perform();
		return (T) this;
	}
	
	public T enterText(WebElement fieldname, String Text) {  // This method can be used for type function
		WebDriverWait wait = new WebDriverWait(driver, 60);
		try {
		wait.until(ExpectedConditions.visibilityOf(fieldname));// To Enter Text
		fieldname.clear();
		fieldname.sendKeys(Text);
		}catch(Exception e) {
			System.out.println("Element not found");
			
		}
		
		return (T) this;
		
	}
	
	public T initialization() throws InterruptedException {

	
		try {

			System.out.println("Launching App");

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.PLATFORM, "ANDROID");
			capabilities.setCapability(CapabilityType.VERSION, "9.0");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
			//capabilities.setCapability("ANDROID_HOME","C:\\Users\\kattaven\\AppData\\Local\\Android\\Sdk");
			capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			capabilities.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir") +"\\Resources\\app-debug-2.apk");
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

		}

		catch (Exception e) {

			System.out.println(e);
			
		}
		return (T) this;
		

	}	
	
	}
	
