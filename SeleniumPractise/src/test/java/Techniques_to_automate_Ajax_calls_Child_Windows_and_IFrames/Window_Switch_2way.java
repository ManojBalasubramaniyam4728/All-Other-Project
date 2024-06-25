package Techniques_to_automate_Ajax_calls_Child_Windows_and_IFrames;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Switch_2way {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/browser-windows");
	WebElement em3=driver.findElement(By.xpath("//button[text()='New Window']"));
	em3.click();
	String currentwindow=driver.getWindowHandle();
	Set<String> windowhandels=driver.getWindowHandles();
	System.out.println("befoure switching");
	System.out.println(driver.getTitle());
	//Switch to child
	for(String windowhandel:windowhandels) {
	   if(!windowhandel.equals(currentwindow)) {
		   driver.switchTo().window(windowhandel);
	                 }
             }
	driver.manage().window().maximize();
	System.out.println("after switching to child");
	System.out.println(driver.getTitle());
	//Switch to parent
	for(String windowhandel:windowhandels) {
		   if(!windowhandel.equals(currentwindow)) {
			   driver.switchTo().window(windowhandel);
	                  }
              }
	System.out.println("after switching to parent");
	System.out.println(driver.getTitle());
	driver.quit();
	     }
	}