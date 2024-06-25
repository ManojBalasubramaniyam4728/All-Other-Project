package Configuring_Selenium_and_Running_Tests_on_All_Browsers;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javapopup {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		//System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    WebDriverWait wait=new WebDriverWait(driver,20);
	  WebElement okpopup=  driver.findElement(By.xpath("//button[@id='alertButton']"));
	  wait.until(ExpectedConditions.visibilityOf(okpopup));
	   okpopup.click();
	    driver.switchTo().alert().accept();//ok or yes
	   driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
	   wait.until(ExpectedConditions.alertIsPresent());//wait until alert pop up arise 
	   driver.switchTo().alert().accept();//wait 5 sec
	   driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	   driver.switchTo().alert().dismiss();//canceling
	   driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	   driver.switchTo().alert().sendKeys("hello priya");
	   driver.switchTo().alert().accept();//sending info
	   driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
       String popup=  driver.switchTo().alert().getText();
	   System.out.println(popup);//getting pop up
	   driver.switchTo().alert().dismiss();//canceling
	  driver.quit();
	}
}
