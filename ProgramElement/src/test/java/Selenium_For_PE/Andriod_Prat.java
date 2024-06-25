package Selenium_For_PE;


import java.net.MalformedURLException;   
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class Andriod_Prat {
	public static AndroidDriver driver;
	public static AndroidDriver driver1;
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		DesiredCapabilities capabilities =new DesiredCapabilities();

		capabilities.setCapability("deviceName", "One Plus");
		capabilities.setCapability("Browser", "Andriod");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.phonepe.app");
		capabilities.setCapability("appActivity", "com.phonepe.app.v4.nativeapps.splash.Navigator_SplashActivity");
		capabilities.setCapability("noReset", true);
		URL url = new URL("http://localhost:4725/wd/hub");

		Thread.sleep(4000);

		driver=new AndroidDriver(url,capabilities);
		WebElement element1=driver.findElement(By.xpath("//android.widget.EditText[@text='10 Digit Mobile Number']"));
		element1.click();
		element1.sendKeys("8147996290");
		WebElement element2=driver.findElement(By.xpath("//android.widget.TextView[@text='PROCEED']"));
		element2.click();

		Thread.sleep(4000);

		DesiredCapabilities capabilities1 =new DesiredCapabilities();
		capabilities1.setCapability("deviceName", "One Plus");
		capabilities1.setCapability("Browser", "Andriod");
		capabilities1.setCapability("platformName", "Android");
		capabilities1.setCapability("appPackage", "com.google.android.apps.messaging");
		capabilities1.setCapability("appActivity", "com.google.android.apps.messaging.main.MainActivity");
		capabilities1.setCapability("noReset", false);
		URL url1 = new URL("http://localhost:4725/wd/hub");

		Thread.sleep(4000);

		driver1=new AndroidDriver(url1, capabilities1);

		WebElement element3=driver1.findElement(By.xpath("//android.widget.TextView[@text='TM-PHONPE']"));
		element3.click();
		driver.openNotifications();

		WebElement element4=driver1.findElement(By.xpath("//android.widget.TextView[@resource-id='com.google.android.apps.messaging:id/message_text']"));
		String messageText  = element4.getText();
		String onlyNumbers= messageText.replaceAll("[^0-9?]", "");
		String otp=onlyNumbers.substring(0, 5);
		System.out.println(otp);
		driver1.close();
		
		

		

	}
}

