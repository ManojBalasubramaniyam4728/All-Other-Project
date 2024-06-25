package Test_Case_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepositoryOfPageFactory.flipkart_Home_Page_PF;
import objectRepositoryOfPageFactory.flipkart_Login_Page_PF;

public class Login_To_Aplication_And_Search_A_Product_PF {

	@Test
	public void Login_To_Aplication_And_Search_A_Product_PageFactory() throws InterruptedException {

		// setting chrome browser to inovok
		WebDriverManager.chromedriver().setup();

		// Lanching the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		// Performing Activity in Login page
		flipkart_Login_Page_PF flpf = new flipkart_Login_Page_PF(driver);
		Thread.sleep(500);
		flpf.EmailId().click();
		flpf.EmailId.sendKeys("manojbalasubramaniyam4488@gmail.com");
		flpf.Cancel().click();

		// Performing Activity in Home page
		flipkart_Home_Page_PF fhpf = new flipkart_Home_Page_PF(driver);
		fhpf.SearchTextfield().sendKeys("Bags For Men");
		fhpf.SearchButton().click();
		driver.close();

	}
}
