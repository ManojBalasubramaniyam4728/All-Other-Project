package Selenium_Webdriver_Techniques_to_automate_Web_elements;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//iframe[@id='webklipper-publisher-widget-container-notification-frame']"))));
		
		if(driver.findElement(By.xpath("//iframe[@id='webklipper-publisher-widget-container-notification-frame']")).isDisplayed()) {
			driver.switchTo().frame(3);
			driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
			driver.switchTo().parentFrame();
					}
		Thread.sleep(2000);
driver.findElement(By.xpath("//li[@data-cy='account']")).click();
	 Thread.sleep(2000);
	WebElement From=driver.findElement(By.id("fromCity"));
	From.click();
	//From.clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Che");
	Thread.sleep(2000);
	Actions act= new Actions(driver);
	act.sendKeys(Keys.ARROW_DOWN);
	act.sendKeys(Keys.ENTER);
	act.build().perform();
	 Thread.sleep(2000);
	WebElement To=driver.findElement(By.id("toCity"));
	To.click();
//	To.clear();
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Bang");
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN);
	act.sendKeys(Keys.ENTER);
	act.build().perform();
	driver.quit();

	
    }
}
