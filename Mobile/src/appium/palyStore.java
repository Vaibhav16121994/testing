package appium;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class palyStore {

	public static void main(String[] args) {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "ZW22265K8R"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.0");
		caps.setCapability("appPackage", "com.android.vending");
		caps.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");
		caps.setCapability("noReset", "true");
		
		//Instantiate Appium Driver
		try    
		
		{				  
			Thread.sleep(5000);
			    AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
				Thread.sleep(5000);
				driver.findElementById("com.android.vending:id/search_box_idle_text").click();
				Thread.sleep(5000);
				driver.findElementById("com.android.vending:id/search_box_text_input").sendKeys("Google");
				Thread.sleep(5000);
				System.out.println("Done");
				
	}
catch(Exception e){
	System.out.println(e.getMessage());
}

}
}