package Techniques_to_automate_Ajax_calls_Child_Windows_and_IFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Ajax_Mouse_Interactions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions Act = new Actions(driver);
		Act.moveToElement(driver.findElement(By.xpath("//span[text()='Account & Lists']"))).build().perform();
		//driver.close();
	}

}
