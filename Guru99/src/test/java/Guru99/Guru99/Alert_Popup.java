package Guru99.Guru99;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert_Popup {
	protected static WebDriver driver;

	@Test
	public void driver()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\AU0003A7\\My Workspace\\SG_Digital_Automation\\Drivers\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         
         //driver.manage().window().maximize();
    
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//a[contains(@href,'popup.php')]")).click();
		String mainWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext())
		{
			String childwindow = i1.next();
			if (!mainWindow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
				driver.close();
				
			}
			driver.switchTo().window(mainWindow);
		}
	}
}

