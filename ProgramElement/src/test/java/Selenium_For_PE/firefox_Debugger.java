package Selenium_For_PE;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class firefox_Debugger {
	   public static void main(String[] args) {
		   WebDriverManager.firefoxdriver().setup();
	       FirefoxOptions options = new FirefoxOptions();
	       options.addArguments("-start-debugger-server"); // Enable the built-in debugger
	       
	       WebDriver driver = new FirefoxDriver(options);
	     //  driver.get("https://www.example.com"); // Navigate to the desired webpage
	   }
	}

