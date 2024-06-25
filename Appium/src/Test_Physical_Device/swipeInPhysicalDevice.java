package Test_Physical_Device;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumBy;

public class swipeInPhysicalDevice extends base{
	public static void main(String[] args) throws MalformedURLException {
	  driver=openTheRaagaAplication();
	  //swipe in uiautomator
	  driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"AD-TRAIND\"))"));
	  //driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().scrollable(true).description(\"AD-TRAIND\"))"));
	  System.out.println("Successfully swiped");
	}

}
 