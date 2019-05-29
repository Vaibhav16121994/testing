package appium;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class Delivify {
	public static void main(String args[]){

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "ZW22265K8R"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.0");
		caps.setCapability("appPackage", "com.delivify.Delivify");
		caps.setCapability("appActivity", "com.delivify.Delivify.login.SplashScreen");
		caps.setCapability("noReset", "true");
		
		//Instantiate Appium Driver
		try    
		{		//Just started		
			    Thread.sleep(5000);
			    AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			    Thread.sleep(5000);
			  
			    driver.findElement(By.linkText("DELIVER TO")).click();
			    		
			    Thread.sleep(2000);
			    driver.findElements(By.id("com.delivify.Delivify:id/text1")).get(4).click();
			    Thread.sleep(2000);
			    
			    //Pets
			    driver.findElement(By.id("com.delivify.Delivify:id/img_pets")).click();
			    Thread.sleep(2000);
			    
			    driver.findElements(By.id("com.delivify.Delivify:id/img_main")).get(0).click();
			    Thread.sleep(2000);
			    driver.findElement(By.linkText("Dog Food - Dry")).click();
			    driver.findElement(By.linkText("Cat Food - Dry")).click();
			    Thread.sleep(2000);
			    
			    driver.navigate().back();
			    
			    
			    Thread.sleep(2000);
			    
			    
			    driver.findElement(By.id("com.delivify.Delivify:id/loc_img")).click();
			    driver.findElement(By.linkText("Home")).click();
			    Thread.sleep(2000);
			    
			    System.out.println("Done");

		
		}
	catch(Exception e){
		
		System.out.println(e.getMessage());
	}
		
	}
 


}
