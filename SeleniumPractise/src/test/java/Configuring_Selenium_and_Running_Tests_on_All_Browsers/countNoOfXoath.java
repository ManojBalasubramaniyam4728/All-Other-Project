package Configuring_Selenium_and_Running_Tests_on_All_Browsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countNoOfXoath {
	public static void main(String[] args) {
		System.setProperty("weddriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		String count =driver.findElement(By.xpath("//a[@rel=\\\"noopener noreferrer\\\"]//div[@style=\\\"font-family: inherit;\\\"]")).getText();
	int	count1= Integer.parseInt(count);
	List<WebElement>geu=driver.findElements(By.xpath("//a[@rel=\"noopener noreferrer\"]//div[@style=\"font-family: inherit;\"]"));
	int noOfXpath= geu.size();
    if(noOfXpath==count1) {
	System.out.println("asexpected");
	
	
	
	

}
}
}
