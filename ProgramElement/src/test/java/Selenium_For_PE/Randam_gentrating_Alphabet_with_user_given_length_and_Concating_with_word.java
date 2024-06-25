package Selenium_For_PE;

import java.util.Random;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Randam_gentrating_Alphabet_with_user_given_length_and_Concating_with_word {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of alphabet");
		int length=sc.nextInt();
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		Random rand = new Random();
	
		// Generate  random alphabets with user given inputs
	     String GeneratedAlphabets="";
		for(int i=1;i<=length;i++) {
			char alphabet1 = (char) (rand.nextInt(26) + 'a');     
	            GeneratedAlphabets+=alphabet1;        
		}
		
		// ConcatenateGenerate Alphabet with word
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Manoj"+""+GeneratedAlphabets);
		Thread.sleep(3000);
		driver.quit();
		
	}
}
