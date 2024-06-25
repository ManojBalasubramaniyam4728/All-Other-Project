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


public class OverComeOfTouchActionClass extends base{
public static void main(String[] args) throws MalformedURLException {
	
	driver=openAppInAVD();
	
	//TouchAction gesture is deprecated So uesing Below
	
	WebElement element=driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
	
	//we need to locate our element on the screen. We will use the getLocation() and getSize() methods from Selenium to calculate the singleTapButton elements' center coordinates:
	Point sourceLocation = element.getLocation();
	Dimension sourceSize = element .getSize();
	int centerX = sourceLocation.getX() + sourceSize.getWidth() / 2;
	int centerY = sourceLocation.getY() + sourceSize.getHeight() / 2;
	
	//Now we need our pointer input that will represent a touch input device:
    PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    
	//We will call our sequence object tap and associate it with the finger input device:
     Sequence tap = new Sequence(finger, 1);
     
     //What remains is to add the pointer actions. First, we move to our button:
     tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), centerX, centerY));
     
     //Then we perform a touch down event on the button using the left mouse button:
     tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
     
     //And one for the touch up event:
     tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
   
    // Once all pointer actions are added we can execute the tap sequence of pointer actions using the perform() method of the driver object, which is an instance of the WebDriver interface. The List.of(tap) method call creates a list of one Sequence object to be executed by the perform() method:
     driver.perform(List.of(tap));
}
}
