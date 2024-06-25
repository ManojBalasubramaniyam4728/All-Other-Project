package pageObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	//Global Variable
	public WebDriver driver;

//**************************************************************************************************************************************
	//Giving life to driver by Constracor
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
//**************************************************************************************************************************************
	//Locaters
  By Create_Account=By.xpath("//a[@title='Create Rediffmail Account']");
  By title=By.xpath("//a[@title='Live commentary of the Indian stock markets, stock quotes and business news']");
  
//**************************************************************************************************************************************		
	//User Defined Method To Above Locators
  
        public WebElement Create_Account() {
    	return driver.findElement(Create_Account);
        }
        
        public WebElement getTitle() {
        	return driver.findElement(title);
        }
}
