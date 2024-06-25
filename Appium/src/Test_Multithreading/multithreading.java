package Test_Multithreading;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class multithreading extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
//******************************************************************************************************************************************************
		//divice1
		driver=openManojWhatsApp();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Office Device']")));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Office Device']")).click();
		driver.findElement(By.id("com.whatsapp:id/entry")).click();
		Random rand=new Random();
		String randomNumbers = "";
		for (int i = 0; i < 3; i++) {
			int randomNumber1=(int)(rand.nextInt(9)+0);
			 randomNumbers+=randomNumber1;
		}
		String mess1="hello office device"+" "+randomNumbers+"";
		driver.findElement(By.id("com.whatsapp:id/entry")).sendKeys(mess1);
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.quit();
		
//******************************************************************************************************************************************************		
		//divice2
		driver=openOfficeWhatsApp();
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='+91 98807 67358']")));
		driver.findElement(By.xpath("//android.widget.TextView[@text='+91 98807 67358']")).click();
		//verification
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+mess1+"']")).isDisplayed();
		driver.findElement(By.id("com.whatsapp:id/entry")).click();
		String randomNumbers1 = "";
		for (int i = 0; i < 3; i++) {
		int	randomNumber2=(int)(rand.nextInt(9)+0);
		randomNumbers1+=randomNumber2;
		}
		String mess2="hello Manoj device"+" "+randomNumbers1+"";
		driver.findElement(By.id("com.whatsapp:id/entry")).sendKeys(mess2);
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		driver.quit();
		
//******************************************************************************************************************************************************		
		//divice2
	    driver=openManojWhatsApp();
	    WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(20));
	    wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Office Device']")));
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Office Device']")).click();
	    //verification
	    driver.findElement(By.xpath("//android.widget.TextView[@text='"+mess2+"']")).isDisplayed();
		driver.findElement(By.id("com.whatsapp:id/entry")).click();
		System.out.println("succesfully achived multithreding");
	    driver.quit();
		

	}
}
