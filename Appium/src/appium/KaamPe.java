package appium;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class KaamPe {
	
	public static void main(String args[]){
	
        DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "ZW22265K8R"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.0");
		caps.setCapability("appPackage", "com.andesoftconsulting.kaam_pe");
		caps.setCapability("appActivity", "com.andesoftconsulting.kaam_pe.login.SplashScreen");
		caps.setCapability("noReset", "true");
		caps.setCapability("ignoreUnimportantViews", "true");
		
		try{
			
		Thread.sleep(5000);	
		AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	    Thread.sleep(5000);
	   
	    driver.findElement(By.id("com.andesoftconsulting.kaam_pe:id/editTextMobileNumber")).sendKeys("9819957656");;
	    driver.hideKeyboard();
	   
	    driver.findElement(By.id("com.andesoftconsulting.kaam_pe:id/editTextMobileNumber")).sendKeys("1234");;
	    driver.hideKeyboard();
	  
	    driver.findElement(By.id("com.andesoftconsulting.kaam_pe:id/btnLogin")).click();
	    Thread.sleep(5000);
	    
	    System.out.println("Donee!!");
	 
	 
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
