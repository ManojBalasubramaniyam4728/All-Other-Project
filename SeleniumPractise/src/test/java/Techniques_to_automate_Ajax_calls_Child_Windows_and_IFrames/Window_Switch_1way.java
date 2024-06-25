package Techniques_to_automate_Ajax_calls_Child_Windows_and_IFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Switch_1way {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		WebElement em3=driver.findElement(By.xpath("//button[text()='New Window']"));
		em3.click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		//to get parent windowId
		String parentid=it.next();
		System.out.println("befoure switching");
		System.out.println(driver.getTitle());
		//to get child windowId
		String childid=it.next();
		driver.switchTo().window(childid);
		driver.manage().window().maximize();
		System.out.println("after switching to child");
		System.out.println(driver.getTitle());
		System.out.println("after switching to parent");
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}

}
