package Configuring_Selenium_and_Running_Tests_on_All_Browsers;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IsDisabled {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--diabled-notifications");
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://app.fireflink.com/");
		Thread.sleep(10000);
	WebElement EmailId = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
		EmailId.click();
		EmailId.sendKeys("jidos50815@imdutex.com");
	WebElement Password=driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
		Password.click();
		Password.sendKeys("Password@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	WebElement demo=   driver.findElement(By.xpath("//span[contains(text(),'demo')]"));
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOf(demo));
	demo.click();
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[text()='+ Automation Script']"))));
	Boolean isDisabled=false;
	System.out.println(isDisabled=driver.findElement(By.xpath("//button[text()='+ Automation Script']")).isEnabled());
	System.out.println("+Automation Script button isDiabled ");
	driver.quit();
	}

}
