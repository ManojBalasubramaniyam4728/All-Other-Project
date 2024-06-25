package Selenium_Webdriver_Techniques_to_automate_Web_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class radioButton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
	 Thread.sleep(2000);
WebElement fo=driver.findElement(By.xpath("//h2[text()='Select multiple options']"));
	 JavascriptExecutor jse=(JavascriptExecutor)driver;
	 jse.executeScript("arguments[0].scrollIntoView(true);",fo);
	 Thread.sleep(2000);
	 Actions act= new Actions(driver);
	WebElement e1= driver.findElement(By.xpath("//input[@value='Bike']"));
	act.click(e1);
	act.build().perform();
	List<WebElement> list=driver.findElements(By.xpath("//input[@type='radio']"));
	int size=list.size();
	System.out.println(size);
	driver.quit();

	}
}
