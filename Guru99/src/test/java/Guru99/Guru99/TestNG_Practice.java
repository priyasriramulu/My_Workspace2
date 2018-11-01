package Guru99.Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNG_Practice {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\Users\\AU0003A7\\My Workspace\\SG_Digital_Automation\\Drivers\\chromedriver.exe";
    public WebDriver driver ;
	@BeforeTest
	public void driver()
	{
		
	    System.out.println("launching firefox browser"); 
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
	}
  @Test
  public void f() 
  {
	  driver.get(baseUrl);
	  Reporter.log("URL is accessed");
	  String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
  }
  @Test
  public void g()
  {
	  driver.findElement(By.name("hello"));
  }
  @AfterTest
  public void terminateBrowser(){
      driver.close();
  }
}
