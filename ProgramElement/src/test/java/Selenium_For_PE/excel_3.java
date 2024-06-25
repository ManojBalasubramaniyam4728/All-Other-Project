package Selenium_For_PE;

import java.io.IOException; 
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class excel_3{
	public static void main(String[] args) throws IOException, InterruptedException {
		excel_1 dd = new excel_1();
		excel_2 ss = new excel_2();
		ArrayList<String> key = ss.getData();

		ArrayList<String> value = dd.getData("ASC-0803");
		System.out.println(key);
		System.out.println(key.size());
		System.out.println(value);
		System.out.println(value.size());
		Map<String, String> keyValue = new HashMap<String, String>();
		Thread.sleep(2000);
		for (int i = 0; i < key.size(); i++) {
			String keys = key.get(i).trim();
			String values = value.get(i).trim();
			keyValue.put(keys, values);
		}
		// Create a new map to store non-null key-value pairs
		Map<String, String> updatekeyValue = new HashMap<String, String>();

		// Copy non-null key-value pairs to the updated map
		for (Map.Entry<String, String> entry : keyValue.entrySet()) {
			if (entry.getValue() != "") {
				updatekeyValue.put(entry.getKey(), entry.getValue());
			}
		}
		System.out.println(updatekeyValue);
		System.out.println(updatekeyValue.size());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://federation-sts-uat.apps.actionable-science.com/auth/realms/testyantraautomation/protocol/openid-connect/auth?client_id=adminui-service&redirect_uri=https%3A%2F%2Ftestyantraautomation.staging.virtualpeople.ai%2F&state=cc8ac0cd-56ba-46ea-8ad9-a57e7374fb60&response_mode=fragment&response_type=code&scope=openid&nonce=f5a028d7-116e-49ab-a17b-f1db126b0ddf");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='username']"))));
		WebElement e1 = driver.findElement(By.xpath("//input[@name='username']"));
		e1.click();
		e1.sendKeys("raghuram.p@testyantra.com");
		WebElement e2 = driver.findElement(By.xpath("//input[@name='password']"));
		e2.click();
		e2.sendKeys("Password@123");
		WebElement e3 = driver.findElement(By.xpath("//input[@name='login']"));
		e3.click();
		Thread.sleep(35000);

     	driver.findElement(By.xpath("//input[@placeholder=\"Enter the ticket no to search\"]")).click();
     	driver.findElement(By.xpath("//input[@placeholder=\"Enter the ticket no to search\"]")).sendKeys("ASC-0803");
     	driver.findElement(By.xpath("//i[@title=\"Search\"]")).click();
     	List<WebElement> elements=driver.findElements(By.xpath("//li[@class=\"nav-item\"]/a[text()]"));
		for (WebElement webElement : elements) {
			String text=webElement.getText();
			if(text.contains("1"));
			Thread.sleep(15000);
			WebElement ele1=driver.findElement(By.xpath("//li[@class='nav-item']/a[text()='"+1+"']"));
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", ele1);
			break;
		      }
		Thread.sleep(15000);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[text()='ASC-0803']"))));
		driver.findElement(By.xpath("//button[text()='ASC-0803']")).click();
		List<String> textList = new ArrayList<String>();

		if (updatekeyValue.containsKey("Ticket No")) {
			Thread.sleep(5000);
			String TicketNo = driver.findElement(By.xpath("//span[@class='ticket-icon']/..//span[@class and(text())]")).getText();
			textList.add(TicketNo.trim());
		}
		if (updatekeyValue.containsKey("Subject")) {
			Thread.sleep(5000);
			String Subject = driver.findElement(By.xpath("//label/..//input[@name='subject']")).getAttribute("value");
			textList.add(Subject.trim());
		}
		if (updatekeyValue.containsKey("Source")) {
			Thread.sleep(500);
			String Source = driver.findElement(By.xpath("//label[text()='Source']/..//div[text()]")).getText();
			textList.add(Source.trim());
		}
		if (updatekeyValue.containsKey("Status")) {
			Thread.sleep(500);
			String Status = driver.findElement(By.xpath("//label[text()='Status']/..//div/p")).getText();
			textList.add(Status.trim());
		}
		if (updatekeyValue.containsKey("Priority")) {
			Thread.sleep(500);
			String Priority = driver.findElement(By.xpath("//label[text()='Priority']/..//div[text()]")).getText();
			textList.add(Priority.trim());
		}
		if (updatekeyValue.containsKey("Description")) {
			Thread.sleep(500);
			String Description = driver.findElement(By.xpath("//label[text()='Description']/..//span//span")).getText();
			textList.add(Description.trim());
		}
		if (updatekeyValue.containsKey("Attachments")) {
			Thread.sleep(5000);
			try {
				if(driver.findElement(By.xpath("//label[@for='Attachments']/../following::a/../i/a/span")).isDisplayed()){
				String	Attachments	=driver.findElement(By.xpath("//label[@for='Attachments']/../following::a/../i/a/span")).getText();
				textList.add(Attachments.trim());
				}
			     }
				catch (Exception e) {
					textList.add("");
				}
			}
	
		if (updatekeyValue.containsKey("Queue")) {
			Thread.sleep(500);
			String Queue = driver.findElement(By.xpath("//label[text()='Queue']/..//div[text()]")).getText();
			textList.add(Queue.trim());
		}
		if (updatekeyValue.containsKey("Domain")) {
			Thread.sleep(500);
			String Domain = driver.findElement(By.xpath("//label[text()='Domain']/..//div[text()]")).getText();
			textList.add(Domain.trim());
		}
		if (updatekeyValue.containsKey("Category")) {
			Thread.sleep(500);
			String Category = driver.findElement(By.xpath("//label[text()='Category']/..//div[text()]")).getText();
			textList.add(Category.trim());
		}
		if (updatekeyValue.containsKey("Sub Category")) {
			Thread.sleep(500);
			String SubCategory = driver.findElement(By.xpath("//label[text()='Subcategory']/..//div[text()]")).getText();
			textList.add(SubCategory.trim());
		}
		if (updatekeyValue.containsKey("Submitted By (Name)")) {
			Thread.sleep(500);
			String SubmittedBy = driver.findElement(By.xpath("//label[text()='Submitted By']/..//p[text()]")).getText();
			String SubmittedByName = SubmittedBy.replaceAll("\\(.*?\\)", "");
			textList.add(SubmittedByName.trim());
		}
		if (updatekeyValue.containsKey("Submitted By (username)")) {
			Thread.sleep(500);
			String SubmittedBy = driver.findElement(By.xpath("//label[text()='Submitted By']/..//p[text()]")).getText();
	        // Extract the value inside brackets
	        int startIndex = SubmittedBy.indexOf('(');
	        int endIndex = SubmittedBy.indexOf(')');
	        String SubmittedByUsername = SubmittedBy.substring(startIndex + 1, endIndex);
			textList.add(SubmittedByUsername.trim());
		}
		if (updatekeyValue.containsKey("Reported for (Name)")) {
			Thread.sleep(500);
			Thread.sleep(500);
			String SubmittedBy = driver.findElement(By.xpath("//label[text()='Submitted By']/..//p[text()]")).getText();
			String ReportedforName = SubmittedBy.replaceAll("\\(.*?\\)", "");
			textList.add(ReportedforName.trim());
		}
		if (updatekeyValue.containsKey("Reported for (username)")) {
			Thread.sleep(500);
			String SubmittedBy = driver.findElement(By.xpath("//label[text()='Submitted By']/..//p[text()]")).getText();
	        // Extract the value inside brackets
	        int startIndex = SubmittedBy.indexOf('(');
	        int endIndex = SubmittedBy.indexOf(')');
	        String ReportedforUsername = SubmittedBy.substring(startIndex + 1, endIndex);
			textList.add(ReportedforUsername.trim());
		}
		if (updatekeyValue.containsKey("Assignee (Name)")) {
			Thread.sleep(500);
			try {
			if(driver.findElement(By.xpath("//label[text()='Assigned To']/..//div[text()]")).isDisplayed()) {
			String Assigneename = driver.findElement(By.xpath("//label[text()='Assigned To']/..//div[text()]")).getText();
	        String[] parts = Assigneename.split("@");
	        String AssigneeNames = parts[0];
	        String AssigneeName = AssigneeNames.replace(".", " ");
			textList.add(AssigneeName.trim());
		         }
			}
			catch (Exception e) {
				textList.add("");
			}
		}
		if (updatekeyValue.containsKey("Assignee (username)")) {
			Thread.sleep(500);
			try {
				if(driver.findElement(By.xpath("//label[text()='Assigned To']/..//div[text()]")).isDisplayed()) {
					String AssigneeUsername = driver.findElement(By.xpath("//label[text()='Assigned To']/..//div[text()]")).getText();
					textList.add(AssigneeUsername.trim());
			} 
			}
			catch (Exception e) {
					textList.add("NA");
			
		}
		}
		if (updatekeyValue.containsKey("Watchers (username)")) {
			Thread.sleep(500);
			try {
				if(driver.findElement(By.xpath("//button[@class='watchers-eye btn btn-secondary']/..//span[text()]")).isDisplayed()) {
					String WatchersUsername = driver.findElement(By.xpath("//button[@class='watchers-eye btn btn-secondary']/..//span[text()]")).getText();
					textList.add(WatchersUsername.trim());
				}
			}
			catch (Exception e) {
				textList.add("NA");
			}
			
		}
		if (updatekeyValue.containsKey("Is Closed")) {
			Thread.sleep(500);
			try {
				if(driver.findElement(By.xpath("//button[text()='Reopen']")).isDisplayed()){
					textList.add("Yes");
				    }
			     }
				catch (Exception e) {
					textList.add("No");
				}
			}
		if (updatekeyValue.containsKey("Created At (MM-DD-YY)")) {
			Thread.sleep(500);
			try {
				if(driver.findElement(By.xpath("//label[text()='Submitted On']/../div//p")).isDisplayed()){
					String timeStr =driver.findElement(By.xpath("//label[text()='Submitted On']/../div//p")).getText();
				        // Step 1: Parse the given time string
				        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy hh:mm:ss a", Locale.ENGLISH);
				        LocalDateTime dateTime = LocalDateTime.parse(timeStr, inputFormatter);
				        // Step 2: Convert to the desired format
				        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'");
				        String CreatedAt = dateTime.format(outputFormatter);
					    textList.add(CreatedAt);
				    }
			     }
				catch (Exception e) {
					textList.add("");
				}
			}
		if (updatekeyValue.containsKey("Last Updated At (MM-DD-YY)")) {
			Thread.sleep(500);
			try {
				if(driver.findElement(By.xpath("//label[text()='Last Updated']/../div//p")).isDisplayed()){
					String timeStr =driver.findElement(By.xpath("//label[text()='Last Updated']/../div//p")).getText();
				        // Step 1: Parse the given time string
				        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy hh:mm:ss a", Locale.ENGLISH);
				        LocalDateTime dateTime = LocalDateTime.parse(timeStr, inputFormatter);
				        // Step 2: Convert to the desired format
				        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'");
				        String LastUpdated = dateTime.format(outputFormatter);
					    textList.add(LastUpdated);
				    }
			     }
				catch (Exception e) {
					textList.add("");
				}
			}
		if (updatekeyValue.containsKey("Resolved At (MM-DD-YY)")) {
			Thread.sleep(500);
			try {
				if(driver.findElement(By.xpath("//label[text()='Submitted On']/../div//p")).isDisplayed()){
					String timeStr =driver.findElement(By.xpath("//label[text()='Submitted On']/../div//p")).getText();
				        // Step 1: Parse the given time string
				        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy hh:mm:ss a", Locale.ENGLISH);
				        LocalDateTime dateTime = LocalDateTime.parse(timeStr, inputFormatter);
				        // Step 2: Convert to the desired format
				        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'");
				        String ResolvedAt = dateTime.format(outputFormatter);
					    textList.add(ResolvedAt);
				    }
			     }
				catch (Exception e) {
					textList.add("");
				}
			}
		if (updatekeyValue.containsKey("Closed At (MM-DD-YY)")) {

			Thread.sleep(500);
			try {
				if(driver.findElement(By.xpath("//label[text()='Last Updated']/../div//p")).isDisplayed()){
					String timeStr =driver.findElement(By.xpath("//label[text()='Last Updated']/../div//p")).getText();
				        // Step 1: Parse the given time string
				        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy hh:mm:ss a", Locale.ENGLISH);
				        LocalDateTime dateTime = LocalDateTime.parse(timeStr, inputFormatter);
				        // Step 2: Convert to the desired format
				        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'");
				        String ClosedAt = dateTime.format(outputFormatter);
					    textList.add(ClosedAt);
				    }
			     }
				catch (Exception e) {
					textList.add("");
				}
			}
		if (updatekeyValue.containsKey("Resolution Notes")) {
			Thread.sleep(500);
			try {
				if(driver.findElement(By.xpath("//strong[@class='h4span']/parent::p[text()]")).isDisplayed()){
				List<WebElement> Elements=	driver.findElements(By.xpath("//strong[@class='h4span']/parent::p[text()]"));
				for (WebElement Element : Elements) {
					String d= Element.getText();
					int s=d.indexOf("\"");
					String S1=d.substring(s+1);
					int b1=S1.indexOf("\"");
					String res=S1.substring(0, b1);
					if(res.equalsIgnoreCase("Resolution Note")) {
						textList.add("Resolution Note");
					       }
				        }
				    }
			     }
				catch (Exception e) {
					textList.add("N/A");
				}
			}
		if (updatekeyValue.containsKey("Chase Note")) {
			Thread.sleep(500);
			try {
				if(driver.findElement(By.xpath("//label[text()='Chase']")).isDisplayed()){
					  JavascriptExecutor scroll=(JavascriptExecutor)driver;
			    	   scroll.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//label[text()='Chase']")) );
			    	   Thread.sleep(500);
					driver.findElement(By.xpath("//label[text()='Chase']")).click();
				List<WebElement> Elements=	driver.findElements(By.xpath("//strong[@class='h4span']/parent::p[text()]"));
				for (WebElement Element : Elements) {
					String d= Element.getText();
					int s=d.indexOf("\"");
					String S1=d.substring(s+1);
					int b1=S1.indexOf("\"");
					String res=S1.substring(0, b1);
					if(res.equalsIgnoreCase("Chase Note")) {
						textList.add("Chase Note");
					       }
				        }
				    }
			     }
				catch (Exception e) {
					textList.add("");
				}
			}
		
		JavascriptExecutor scroll=(JavascriptExecutor)driver;
   	   scroll.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath("//button[text()='Back to Ticket List']")));
   	   Thread.sleep(500);
   	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
   	jsExecutor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[text()='Back to Ticket List']")));
     Thread.sleep(5000);
    
   	  if (updatekeyValue.containsKey("SLA")) {
		Thread.sleep(500);
		try {
			if(driver.findElement(By.xpath("//th[4]//span[text()='Met']")).isDisplayed()){
					textList.add("Met");
			         }
		     }
			catch (Exception e) {
				textList.add("Not Met");
			}
		}
   	   
		List<String> lowercaseValuesTextList = new ArrayList<String>();
		 for (String v : textList) {
			lowercaseValuesTextList.add(v.toLowerCase());
	        }
		
		System.out.println(textList);
		 for (Map.Entry<String, String> entry : updatekeyValue.entrySet()) {
	            String value1 = entry.getValue();
	            if (lowercaseValuesTextList.contains(value1.toLowerCase())) {
	             //   System.out.println("Value " + value1 + " is present in the list");
	            } else {
	                System.out.println("Value " + value1 + " is not present in the list");
	            }
	        }
		 driver.quit();
		 driver=null;
	}
}
	
		


