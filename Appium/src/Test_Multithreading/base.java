package Test_Multithreading;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
	
	//Global Variable
public static AndroidDriver driver;
	
public static AndroidDriver openOfficeWhatsApp() throws MalformedURLException {
	//Creating Capabilities
	DesiredCapabilities cap=new DesiredCapabilities();
	

	//Setting Capabilities
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android devices");
	cap.setCapability("appPackage","com.whatsapp");
	cap.setCapability("appActivity","com.whatsapp.Main");
	cap.setCapability(MobileCapabilityType.UDID, "RZ8T90B7V4E");
	cap.setCapability(MobileCapabilityType.NO_RESET, true);
	
	//url To server
	URL url =new URL("http://localhost:4723/wd/hub");
	
	//open the app
	 driver=new AndroidDriver(url,cap);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	System.out.println("Successfully Opend The App");
	return driver;
}
public static AndroidDriver openManojWhatsApp() throws MalformedURLException {
	//Creating Capabilities
	DesiredCapabilities cap=new DesiredCapabilities();
	
	//Setting Capabilities
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android devices");
	cap.setCapability("appPackage","com.whatsapp");
	cap.setCapability("appActivity","com.whatsapp.Main");
	cap.setCapability(MobileCapabilityType.UDID, "VSBQDUOBRSLF6P5X");
	cap.setCapability(MobileCapabilityType.NO_RESET, true);
	
	//url To server
	URL url =new URL("http://localhost:4723/wd/hub");
	
	//open the app
	 driver=new AndroidDriver(url,cap);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	System.out.println("Successfully Opend The App");
	return driver;
}

}
