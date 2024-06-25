package Selenium_Webdriver_Techniques_to_automate_Web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_Static_Drop_Down {

	public static void main(String[] args) {
		System.setProperty("weddriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uat-shop-live.vsgdover.com/INTERSHOP/web/WFS/VSG-BRB-Site/en_DE/-/EUR/ViewHomepage-Start");
		Select s= new Select(driver.findElement(By.xpath("//select[@id=\"category\"]")));
		  s.selectByValue("604146");
		  s.selectByVisibleText("Accessories lifts");
		 // driver.close();
		
	}
}
