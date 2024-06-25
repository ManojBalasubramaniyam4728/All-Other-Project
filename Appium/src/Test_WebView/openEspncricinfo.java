package Test_WebView;


import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class openEspncricinfo extends base{
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	driver=openBrowserInAdroid();
	driver.get("https://www.espncricinfo.com");
	try {
	WebElement notNow=driver.findElement(By.xpath("//span[text()='Not now']"));
	if(notNow.isDisplayed()) {
		notNow.click();
	  }
	} 
	catch (NoSuchElementException e) {
	   System.out.println("Not now is not there");
	}
	System.out.println(driver.getCurrentUrl());
	WebElement termsOfUse=driver.findElement(By.xpath("//span[text()='Terms of Use']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", termsOfUse);
    termsOfUse.isDisplayed();
    Thread.sleep(5000);
   driver.quit();
     
}
}
