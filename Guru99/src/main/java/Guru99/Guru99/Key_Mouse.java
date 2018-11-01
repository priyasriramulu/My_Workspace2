package Guru99.Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Key_Mouse 
{
	
	public static void  main(String[] args )
	{
	String baseUrl = "http://demo.guru99.com/test/newtours/";
    System.setProperty("webdriver.chrome.driver","C:\\Users\\AU0003A7\\My Workspace\\SG_Digital_Automation\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get(baseUrl);           
            WebElement link_Home = driver.findElement(By.linkText("Home"));
            WebElement td_Home = driver
                    .findElement(By
                    .xpath("//html/body/div"
                    + "/table/tbody/tr/td"
                    + "/table/tbody/tr/td"
                    + "/table/tbody/tr/td"
                    + "/table/tbody/tr"));    
       
            Actions builder = new Actions(driver);
            Action mouseOverHome = builder
                    .moveToElement(link_Home)
                    .build();
            //String bgColor = link_Home.getCssValue("background-color");
            String bgColor = td_Home.getCssValue("background-color");
            System.out.println("Before hover: " + bgColor);        
            mouseOverHome.perform();   
         //   bgColor = link_Home.getCssValue("background-color");
            bgColor = td_Home.getCssValue("background-color");
            System.out.println("After hover: " + bgColor);
           // driver.close();
            
            WebElement uname = driver.findElement(By.name("userName"));
            Action Key = builder.moveToElement(uname).click().keyDown(uname, Keys.SHIFT).sendKeys(uname,"hello").keyUp(uname, Keys.SHIFT).doubleClick(uname).build();
            Key.perform();
            
	}

	private static void keyboard() {
		// TODO Auto-generated method stub
		
	}

}
