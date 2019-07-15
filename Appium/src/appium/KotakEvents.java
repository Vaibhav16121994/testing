package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidDriver;


public class KotakEvents {
public static void main(String[] args) throws InterruptedException {
		
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "ZW22265K8R"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.0");
		caps.setCapability("appPackage", "com.andesoft.matrixmobile");
		caps.setCapability("appActivity", "com.andesoft.matrixmobile.SplashScreenActivity");
		caps.setCapability("noReset", "true");
		
		//Instantiate Appium Driver
		try    
		
		{				
			    Thread.sleep(5000);  
			    AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		      
			   // new WebDriverWait(driver,100).until(ExpectedConditions.elementToBeClickable(By.id("com.andesoft.matrixmobile:id/et_email_id")));
			    Thread.sleep(5000);
				driver.findElementById("com.andesoft.matrixmobile:id/et_email_id").sendKeys("debraj.das");
                driver.hideKeyboard();
				Thread.sleep(5000);
				driver.findElementById("com.andesoft.matrixmobile:id/et_otp").sendKeys("Kotak@123");
				driver.hideKeyboard();
				Thread.sleep(5000);
				driver.findElementById("com.andesoft.matrixmobile:id/ab_Login").click();
				
				Thread.sleep(9000);
				
				driver.findElementsById("com.andesoft.matrixmobile:id/standard_spinner_format").get(0).click();
				driver.findElementsById("com.andesoft.matrixmobile:id/standard_spinner_format").get(1).click();
			
				Thread.sleep(9000);
				
				System.out.println(" Login Done");
				
				driver.findElementById("com.andesoft.matrixmobile:id/ibNavigationDrawer").click();
				
				Thread.sleep(5000);
			   
				driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Logout\"));")).click();

				Thread.sleep(5000);
			    
				System.out.println("Logout done");   
				
		} 
		
		catch (MalformedURLException e) 
		
		{
			System.out.println(e.getMessage());
		   
		}
	}
}


//	com.andesoft.matrixmobile:id/tvTitle



