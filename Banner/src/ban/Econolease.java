package ban;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Econolease {
  WebDriver driver;
  
	@Test(priority=0)
  public void Login() throws InterruptedException {
		
		driver.findElement(By.id("Username")).sendKeys("rehana");
		driver.findElement(By.id("Password")).sendKeys("Andesoft1");
		driver.findElement(By.name("button")).click();
		driver.findElement(By.xpath("//button[@class='ui blue button']")).click();
		Thread.sleep(5000);
	  
  }
	
	@Test(priority=1)
	  public void NewLease() throws InterruptedException {
	 //1
		driver.findElement(By.linkText("New Lease")).click();
		driver.findElement(By.xpath("//div[@class='ui radio checkbox prop-btn']")).click();
		driver.findElement(By.id("EquipmentDealer")).sendKeys("Proprietorship");
		driver.findElement(By.id("EquipmentDescription")).sendKeys("Proprietorship");
		driver.findElement(By.id("Amount")).sendKeys("500");
		driver.findElement(By.xpath("//span[@class='ui radio checkbox rd-btn1']")).click();
		
		/*driver.findElement(By.id("corp-business")).click();
		
		driver.findElements(By.xpath("//i[@class='plus icon']")).get(0).click();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,10)");
		Thread.sleep(5000);
		
		driver.findElement(By.id("OperatingName")).sendKeys("Prop");
		driver.findElement(By.id("YearsInBusiness")).sendKeys("5");
		driver.findElement(By.id("FirstName")).sendKeys("Ande");
		driver.findElement(By.id("LastName")).sendKeys("Soft");
			
		driver.findElement(By.id("DateofBirth")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='ui input left icon']//table[@class='ui celled center aligned unstackable table three column year']//span[@class='next link']")).click();
		Thread.sleep(5000);
		
        List<WebElement> allyear=driver.findElements(By.xpath("//table[@class='ui celled center aligned unstackable table three column year']//td"));
		
		for(WebElement ele:allyear)
		{
			
			String year=ele.getText();
			System.out.println("All year:"+year);
			
			if(year.equalsIgnoreCase("2025"))
			{
				ele.click();
				break;
			}
			Thread.sleep(2000);
		}
			
		
		 List<WebElement> allmonth=driver.findElements(By.xpath("//table[@class='ui celled center aligned unstackable table three column month']//td"));
			
			for(WebElement ele:allmonth)
			{
				
				String month=ele.getText();
				System.out.println("All month:"+month);
				
				if(month.equalsIgnoreCase("May"))
				{
					ele.click();
					break;
				}
				Thread.sleep(2000);
			}
	
      List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui celled center aligned unstackable table seven column day']//td"));
			
			for(WebElement ele:alldates)
			{
				
				String date=ele.getText();
				System.out.println("All date:"+date);
				
				if(date.equalsIgnoreCase("1"))
				{
					ele.click();
					break;
				}
				Thread.sleep(2000);
			}	
		
			driver.findElement(By.id("Cell")).sendKeys("000000000");
			driver.findElement(By.id("Email")).sendKeys("Ande@soft.com");	
			*/
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,50)");
		Thread.sleep(5000);
		
		driver.findElement(By.id("applicant-gurantee")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='ap-guarantee field radio_label']//label[contains(text(),'Yes')]")).click();
		Thread.sleep(5000);
		
	}
	
	
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\Desktop\\Eclipse\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://devportal.econolease.com/");
        driver.manage().window().maximize();
		Thread.sleep(5000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

