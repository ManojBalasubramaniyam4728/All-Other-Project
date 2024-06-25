package Selenium_For_PE;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanchAlreadyOpenedBrowser {
	public static void main(String[] args) throws IOException, InterruptedException {

		String cmdCommand = "chrome.exe -remote-debugging-port=2705 --no-first-run --no-default-browser-check --user-data-dir=";
		String folderDirectory = "C:\\Users\\user\\Desktop\\newchrome1";
		String chromePath = "C:\\Program Files\\Google\\Chrome\\Application";
		Runtime.getRuntime().exec("cmd /c start cmd.exe /K " + cmdCommand + folderDirectory, null, new File(chromePath));
		Thread.sleep(5000);
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
		ChromeOptions options1 = new ChromeOptions();
		options1.setExperimentalOption("debuggerAddress", "localhost:2705");
		options1.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
	 // System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver(options1);
		driver1.manage().window().maximize();
		driver1.navigate().to("https://app.fireflink.com/");

	}
}
