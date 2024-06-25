package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMStep {
	
	WebDriver driver;
	
	@Given("I Launch chrome browser")
	public void i_launch_chrome_browser() {
		driver=new ChromeDriver();
	}

	@When("I opened orangeHRM home page")
	public void i_opened_orange_hrm_home_page() {
	   driver.manage().window().maximize();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Then("I verify that the log is prsent on home page")
	public void i_verify_that_the_log_is_prsent_on_home_page() throws InterruptedException {
	   Thread.sleep(5000);
	   boolean isPresent=driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']")).isDisplayed();
	   Assert.assertEquals(true, isPresent);
	}

	@And("Close the browser")
	public void close_the_browser() {
	   driver.close();
	}

}
