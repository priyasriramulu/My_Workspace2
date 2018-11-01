package Guru99.Guru99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Parameters {
  @Test
  @org.testng.annotations.Parameters({"author","searchkey"})
  public void f(String author, String searchkey) throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\AU0003A7\\My Workspace\\SG_Digital_Automation\\Drivers\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://google.com");
      
      WebElement search = driver.findElement(By.name("q"));
      search.sendKeys(searchkey);
      System.out.println("welcome author :"+author+" Search key is :"+searchkey);
     // WebDriverWait wait = new WebDriverWait(driver, 20);
     Thread.sleep(3000);
      System.out.println("Value in Google Search Box = "+search.getAttribute("value"));
      Assert.assertTrue(search.getAttribute("value").equalsIgnoreCase(searchkey));
  }
  @Test(enabled = false)
  public void g()
  {
	  System.out.println("test fiunction F");
  }
  public void h(String searchkey)
  {
	  
  }
}
