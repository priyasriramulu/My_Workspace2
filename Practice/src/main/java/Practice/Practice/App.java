package Practice.Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	Random ran = new Random();
    	for(int i=0;i<10;i++)
    	{
    		int rannum = ran.nextInt(100);
    		System.out.println("Random1:"+rannum);
    		System.out.println("Math Random:"+Math.random());
    		
    	}
        System.out.println( "Hello World!" );
       String url;
      String[] testdata ={"test1","test2","test3"};
     for(String s:testdata)
     	{
  	System.out.println(s);
       	}

    WebDriver driver = null;
	if(driver == null)
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\AU0003A7\\My Workspace\\SG_Digital_Automation\\Drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.get("https://www.freecrm.com/index.html");
		 driver.findElement(By.cssSelector("input.form-control[name='username']")).sendKeys("test");
		System.out.println(driver.findElement(By.cssSelector("input.form-control")));
		Alert a1 = driver.switchTo().alert();
		a1.getText();
		
		
		 String color = driver.findElement(By.cssSelector("input.form-control[name='username']")).getCssValue("color");
		 System.out.println("Color :"+color);
		 Set<String> s1= driver.getWindowHandles();
		 Iterator<String> it = s1.iterator();
		 while(it.hasNext())
		 {
			url = it.next();
			System.out.println("url:"+url);
			 
		 }
		 
		}
	
		// assert.aserte
		// driver.findElement(By.cssSelector("input#email"));
	}
}

