package Test_Emulator;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

public class otherSwipeDownUntilElementVisibleSelenium extends base{
	public static void main(String[] args) throws MalformedURLException {
		driver=openAppInAVD();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();
		
		//Taking mobile X and y center of screen
		int centerScreenX=driver.manage().window().getSize().getWidth()/2;
		int centerScreenY=driver.manage().window().getSize().getHeight()/2;
		
		//Frome center of the screen swiping 30% upword
		int endY=(int) (driver.manage().window().getSize().getHeight()*0.01);
		
		int maximumCount=10;
		int count=0;
			for (int i = count; i < maximumCount; i++) {
			PointerInput finger=new PointerInput(PointerInput.Kind.TOUCH, "finger");
		    Sequence swipe=new Sequence(finger, 1);
			try {
		   WebElement webViewElement=driver.findElement(By.xpath("//android.widget.TextView[@text='WebView']"));
			if(webViewElement.isDisplayed()) {
				System.out.println("Successfully Swiped down");
				break;
			       }
			    }
			catch(NoSuchElementException e) {
				swipe.addAction(finger.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(), centerScreenX, centerScreenY));
				swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
				swipe.addAction(finger.createPointerMove(Duration.ofMillis(600),PointerInput.Origin.viewport(), centerScreenX, endY));
				swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
				driver.perform(List.of(swipe));
			}
			if(count >= maximumCount) {
				System.out.println("after swipeing"+maximumCount+"also not able to find ");
			} 
			
			System.out.println(i);
		}
	  WebElement webViewElement=driver.findElement(By.xpath("//android.widget.TextView[@text='WebView']"));
	  webViewElement.click();
	  driver.quit();
	}

}
