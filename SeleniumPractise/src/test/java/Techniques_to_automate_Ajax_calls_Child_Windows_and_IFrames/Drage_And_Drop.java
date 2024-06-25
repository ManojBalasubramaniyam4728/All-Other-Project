package Techniques_to_automate_Ajax_calls_Child_Windows_and_IFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drage_And_Drop {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		WebElement Darge=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement Drop=driver.findElement(By.xpath("(//div[@id=\"droppable\"]//p)[1]"));
	   Actions act=new Actions(driver);
	   act.dragAndDrop(Darge, Drop).build().perform();
	   driver.quit();
	}

}
