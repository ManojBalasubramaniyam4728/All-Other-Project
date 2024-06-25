package Selenium_For_PE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ordernarty {
	public static void main(String[] args) {
		// Set the path of the ChromeDriver executable
		//WebDriverManager.chromedriver().setup();
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		// Create a ChromeOptions object and set the user-data-dir flag to the path of
		// the profile directory you want to use
		ChromeOptions option = new ChromeOptions();
		//option.setBinary("C:\\Users\\user\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		// option.addArguments("--no-sandbox");
		// option.addArguments("--disable-dev-shm-usage");
		// option.addArguments("--disable-gpu");
		option.addArguments("--remote-allow-origins=*");
		//option.addArguments("user-data-dir=C:\\DebuggerChromes\\Shreenithya");
    	option.addArguments("user-data-dir=C:\\DebuggerChromes\\Agencyeasy");
		//option.addArguments("user-data-dir=C:\\DebuggerChromes\\Raguram");

		// Create a new ChromeDriver instance with the options object
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();

		// Navigate to a website
		driver.get("https://www.google.com");
	}
}

