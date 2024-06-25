package Test_Hybrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
	
	public static AndroidDriver driver;

	public static AndroidDriver openHybridApp() throws MalformedURLException {
	
		// Createing capbilitites to open the app
		DesiredCapabilities cap = new DesiredCapabilities();

		// seting capbilitites
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,Platform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Manoj_Device");
		cap.setCapability("appPackage","com.sbilife.smartcare" );
		cap.setCapability("appActivity","com.sbilife.smartcare.MainActivity" );
		cap.setCapability("noReset", true);

		// url to server
		URL url = new URL("http://localhost:4723/wd/hub");

		// launch the android app
		driver = new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver;
	}
}
