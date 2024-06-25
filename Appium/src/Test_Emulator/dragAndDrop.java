package Test_Emulator;

import java.net.MalformedURLException; 
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

public class dragAndDrop extends base {
	public static void main(String[] args) throws MalformedURLException {
		driver=openAppInAVD();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Drag and Drop']")).click();
		
		//Storing The Element
		WebElement sourceElement=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		WebElement targetElement=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_3"));
		
		//Center Location of the sorecElement
		Point sourceElementLocation=sourceElement.getLocation();
		Dimension sourceElementSize=sourceElement.getSize();
		
		int sourceElementCenterX=sourceElementLocation.getX()+sourceElementSize.getWidth()/2;
		int sourceElementCenterY=sourceElementLocation.getY()+sourceElementSize.getHeight()/2;
		
		//Center Location of the targetElement
		Point targetElementLocation=targetElement.getLocation();
		Dimension targetElementSize=targetElement.getSize();
		
		int targetElementCenterX=targetElementLocation.getX()+targetElementSize.getWidth()/2;
		int targetElementCenterY=targetElementLocation.getY()+targetElementSize.getHeight()/2;
		
		//drag and drop
		PointerInput finger=new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence dragNDrop=new Sequence(finger, 1);
		
		dragNDrop.addAction(finger.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),sourceElementCenterX, sourceElementCenterY ));
		dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		dragNDrop.addAction(finger.createPointerMove(Duration.ofSeconds(1),PointerInput.Origin.viewport(), targetElementCenterX, targetElementCenterY));
		dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		
		//Saying Driver to drag and drop
		driver.perform(List.of(dragNDrop));
		
		System.out.println("Successfull Drag and droped the element");
		
		driver.quit();
	}

}
