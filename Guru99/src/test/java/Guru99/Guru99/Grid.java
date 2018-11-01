package Guru99.Guru99;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class Grid {
	public WebDriver driver;
	public String URLstring,node;
  
  @BeforeTest
  public void LaunchBrowser(String browser) throws IOException 
  {
	  URLstring = "http://www.calculator.net";
	  if(browser.equalsIgnoreCase("Firefox"))
	  {
		  System.out.println("Browser is Firefox");
		  node = "";
		  DesiredCapabilities dc = new DesiredCapabilities().firefox();
		  dc.setBrowserName("geckodriver");
		  driver = new RemoteWebDriver(new java.net.URL(node),dc);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.navigate().to(URLstring);
		  driver.manage().window().maximize();
	  }
	  else if(browser.equalsIgnoreCase("IE"))
	  {
		  System.out.println("Browser is IE");
		  node = "";
		  DesiredCapabilities dc = new DesiredCapabilities().internetExplorer();
		  dc.setBrowserName("internetexplorer");
		  driver = new RemoteWebDriver(new java.net.URL(node),dc);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.navigate().to(URLstring);
		  driver.manage().window().maximize();
	 }
	  else if(browser.equalsIgnoreCase("Chrome"))
	  {
		  System.out.println("Browser is chrome");
		  node = "";
		  DesiredCapabilities dc = new DesiredCapabilities().chrome();
		  dc.setBrowserName("chromedriver");
		  driver = new RemoteWebDriver(new java.net.URL(node),dc);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.navigate().to(URLstring);
		  driver.manage().window().maximize();
	  }
  }
  @Test
  public void calculatepercent() {
		// Click on Math Calculators
		driver.findElement(By.xpath("//a[contains(text(),'Math')]")).click();
		// Click on Percent Calculators
		driver.findElement(
				By.xpath("//a[contains(text(),'Percentage Calculator')]"))
				.click();
		// Enter value 17 in the first number of the percent Calculator
		driver.findElement(By.id("cpar1")).sendKeys("17");
		// Enter value 35 in the second number of the percent Calculator
		driver.findElement(By.id("cpar2")).sendKeys("35");

		// Click Calculate Button
		driver.findElement(
				By.xpath("(//input[contains(@value,'Calculate')])[1]")).click();
		// Get the Result Text based on its xpath
		String result = driver.findElement(
				By.xpath(".//*[@id='content']/p[2]/font/b")).getText();
		// Print a Log In message to the screen
		System.out.println(" The Result is " + result);
		if (result.equals("5.95")) {
			System.out.println(" The Result is Pass");
		} else {
			System.out.println(" The Result is Fail");
		}
	}

	@AfterTest
	public void closeBrowser() {
		// driver.quit();
	}
}
