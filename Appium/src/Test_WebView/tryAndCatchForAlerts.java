package Test_WebView;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

public class tryAndCatchForAlerts extends base {
	public static void main(String[] args) throws MalformedURLException {
		driver = openBrowserInAdroid();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
		try {
			driver.switchTo().alert();
		} catch (Exception e) {
			System.out.println("Not Able To Click On Element");
		}
		driver.quit();
	}
}
