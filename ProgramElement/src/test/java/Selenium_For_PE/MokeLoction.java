
package Selenium_For_PE;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.SupportsContextSwitching;

public class MokeLoction {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		// dc.setCapability(MobileCapabilityType.UDID, "RZ8TA03EJ7V");
//		dc.setCapability("appPackage", "com.google.android.apps.maps");
//		dc.setCapability("appActivity", "com.google.android.maps.MapsActivity");
//		dc.setCapability("noReset", "false");
		dc.setCapability("platformName", "Android");
		dc.setCapability("chromedriverExecutable", "C:\\Users\\user\\AppData\\Roaming\\fire-flink-client\\localnode\\chromedriver.exe");
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, dc);
		System.out.println("Opened the application");
		driver.findElement(By.xpath("//android.widget.Image[@text='buy-pass']")).click();
		Thread.sleep(5000);
//		Set<String> contextHandles = ((SupportsContextSwitching) driver).getContextHandles();
//		for (String contextHandle : contextHandles) {
//			System.out.println(contextHandle);
//			if (contextHandle.contains("WEBVIEW")) {
//				((SupportsContextSwitching) driver).context(contextHandle);
//				break;
//			}
		WebElement e1=	driver.findElement(By.xpath("//android.view.View[@resource-id='menu-button']"));
		e1.click();
		
			
		
		}

	}

