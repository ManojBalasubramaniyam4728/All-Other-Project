package Selenium_For_PE;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;import com.github.dockerjava.api.model.Driver;

public class tesssssssssssssss {

public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://app.fireflink.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//input[@id='mui-1']")).click();
	driver.findElement(By.xpath("//input[@id='mui-1']")).sendKeys("jidos50815@imdutex.com");
	driver.findElement(By.xpath("//input[@id='mui-2']")).click();
	driver.findElement(By.xpath("//input[@id='mui-2']")).sendKeys("Password@123");
	driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='MuiListItemText-root jss6 css-10hifo4']"))));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space()='Test']")).click();
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@title='Testing']"))));
	driver.findElement(By.xpath("//span[@title='Testing']")).click();
	Actions ac=new Actions(driver);
	for (int i = 0; i <=80; i++) {
	ac.moveToElement(driver.findElement(By.xpath("(//td/span[@class='actionIcons'])[5]"))).build().perform();
	driver.findElement(By.xpath("(//td/span[@class='actionIcons'])[5]//button[.='Open options']")).click();
	Thread.sleep(200);
	ac.moveToElement(driver.findElement(By.xpath("//button[text()='Clone']"))).build().perform();
	driver.findElement(By.xpath("//button[text()='Clone']")).click();
	Thread.sleep(5000);
	}
}

}
