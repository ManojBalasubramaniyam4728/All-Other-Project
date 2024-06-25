package Selenium_Webdriver_Techniques_to_automate_Web_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chechkbox {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/checkbox");
		driver.findElement(By.xpath("//button[@aria-label='Toggle']")).click();
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Documents')]/ancestor::span//span[@class='rct-checkbox']/*/*")).isSelected());
		driver.findElement(By.xpath("//span[contains(text(),'Documents')]/ancestor::span//span[@class='rct-checkbox']")).click();
		Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Documents')]/ancestor::span//span[@class='rct-checkbox']/*")).isSelected());
	System.out.println(driver.findElements(By.xpath("//span[contains(@class,'rct-title')]")).size());
		
		// another way
		
//		List<WebElement> fg=driver.findElements(By.xpath("//span[contains(@class,'rct-title')]"));
//		int size=fg.size();
//		System.out.println(size);
		
		driver.quit();
	}

}
