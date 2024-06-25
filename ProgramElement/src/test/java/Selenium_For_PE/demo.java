package Selenium_For_PE;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {
	public static void main(String[] args) {
	LocalDateTime time=LocalDateTime.now();
	System.out.println(time);
	System.out.println("====================");
	
	String newTime1 =time.toString();
	String tt=(String)newTime1.substring(14,16);
	Integer Int=Integer.parseInt(tt);
	System.out.println(tt);
    System.out.println("====================");
    
    if(Int%2==0) {
    	System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    }
    else {
    	System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/geckodriver.exe");
    	WebDriver driver=new FirefoxDriver();
	}
    
    
    
    //another way...
   
    
  /*LocalDateTime time1=LocalDateTime.now();
  int tt1=time.getMinute();
  System.out.println(time.getMinute());
  System.out.println("====================");
 
  
  if(tt1%2==0) {
  	System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
  	WebDriver driver=new ChromeDriver();
  }
  else {
  	System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/geckodriver.exe");
  	WebDriver driver=new FirefoxDriver();
	}*/
  
	}
}