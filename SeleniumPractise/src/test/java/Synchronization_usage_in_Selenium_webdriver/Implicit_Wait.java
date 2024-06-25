package Synchronization_usage_in_Selenium_webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Implicit_Wait
		driver.manage().timeouts().implicitlyWait(0, null);
		
		driver.get("https://www.zomato.com/bangalore");
		driver.findElement(By.xpath("//p[text()='Chicken']")).click();
		driver.findElement(By.xpath("//img[@alt='Restaurant Card']")).click();
		
		
	}

}
