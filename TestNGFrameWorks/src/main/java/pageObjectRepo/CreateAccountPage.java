package pageObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountPage {
	// Global Variable
	public WebDriver driver;

//**************************************************************************************************************************************
	// Giving life to driver by Constracor
	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;
	}

//**************************************************************************************************************************************
	// Locaters
	By Full_Name = By.xpath("//td[text()='Full Name']/..//input");
	By Choose_a_Rediffmail_ID = By.xpath("//td[text()='Choose a Rediffmail ID']/..//input[@type='text']");
	By Check_availability = By.xpath("//input[@value='Check availability']");

//**************************************************************************************************************************************		
	// User Defined Method To Above Locators
	
	public WebElement Full_Name() {
	return	driver.findElement(Full_Name);
	}
	
	public WebElement Choose_a_Rediffmail_ID() {
	return	driver.findElement(Choose_a_Rediffmail_ID);
	}
	
	public WebElement Check_availability() {
	return	driver.findElement(Check_availability);
	}
//**************************************************************************************************************************************
	
}
