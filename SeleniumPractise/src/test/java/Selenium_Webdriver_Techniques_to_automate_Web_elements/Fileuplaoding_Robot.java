package Selenium_Webdriver_Techniques_to_automate_Web_elements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fileuplaoding_Robot {
public static void main(String[] args) throws AWTException, InterruptedException {
			// TODO Auto-generated method stub
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@type='file']"))));
			WebElement ele= driver.findElement(By.xpath("(//form//input)[1]"));
			WebElement ele1=driver.findElement(By.xpath("(//form//input)[2]"));
		
			Actions actn= new Actions(driver);
			actn.moveToElement(ele).click().perform();
			 Thread.sleep(1000);
			Robot ro=new Robot();
			
			ro.keyPress(KeyEvent.VK_CONTROL);
			ro.keyPress(KeyEvent.VK_V);
			ro.keyRelease(KeyEvent.VK_CONTROL);
			ro.keyRelease(KeyEvent.VK_V);		
	        ro.keyPress(KeyEvent.VK_ENTER);
	        ro.keyRelease(KeyEvent.VK_ENTER);
	        driver.close();
	        
		}
		
//"C:/Users/user/Downloads/ExecutionReport_EXEC1065.pdf"
}