package Techniques_to_automate_Ajax_calls_Child_Windows_and_IFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		//switch frame by Idex
		//driver.switchTo().frame(2);
		
		//Switch frame by Id
		driver.switchTo().frame("frame1");
		
		//switch frame by Element
	//	driver.switchTo().frame("//iframe[@id='frame1']");
		 WebElement element1=driver.findElement(By.xpath("//body//h1[@id=\"sampleHeading\" and(text()=\"This is a sample page\")]"));
         String text=element1.getText();
        driver.switchTo().parentFrame();
        System.out.println(text);
        driver.quit();
}
}
