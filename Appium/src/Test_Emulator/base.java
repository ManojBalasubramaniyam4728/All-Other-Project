package Test_Emulator;

import java.io.File; 
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
	
	public static AndroidDriver driver;

	public static AndroidDriver openAppInAVD() throws MalformedURLException {

		// apk path

		File fl = new File("src");
		File file = new File(fl, "ApiDemos-debug.apk");

		// Createing capbilitites to open the app
		DesiredCapabilities cap = new DesiredCapabilities();

		// seting capbilitites
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Manoj_Device");
		cap.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
		cap.setCapability("noReset", true);

		// url to server
		URL url = new URL("http://localhost:4723/wd/hub");

		// launch the android app
		driver = new AndroidDriver(url, cap);
        return driver;
	}
}
