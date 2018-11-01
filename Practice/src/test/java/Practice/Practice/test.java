package Practice.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\AU0003A7\\My Workspace\\SG_Digital_Automation\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("https://www.freecrm.com/index.html");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")));
		driver.findElement(By.cssSelector(".nav > li:nth-child(2) > a:nth-child(1) > font:nth-child(1)")).click();
	}

}
