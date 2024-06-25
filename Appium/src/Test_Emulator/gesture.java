package Test_Emulator;


import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

public class gesture extends base{
	public static void main(String[] args) throws MalformedURLException {
		driver=openAppInAVD();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	//Pointer action in W3C Action
//********************************************************************************
	//This Pointer for Taping
		 
      //storing wed element
		WebElement viewElement=driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']"));
		
		Point viewElementLocation = viewElement.getLocation();
		Dimension viewElementSize = viewElement.getSize();
		
		int centerX = viewElementLocation.getX()+viewElementSize.getWidth()/2;
		int centerY = viewElementLocation.getY()+viewElementSize.getHeight()/2;
		
		//PointerInput class
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");
		//sequence class tapping
		Sequence tap= new Sequence(finger, 1);
		
		
		//Now tap action
		tap.addAction(finger.createPointerMove(Duration.ofMillis(0),PointerInput.Origin.viewport(),centerX,centerY));
		tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		//Performing Action
		driver.perform(List.of(tap));
		
		//
//********************************************************************************
		//storing wed element
		WebElement expandableListsElement = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]"));
		 
		Point expandableListsElementeLocation = expandableListsElement.getLocation();
		Dimension expandableListsElementSize = expandableListsElement.getSize();
		
		int centerX2 = expandableListsElementeLocation.getX()+expandableListsElementSize.getWidth()/2;
		int centerY2 = expandableListsElementeLocation.getY()+expandableListsElementSize.getHeight()/2;
		
		//sequence class 2tapping
		Sequence tap1= new Sequence(finger, 1);
		
		tap1.addAction(finger.createPointerMove(Duration.ofMillis(0),PointerInput.Origin.viewport(),centerX2, centerY2));
		tap1.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		tap1.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(List.of(tap1));
		
//********************************************************************************
		//Storing web element
		WebElement customAdapterElement = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]"));
		 
		Point customAdapterElementLocation = customAdapterElement.getLocation();
		Dimension customAdapterElementSize = customAdapterElement.getSize();
		
		int centerX3= customAdapterElementLocation.getX()+customAdapterElementSize.getWidth()/2;
		int centerY3=customAdapterElementLocation.getY()+customAdapterElementSize.getHeight()/2;
		
		//sequence class 3tapping
		Sequence tap2=new Sequence(finger, 1);
		
		tap2.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), centerX3, centerY3));
		tap2.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		tap2.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(List.of(tap2));
		
//********************************************************************************
		//Storing web element
		WebElement peopleNamesElement = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		
		Point peopleNamesElementLocation= peopleNamesElement.getLocation();
		Dimension peopleNamesElementSize= peopleNamesElement.getSize();
		
		int centerX4= peopleNamesElementLocation.getX()+peopleNamesElementSize.getWidth()/2;
		int centerY4= peopleNamesElementLocation.getY()+peopleNamesElementSize.getHeight()/2;
		
		//for loop
		for(int i=0;i<6;i++) {
			
			//sequence class 4tapping
			Sequence pressAndHold=new Sequence(finger, 1);
			
			pressAndHold.addAction(finger.createPointerMove(Duration.ofMillis(0),PointerInput.Origin.viewport(), centerX4, centerY4));
			pressAndHold.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
			 
			try {
		 WebElement sampleMenuElement=driver.findElement(By.xpath("//android.widget.TextView[@text='Sample menu']"));
		  if(sampleMenuElement.isDisplayed()) {
			  pressAndHold.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
			  break;
		      }
			}
		  catch (NoSuchElementException e) {
			  pressAndHold.addAction(new Pause(finger, Duration.ofMillis(500)));
		        }
			driver.perform(List.of(pressAndHold));
			System.out.println(i);
	          }
		System.out.println("Successfully complted");
		
		driver.quit();
		
	     	}
          }
