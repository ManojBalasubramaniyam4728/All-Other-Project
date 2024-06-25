package Selenium_For_PE;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Uploding_With_Autoit {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
	   driver.findElement(By.xpath("//label[@for=\"uploadFile\"]")).click();
	   Thread.sleep(500);
       Runtime.getRuntime().exec("C:\\Users\\user\\Documents\\Man\\s\\Fileuploding.exe");
	   Thread.sleep(4000);
	   driver.close();
	}

}
