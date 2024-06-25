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
 
public class tapAndHoldAndMoveToTargetedLocation extends base {
	public static void main(String[] args) throws MalformedURLException {
		driver=openAppInAVD();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Date Widgets']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='2. Inline']")).click();
		driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='9']")).click();
		
		//storing element
		
		WebElement fromMinitesElement=driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='15']"));
		WebElement toMiniteElement=driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='45']"));
		
		//Center of Element fromMinitesElement
		Point fromMinitesElementLocation=fromMinitesElement.getLocation();
		Dimension fromMinitesElementSize=fromMinitesElement.getSize();
		
		int centerX1=fromMinitesElementLocation.getX()+fromMinitesElementSize.getWidth()/2;
		int centerY1=fromMinitesElementLocation.getY()+fromMinitesElementSize.getHeight()/2;
		
		//Center of Element fromMinitesElement
	    Point toMiniteElementLocation=toMiniteElement.getLocation();
		Dimension toMiniteElementSize=toMiniteElement.getSize();
				
		int centerX2=toMiniteElementLocation.getX()+toMiniteElementSize.getWidth()/2;
		int centerY2=toMiniteElementLocation.getY()+toMiniteElementSize.getHeight()/2;
		
		//pointerInput class
		
		PointerInput finger=new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence tap=new Sequence(finger, 1);
		
		//taping on first elemnt and holding for few seconds and move element two and relese
		tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), centerX1, centerY1));
		tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		tap.addAction(finger.createPointerMove(Duration.ofMillis(2000), PointerInput.Origin.viewport(), centerX2, centerY2));
		tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(List.of(tap));
		
		System.out.println("Successfully tap and hold and move to targeted location");
		
	   driver.quit();
		
		
		
		
	}

}
