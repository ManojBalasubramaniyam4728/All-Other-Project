package Selenium_For_PE;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_and_drop {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();

	WebDriver driver=new ChromeDriver();
	// Find the element to be dragged
	WebElement dragElement = driver.findElement(By.xpath("dragElement"));

	// Find the element to drop on
	WebElement dropElement = driver.findElement(By.xpath("dropElementId"));

	// Create an instance of Actions class
	   Actions act=new Actions(driver);
	   

	// Perform the drag and drop operation
	act.dragAndDrop(dragElement, dropElement);
	act.build().perform();
	
	// Perform the drag and drop operation another way
	 act.dragAndDropBy(dragElement, 234, 456);
	act.build().perform();
   }
}
