package Selenium_For_PE;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Take_Screenshot {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https:fireflink.com");
	Thread.sleep(5000);
	TakesScreenshot tsc=(TakesScreenshot)driver;
	File screenshot=tsc.getScreenshotAs(OutputType.FILE);
	File file= new  File("C:/Users/user/Documents/Man/m.png");
	FileUtils.copyFile(screenshot, file);
	driver.quit();
}
}
