package Selenium_For_PE;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EventCreation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://ncpuat.olamagri.com/");
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("john.georgek@mindsprint.org");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Welcome@123");
		WebElement login=driver.findElement(By.xpath("//input[@id='submit_button']/.."));
		login.click();
		driver.get("https://ncpuat.olamagri.com/#/pages/event_creation?eventId=1141");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='progress']/div[2]")));
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@id='progress']/div[2]")).click();
		List<String> dat=new LinkedList<>();
        dat.add("Approval Start Date and Time");
		dat.add("Approval End Date and Time");
		dat.add("Publish Date and Time");
		dat.add("Event Start Date and Time");
		dat.add("Event End Date and Time");
		dat.add("Evaluation Start Date and Time");
		dat.add("Evaluation End Date and Time");
		dat.add("Awarded Start Date and Time");
		dat.add("Awarded End Date and Time");

		for (String t: dat) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='"+t+"']/..//img")));
			driver.findElement(By.xpath("//div[text()='"+t+"']/..//img")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class,'cell-today')]/.."))).click();
			if(t.equals("Approval Start Date and Time")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class=\"owl-dt-timer-input\"])[2]"))).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class=\"owl-dt-timer-input\"])[2]"))).sendKeys(LocalTime.now().plusMinutes(10).getMinute()+"");
			}
			Thread.sleep(500);
	        driver.findElement(By.xpath("//button/span[text()='Apply']")).click();	
		}	
	}
}

