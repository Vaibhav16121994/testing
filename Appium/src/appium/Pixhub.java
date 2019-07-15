package appium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Pixhub {

	
	@Test
	public void f(){
		
		try    
		
		{	
		//Comments..	
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "ZW22265K8R"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "7.0");
		caps.setCapability("appPackage", "com.andesoftconsulting.pixhub");
		caps.setCapability("appActivity", "com.andesoftconsulting.pixhub.SplashScreenActivity");
		caps.setCapability("noReset", "true");
			
			    AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
				Thread.sleep(5000);	
				
			
		        driver.findElementById("com.andesoftconsulting.pixhub:id/editTextUserName").sendKeys("6161651616");
				driver.hideKeyboard();
				driver.findElementById("com.andesoftconsulting.pixhub:id/editTextPassword").sendKeys("994");
				driver.hideKeyboard();
				driver.findElementById("com.andesoftconsulting.pixhub:id/btnLogin").click();
				Thread.sleep(5000);
				
	    
		}	
			
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		}
	
	

}


