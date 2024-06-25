package Selenium_For_PE;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetElementCoordinates {
   public static void main(String[] args) {
      // Set the path of chrome driver executable
     System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
      // Create a new instance of the chrome driver
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();

      // Navigate to the web page
      driver.get("https://www.zomato.com/");

      // Find the element by its ID
      WebElement element = driver.findElement(By.xpath("//input[@placeholder='Bengaluru']"));

      // Get the XY coordinates of the element
      Point coordinates = element.getLocation();
      int Xcoordinates = coordinates.getX();
      int Ycoordinates = coordinates.getY();

      // Print the XY coordinates of the element
      System.out.println("Elementcoordinates: (" + Xcoordinates + ", " + Ycoordinates + ")");

      // Close the browser
      driver.quit();
   }
}
