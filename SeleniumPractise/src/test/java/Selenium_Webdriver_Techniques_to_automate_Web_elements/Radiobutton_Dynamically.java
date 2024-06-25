package Selenium_Webdriver_Techniques_to_automate_Web_elements;

import java.awt.AWTException; 
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Radiobutton_Dynamically {
	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.crome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	WebElement scroll=	driver.findElement(By.xpath("//h2[text()='Select a vehicle']"));
		JavascriptExecutor jsc=(JavascriptExecutor)driver;
		jsc.executeScript("arguments[0].scrollIntoView(true);", scroll);
		List<WebElement> list=	driver.findElements(By.xpath("//input[@type='radio']"));
		int count=list.size();
		for(int i=0;i<count;i++) {
			String text=driver.findElements(By.xpath("//input[@type='radio']")).get(i).getAttribute("value");
				if(text.equals("Car")) {
		driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
		
			       }
				}

		driver.close();
		}
		
	}


