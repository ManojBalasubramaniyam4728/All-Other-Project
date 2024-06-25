package Selenium_For_PE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
public class ImageBasedTesting {
	
	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		
		
		
		driver.get("https://www.fireflink.com/signin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(20000);
		
		//create the object of screen class - sikuli
		Screen s =new Screen();
		
		//creating pattern class objectx
		Pattern AcceptAllCookies= new Pattern("C:\\Users\\user\\eclipse-workspace\\ProgramElement\\Image Based Testing\\Accepet All.png");
		s.wait(AcceptAllCookies,1000);
		s.click();
		
		Pattern emailTextfield = new Pattern("C:\\Users\\user\\eclipse-workspace\\ProgramElement\\Image Based Testing\\Email Textfiled.png");
		s.wait(emailTextfield, 10000);
		s.click();
		s.type("jidos50815@imdutex.com");
		
		Pattern passwordTextfield=new Pattern("C:\\Users\\user\\eclipse-workspace\\ProgramElement\\Image Based Testing\\Password Testfiled.png");
		s.wait(passwordTextfield,3000);
		s.click();
		s.type("Password@123");
		
		Pattern SigninButton= new Pattern("C:\\Users\\user\\eclipse-workspace\\ProgramElement\\Image Based Testing\\Sigin In To Platform.png");
		s.wait(SigninButton,10000);
		s.click();	
		
		
		driver.close();
	}
}