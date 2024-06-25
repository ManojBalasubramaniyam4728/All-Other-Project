package objectRepositoryOfPageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class flipkart_Home_Page_PF {
	//WedDriver invoking
	WebDriver driver;
	
    //Constractor =And Passing Driver
	public flipkart_Home_Page_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
    //Storing Elements By FindBy anotation
	@FindBy(xpath = "//input[@title='Search for products, brands and more']")
	WebElement SearchTextfield;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement SearchButton;
	
   //annnation to remamber(@FindAll)
	@FindAll({@FindBy(xpath ="//input[@title='Search for products, brands and more']"),
	          @FindBy(xpath="//input[contains(@title,'Search for products, brands and more')]")})
	WebElement SearchTextfield1;
	/*this @FindAll will work how much Find By should pass all
	     Both xpath should pass than only it will work
       */
	
	 //annnation to remamber(@FindBys)
	@FindBys({@FindBy(xpath ="//input[@title='Search for products, brands and more']"),
	          @FindBy(xpath="//input[contains(@title,'Search for products, brands and more')]")})
	WebElement SearchTextfield2;
	/*this @FindAll will work how much Find By shaould any one to pass
	     any one to pass xpath should pass than only it will work
       */
	
	//User Defined Method To Above Elements
	public WebElement SearchTextfield() {
		return SearchTextfield;
	}

	public WebElement SearchButton() {
		return SearchButton;
	}
	public WebElement SearchTextfield1() {
		return SearchTextfield1; 
	}
	public WebElement SearchTextfield2() {
		return SearchTextfield2;
	}

}

