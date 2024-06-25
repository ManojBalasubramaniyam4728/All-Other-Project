package Synchronization_usage_in_Selenium_webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Excpicite_Wait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/bangalore");
		driver.findElement(By.xpath("//p[text()='Chicken']")).click();
		
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@alt='Restaurant Card']"))));
		
		//another way in selenium update variation
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@alt='Restaurant Card']"))));
		
		driver.findElement(By.xpath("//img[@alt='Restaurant Card']")).click();
	}

}
