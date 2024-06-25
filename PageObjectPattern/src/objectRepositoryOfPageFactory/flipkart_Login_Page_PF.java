package objectRepositoryOfPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkart_Login_Page_PF {

		// WedDriver invoking
		WebDriver driver;

		// Constractor =And Passing Driver
		public flipkart_Login_Page_PF(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		// Storing Elements With @FindByn
		@FindBy(xpath = "//form[@autocomplete='on']/..//input[@type='text']")
		public WebElement EmailId;
		
		@FindBy(xpath = "//button[text()='✕']")
		WebElement Cancel;
	

		// User Defined Method To Above Elements
		public WebElement EmailId() {
			return EmailId;
		}
		
		public WebElement Cancel() {
			return Cancel;
		}
		
		
	}


