
package Selenium_For_PE;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VPN_OneAndOff {
    public static void main(String[] args) throws InterruptedException {
        // Replace '14.192.2.179' with the actual IP address you want to manage
        String ipToManage = "14.192.2.179";

        // Build the command to check the network connection status
        String[] checkCommand = {"C:\\Program Files (x86)\\Sophos\\Connect\\sccli", "status", "-n", ipToManage};

        try {
            ProcessBuilder checkProcessBuilder = new ProcessBuilder(checkCommand);
            Process checkProcess = checkProcessBuilder.start();

            // Read the output of the check command
            BufferedReader checkReader = new BufferedReader(new InputStreamReader(checkProcess.getInputStream()));
            String checkOutput = checkReader.readLine();
            checkProcess.waitFor();
            System.out.println(checkOutput);

            if (checkOutput != null && checkOutput.contains("enabled")) {
                System.out.println("Network connection is currently enabled.");
                // Add code here to handle the case when the connection is already enabled.
            } else {
                System.out.println("Network connection is currently disabled. Enabling it now.");

                // Build the command to enable the network connection
                String[] enableCommand = {"C:\\Program Files (x86)\\Sophos\\Connect\\sccli", "enable", "-n", ipToManage};

                ProcessBuilder enableProcessBuilder = new ProcessBuilder(enableCommand);
                Process enableProcess = enableProcessBuilder.start();

                Boolean enableExitCode = enableProcess.waitFor(20, TimeUnit.SECONDS);

                if (enableExitCode == true) {
                    System.out.println("Network connection enabled successfully.");
                } else {
                    System.err.println("Failed to enable network connection. Exit code: " + enableExitCode);
                }
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://10.10.20.134/MSRTCQA/");
        
        WebDriverWait wiat =new WebDriverWait(driver, Duration.ofSeconds(5));
        
        for(int i=1; i<=5;i++) {
        try {
        	wiat.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Login']")));
		 break;
        }
        catch (TimeoutException e) {
        	driver.navigate().refresh();
		}
        
        }

    }
}

