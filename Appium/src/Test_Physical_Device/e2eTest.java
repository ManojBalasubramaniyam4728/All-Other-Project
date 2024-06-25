package Test_Physical_Device;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;

public class e2eTest extends base {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//Opening app
		driver=openTheRaagaAplication();
		
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		//waite till element is visable
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.gms:id/app_icon")));
		
		//pointerinput for tap on coordinates
        PointerInput finger=new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tapByCoordinate=new Sequence(finger, 1);
        tapByCoordinate.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 865,463));
        tapByCoordinate.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tapByCoordinate.addAction(new Pause(finger, Duration.ofMillis(50)));
        tapByCoordinate.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tapByCoordinate));
        
        //aite till element is visable
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.raaga.android:id/skip_login_btn")));
        
        //click action
        driver.findElement(By.id("com.raaga.android:id/skip_login_btn")).click();
        
        //aite till element is visable
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.raaga.android:id/et_email")));
        
        //click action
        driver.findElement(By.id("com.raaga.android:id/et_email")).click();
        
        //Entering input
        driver.findElement(By.id("com.raaga.android:id/et_email")).sendKeys("sanjay123@gmail.com");
        
        //Hideing Keyboard
        driver.hideKeyboard();
        
         //click action
        driver.findElement(By.id("com.raaga.android:id/et_password")).click();
        
         //Entering input
        driver.findElement(By.id("com.raaga.android:id/et_password")).sendKeys("Password@123");
        
        //Hideing Keyboard
        driver.hideKeyboard();
        
         //click action
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("text(\"SIGN IN\")")).click();
       // driver.findElement(By.id("com.raaga.android:id/btn_sign_in")).click();
        
        //aite till element is visable
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.raaga.android:id/btn_skip_personalize")));
        
        //click action
        driver.findElement(By.id("com.raaga.android:id/btn_skip_personalize")).click();
        
        //waite till element is visable
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Sanjay']")));
//*********************************************************************************************************************************************************        
   //swipe in uiautomator
     // driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Latest Updates\"))"));
     //driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().description(\"Latest Updates\"))"));
        
    	
        //Swipe
     int xCenter = driver.manage().window().getSize().getWidth()/2;
     int yCenter = driver.manage().window().getSize().getHeight()/2;
     
     int endy= (int) (driver.manage().window().getSize().getHeight()*0.2);
  
     int maxDownSwipe=10;
      
      for (int i = 0; i<=maxDownSwipe; i++) {
    	  Sequence swipeVereticaly=new Sequence(finger, 1);
      try {
    	  WebElement popularRadios=driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Latest Updates')]"));
    	  if(popularRadios.isDisplayed()) {
    		  System.out.println("Successfully Swiped down");
    		  break;
    	     } 
    	  }
		 catch (NoSuchElementException e) {
			 swipeVereticaly.addAction(finger.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(), xCenter, yCenter));
			 swipeVereticaly.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
			 swipeVereticaly.addAction(finger.createPointerMove(Duration.ofMillis(700),PointerInput.Origin.viewport(), xCenter, endy));
			 swipeVereticaly.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
			 driver.perform(List.of(swipeVereticaly));
	}
      System.out.println(i);
      if(i==maxDownSwipe) {
    	  System.out.println("swiped "+maxDownSwipe+" But also not found");
    	  break;
         }
      }  
      
      Thread.sleep(5000);
//*********************************************************************************************************************************************************       
     //click action
      driver.findElement(By.xpath("//android.widget.TextView[@text='See All']")).click();
    //waite till element is visable
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='1-Touch Play']")));
      
      //swipe Right to left
      WebElement popularRadiosElement =driver.findElement(By.xpath("//android.widget.TextView[@text='1-Touch Play']/..//androidx.recyclerview.widget.RecyclerView"));
      
      Point popularRadiosElementLocation= popularRadiosElement.getLocation();
      Dimension popularRadiosElementSize=popularRadiosElement.getSize();
      
      int popularRadiosElementsXCenter=popularRadiosElementLocation.getX()+popularRadiosElementSize.getWidth()/2;
      int popularRadiosElementsYCenter=popularRadiosElementLocation.getY()+popularRadiosElementSize.getHeight()/2;
      int endX=popularRadiosElementSize.getHeight()/2;
    //  int endX=(int) (popularRadiosElementSize.getWidth()*0.75);
      int maxRightSwipe=25;
      for (int i = 0; i < maxRightSwipe; i++) {
    	  Sequence swipeRight=new Sequence(finger, 1);
		try {
			WebElement HariharanText=driver.findElement(By.xpath("//android.widget.TextView[@text='Rajnikanth']"));
			if(HariharanText.isDisplayed()) {
				System.out.println("Successfully swiped right to left");
				break;
			}
		} 
		
		catch (NoSuchElementException e) {
			swipeRight.addAction(finger.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(), popularRadiosElementsXCenter, popularRadiosElementsYCenter));
			swipeRight.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
			swipeRight.addAction(finger.createPointerMove(Duration.ofMillis(700),PointerInput.Origin.viewport(),endX, popularRadiosElementsYCenter));
			swipeRight.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
			driver.perform(List.of(swipeRight));
		}
		System.out.println(i);
		if(i==maxRightSwipe) {
			System.out.println("swiped right to leaft"+maxRightSwipe+"But also not able to find");
			break;
		}
	}
      
      //click action
      driver.findElement(By.xpath("//android.widget.TextView[@text='Rajnikanth']")).click();
       //wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.raaga.android:id/iv_arc_image")));
		driver.findElement(By.id("com.raaga.android:id/iv_arc_image")).click();
		System.out.println("Successfully Done E2E Know closing Driver");
		
		driver.quit();
		
	}
	}


