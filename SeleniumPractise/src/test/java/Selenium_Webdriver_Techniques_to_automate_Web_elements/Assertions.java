package Selenium_Webdriver_Techniques_to_automate_Web_elements;


	 import org.apache.commons.exec.ExecuteException; 
	 import org.openqa.selenium.By;
	 import org.openqa.selenium.JavascriptExecutor;
	 import org.openqa.selenium.WebDriver;
	 import org.openqa.selenium.WebElement;
	 import org.openqa.selenium.chrome.ChromeDriver;
	 import org.openqa.selenium.chrome.ChromeOptions;
	 import org.openqa.selenium.interactions.Actions;
     import org.testng.Assert;

   //import net.bytebuddy.build.BuildLogger;

	 public class Assertions {
	 public static void main(String[] args) throws InterruptedException {
	 	System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
	 	ChromeOptions option= new ChromeOptions();
	 	
	 	option.addArguments("--disable-notifications");
	 	WebDriver driver=new ChromeDriver(option);
	 	driver.manage().window().maximize();
	 	driver.get("https://www.spicejet.com/");
	 	String s1=(driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers\"]/div/div[1]")).getText());
	      System.out.println(s1);
	      
	      Assert.assertEquals(s1, s1);
	      
	 	driver.findElement(By.xpath("//div[text()='1 Adult']")).click();
	 	Thread.sleep(200);
	 	for(int i=1;i<=4;i++) {
	 		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']/*")).click();
	 	}
	 	WebElement done=driver.findElement(By.xpath("//div[text()='Done']"));

	 	Actions act= new Actions(driver);
	 	act.moveToElement(done);
	 	act.click(done);
	 	act.build().perform();
	 	String s2=(driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers\"]/div/div[1]")).getText());
	 	System.out.println(s2);
	 	Assert.assertNotSame(s1, s2);
	 	
	 	driver.quit();

	  
	   }
	 }
