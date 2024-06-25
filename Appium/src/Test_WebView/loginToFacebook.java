package Test_WebView;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

public class loginToFacebook extends base{
public static void main(String[] args) throws MalformedURLException {
	driver=openBrowserInAdroid();
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//a[text()='English (UK)']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Mobile number or email address']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Mobile number or email address']")).sendKeys("manoj.b@testyantra.com");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Password@123");
	driver.findElement(By.xpath("//button[@value='Log In']")).click();
	System.out.println("Successfully Loged in");
	driver.quit();
}
}
