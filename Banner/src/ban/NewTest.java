package ban;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	
  @Test
  public void f() {

      List<WebElement> items = driver.findElements(By.xpath("//ol[@class='a-carousel']//li[@class='a-carousel-card']"));
      ArrayList list1 = new ArrayList();
     

      for (int i = 0; i < items.size(); i++) {
	  
  }
      System.out.println("No of banners:"+items.size());

  }
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAIBHAV\\Desktop\\Eclipse\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?ie=UTF8&tag=googinabkkenshoo-21&ascsubtag=_k_EAIaIQobChMIgbGxyYCB4QIVj4BwCh0LqAA3EAAYASAAEgKQ5vD_BwE_k_&gclid=EAIaIQobChMIgbGxyYCB4QIVj4BwCh0LqAA3EAAYASAAEgKQ5vD_BwE");
        driver.manage().window().maximize();
		Thread.sleep(5000);
  }
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}


//   views-slideshow-cycle-main-frame views_slideshow_cycle_teaser_section
//
//