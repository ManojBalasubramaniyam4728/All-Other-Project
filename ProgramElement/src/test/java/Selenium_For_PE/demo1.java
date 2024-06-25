package Selenium_For_PE;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo1 {
	public static String getDateInURCSTATFormate(String daysInCount) {
		int tatDate = Integer.parseInt(daysInCount);

		Calendar cal  = Calendar.getInstance();
		//subtracting a day
		cal.add(Calendar.DATE, -tatDate);

		SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
		String result = s.format(new Date(cal.getTimeInMillis()));
		
		return result;
	}
	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		System.out.println("enter Browser name:-");
//		String name=sc.next();
//		if(name.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
//	    	WebDriver driver=new ChromeDriver();
//		}
//		else if(name.equalsIgnoreCase("Firefox"));
//		    System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/geckodriver.exe");
//    	    WebDriver driver=new FirefoxDriver();
//	}
		System.out.println(demo1.getDateInURCSTATFormate("0"));
		
	}
}
