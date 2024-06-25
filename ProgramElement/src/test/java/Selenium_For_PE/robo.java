package Selenium_For_PE;

import java.awt.AWTException; 
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class robo {
	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.crome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	WebElement scroll=	driver.findElement(By.xpath("//h2[text()='Select a vehicle']"));
		JavascriptExecutor jsc=(JavascriptExecutor)driver;
		jsc.executeScript("arguments[0].scrollIntoView(true);", scroll);
		Actions act=new Actions(driver);
		act.moveToElement(scroll);
		act.doubleClick();
		act.click();
		act.build().perform();
		Robot rb=new Robot();
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_C);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_C);
	
		
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://onlinenotepad.org/notepad");
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		//WebDriverWait wait= new WebDriverWait(driver, null);
	//	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("tinymce"))));
		driver.findElement(By.id("tinymce")).click();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		

		driver.quit();
		}
		
	}
