package Performance_Testing;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Headless_Testing {
	
	@Test
	public void headless() {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new HtmlUnitDriver();
	driver.get("http://ebay.com");
	System.out.println(driver.getTitle());
	driver.close();

   }
}
