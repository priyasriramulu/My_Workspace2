package Guru99.Guru99;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dynamic_WebTable {
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\AU0003A7\\My Workspace\\SG_Digital_Automation\\Drivers\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();

         
	  driver.get("http://money.rediff.com/gainers/bsc/daily/groupa");
	  WebElement ele=driver.findElement(By.xpath("//table//thead//tr//th[text()='Company']"));
	  //driver.navigate().forward();
	  
	  //get the column size
	  List col=driver.findElements(By.xpath("//table/thead/tr/th"));
	  System.out.println("print cols:"+col.size());
	  
	  //get the row size
	  WebElement mytable = driver.findElement(By.xpath("//table/tbody"));
	  
	  List<WebElement> row = mytable.findElements(By.tagName("tr"));
	  System.out.println("print rows:"+row.size());
	  for(int rowe = 0;rowe<row.size();rowe++)
	  {
	  List<WebElement> col_row = row.get(rowe).findElements(By.tagName("td"));
	  for(int cole = 0;cole<col_row.size();cole++)
	  {
		  String celtext = col_row.get(cole).getText();
		  System.out.println("Celtext:"+celtext);
	  }
	  }
	  
  }
}
