package Test_Emulator;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;

public class Basics extends base {
	public static void main(String[] args) throws MalformedURLException {
		
		//storing the return driver intatance in driver
	 driver =	openAppInAVD();
	 
	 //Implicit wait
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 /*Locotors:- xpath, id, class name,accessibility id, android uiautomator
	  * 
	  * Xpath Syntax
	  * 
	  * //class Name[@attribute='value']
	  *
	  */
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