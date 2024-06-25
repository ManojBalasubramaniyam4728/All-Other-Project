//
//	package Selenium_For_PE;
//	import io.appium.java_client.android.AndroidDriver;
//	import io.appium.java_client.android.AndroidElement;
//	import io.appium.java_client.android.AndroidKeyCode;
//	import io.appium.java_client.remote.MobileCapabilityType;
//	import org.openqa.selenium.By;
//	import org.openqa.selenium.remote.DesiredCapabilities;
//
//	import io.appium.java_client.android.nativekey.PressesKey;
//	import io.appium.java_client.android.location.Location;
//
//	import java.net.MalformedURLException;
//	import java.net.URL;
//
//	public class LocationMockingExample {
//
//	    public static void main(String[] args) throws MalformedURLException {
//	        DesiredCapabilities caps = new DesiredCapabilities();
//	        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "your_device_name");
//	        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//	        caps.setCapability(MobileCapabilityType.APP, "path_to_your_app.apk");
//
//	        // Set the Appium server URL
//	        URL appiumServerURL = new URL("http://127.0.0.1:4723/wd/hub");
//
//	        AndroidDriver driver = new AndroidDriver(appiumServerURL, caps);
//
//	        // Mock the location to a specific latitude and longitude
//	        Location location = new Location(42.331429, -83.045754, 0);
//	        driver.setMockLocation(location);
//
//	        // Your test code goes here
//
//	        // Close the driver when done
//	        driver.quit();
//	    }
//	}
//O