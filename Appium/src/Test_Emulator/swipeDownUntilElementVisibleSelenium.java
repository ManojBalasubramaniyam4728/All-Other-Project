package Test_Emulator;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class swipeDownUntilElementVisibleSelenium extends base {
public static void main(String[] args) throws MalformedURLException {
	driver=openAppInAVD();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();
	//scrooling throught Ui Automator
	//driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))"));
	driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().description(\"WebView\"))"));
	System.out.println("Successfully Swiped down");
	driver.quit();
	}
}
