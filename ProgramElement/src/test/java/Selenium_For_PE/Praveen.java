package Selenium_For_PE;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Praveen {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.spicejet.com/");
// WebDriverWait wait=new WebDriverWait(driver, 20);
// wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='Welcome aboard']"))));
 
// driver.findElement(By.xpath("//div[text()=\"round trip\"]/../../div/*/*")).click();


 try {
	 driver.findElement(By.xpath("//div[text()=\"Select Date\"]/..//div[@style=\"font-family: inherit;\"]")).isDisplayed();
	 System.out.println("it is disabled");
 }
 catch (Exception e) {
	System.out.println("Return Date is enabled");
}
 driver.quit();
}
}
