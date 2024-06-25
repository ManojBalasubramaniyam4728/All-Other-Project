package CloudTesting;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SaucelabsTest {
	
public static final String USERNAME="RAHUL12";
public static final String ACCESS_KEY="RAHUL12#HGFHDSGUY15E465247";
public static final String URL="https://ManojIndia:92942555-7df5-4401-a54b-0b24d2f4a143@ondemand.us-west-1.saucelabs.com:443/wd/hub";

public static void main(String[] args) throws MalformedURLException {
	DesiredCapabilities caps=DesiredCapabilities.chrome();
	caps.setCapability("platform", "windows 7");
	caps.setCapability("version", "51.0");
	WebDriver driver=new RemoteWebDriver(new java.net.URL(URL),caps);
	driver.get("https://geogle.com");
	System.out.println(driver.getTitle());
	driver.quit();
              }
         }
    

