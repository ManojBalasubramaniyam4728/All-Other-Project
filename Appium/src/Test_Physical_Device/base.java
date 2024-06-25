package Test_Physical_Device;

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
	
public static AndroidDriver openTheRaagaAplication() throws MalformedURLException {
	//Creating Capabilities
	DesiredCapabilities cap=new DesiredCapabilities();
	
	String raagaAppPackage="com.raaga.android";
	String raagaAppActivity="com.raaga.android.activity.SplashActivity";
//	String messageAppPackage="com.google.android.apps.messaging";
//	String messageAppActivity="com.google.android.apps.messaging.ui.ConversationListActivity";
	
	//Setting Capabilities
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android devices");
	cap.setCapability("appPackage",raagaAppPackage);
	cap.setCapability("appActivity",raagaAppActivity);
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
