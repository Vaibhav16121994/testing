package appium;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DelivifyVMS {
	
	public static void main(String args[]){

	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("deviceName", "My Phone");
	caps.setCapability("udid", "ZW22265K8R"); //Give Device ID of your mobile phone
	caps.setCapability("platformName", "Android");
	caps.setCapability("platformVersion", "7.0");
	caps.setCapability("appPackage", "com.delivify.vms.vendor");
	caps.setCapability("appActivity", "com.delivify.vms.vendor.MainActivity");
	caps.setCapability("noReset", "true");
	
	//Instantiate Appium Driver
	try    
	
	{				
		    
		    AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			Thread.sleep(5000);
			driver.findElementById("com.delivify.vms.vendor:id/edit_username").sendKeys("4465");
			driver.hideKeyboard();
			Thread.sleep(5000);
			driver.findElementById("com.delivify.vms.vendor:id/edit_password").sendKeys("105177");
			driver.hideKeyboard();
			Thread.sleep(5000);
			driver.findElementById("com.delivify.vms.vendor:id/btn_login").click();
			Thread.sleep(5000);
			driver.findElementById("com.delivify.vms.vendor:id/btn_signout").click();
			driver.findElementById("android:id/button1").click();
			Thread.sleep(5000);
			System.out.println("Login Logout Done");
			
			
			
			
}
catch(Exception e){
	System.out.println(e.getMessage());
}
}
}