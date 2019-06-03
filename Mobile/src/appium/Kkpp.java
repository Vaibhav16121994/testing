package appium;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Kkpp {

	public static void main(String[] args) {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("automationName", "uiautomator2");	
		caps.setCapability("udid", "ZW22265K8R"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.0");
		caps.setCapability("appPackage", "com.andesoftconsulting.kaam_pe");
		caps.setCapability("appActivity", "com.andesoftconsulting.kaam_pe.login.SplashScreen");
		caps.setCapability("noReset", "true");

		
		try{
		
			//First Commit
		Thread.sleep(5000);	
		AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	  
		Thread.sleep(5000);	
	   driver.findElementById("com.andesoftconsulting.kaam_pe:id/editTextMobileNumber").sendKeys("9819957656");
	   // driver.findElement(By.xpath("//*[@resource-id='com.andesoftconsulting.kaam_pe:id/editTextMobileNumber']")).sendKeys("9819957656");
	    driver.hideKeyboard();
	   
	    driver.findElementById("com.andesoftconsulting.kaam_pe:id/editTextPassword").sendKeys("1234");
	    //driver.findElement(By.xpath("//*[@resource-id='com.andesoftconsulting.kaam_pe:id/editTextPassword']")).sendKeys("1234");
	    driver.hideKeyboard();
	  
	   driver.findElementById("com.andesoftconsulting.kaam_pe:id/btnLogin").click();
	    //driver.findElement(By.xpath("//*[@resource-id='com.andesoftconsulting.kaam_pe:id/btnLogin']")).click();
	    Thread.sleep(5000);
	    
	    System.out.println("Donee!!");
	 
	 
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
	}
	}


