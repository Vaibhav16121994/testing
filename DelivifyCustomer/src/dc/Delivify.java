package dc;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class Delivify {
	public static void main(String args[]){

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("automationName", "uiautomator2");
		caps.setCapability("udid", "ZW22265K8R"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.0");
		caps.setCapability("appPackage", "com.delivify.Delivify");
		caps.setCapability("appActivity", "com.delivify.Delivify.login.SplashScreen");
		caps.setCapability("noReset", "true");
		
		//Instantiate Appium Driver
		try    
		{		
			
			    //Just started		
			    Thread.sleep(5000);
			    AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			    Thread.sleep(5000);
			  
			    driver.findElement(By.id("com.delivify.Delivify:id/loc_txt")).click();
			    		
			    Thread.sleep(2000);
			    driver.findElements(By.id("com.delivify.Delivify:id/text1")).get(1).click();
			    Thread.sleep(2000);
			        
			    //Pets
			  
			    driver.findElement(By.id("com.delivify.Delivify:id/img_pets")).click();
			    Thread.sleep(5000);
			    driver.findElements(By.id("com.delivify.Delivify:id/img_main")).get(0).click();
			    Thread.sleep(5000);
			   
			    try{
			    	
			    WebElement preorder=driver.findElement(By.id("android:id/button1"));
			    
			    if(preorder.isDisplayed()){
			    	preorder.click();
			    }
			    
			    else{
			
			   driver.findElements(By.id("com.delivify.Delivify:id/btn_add")).get(0).click();
			    } 
			    }
			    
				catch(Exception e){
					
					System.out.println(e.getMessage());
				}
			    
			    Thread.sleep(5000);
			    
			    driver.navigate().back();
		} 
			/*    
			    Thread.sleep(2000);
			    driver.findElement(By.id("com.delivify.Delivify:id/loc_img")).click();
			    driver.findElement(By.linkText("Home")).click();
			    Thread.sleep(2000);
			    
			    //Logout
			    driver.findElement(By.id("com.delivify.Delivify:id/loc_img")).click();
			    Thread.sleep(2000);
			    driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Settings\"));")).click();		    
			    Thread.sleep(2000);
			    driver.findElement(By.id("com.delivify.Delivify:id/btn_settings")).click();
*/
		
		
			
			    
	catch(Exception e){
		
		System.out.println(e.getMessage());
	}
		
	}
 


}







 

























