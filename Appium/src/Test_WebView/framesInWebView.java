package Test_WebView;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class framesInWebView extends base {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		driver = openBrowserInAdroid();
		driver.get("https://app.txtbox.in/app/#/contact");

		WebElement signInWithEmail = driver.findElement(By.xpath("//a[text()='Sign In with Email']"));
		// scroll
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView(true);", signInWithEmail);

		// click
		signInWithEmail.click();
		Thread.sleep(5000);
		// get actualy frame number userdefined method
		int num = getTheFrameIndex(By.xpath("//div[@class='recaptcha-checkbox-border']"));

		// switching to actualy frame number
		driver.switchTo().frame(num);

		// doing action after switching
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();

		// after switching we need switch back so both below ways are possiable
		// driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		Thread.sleep(5000);
		driver.quit();
	}

    //user define method
	public static int getTheFrameIndex(By xpath) {
		int totalFrame = driver.findElements(By.tagName("iframe")).size();
		System.out.println(totalFrame);
		int i;
		for (i = 0; i < totalFrame; i++) {
			driver.switchTo().frame(i);
			int size = driver.findElements(xpath).size();
			System.out.println(size);
			driver.switchTo().parentFrame();
			if (size > 0) {
				break;
			} else {
				continue;
			}
		}
		return i;

	}
}
