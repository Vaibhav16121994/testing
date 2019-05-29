package appium;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DelivifyRider {

	public static void main(String[] args) {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "ZW22265K8R"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.0");
		caps.setCapability("appPackage", "delivify.app.rider");
		caps.setCapability("appActivity", "delivify.app.rider.Launcher");
		caps.setCapability("noReset", "true");
		
		//Instantiate Appium Driver
		try    
		
		{				  
			    
			    AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
				Thread.sleep(5000);
				
				driver.findElementById("delivify.app.rider:id/driver_username").sendKeys("test@gmail.com");
				driver.hideKeyboard();
				Thread.sleep(5000);
				
				driver.findElementById("delivify.app.rider:id/driver_id").sendKeys("9773555644");
				driver.hideKeyboard();
				Thread.sleep(5000);
				
				driver.findElementById("delivify.app.rider:id/driver_pass").sendKeys("123456");
				driver.hideKeyboard();
				Thread.sleep(5000);
				
				driver.findElementById("delivify.app.rider:id/login_btn").click();
				Thread.sleep(5000);
				
				driver.findElementById("android:id/button1").click();
				Thread.sleep(5000);
				
				driver.findElementById("delivify.app.rider:id/start_end_day_btn").click();
                System.out.println("Duty Started");
                
                driver.findElementById("").click();
	
				}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
	}

	}


