package Selenium_For_PE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getColourOfelement {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://app.fireflink.com/signin");
	
WebElement element=	driver.findElement(By.xpath("//button[text()='Sign in']"));
String colorr=element.getCssValue("background-color");
System.out.println(colorr);
String excatcolor=Color.fromString(colorr).asHex();
System.out.println(excatcolor);
if(excatcolor.contains("#1648c6")) {
	System.out.println("Blue button");
}



}
}
