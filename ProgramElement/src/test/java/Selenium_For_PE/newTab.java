package Selenium_For_PE;

import org.openqa.selenium.WebDriver; 
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newTab {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.zomato.com/");
		driver.close();
		Thread.sleep(5000);
        driver.quit();
	   
    }
}