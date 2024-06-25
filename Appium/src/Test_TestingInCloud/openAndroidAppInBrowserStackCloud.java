package Test_TestingInCloud;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class openAndroidAppInBrowserStackCloud {
	public static final  String username = "manojb_LImeHT";
	public static final  String accessKey = "p6ndGwophkYyoxJS4Aoe";
	public static final  String url = "http://"+username+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub";

public static void main(String[] args) throws MalformedURLException {
	 DesiredCapabilities caps = new DesiredCapabilities();
	 caps.setCapability("platformName", "Android");
     caps.setCapability("deviceName", "Google Pixel 3");
     caps.setCapability("os_version", "10.0");
     caps.setCapability("autoGrantPermissions", true);
    // The filename of the mobile app(apk)
     caps.setCapability(MobileCapabilityType.APP, "bs://326f39693af2f4866fd5c08c979dc5236495aaf3");


	AndroidDriver driver = new AndroidDriver(new URL(url), caps);
	 driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
	 driver.findElement(By.id("android:id/button1")).click();
	 driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Preference']")).click();
	 driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
	 driver.findElement(By.id("android:id/checkbox")).click();
	 driver.findElement(By.xpath("//android.widget.TextView[@text='WiFi settings']")).click();
	 driver.findElements(By.className("android.widget.LinearLayout")).get(4).click();
	 driver.findElement(By.className("android.widget.EditText")).sendKeys("hello 1");
	 driver.findElement(By.id("android:id/button1")).click();
	 driver.quit();
}
}
