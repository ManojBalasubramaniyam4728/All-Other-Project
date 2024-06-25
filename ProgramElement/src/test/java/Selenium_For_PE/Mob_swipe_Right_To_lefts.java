package Selenium_For_PE;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Mob_swipe_Right_To_lefts 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		//dc.setCapability(MobileCapabilityType.UDID, "RZ8TA03EJ7V");
		dc.setCapability("appPackage", "com.vlv.aravali");
		dc.setCapability("appActivity", "com.vlv.aravali.views.activities.SplashActivity");
		dc.setCapability("noReset", "true");
		dc.setCapability("platformName", "Android");
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, dc);
		Thread.sleep(10000);
		System.out.println("Opened the application");
		
        Thread.sleep(3000);
        WebElement element1= driver.findElement(By.xpath("//android.widget.GridView[@resource-id='com.vlv.aravali:id/rcvList']"));
        
        Point element1Location=element1.getLocation();
        Dimension element1Size=element1.getSize();
        
        int XCenterOfElement1=element1Location.getX()+element1Size.getWidth()/2;
        System.out.println(XCenterOfElement1);
        int yCenterOfElement1=element1Location.getY()+element1Size.getHeight()/2;
        System.out.println(yCenterOfElement1);
        
        int endx=element1Size.getHeight()/2;
        System.out.println(endx);
        
        
        PointerInput finger=new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe=new Sequence(finger, 1);
        int max=4;
        int count=0;
        for (int i = count; i <max; i++) {
			
        try {
        	  WebElement element3= driver.findElement(By.xpath("//android.widget.TextView[@text='Investing']"));
        	  if(element3.isDisplayed()) {
        	      break;
           }
        }
        	 catch (NoSuchElementException e) {
        		 swipe.addAction(finger.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(), XCenterOfElement1, yCenterOfElement1));
      	        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
      	        swipe.addAction(finger.createPointerMove(Duration.ofMillis(700),PointerInput.Origin.viewport(), endx, yCenterOfElement1));
      	        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
      	        driver.perform(Arrays.asList(swipe));
		}
        if (count>=max) {
			System.out.println("After Swipeing"+max+"also not able to find");
		}
        
        }
	}
}