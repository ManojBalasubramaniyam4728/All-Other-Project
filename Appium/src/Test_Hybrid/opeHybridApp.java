package Test_Hybrid;

import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.By;

public class opeHybridApp extends base{
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	driver=openHybridApp();
	String currentView=driver.getContext();
	System.out.println(currentView);
	Thread.sleep(8000);
	Set<String> contextHandlers=driver.getContextHandles();
	System.out.println(contextHandlers);
	for (String context : contextHandlers) {
		if(context.contains("WEBVIEW_chrome")) {
			driver.context(context);
		}
	}
	
	driver.findElement(By.xpath("//div[text()='Pay']")).click();
	System.out.println("Successfully performed this in webview");
	
	driver.quit();
}
}
