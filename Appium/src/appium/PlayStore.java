package appium;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

  public class PlayStore 
 {
	   
  @Test
  public void f() {
	  try{
		     DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName", "My Phone");
			caps.setCapability("udid", "7PFMEQ6LZPW8UWTC"); //Give Device ID of your mobile phone
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "6.0");
			caps.setCapability("appPackage", "com.android.vending");
			caps.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");
			caps.setCapability("noReset", "true");
		  
			AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			Thread.sleep(5000);	  	    
			driver.findElementById("com.android.vending:id/search_box_idle_text").click();
			//com.android.vending:id/search_box_idle_text
			Thread.sleep(5000);
			driver.findElementById("com.android.vending:id/search_box_text_input").sendKeys("Google");
			Thread.sleep(5000);
			System.out.println("Done");
			driver.quit();
	  }
	  catch(Exception e){
		  System.out.println(e.getMessage());
	  }
  }
}
