package Selenium_For_PE;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Randam_gentrating_Alphabet_and_Concating_with_word {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriverManager.chromiumdriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).click();
		Random rand = new Random();

		// Generate three random alphabets
		char alphabet1 = (char) (rand.nextInt(26) + 'a');
		char alphabet2 = (char) (rand.nextInt(26) + 'a');
		char alphabet3 = (char) (rand.nextInt(26) + 'a');

		// Concatenate Number with Generate Alphabet
		String GeneratedAlphabets=  alphabet1+"" + alphabet2 +"" + alphabet3;
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Manoj"+""+GeneratedAlphabets);
		Thread.sleep(3000);
		driver.quit();
		
	}
}
