package Selenium_For_PE;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dfghjk {
	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fr.wikipedia.org/wiki/Google");
		WebElement element1 = driver.findElement(By.xpath("//b[text()='Google ']"));
		WebElement element2 = driver.findElement(By.xpath("(//a[text()='Google Play'])[1]"));
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		Thread.sleep(1000);
	//	action.moveToElement(element1).clickAndHold().moveToElement(element2).release().build().perform();
		action.clickAndHold(element1);
		action.release(element2);
		action.build().perform();
		Thread.sleep(1000);
		//action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		System.setProperty("java.awt.headless", "false");
		Robot robo = new Robot();
		robo.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		robo.keyPress(java.awt.event.KeyEvent.VK_C);
		robo.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		robo.keyRelease(java.awt.event.KeyEvent.VK_C);
	
	}
}
