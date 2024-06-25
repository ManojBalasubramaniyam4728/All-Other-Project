package Selenium_For_PE;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Randam_gentrating_Number_and_Concating_with_Number {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).click();
		Random rand = new Random();

		// Generate three random Number
		int num1 = (int) (rand.nextInt(9) + 0);
		int num2 = (int) (rand.nextInt(9) + 0);
		int num3 = (int) (rand.nextInt(9) + 0);
		int num4 = (int) (rand.nextInt(9) + 0);
		int num5 = (int) (rand.nextInt(9) + 0);

		// Concatenate Number with Generate Number
		String GeneratedNumber=  (num1+""+num2+""+num3+""+num4+""+num5);
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("97418"+""+GeneratedNumber);
		Thread.sleep(3000);
		driver.quit();
	
	}
}
