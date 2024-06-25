package Selenium_For_PE;



import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DateTextfield {
	public static void main(String[] args) throws InterruptedException {
				
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://ncpuat.olamagri.com/#/pages/rfq/rfq-creation?id=1563");
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("john.georgek@mindsprint.org");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Welcome@123");
		WebElement login=driver.findElement(By.xpath("//input[@id='submit_button']/.."));
		login.click();
		
		Thread.sleep(3000);
		driver.get("https://ncpuat.olamagri.com/#/pages/rfq/rfq-creation");
		
		Map<String, String> dat=new LinkedHashMap<>();
		dat.put("Deadline Date", getDate(0));
		dat.put("Validity Start Date", getDate(0));
		dat.put("Evaluation Start Date", getDate(0));
		dat.put("Evaluation End Date", getDate(0));
		dat.put("Awarding Start Date", getDate(0));
		dat.put("Award By Date", getDate(0));
		dat.put("Validity End Date", getDate(0));
		dat.put("Delivery Date", getDate(1));

        for ( Entry<String, String> d:dat.entrySet()) {
			System.out.println(d.getKey()+" -> "+d.getValue());
			WebElement we=driver.findElement(By.xpath("//span[text()='"+d.getKey()+"']/..//input"));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='"+d.getKey()+"']/..//input"))).click();
			act.moveToElement(we).build().perform();
			act.doubleClick().click().build().perform();
			Thread.sleep(1000);			
			we.sendKeys(d.getValue().toString().trim());
			}
	}

	private static String getDate(int i) {
	    String date = LocalDate.now().plusDays(i).format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
        return date;
		
	}
}

