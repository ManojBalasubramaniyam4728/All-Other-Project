package Selenium_Webdriver_Techniques_to_automate_Web_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Selecting_Dynamic_drop_down {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[text()='From']/..//input[@autocapitalize='sentences']")).click();
		Actions act=new Actions(driver);
		WebElement From=driver.findElement(By.xpath("//div[text()='Kempegowda International Airport']"));
		act.moveToElement(From);
		act.click(From);
		act.build().perform();
		Thread.sleep(2000);
		WebElement To=driver.findElement(By.xpath("//div[text()='Chennai']"));
		act.moveToElement(To);
		act.click(To);
		act.build().perform();
		driver.quit();
	
		
	}

}

