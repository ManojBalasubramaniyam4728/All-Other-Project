package recordAndPlayback.com;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginToFireflinkAndCreteOneWedTypeOfProjectTest {
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
	public void loginToFireflinkAndCreteOneWedTypeOfProject() throws InterruptedException {
		driver.get("https://app.fireflink.com/signin");
		driver.manage().window().setSize(new Dimension(1382, 736));
		driver.findElement(By.id("mui-1")).click();
		driver.findElement(By.id("mui-1")).sendKeys("jidos50815@imdutex.com");
		driver.findElement(By.id("mui-2")).click();
		driver.findElement(By.id("mui-2")).sendKeys("Password@123");
		driver.findElement(By.cssSelector(".primary-btn")).click();
		Thread.sleep(5000);
	    boolean isDispayed=false;
	    try {
			driver.findElement(By.xpath("//span[text()='Test123']")).isDisplayed();
			isDispayed=true;
		} catch (NoSuchElementException e) {
			isDispayed=false;
		}
	    if (isDispayed) {
	    	Actions act=new Actions(driver);
	    	act.moveToElement(driver.findElement(By.xpath("//span[text()='Test123']/../../..")));
	    	driver.findElement(By.xpath("//span[text()='Test123']/../../..//span[@data-title='Edit']")).click();
	    	Thread.sleep(2000);
	    	 driver.findElement(By.xpath("//input[@type=\"checkbox\"]/..//span")).click();
	    	 driver.findElement(By.xpath("//button[text()='Change']")).click();
	    	 Thread.sleep(2000);
	    	 driver.findElement(By.xpath("//button[text()='Update']")).click();
	    	 Thread.sleep(2000);
	    	 act.moveToElement(driver.findElement(By.xpath("//span[text()='Test123']/../../..")));
	    	 driver.findElement(By.xpath("//span[@id=\"del\"]")).click();
		}
	    else {
	    	
	    
		driver.findElement(By.xpath("//button[text()=\"+ Project\"]")).click();
		driver.findElement(By.id("projectName")).sendKeys("Test123");
		{
			WebElement element = driver.findElement(By.id("projecttype"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).clickAndHold().perform();
		}
		{
			WebElement element = driver.findElement(By.cssSelector(".MuiBackdrop-root"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).release().perform();
		}
		driver.findElement(By.cssSelector(".no_overflow")).click();
		driver.findElement(By.xpath("(//li[@id=\'sideLeft\'])[2]")).click();
		driver.findElement(By.id("Url")).click();
		driver.findElement(By.id("Url")).sendKeys("https://app.fireflink.com");
		driver.findElement(By.id("buttonId")).click();
		Thread.sleep(5000);
		{
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()=\'Test Development\']"));
			assert (elements.size() > 0);
		}
	}
	}
}
