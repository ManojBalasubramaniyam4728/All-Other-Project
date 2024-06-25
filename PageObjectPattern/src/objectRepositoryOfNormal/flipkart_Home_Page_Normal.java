package objectRepositoryOfNormal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class flipkart_Home_Page_Normal {
	//WedDriver invoking
	WebDriver driver;
	
    //Constractor =And Passing Driver
	public flipkart_Home_Page_Normal(WebDriver driver) {
		this.driver = driver;
	}
	
    //Storing Elements
	By SearchTextfield = By.xpath("//input[@title='Search for products, brands and more']");
	By SearchButton = By.xpath("//button[@type='submit']");

	//User Defined Method To Above Elements
	public WebElement SearchTextfield() {
		return driver.findElement(SearchTextfield);
	}

	public WebElement SearchButton() {
		return driver.findElement(SearchButton);
	}

}

