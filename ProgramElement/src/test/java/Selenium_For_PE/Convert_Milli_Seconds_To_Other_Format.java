package Selenium_For_PE;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Convert_Milli_Seconds_To_Other_Format {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The units(Number)which you want To convert in milliseconds ");
	int units=sc.nextInt();
	System.out.println("Enter The unit type which you want To convert To");
	String UntieType1=sc.next();
	
	switch (UntieType1.toLowerCase()) {
	
//	Converting milliSeconds to Seconds:
	 case "seconds": long milliseconds1 = units;
	                                 long seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds1);
	                                 System.out.println(seconds+" "+"Seconds"); 
	                                 break;
	
//  Converting milliseconds to minutes:
	 case "minutes":long milliseconds2 = units;
	                                 long minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds2);
	                                 System.out.println(minutes+" "+"Minutes"); 
	                                 break;
	
//	Converting milliseconds to hour:
	
	 case "hours":long milliseconds3 = units;
	                                long hour = TimeUnit.MILLISECONDS.toHours(milliseconds3);
	                                System.out.println(hour+" "+"Hour");
	                                break;
	
//  Converting milliseconds to no such format:
	  default: System.out.println("No Such format");
             }
	
        }
}


