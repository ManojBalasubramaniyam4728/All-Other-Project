package Selenium_For_PE;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class ChromeDriverWithProxy {
    public static void main(String[] args) {
        String proxyAddress = "C:/Users/user/Downloads/SophosConnect_2.2.90_(IPsec_and_SSLVPN).msi";
        String proxyPort = "14.192.2.179";
        String proxyUsername = "james";
        String proxyPassword = "Neumeric#1909";

        // Set up the proxy
        Proxy proxy = new Proxy();
        proxy.setHttpProxy(proxyAddress + ":" + proxyPort);
        proxy.setSslProxy(proxyAddress + ":" + proxyPort);

        // Create ChromeOptions and set the proxy
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability(CapabilityType.PROXY, proxy);

        // Add proxy authentication to ChromeOptions
        chromeOptions.addArguments("--proxy-auth=" + proxyUsername + ":" + proxyPassword);


        // Create a WebDriver instance with the configured proxy
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Open a website
        driver.get("http://10.10.20.134/MSRTCQA/");

        // Rest of your automation code here

        // Close the WebDriver
        
    }
}
