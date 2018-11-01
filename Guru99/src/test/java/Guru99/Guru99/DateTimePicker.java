package Guru99.Guru99;

import java.awt.List;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DateTimePicker {
  
  /*public void e()
  {
	  String datetime = "29/10/2018 02:56 PM";
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\AU0003A7\\My Workspace\\SG_Digital_Automation\\Drivers\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      
      driver.manage().window().maximize();
      driver.get("http://demos.telerik.com/kendo-ui/datetimepicker/index");
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      WebElement selectDate = driver.findElement(By.xpath("//span[@aria-controls='datetimepicker_dateview']"));
      selectDate.click();
    //button to move next in calendar

      WebElement nextLink = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-next')]"));
      
    //button to click in center of calendar header

      WebElement midLink = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-fast')]"));

      //button to move previous month in calendar

      WebElement previousLink = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-prev')]")); 

          //Split the date time to get only the date part

          
		String date_dd_MM_yyyy[] = (dateTime.split(" ")[0]).split("/");

          //get the year difference between current year and year to set in calander

          int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2])- Calendar.getInstance().get(Calendar.YEAR);

          midLink.click();

          if(yearDiff!=0){

              //if you have to move next year

              if(yearDiff>0){

                  for(int i=0;i< yearDiff;i++){

                      System.out.println("Year Diff->"+i);

                      nextLink.click();

                  }

              }

              //if you have to move previous year

              else if(yearDiff<0){

                  for(int i=0;i< (yearDiff*(-1));i++){

                      System.out.println("Year Diff->"+i);

                      previousLink.click();

                  }

              }

          }
          
          Thread.sleep(1000);
        //Get all months from calendar to select correct one

          List<WebElement> list_AllMonthToBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
          
          list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1])-1).click();
          
          Thread.sleep(1000);

          //get all dates from calendar to select correct one

          List<WebElement> list_AllDateToBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
          
          list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0])-1).click();
          
          ///FOR TIME

          WebElement selectTime = driver.findElement(By.xpath("//span[@aria-controls='datetimepicker_timeview']"));

          //click time picker button

          selectTime.click();

          //get list of times

          List<WebElement> allTime = driver.findElements(By.xpath("//div[@data-role='popup'][contains(@style,'display: block')]//ul//li[@role='option']"));
        
          dateTime = dateTime.split(" ")[1]+" "+dateTime.split(" ")[2];

       //select correct time

          for (WebElement webElement : allTime) {

              if(webElement.getText().equalsIgnoreCase(dateTime))

              {

                  webElement.click();

              }

          }

      }
}*/

  @Test
  public void f() 
  {
	  ///giving error due to chrome driver version issue
	  String baseUrl = "http://demo.guru99.com/test/";
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\AU0003A7\\My Workspace\\SG_Digital_Automation\\Drivers\\chromedriver.exe");
	            WebDriver driver = new ChromeDriver();
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            driver.get(baseUrl);
	            WebElement datebox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
	            datebox.sendKeys("10292018");
	            datebox.sendKeys(Keys.TAB);
	            datebox.sendKeys("0243PM");
  }
  
}
