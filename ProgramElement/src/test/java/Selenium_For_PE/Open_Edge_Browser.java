package Selenium_For_PE;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Open_Edge_Browser {
    public static void main(String[] args) {
    	System.setProperty("webdriver.edge.driver", "C:/Web Drivers/msedgedriver.exe");
        // Create EdgeOptions instance
        EdgeOptions options = new EdgeOptions();

        // Add arguments
        options.addArguments("--remote-allow-origins=*");

        // Create EdgeDriver with options
        EdgeDriver driver = new EdgeDriver(options);

        // Your WebDriver code here

        // Close the browser
       // driver.quit();
    }
}
