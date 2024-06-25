package Test_TestingInCloud;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class openAndroidAppInSauceCloud {
public static void main(String[] args) throws MalformedURLException {
	MutableCapabilities caps = new MutableCapabilities();
	caps.setCapability("platformName", "Android");
	// The filename of the mobile app
	caps.setCapability("appium:app", "storage:filename=ApiDemos-debug.apk");
	caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
	caps.setCapability("appium:deviceOrientation", "portrait");
	caps.setCapability("appium:platformVersion", "12.0");
	caps.setCapability("appium:automationName", "UiAutomator2");
	MutableCapabilities sauceOptions = new MutableCapabilities();
	sauceOptions.setCapability("appiumVersion", "2.0.0");
	sauceOptions.setCapability("username", "oauth-manoj.b-96e76");
	sauceOptions.setCapability("accessKey", "2f864740-ff75-4a78-90ef-8acc5b6ae229");
	caps.setCapability("sauce:options", sauceOptions);

	URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
	AndroidDriver driver = new AndroidDriver(url, caps);
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
