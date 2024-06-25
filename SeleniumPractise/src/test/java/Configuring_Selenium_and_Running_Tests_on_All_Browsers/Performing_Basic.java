package Configuring_Selenium_and_Running_Tests_on_All_Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Performing_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		driver.findElement(By.xpath("//input[@placeholder=\"Search for restaurant, cuisine or a dish\"]")).sendKeys("pizza");
	  driver.close();
			
		}
		

	}


