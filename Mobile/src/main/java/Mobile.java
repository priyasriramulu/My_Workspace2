import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Mobile {

	
	    private String accessKey = "eyJ4cC51IjoyMTM3NzcxLCJ4cC5wIjoyMTM3NzcwLCJ4cC5tIjoiTVRVME1ETTJPVEl4TlRRd05nIiwiYWxnIjoiSFMyNTYifQ.eyJleHAiOjE4NTU3MjkyMTcsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.ZaVPJWsufki6wp62D_6uzPeSsfpIASmfuiqezWcAyxw";
	    protected IOSDriver<IOSElement> driver = null;
	    DesiredCapabilities dc = new DesiredCapabilities();

	    @Before
	    public void setUp() throws MalformedURLException {
	        dc.setCapability("testName", "Quick Start iOS Native Demo");
	        dc.setCapability("accessKey", accessKey);
	        dc.setCapability("deviceQuery", "@os='ios' and @category='PHONE'");
	        dc.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank");
	        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.experitest.ExperiBank");
	        driver = new IOSDriver<>(new URL("https://cloud.seetest.io/wd/hub"), dc);
	    }

	    @Test
	    public void quickStartiOSNativeDemo() {
	        driver.rotate(ScreenOrientation.PORTRAIT);
	        driver.findElement(By.xpath("//*[@id='usernameTextField']")).sendKeys("company");
	        driver.hideKeyboard();
	        driver.findElement(By.xpath("//*[@id='passwordTextField']")).sendKeys("company");
	        driver.findElement(By.xpath("//*[@id='loginButton']")).click();
	        driver.findElement(By.xpath("//*[@id='makePaymentButton']")).click();
	        driver.findElement(By.xpath("//*[@id='phoneTextField']")).sendKeys("0541234567");
	        driver.findElement(By.xpath("//*[@id='nameTextField']")).sendKeys("Jon Snow");
	        driver.findElement(By.xpath("//*[@id='amountTextField']")).sendKeys("50");
	        driver.findElement(By.xpath("//*[@id='countryButton']")).click();
	        driver.findElement(By.xpath("//*[@id='Switzerland']")).click();
	        driver.findElement(By.xpath("//*[@id='sendPaymentButton']")).click();
	        driver.findElement(By.xpath("//*[@id='Yes']")).click();
	    }

	    @After
	    public void tearDown() {
	        driver.quit();
	    }
	

}

