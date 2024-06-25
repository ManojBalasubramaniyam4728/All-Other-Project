package Selenium_For_PE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class New_Method {
public static void main(String[] args) {
//	ChromeOptions opt=new ChromeOptions();
//	opt.setBinary("C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64.chromedriver.exe");
//   //opt.setBrowserVersion("117");
//	WebDriver driver=new ChromeDriver(opt);
//	driver.manage().window().maximize();
//	driver.get("http://googel.com");
	
	FirefoxOptions fo=new FirefoxOptions();
	fo.setBrowserVersion("nightly");
	WebDriver driver=new FirefoxDriver(fo);
	driver.get("https://fireflink.com");
}
}
