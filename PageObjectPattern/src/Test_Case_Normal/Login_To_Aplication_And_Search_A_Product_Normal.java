package Test_Case_Normal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepositoryOfNormal.flipkart_Home_Page_Normal;
import objectRepositoryOfNormal.flipkart_Login_Page_Normal;

public class Login_To_Aplication_And_Search_A_Product_Normal {

	@Test
	public void Login_To_Aplication_And_Search_A_Product_Normal1() {

		// setting chrome browser to inovok
		WebDriverManager.chromedriver().setup();

		// Lanching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		// Performing Activity in Login page
		flipkart_Login_Page_Normal flpn = new flipkart_Login_Page_Normal(driver);
		flpn.EmailId().click();
		flpn.EmailId().sendKeys("manojbalasubramaniyam4488@gmail.com");
		flpn.Cancel().click();

		// Performing Activity in Home page
		flipkart_Home_Page_Normal fhpn = new flipkart_Home_Page_Normal(driver);
		fhpn.SearchButton().click();
		fhpn.SearchTextfield().sendKeys("Bags For Men");
		fhpn.SearchButton().click();
		driver.close();

	}

}
