package Manual_Dumping_In_FireFlink;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A4_Writing_Getted_List_Into_FireFlink extends A3_Getting_Finalized_Text_From_Script {

	public static void  writingGettedListIntoManuelTestCase()throws InterruptedException {

		// Object Creating Since Some Variable Are Non-Static So This Step and also To
		// Access Variable For Parent Class
		A4_Writing_Getted_List_Into_FireFlink a1 = new A4_Writing_Getted_List_Into_FireFlink();
		// Instead Of Making WebUrl As (n1.WebUrl) I Am Declaring Like Below
		int wait = a1.wait;

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Calling User Define Method Of Parent Class
		gettingTextFromScripet();
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Getting Final Text From Parent Class Using Parent Class Variable
		List<String> finalTextList = a1.finalTextList;
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Getting Driver Instance Of Parent Class Using Parent Class Variable
		WebDriver driver1 = a1.driver;
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		List<String> key=new ArrayList<String>();
		List<String> value=new ArrayList<String>();
		// Making Use Of User Defined clickAction Method To Click On Variables Link
		clickAction(driver1, a1.VariablesXpath, "Variables link");
		
		// Making Use Of User Defined Explicit Wait Method To Wait Till Local Variables text
		WaitAndPerformAction(driver1, a1.LocalVariablesXpath, wait);
				
				//Getting Key value pare from map
		        keyValue = new HashMap<String, String>();
		        Thread.sleep(2000);
		        //Object Creating To Call Return Type From Method(m1)
		        List<String> key1 = a1.gettingTextFromListWebElements(driver1, a1.keyXpath,"key");
	    	     //To Get Only The Step Names
	    	     // Remove numbers and special characters using regular expressions
	    	       for (String keys : key1) {
	   	           String trimedkeys = keys.trim();
	   	                key.add(trimedkeys);
	    	                   }
	    	       //Object Creating To Call Return Type From Method(m1)
	    	       List<String>   value1 = a1.gettingTextFromListWebElements(driver1, a1.valueXpath,"value");
	    	     //To Get Only The Step Names
	    	     // Remove numbers and special characters using regular expressions
	    	       for (String values : value1) {
	   	           String trimedvalues = values.trim();
	   	                 value.add(trimedvalues);
	    	                   }
	    	       for (int i = 0; i < key.size(); i++) {
	    	            String keys = key.get(i);
	    	            String values = value.get(i);
	    	            keyValue.put(keys, values);
	    	        }
	
		// Making Use Of User Defined clickAction Method To Click On Variables DropDown Button
		 clickAction(driver1, a1.VariablesDropDownButtonXpath, "Variables DropDown Button");
		
		 // Making Use Of User Defined clickAction Method To Click On Global Variables Button
		 clickAction(driver1, a1.GlobalVariablesButtonXpath , "Global Variables Button");
		
		// Making Use Of User Defined Explicit Wait Method To Wait Till Global Variables Button
		 WaitAndPerformAction(driver1,a1.GlobalVariablesButtonXpath, wait);
		  Thread.sleep(2000);
	        //Object Creating To Call Return Type From Method(m1)
		  List<String> key2 = a1.gettingTextFromListWebElements(driver1, a1.keyXpath,"key");
  	     //To Get Only The Step Names
  	     // Remove numbers and special characters using regular expressions
  	       for (String keys : key2) {
 	           String trimedkeys = keys.trim();
 	                key.add(trimedkeys);
  	                   }
  	       //Object Creating To Call Return Type From Method(m1)
  	     List<String>   value2 = a1.gettingTextFromListWebElements(driver1, a1.valueXpath,"value");
  	     //To Get Only The Step Names
  	     // Remove numbers and special characters using regular expressions
  	       for (String values : value2) {
 	           String trimedvalues = values.trim();
 	                 value.add(trimedvalues);
  	                   }
  	       for (int i = 0; i < key.size(); i++) {
  	            String keys = key.get(i);
  	            String values = value.get(i);
  	            keyValue.put(keys, values);
  	        }
	       driver.navigate().back();
	       driver.navigate().back();
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Making Use Of User Defined clickAction Method To Click On Manual Test Case link
		clickAction(driver1, a1.ManualTestCaseLinkXpath, "Manual Test Case Link");
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Making Use Of User Defined Explicit Wait Method To Wait Till Test Case Name
		// Text Is Visible
		WaitAndPerformAction(driver, a1.TestCaseNameTextXpath, wait);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Making Use Of User Defined clickAction Method To Click On Requirement Id
		// Textfield
		clickAction(driver1, a1.RequirementIdTextfieldXpath, "Requirement Id Textfield Xpath");
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Making Use Of User Defined enterInputIntoTheTextfield method To Enter Input
		// Into The Requirement Id Textfield
		enterInputIntoTheTextfield(driver, a1.RequirementIdTextfieldXpath, a1.RequirementId,
				"Requirement Id Textfield");
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Making Use Of User Defined clickAction Method To Click On Created By
		// Textfield
		clickAction(driver1, a1.CreatedByTextfieldXpath, "Created By Textfield Xpath");
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Making Use Of User Defined enterInputIntoTheTextfield method To Enter Input
		// Into The Created By Textfield
		enterInputIntoTheTextfield(driver, a1.CreatedByTextfieldXpath, a1.CreatedBy, "Created By Textfield");
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Making Use Of User Defined clickAction Method To Click On Crated On Date
		clickAction(driver1, a1.CratedOnDateXpath, "Crated On Date");
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Making Use Of User Defined clickAction Method To Click On Todays Date
		clickAction(driver1, a1.TodaysDateXpath, "Todays Date");
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Making Use Of User Defined clickAction Method To Click On Reviewed By
		// Textfield
		clickAction(driver1, a1.ReviewedByTextfieldXpath, "Reviewed By Textfield");
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Making Use Of User Defined enterInputIntoTheTextfield method To Enter Input
		// Into The Reviewed By Textfield
		enterInputIntoTheTextfield(driver, a1.ReviewedByTextfieldXpath, a1.ReviewedBy, "Reviewed By Textfield");
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Making Use Of User Defined clickAction Method To Click On Reviewed On Data
		clickAction(driver1, a1.ReviewedOnDataXpath, "Reviewed On Data");
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Making Use Of User Defined clickAction Method To Click On Todays Date
		clickAction(driver1, a1.TodaysDateXpath, "Todays Date");
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Getting Size Of FinalTextList
		int finalTextListSize = finalTextList.size();
		// Making Use Of gettingSizeFromListOfWebElements Generic Method
		int NumberOfRow = gettingSizeFromListOfWebElements(driver, a1.NumberOfRowXpath, "Number Of Row");
		 //This Loop For Adding Rows
		for (int m = NumberOfRow; m < finalTextListSize; m++) {
			Thread.sleep(200);
			// Making Use Of User Defined clickAction Method To Click On First Row As To Be
			// Added
			clickAction(driver1, a1.FirstRowAsToBeAddedIconXpath, "First Row As To Be Added");
			// Making Use Of User Defined clickAction Method To Click On First Row As To
			// Insert Row Below Button Xpath
			clickAction(driver1, a1.InsertrowbelowButtonXpath, "Insert Row Below Button Xpath");
		              }
		//This Loop For Entering Getted Text From Scripet
		for (int a = 0; a < finalTextListSize; a++) {
			WebElement element = driver.findElement(By.xpath((("((//td[contains(@class,'testStepTable fontPoppinsRegularSm')][5]))[" + (a + 1) + "]"))));
			           element.click();
			           element.sendKeys(finalTextList.get(a));
		                }
		//This Loop For Entering Expeceted Result
		for (int n = 0; n < finalTextListSize; n++) {
			WebElement element = driver.findElement(By.xpath((("((//td[contains(@class,'testStepTable fontPoppinsRegularSm')][6]))[" + (n + 1) + "]"))));
			           element.click();
			           element.sendKeys("User Should Able To " + finalTextList.get(n));
		                   }
		//This Loop For Entering Serial Number
		for (int o = 0; o < finalTextListSize; o++) {
			WebElement element = driver.findElement(By.xpath((("((//td[contains(@class,'testStepTable fontPoppinsRegularSm')][2]))[" + (o + 1) + "]"))));
			           element.click();
			           element.sendKeys(o + 1 + "");
		                    }
		//This Loop For Entering Test Dta
		for (int j = 0; j < finalTextListSize; j++) {
			WebElement element = driver.findElement(By.xpath((("((//td[contains(@class,'testStepTable fontPoppinsRegularSm')][4]))[" + (j + 1) + "]"))));
			           element.click();
			           element.sendKeys("N/A");
		                    }
		// Enter Test Case Id
//		WebElement element = driver.findElement(By.xpath((("((//td[contains(@class,'testStepTable fontPoppinsRegularSm')][3]))[1]"))));
//		               element.click();
//		               element.sendKeys(a1.TestCaseId);
//		// Entering TestDescription         
		WebElement element2 = driver.findElement(By.xpath((("((//td[contains(@class,'testStepTable fontPoppinsRegularSm')][3]))[1]"))));
		               element2.click();
		               element2.sendKeys(a1.TestDescription);
		               Thread.sleep(200); 
    
//This Loop Removing Verify If And Making check for
for (int a = 0; a < finalTextListSize; a++) {
WebElement element = driver.findElement(By.xpath((("((//td[contains(@class,'testStepTable fontPoppinsRegularSm')][5]))[" + (a + 1) + "]"))));
        String s1= element.getText();
        if(s1.contains("Verify if")) {
        String s2=s1.replace("Verify if", "Check for");
        	element.clear();
           element.sendKeys(s2);
              }
          }
//This Loop Removing User should be able to Verify if And Making should be
for (int a = 0; a < finalTextListSize; a++) {
WebElement element = driver.findElement(By.xpath((("((//td[contains(@class,'testStepTable fontPoppinsRegularSm')][6]))[" + (a + 1) + "]"))));
      String s1= element.getText();
      if(s1.contains("User Should Able To Verify if")) {
    	  String originalPhrase = "User should be able to Verify if My Wishlist text is displayed";

      // Remove "User should be able to Verify if"
      String modifiedPhrase = originalPhrase.replace("User should be able to Verify if", "");

      // Replace "is" with "should be"
      modifiedPhrase = modifiedPhrase.replace("is displayed", " should be displayed");
      element.clear();
      element.sendKeys(modifiedPhrase);
          }
	}
//This Loop Removing User Open browser if And Browser should be opened
for (int a = 0; a < finalTextListSize; a++) {
WebElement element = driver.findElement(By.xpath((("((//td[contains(@class,'testStepTable fontPoppinsRegularSm')][6]))[" + (a + 1) + "]"))));
      String s1= element.getText();
      if(s1.toLowerCase().contains("open browser")) {
    	  element.clear();
          element.sendKeys("Browser should be opened");
            }
      else if(s1.toLowerCase().contains("open chrome")) {
    	  element.clear();
          element.sendKeys("Browser should be opened");
      }
        }
//This Loop Removing Maximize browser if And Browser should be Maximized
for (int a = 0; a < finalTextListSize; a++) {
WebElement element = driver.findElement(By.xpath((("((//td[contains(@class,'testStepTable fontPoppinsRegularSm')][6]))[" + (a + 1) + "]"))));
    String s1= element.getText();
    if(s1.toLowerCase().contains("maximize browser")) {
  	  element.clear();
        element.sendKeys("Browser should be Maximized");
          }
      }
//This Loop Removing Browser window close if And Close All Browser
for (int a = 0; a < finalTextListSize; a++) {
WebElement element = driver.findElement(By.xpath((("((//td[contains(@class,'testStepTable fontPoppinsRegularSm')][5]))[" + (a + 1) + "]"))));
  String s1= element.getText();
  if(s1.toLowerCase().contains("browser window close")) {
	  element.clear();
      element.sendKeys("Close All Browser");
        }
    }
//This Loop Removing Browser window close if And Close All Browser
for (int a = 0; a < finalTextListSize; a++) {
WebElement element = driver.findElement(By.xpath((("((//td[contains(@class,'testStepTable fontPoppinsRegularSm')][6]))[" + (a + 1) + "]"))));
  String s1= element.getText();
  if(s1.toLowerCase().contains("browser window close")) {
	  element.clear();
      element.sendKeys("Browser should be closed");
        }
    }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 // Making Use Of User Defined clickAction Method To Click On Save Button
		       		clickAction(driver1, a1.SaveButtonXpath, "Save Button");
		       		Thread.sleep(3000);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 //Closing the browser after performing all kind of activity        
		       		driver1.quit();
		       		driver1=null;
		       		System.out.println("Browser Closed Successfully");
	          }
      }
