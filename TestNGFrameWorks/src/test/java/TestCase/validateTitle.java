package TestCase;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.logging.log4j.*;
import Resources.base;
import pageObjectRepo.LandingPage;


public class validateTitle extends base {
	public static Logger log=LogManager.getLogger(validateTitle.class.getName());

	@BeforeTest
	public void openBrowser() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(filePath);
		prop.load(fis);
		String url = prop.getProperty("url");
		driver = initializeDriver();
		log.info("Wait Until visibility Of Create Account link");
		driver.get(url);
		
	}

	@Test
	public void validateTitles() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(filePath);
		prop.load(fis);
		String title = prop.getProperty("title");
		// Object Creating For Landing Page
		LandingPage lp = new LandingPage(driver);
		WaitUntilvisibilityOf(lp.Create_Account());
		log.info("Wait Until visibility Of Create Account link");
		assertEquals(lp.getTitle().getText(), title);
		log.info("Succesfully Compared the valu with actual and expected");
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver=null;
		log.info("Successfully Browser closed");
	}

}
