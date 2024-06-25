package objectRepositoryOfNormal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class flipkart_Login_Page_Normal {

	// WedDriver invoking
	WebDriver driver;

	// Constractor =And Passing Driver
	public flipkart_Login_Page_Normal(WebDriver driver) {
		this.driver = driver;
	}

	// Storing Elements
	By EmailId = By.xpath("//form[@autocomplete='on']/..//input[@type='text']");
	By Cancel = By.xpath("//button[text()='✕']");

	// User Defined Method To Above Elements
	public WebElement EmailId() {
		return driver.findElement(EmailId);
	}
	
	public WebElement Cancel() {
		return driver.findElement(Cancel);
	}
	
}
