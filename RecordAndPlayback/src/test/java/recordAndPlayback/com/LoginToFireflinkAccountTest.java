package recordAndPlayback.com;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToFireflinkAccountTest {
  private WebDriver driver;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void loginToFireflinkAccount() throws InterruptedException {
    driver.get("https://app.fireflink.com/");
    driver.manage().window().setSize(new Dimension(1382, 736));
    driver.findElement(By.id("mui-1")).click();
    driver.findElement(By.id("mui-1")).sendKeys("jidos50815@imdutex.com");
    driver.findElement(By.id("mui-2")).click();
    driver.findElement(By.id("mui-2")).sendKeys("Password@123");
    driver.findElement(By.cssSelector(".primary-btn")).click();
    Thread.sleep(7000);
    {
		List<WebElement> elements = driver.findElements(By.cssSelector(".project_label"));
		assert (elements.size() > 0);
	}
  }
}