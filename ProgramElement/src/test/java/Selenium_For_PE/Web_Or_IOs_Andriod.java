package Selenium_For_PE;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class Web_Or_IOs_Andriod {
	public static DesiredCapabilities launchAndroidApp(String appPackage, String appActivity, Boolean noReset) {
	DesiredCapabilities androidCaps = new DesiredCapabilities();

	androidCaps.setCapability("platformName", "Android");
	androidCaps.setCapability("appPackage", appPackage);
	androidCaps.setCapability("appActivity", appActivity);
	androidCaps.setCapability("noReset", noReset);
	return androidCaps;
}

public static DesiredCapabilities launchiOSApp(String bundleId, Boolean noReset) {
	DesiredCapabilities iosCaps = new DesiredCapabilities();
	iosCaps.setCapability("platformName", "iOS");
	iosCaps.setCapability("bundleId", bundleId);
	iosCaps.setCapability("noReset", noReset);
	return iosCaps;
}
	public static void main(String[] args) {
		WebDriver driver=null;
		try {
			DesiredCapabilities androidCaps = launchAndroidApp("com.android.chrome", "com.google.android.apps.chrome.Main", true);
			DesiredCapabilities iosCaps = launchiOSApp("dfgh", true);
			
			try {
			driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), androidCaps);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
			driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), iosCaps);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		} catch (Exception e) {
		}
	}

}
