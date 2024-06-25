package Resources;

import java.io.File; 
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
   //global Variables
	public static WebDriver driver;
	public static String filePath="C:\\Users\\user\\eclipse-workspace\\TestNGFrameWorks\\src\\main\\java\\Resources\\data.properties";

//**************************************************************************************************************************************
   //User Defined Method To Invoking Browsers
	public WebDriver initializeDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(filePath);
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		 
		
		if (browserName.equalsIgnoreCase("chrome")) {
           WebDriverManager.chromedriver().setup();
             driver=new ChromeDriver();
             driver.manage().window().maximize();
		}
		
		else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		     driver=new FirefoxDriver();
		     driver.manage().window().maximize();
		}
		
		else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
		     driver=new EdgeDriver();
		     driver.manage().window().maximize();
		}
		
		else {
			WebDriverManager.safaridriver().setup();
			 driver=new SafariDriver();
			 driver.manage().window().maximize();
		}
		
		return driver;
	}
	
//**************************************************************************************************************************************
	  //User Defined Method To Explicit Wait
	public void WaitUntilvisibilityOf(WebElement Element) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(filePath);
		prop.load(fis);
		String ExplicitWait=prop.getProperty("ExplicitWait");
		Integer ExplicitWaitTime=Integer.parseInt(ExplicitWait);
		//logic gos here
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(ExplicitWaitTime));
		 wait.until(ExpectedConditions.visibilityOf(Element));
	}		
		
//**************************************************************************************************************************************
        public void getScreenShot(String result) throws IOException{
        	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        	FileUtils.copyFile(src, new File("C:\\Users\\user\\eclipse-workspace\\FrameWorks\\ScreenShot\\"+result+"screenshot.png"));
        }
//**************************************************************************************************************************************
	
}
