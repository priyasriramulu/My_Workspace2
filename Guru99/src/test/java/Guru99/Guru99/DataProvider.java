package Guru99.Guru99;

import org.testng.annotations.Test;

import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class DataProvider {
  WebElement driver;
  
  @BeforeTest(groups = {"A","B"})
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\AU0003A7\\My Workspace\\SG_Digital_Automation\\Drivers\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://google.com");
  }

  @Test(dataProvider = "dp" , groups = "A")
  public void f(String Author, String searchkey) 
  {
	  WebElement searchtext = driver.findElement(By.name("q"));
	  searchtext.sendKeys(searchkey);
	  String str = searchtext.getAttribute("value");
	  Assert.assertTrue(str.equalsIgnoreCase(searchkey));
	  searchtext.clear();
	  System.out.println("Author :"+Author+" SearchKey : "+searchkey);
  }
  @Test(dataProvider = "dp" , groups = "B")
  public void g(String searchkey) 
  {
	  WebElement searchtext = driver.findElement(By.name("q"));
	  searchtext.sendKeys(searchkey);
	  String str = searchtext.getAttribute("value");
	  Assert.assertTrue(str.equalsIgnoreCase(searchkey));
	  searchtext.clear();
	  System.out.println(" SearchKey : "+searchkey);
  }
  
  @org.testng.annotations.DataProvider(name="dp")
  public Object[][] dp(ITestContext c) {
	  Object[][] grouparray = null;
	  for(String group:c.getIncludedGroups())
	  {
		  if(group.equalsIgnoreCase("A"))
		  {
			  grouparray = new Object[][] {{"guru99", "India"},{"priya","Singapore"},{"Laks","USA"}};
			  break;
		  }
		  else if(group.equalsIgnoreCase("B"))
		  {
			  grouparray = new Object[][] {{"Canada"},{"Germany"},{"UK"}};
			  break;
		  }
	  }
    
	return grouparray;
  }
}
