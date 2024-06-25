package Selenium_For_PE;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch_To_Window {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// Get the current window handle
		String currentWindowHandle = driver.getWindowHandle();

		// Get all window handles
		Set<String> windowHandles = driver.getWindowHandles();

		// Switch to the new window
		for (String windowHandle : windowHandles) {
			if (!windowHandle.equals(currentWindowHandle)) {
				
			driver.switchTo().window(windowHandle);
		}
	}

}
}
