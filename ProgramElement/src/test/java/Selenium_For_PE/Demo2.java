package Selenium_For_PE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo2 {
	public static void main(String[] args) {
		
		 /*    String stepDescription = "[1.OpenBrowser, 2.Maximize browser window, 3.Navigate to URL getJopUrl, 4.Wait for page to load for maximum time limit implicit time out seconds]";

		        // Remove numbers and special characters using regular expressions
		        String alphabetsOnly = stepDescription.replaceAll("[0-9.]", "");

		        System.out.println(alphabetsOnly);
		       */ 
		      
		
		List <String> g=new ArrayList<String>();
		g.add("[1.OpenBrowser,");
		g.add("2.Maximize browser window");
		g.add("3.Navigate to URL getJopUr");
		g.add("4.Wait for page to load for maximum time limit implicit time out seconds");
		
		
		List <String> g1=new ArrayList<String>();
		g1.add("Click on Email Id textfield");
		g1.add("Open Broweser step group");
		g1.add("Enter emailId into Email Id textfield");
		
		
		g1.remove(1);
		g1.addAll(1, g);
		for (String string : g1) {
			System.out.println(string.replaceAll("[0-9.]",""));
		}
		    }
		}


