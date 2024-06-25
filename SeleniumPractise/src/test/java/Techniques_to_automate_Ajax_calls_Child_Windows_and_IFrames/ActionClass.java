package Techniques_to_automate_Ajax_calls_Child_Windows_and_IFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {
	public static void main(String[] args) {
	//	System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions Act = new Actions(driver);
		Act.moveToElement(driver.findElement(By.xpath("//span[text()='Account & Lists']"))).build().perform();
		// entering element in caps
		Act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
				.sendKeys("hello").build().perform();
		// selecting enterelement
		Act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
				.sendKeys("hello").doubleClick().build().perform();
		// Rightclick
		Act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).contextClick().build().perform();
		// liftclick
		Act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().build().perform();
		// driver.close();

	}
}
