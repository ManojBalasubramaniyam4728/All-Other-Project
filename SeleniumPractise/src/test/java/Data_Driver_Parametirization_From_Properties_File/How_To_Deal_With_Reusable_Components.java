package Data_Driver_Parametirization_From_Properties_File;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class How_To_Deal_With_Reusable_Components extends Opening_softcoded_Browsers {

	@BeforeTest
	public void openBrowserAndNavigateToZomato() throws IOException {
		openBrowserAndLogInToUrl();
		System.out.println("Browser opened successfully");
	}

	@Test
	public void other() {
		WebElement element1=driver.findElement(By.xpath("//h3[text()='Inspiration for your first order']"));
	boolean	stat= element1.isDisplayed();
	System.out.println(stat+" "+"is displayed in the web page");
	}
	
	@AfterTest
	public void closeBrowsers() {
		closeBrowser();
		System.out.println("Browser closed successfully");
	}

}
