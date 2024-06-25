package Selenium_For_PE;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Captcha {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		File file = new File("C:/Users/user/Downloads/Buster-Captcha-Solver-for-Humans.crx");
		option.addExtensions(file);
	
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://app.txtbox.in/app/#/contact");
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[contains(text(),'Sign In with Email')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter email address']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter email address']")).sendKeys("varungowdakumar@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("Password@123");
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
		Thread.sleep(7000);
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
		driver.switchTo().parentFrame();
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='recaptcha challenge expires in two minutes']")));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='button-holder help-button-holder']")).click();
		Thread.sleep(10000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.quit();
		
	}
}