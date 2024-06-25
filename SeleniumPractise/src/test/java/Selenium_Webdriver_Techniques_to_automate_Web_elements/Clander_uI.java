
	package Selenium_Webdriver_Techniques_to_automate_Web_elements;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	   public class Clander_uI {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notifications");
			WebDriver driver=new ChromeDriver(option);

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.makemytrip.com/");
			
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//iframe[@id='webklipper-publisher-widget-container-notification-frame']"))));
			
			if(driver.findElement(By.xpath("//iframe[@id='webklipper-publisher-widget-container-notification-frame']")).isDisplayed()) {
			driver.switchTo().frame(3);
			driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
			driver.switchTo().parentFrame();
						}
			Thread.sleep(2000);
	     
			driver.findElement(By.xpath("//li[@data-cy='account']")).click();
	    Thread.sleep(2000);
	    //From place:-
		WebElement From=driver.findElement(By.id("fromCity"));
		From.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Che");
		Thread.sleep(2000);
		Actions act= new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		
		
		//To place:-
		 Thread.sleep(2000);
		WebElement To=driver.findElement(By.id("toCity"));
		To.click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Bang");
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER);
		act.build().perform();
	
		
		
		//To Get current date
        LocalDate nowdaydate = LocalDate.now();
        System.out.println(nowdaydate);
        String todaydate=nowdaydate.toString();
        System.out.println(todaydate);
        String getTodayDate=todaydate.substring(8, 10);
        System.out.println(getTodayDate);
        
        
        
		List<WebElement> date=  driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div/p"));
		int count=date.size();
		
		//From date:-
		for(int i=1	;i<=count;i++) {
       String num=driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div/p")).get(i).getText();
       if(num.equals(getTodayDate)) {
    	   driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div/p")).get(i).click();
    	   break;
                      }
		         }
		
		//To date:-
		driver.findElement(By.xpath("//span[contains(text(),'RETURN')]")).click();
		for(int i=1	;i<=count;i++) {
		       String num=driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div/p")).get(i).getText();
		       if(num.equals("5")) {
		    	   driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div/p")).get(i).click();
		    	   break;
		       }
		}
	   driver.quit();
		
	         }
	   }

