package Configuring_Selenium_and_Running_Tests_on_All_Browsers;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpeningBrowser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");//if chrome in resources
			//	WebDriverManager.chromedriver().setup();//if chrome is given in pom
				WebDriver driver=new ChromeDriver();//creating driver object to access every thin
				driver.manage().window().maximize();//maximize browse window
				driver.get("https://www.flipkart.com/");//saying browser to open flipcart
				System.out.println(driver.getTitle());//verifying we navigated to correct url
		        System.out.println(driver.getCurrentUrl());//validate we landing on Correct  url
		        driver.get("https://www.sbiyono.sbi");//navigating from on url to another url
		        driver.navigate().back();//navigating to previous page
		      //  driver.switchTo().newWindow(WindowType.TAB);//opening new tab
		        driver.navigate().to("https://www.sbiyono.sbi");//saying browser to open sbiyono
		       // driver.switchTo().newWindow(WindowType.TAB);
		    // 	driver.close();//close current running window
		    	driver.quit();//close all browser windows which are running
		
             	}
           }

