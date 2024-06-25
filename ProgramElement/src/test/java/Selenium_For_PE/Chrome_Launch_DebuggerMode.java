package Selenium_For_PE;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_Launch_DebuggerMode {
	public static void main(String[] args) throws IOException, InterruptedException {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter the cmdCommand");
//String cmdCommand	=sc.nextLine();
//System.out.println(" Enter the folder Directory");
//String folderDirectory=sc.nextLine();
//System.out.println("Enter the chromePath");
//String chromePath=sc.nextLine();
		String cmdCommand = "chrome.exe -remote-debugging-port=2705 --no-first-run --no-default-browser-check --user-data-dir=";
		String folderDirectory = "C:/Users/User/Desktop/newchrome";
		String chromePath = "C:/Program Files/Google/Chrome/Application";

		Runtime.getRuntime().exec("cmd /c start cmd.exe /K " + cmdCommand + folderDirectory, null,
				new File(chromePath));
		Thread.sleep(5000);
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
        WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		// WebDriver d=WebDriverManager.chromedriver().capabilities(option).create();
		option.addArguments("--no-sandbox");
		option.addArguments("--disable-dev-shm-usage");
		option.addArguments("--disable-gpu");
		option.setExperimentalOption("debuggerAddress", "localhost:2705");
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(option);
		// WebDriver driver=new ChromeDriver();
		try {
			driver.manage().window().maximize();
			driver.get("https://www.zomato.com/bangalore");
		} catch (Exception e) {
			System.out.println();
			e.printStackTrace();
		}

	}

}
