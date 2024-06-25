package Test_Emulator;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class miscelleanous extends base{
public static void main(String[] args) throws MalformedURLException {
	driver=openAppInAVD();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//Current Activity
	String activity= driver.currentActivity();
	
	//Current Package
	String Package= driver.getCurrentPackage();
	
	//Current View ie.Native,hybrid,webview
	String Context=driver.getContext();
	
	//current ScreenOrientation
	ScreenOrientation Orientation= driver.getOrientation();
	
	//verify phone is locked are not
	boolean LockedAreNot=driver.isDeviceLocked();
	
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();
	
	//press back key
	driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	        //or
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	
	System.out.println("Successfull clicked on Back key");
	System.out.println(activity);
	System.out.println(Package);
	System.out.println(Context);
	System.out.println(Orientation);
	System.out.println(LockedAreNot);
	driver.quit();
       }
}
