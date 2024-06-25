package TestCase;

import java.io.FileInputStream; 
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.base;
import pageObjectRepo.CreateAccountPage;
import pageObjectRepo.LandingPage;

import org.apache.logging.log4j.*;

public class homePage extends base {
	public static Logger log=LogManager.getLogger(homePage.class.getName());

	@BeforeTest
	public void openBrowser() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(filePath);
		prop.load(fis);
		String url = prop.getProperty("url");
		driver = initializeDriver();
		log.info("Browser Opened Succesfully"); 
		driver.get(url);
		log.info("Navigated To reddif home page");
		
	}

	@Test(dataProvider = "getData")
	public void LangingOnHomePage(String FullName,String chooseARediffmailid) throws IOException {
		// Object Creating For Landing Page
		LandingPage lp = new LandingPage(driver);
		WaitUntilvisibilityOf(lp.Create_Account());
		log.info("Wait Until visibility Of Create Account link");
		lp.Create_Account().click();
		log.info("Successfully Clicked on create Account");
		
		//Object Creating For Create account
		CreateAccountPage cap=new CreateAccountPage(driver);
		cap.Full_Name().click();
		log.info("Successfully Clicked on Full Name TextField");
		cap.Full_Name().sendKeys(FullName);
		log.info("Successfully Entered Full Name in Full Name TextField");
		cap.Choose_a_Rediffmail_ID().click();
		log.info("Successfully Clicked on Choose a Rediffmail Id TextField");
		cap.Choose_a_Rediffmail_ID().sendKeys(chooseARediffmailid);
		log.info("Successfully Choose a Rediffmail Id  in Choose a Rediffmail Id TextField");
		cap.Check_availability().click();
		log.info("Successfully Clicked Check availability Button");
		
		
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver=null;
		log.info("Successfully Browser closed");
	}
	

	@DataProvider
	   public Object[][] getData() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(filePath);
		prop.load(fis);
		
		String FullName = prop.getProperty("fullName");
		String chooseARediffmailid = prop.getProperty("chooseARediffmailid");
        
		Object[][] data= new Object[1][2];

        data[0][0]=FullName;
        data[0][1]=chooseARediffmailid;
	   return data;
	}
}