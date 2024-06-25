package Selenium_For_PE;

import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class To_Get_Port_Number {
	public static void main(String[] args) throws URISyntaxException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		ChromeDriverService service = new ChromeDriverService.Builder().withSilent(true).build();
		WebDriver driver = new ChromeDriver(service, option);
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/bangalore");
		
		URI url = new URI("driver");
		System.out.println(url.getPort());
		driver.quit();
		}
	}


