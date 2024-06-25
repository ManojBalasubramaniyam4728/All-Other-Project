package Manual_Dumping_In_FireFlink;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A2_User_Defined_Methodes extends A1_Xpaths{

	//User Defined Method
	// Explicit Wait
	public static void WaitAndPerformAction(WebDriver driver, String Xpath, int Wait) {
		new WebDriverWait(driver, Duration.ofSeconds(Wait))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
	}

	// Click Action
	public static void clickAction(WebDriver driver, String element, String elemntName) {
		driver.findElement(By.xpath(element)).click();
		System.out.println("Successfully Click On" + " " + elemntName);
	}

	// Double Click
	public static void DoubleclickAction(WebDriver driver, String element, String elemntName) {
		Actions actions = new Actions(driver);
		actions.doubleClick(driver.findElement(By.xpath(element))).build().perform();
		System.out.println("Successfully Double Click On" + " " + elemntName);
	}

	// Enter Input Into Textfield
	public static void enterInputIntoTheTextfield(WebDriver driver, String element, String input, String elemntName) {
		driver.findElement(By.xpath(element)).sendKeys(input);
		System.out.println("Successfully Entered Input Into The" + " " + elemntName);
	}

	// Mouse Move Action
	public static void moveMouseAction(WebDriver driver, String element, String elemntName) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(element))).build().perform();
		System.out.println("Successfully Mouse Move Action To The" + " " + elemntName);
	}

	// Click action Useing JavascriptExecutor
	public static void clickactionUseingJavascriptExecutor(WebDriver driver, String element, String elemntName) {
		WebElement element1 = driver.findElement(By.xpath(element));
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", element1);
		System.out.println("Successfully Click On" + " " + elemntName);
	}

	// Getting Text From List Of WebElements
	public static List<String> gettingTextFromListWebElements(WebDriver driver, String element, String elementName) {
		List<String> textList = new ArrayList<String>();
		List<WebElement> elements = driver.findElements(By.xpath(element));
		for (WebElement element1 : elements) {
			String text = element1.getText();
			textList.add(text);
		}
		System.out.println("Successfully Getted List WebElements" + " " + elementName);
		return textList;
	}

	// Getting Size From List Of Web Elements
	public static int gettingSizeFromListOfWebElements(WebDriver driver, String element, String elementName) {
		List<WebElement> elements = driver.findElements(By.xpath(element));
		int size = elements.size();
		System.out.println("Successfully Getted List WebElements Size From" + elementName);
		return size;
	}

	// Making Xpath As Element In
	public static WebElement makingXpathAsElement(WebDriver driver, String element, String elementName) {
		WebElement gettedElement = driver.findElement(By.xpath(element));
		System.out.println("Successfully Converted Xpath To Elements" + elementName);
		return gettedElement;
	}

	// Scroll To The Element Using JavascriptExecutor
	public static void scrollTillElementIsvisable(WebDriver driver, String element, String elementName) {
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath(element)));
		System.out.println("Successfully Scroll Till Elements Is Visable" + elementName);
	}
}
