package CloudTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class BrowserStackTest {
    public static final String USERNAME = "your_username";
    public static final String ACCESS_KEY = "your_access_key";
    public static final String BROWSERSTACK_URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static void main(String[] args) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "latest");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");

        WebDriver driver = new RemoteWebDriver(new URL(BROWSERSTACK_URL), caps);
    	driver.get("https://geogle.com");
    	System.out.println(driver.getTitle());
    	driver.quit();
    }
}
