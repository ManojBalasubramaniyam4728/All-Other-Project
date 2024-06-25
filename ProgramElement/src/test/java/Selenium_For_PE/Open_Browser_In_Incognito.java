package Selenium_For_PE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_Browser_In_Incognito {
	
	@Test
	public void openbrowser() {
 //System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
   WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("incognito");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/bangalore");
	driver.quit();
	}
}


	
