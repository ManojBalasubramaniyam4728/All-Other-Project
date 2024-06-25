package Test_Emulator;

import java.net.MalformedURLException;
import java.time.Duration;

import io.appium.java_client.AppiumBy;

public class uiAutomator extends base{
	
public static void main(String[] args) throws MalformedURLException {
	
	//storing the return driver intatance in driver
	 driver =	openAppInAVD();
	 
	 //Implicit wait
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 //android uiautomator
	driver.findElement(new AppiumBy.ByAndroidUIAutomator("text(\"Views\")")).click();
	
	//validation using android uiautomator
	int size=driver.findElements(new AppiumBy.ByAndroidUIAutomator("new UiSelector().clickable(true)")).size();
	System.out.println(size);
	
	driver.quit();
}
}
