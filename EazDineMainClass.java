package tests;

import java.net.URL;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class EazDineMainClass {
	
	static AppiumDriver<MobileElement> driver;

	
	//Setup of Capabilities & Test Connections
	
	@BeforeTest
	public static void setup(){
		
	//Setup of Capabilities
	try{
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME,"SM-G960F");
			caps.setCapability(MobileCapabilityType.UDID,"2bcc82dce11c7ece");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
			caps.setCapability(MobileCapabilityType.BROWSER_NAME,"");
			caps.setCapability("appPackage","com.eazdinepos.mobile"); 
			caps.setCapability("appActivity","com.eazdinepos.mobile.MainActivity");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\AppData\\Local\\Temp\\78.0.3904.70\\chromedriver\\chromedriver.exe");
			caps.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
			
			
			//Connecting to Appium Server			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			System.out.println("\n Connected to Appium Server ");
			
			//Driver creation, passing the capabilities and server connection details
			driver = new AppiumDriver<MobileElement>(url,caps); 		
						
			System.out.println("\n Driver Established Successfully");
		} catch(Exception Ex){
			System.out.println("\n EazDine: The cause is :"+Ex.getCause());
			System.out.println("\n EazDine: The message is :"+Ex.getMessage());
			Ex.printStackTrace();
		}
		
	}
	
	
	 @AfterTest
	 public static void teardown(){
		driver.close();
		driver.quit();
	}
	
	
	
}
