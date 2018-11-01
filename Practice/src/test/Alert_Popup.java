import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert_Popup {
	public WebDriver driver;

	@BeforeTest
	public void driver()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\AU0003A7\\My Workspace\\SG_Digital_Automation\\Drivers\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("http://demo.guru99.com/popup.php");
         driver.manage().window().maximize();
	
	}
	
	@Test
	public void Alert() extends driver()
	{
		String mainWindow = driver.getWindowHandle(driver);
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		set<String> s1 = driver.getWindowHandles();
		Iterator<string> i1 = s1.iterator();
		//while(i1.)
		
		
		
	}
}
