package Selenium_For_PE;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swiching_To_Frame   {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://app.txtbox.in/app/#/contact");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement signInWithEmail=driver.findElement(By.xpath("//a[text()='Sign In with Email']"));
	//scroll
	JavascriptExecutor scroll=(JavascriptExecutor)driver;
	scroll.executeScript("arguments[0].scrollIntoView(true);", signInWithEmail);
	
	//click
	signInWithEmail.click();
	Thread.sleep(5000);
	//get actualy frame number userdefined method
    int num=getTheFrameIndex(driver,By.xpath("//div[@class='recaptcha-checkbox-border']"));
    System.out.println(num);
    //switching to actualy frame number
    driver.switchTo().frame(num);
    System.out.println(num);
    
    //doing action after switching
    driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
    
    //after switching we need switch back so both below ways are possiable
    //driver.switchTo().defaultContent();
    driver.switchTo().parentFrame();
    Thread.sleep(5000);
    driver.quit();
}


//user define method
public static int getTheFrameIndex (WebDriver driver, By xpath) {
int totalFrame =driver.findElements(By.tagName("iframe")).size();
System.out.println(totalFrame);
int i;
for (i = 0; i < totalFrame; i++) {
	driver.switchTo().frame(i);
	int size=driver.findElements(xpath).size();
	System.out.println(size);
	driver.switchTo().parentFrame();
	if (size>0) {
		break;
	}
	else {
		continue;
	}
}
	return i;
	 
}
}
