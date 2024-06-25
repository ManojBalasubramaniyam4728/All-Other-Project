package TestCase;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;
import pageObjectRepo.LandingPage;

public class validateTitle2 extends base {
	public static Logger log=LogManager.getLogger(validateTitle2.class.getName());

	@BeforeTest
	public void openBrowser() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(filePath);
		prop.load(fis);
		String url = prop.getProperty("url");
		driver=initializeDriver();
		log.info("Browser Opened Succesfully");
		driver.get(url);
		log.info("Navigated To reddif home page");
	}

	@Test
	public void validateTitles() throws IOException {
		// Object Creating For Landing Page
		LandingPage lp = new LandingPage(driver);
		WaitUntilvisibilityOf(lp.Create_Account());
		log.info("Wait Until visibility Of Create Account link");
		assertTrue(lp.getTitle().isDisplayed());
		log.info("Title is dispalyed");
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver=null;
		log.info("Successfully Browser closed");
	}

}