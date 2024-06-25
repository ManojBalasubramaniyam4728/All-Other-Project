package Selenium_For_PE;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dfgh {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.fireflink.com/");
	int aa=1;
		
		for (boolean a=false; a ==false;) {
			System.out.println(aa++);
			try {
				boolean d =driver.findElement(By.xpath("//span[text()='Automation']")).isDisplayed();
				a=d;
			} catch (NoSuchElementException e) {
				   
			}
		}
	}

}
