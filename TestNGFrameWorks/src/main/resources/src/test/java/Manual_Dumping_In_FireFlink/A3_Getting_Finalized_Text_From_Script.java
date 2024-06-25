package Manual_Dumping_In_FireFlink;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class A3_Getting_Finalized_Text_From_Script extends A2_User_Defined_Methodes {
	
   public static void gettingTextFromScripet() throws InterruptedException{
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	   //Object Creating To Call Return Type From Method , Varables From Parent Class and Since Some Variable Are Non-Static So This Step
	    A3_Getting_Finalized_Text_From_Script m1=new A3_Getting_Finalized_Text_From_Script();
	  //Instead Of Making WebUrl As m1.WebUrl I Am Declaring Like Below
	    String WebUrl=m1.WebUrl;
	    int wait=m1.wait;
	    String EmaiId=m1.EmaiId;
	    String Password=m1.Password;
	    
 //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	   //Setting Chrome Driver
	    WebDriverManager.chromedriver().setup();
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	   //Opening Chrome Driver
		 driver=new ChromeDriver();
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Maximize Window
		driver.manage().window().maximize();
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Navigateing To Url
	    driver.get(WebUrl);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    // Making Use Of User Defined Explicit Wait Method To Wait Till Email Id Textfield Is Visible
	    WaitAndPerformAction(driver,m1.EmaiIdXpath, wait);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    //Making Use Of User Defined clickAction Method To Click On EmaiId Textfield
	    clickAction(driver,m1.EmaiIdXpath ,"EmaiId Textfield" );
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    //Making Use Of User Defined enterInputIntoTheTextfield method To Enter Input Into The EmaiId Textfield
	    enterInputIntoTheTextfield(driver, m1.EmaiIdXpath,EmaiId ,"EmaiId Textfield");
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    //Making Use Of User Defined clickAction Method To Click On Password Textfield
	    clickAction(driver, m1.PasswordTextfieldXpath,"Password Textfield");
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    //Making Use Of User Defined enterInputIntoTheTextfield Method To Enter Input Into The Password Textfield
		enterInputIntoTheTextfield(driver, m1.PasswordTextfieldXpath, Password, "Password Textfield");
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//Making Use Of User Defined clickAction Method To Click On Sign In Button
		clickAction(driver, m1.SignInButtonXpath, "Sign In Button");
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Making Use Of User Defined Explicit Wait Method To Wait Till Projects Tab Is Visible
        WaitAndPerformAction(driver, m1.ProjectsTabXpath, wait);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Making Use Of User Defined clickAction Method To Click On First Project Name Text
	    clickAction(driver,m1.ProjectsTabXpath ,"First Project Name Text" );
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    // Making Use Of User Defined Explicit Wait Method To Wait Till Root Modul Text Is Visible
        WaitAndPerformAction(driver, m1.RootModulTextXpath, wait);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        Thread.sleep(8000);
        //Making Use Of User Defined clickAction Method To Click On Module Name Text
	    clickAction(driver,m1.ModuleNameTextXpath ,"First Module Name Text" );
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- 
	    // Making Use Of User Defined Explicit Wait Method To Wait Till Modul Text Is Visible
        WaitAndPerformAction(driver, m1.ModuleNameTextXpath, wait);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Making Use Of User Defined clickAction Method To Click On Expand Opend Module Name Button
	    clickAction(driver,m1.ExpanderOpendModuleButton ,"Expand First Opend Module Name Button" );
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	   // Making Use Of User Defined Explicit Wait Method To Wait Till Script Name Text Is Visible
        WaitAndPerformAction(driver, m1.ScriptNameTextXpath, wait);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Making Use Of User Defined clickAction Method To Click On Script Name Text
	    clickAction(driver,m1.ScriptNameTextXpath ,"Expander First Module Names First Script Name Text" );
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	    // Making Use Of User Defined Explicit Wait Method To Wait Till Opened Script Name Text Is Visible
        WaitAndPerformAction(driver, m1.OpenedScriptNameText, wait);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        Thread.sleep(1500);
        //Making Use Of User Defined clickAction Method To Click On Clear Result Button
        clickAction(driver,m1.ClearResultButtonXpath,"Clear Result Button Xpath" );
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Making Use Of User Defined makingXpathAsElement Method To Get Element and useing in conditions
        
        //I am Declaring this out side try catch block so scop will remain and easily accusable  
        WebElement PreConditionElement=null;
        WebElement PostConditionElement=null;
        WebElement DependsOnScriptsElement=null;
        WebElement PerConditionRightarrowInClosedElement=null;
        WebElement PostConditionRightarrowInClosedElement=null;
        WebElement DependsOnScriptsRightarrowInClosedElement=null;
        //To Handel Expection I Have Given In Try And Catch
        //Object Creating To Call Return Type From Method(m1)
        try{
         PreConditionElement=m1.makingXpathAsElement(driver, m1.PreConditionTextXpath,"Pre Condition Text");
        }
        catch (Exception e) {
			System.out.println("There Is No Pre Condition Element In Web Page");
		}
        try {
        PostConditionElement=m1.makingXpathAsElement(driver, m1.PostConditionTextXpath,"Post Condition Text");
        }
        catch (Exception e) {
        	System.out.println("There Is No Post Condition Element In Web Page");
		}
        try{
        DependsOnScriptsElement=m1.makingXpathAsElement(driver, m1.DependsOnScriptsTextXpath,"Pre Condition Text");
        }
        catch (Exception e) {
        	System.out.println("There Is No Depends On Scripts Element In Web Page");
		}
        try {
        PerConditionRightarrowInClosedElement=m1.makingXpathAsElement(driver, m1.PerConditionRightarrowInClosedButtonXpath,"Per Condition Rightarrow In Closed Button");
        }
        catch (Exception e) {
        	System.out.println("There Is No Per Condition Rightarrow In Closed Element In Web Page");
		}
        try {
        	PostConditionRightarrowInClosedElement=m1.makingXpathAsElement(driver, m1.PostConditionRightarrowInClosedButtonXpath, "Post Condition Rightarrow In Closed Button");
        }
        catch (Exception e) {
        	System.out.println("There Is No Post Condition Rightarrow In Closed Element In Web Page");
		}
        try {
        	DependsOnScriptsRightarrowInClosedElement=m1.makingXpathAsElement(driver,m1.DependsOnScriptsRightarrowInClosedButtonXpath, "Depends On Scripts Rightarrow In Closed Button");
        }
        catch (Exception e) {
        	System.out.println("Depends On Scripts Rightarrow In Closed Element In Web Page");
		}
        	
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //If Condition To Get Text From Pre,Post Condition and Depends On Scripts
        
        //I am Declaring this out side condition and loop so scop will remain and easily accusable  
        List<String> gettedTextOfDependsOnScriptsSteps=new ArrayList<String>();
   
        //If Depends On Scripts Element Is Dispalyed Go Inside
        try {
			if (DependsOnScriptsElement.isDisplayed()) {
				Thread.sleep(500);
				//If Depends On Scripts In Closed State To Open That Arrow
			     if(DependsOnScriptsRightarrowInClosedElement.isDisplayed()) {
			    	 DependsOnScriptsRightarrowInClosedElement.click();
			    	 Thread.sleep(500);
			    	 //Making Use Of gettingSizeFromListOfWebElements Generic Method
			    	 int DependsOnScriptsSize=gettingSizeFromListOfWebElements(driver, m1.OpenedDependsOnScriptsStepsTextXpath, "Opened Depends On Scripts Steps Text Xpath");
			    	 int PreCondutionSize=gettingSizeFromListOfWebElements(driver, m1.OpenedPreConditionStepsTextXpath, "Opened Pre Condition Steps Text Xpath");
			    	 //If There Are Many Pre condition so that for loop
			    	 //Since Front End Developer As Used Same HTML Code Instead Of Depends On Scripts He As Mention Preconditions In ID So This Size (+ and -) Activity
			    	 int finalSize=DependsOnScriptsSize-PreCondutionSize;
			    	 for(int m=0;m<finalSize;m++) {
			    		  Thread.sleep(500);
			    		 //Here i Directly Make Use Of Converting Xpath Into Element Because of updation
			    		  WebElement element = driver.findElement(By.xpath("//b[text()='Depends On Scripts']/../following::div[@class='precondition-container']["+(m+1)+"]/..//span[text()]"));
			    		  Thread.sleep(500);
				    		  //Converted Elemnt I Am Clicking Here
				    		  element.click();
				    		  // Making Use Of User Defined Explicit Wait Method To Wait Till Opened Depends On Scripts Text Is Visible
				    	      WaitAndPerformAction(driver, m1.OpenedDependsOnScriptsTextXpath, wait);
				    	      //Making Use Of User Defined gettingListWebElements Method To Get List Of Weblement From Getting Text From Opened Depends On Scripts Xpath
				    	      //Object Creating To Call Return Type From Method(m1)
				    	      Thread.sleep(2000);
				    	      List<String> gettedTextOfDependsOnScriptsStepsWithNumberAlso = m1.gettingTextFromListWebElements(driver, m1.GettingTextFromOpenedDependsOnScriptsXpath,"Getting Text From Opened Depends On Scripts Xpath");
				    	      //To Get Only The Step Names
				    	      // Remove numbers and special characters using regular expressions
				    	       for (String stepDescription : gettedTextOfDependsOnScriptsStepsWithNumberAlso) {
					   	           String alphabetsOnly = stepDescription.replaceAll("[0-9.]", "").trim();
					    	       gettedTextOfDependsOnScriptsSteps.add(alphabetsOnly);
				    	                                }
				    	       
				    	      //Making Use Of Generic clickAction Method To Click On Cancel Button Of Opened Pre Condition
						       clickAction(driver, m1.CancelButtonOfOpenedPreCondition, "Cancel Button Of Opened Pre Conditio");
						       Thread.sleep(1500);
			    	                              }
					                         }
				                          }
			                          }
                           
        //This Catch Block Will Act As Else Condition Is DependsOnScriptsElement Is Not Displayed Complied Will Come Here And Execute This Block 
			catch (Exception e) {
			System.out.println("So There Depends On Scripts");
		}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
      //I am Declaring this out side condition and loop so scop will remain and easily accusable  
        List<String> gettedTextOfPreConditionSteps=new ArrayList<String>();
        
      //If Pre Condition Element Is Dispalyed Go Inside
        try {
			if (PreConditionElement.isDisplayed()) {
				Thread.sleep(500);
	                //If Pre Condution Is In Closed State To Open That Arrow
				     if(PerConditionRightarrowInClosedElement.isDisplayed()) {
				    	 PerConditionRightarrowInClosedElement.click();
				    	 Thread.sleep(500);
				    	 //Making Use Of gettingSizeFromListOfWebElements Generic Method
				    	 int PreCondutionSize=gettingSizeFromListOfWebElements(driver, m1.OpenedPreConditionStepsTextXpath, "Opened Pre Condition Steps Text Xpath");
				    	 int PostCondutionSize=gettingSizeFromListOfWebElements(driver, m1.OpenedPostConditionStepsTextXpath, "Opened Post Condition Steps Text Xpath");
				    	 //If There Are Many Pre condition so that for loop
				    	 //Since Front End Developer As Used Same HTML Code Instead Of Postcondition He As Mention Preconditions In ID So This Size (-) Activity
				    	 int finalSize=PreCondutionSize-PostCondutionSize;
				    	 for(int a=0;a<finalSize;a++) {
				    		  Thread.sleep(500);
				    		 //Here i Directly Make Use Of Converting Xpath Into Element Because of updation
				    		  WebElement element = driver.findElement(By.xpath("//b[text()='Pre Condition']/../following::div[@class='precondition-container']["+(a+1)+"]/..//span[text()]"));
				    		  Thread.sleep(500);
				    		 //Converted Elemnt I Am Clicking Here
				    		  element.click();
				    		 // Making Use Of User Defined Explicit Wait Method To Wait Till Step Group Input Parameters Text Is Visible
				    	      WaitAndPerformAction(driver, m1.StepGroupInputParametersTextXpath, wait);
				    	      //Making Use of User Defined moveMouseAction Method To Move  mouse On Opened Per Condition Steps Button
				    	      moveMouseAction(driver, m1.OpenedPerConditionStepsButtonXpath, "Opened PerCondition Steps Button");
				    	     //Making Use Of User Defined clickAction Method To Click On Opened PerCondition Steps Button
				    	       clickAction(driver,m1.OpenedPerConditionStepsButtonXpath,"Opened PerCondition Steps Button" );
				    	       Thread.sleep(1500);
				    	     //Making Use Of User Defined gettingListWebElements Method To Get List Of Weblement From Getting Text From Opened Per Condition Steps
				    	     //Object Creating To Call Return Type From Method(m1)
				    	       List<String>  gettedTextOfPreConditionStepsWithNumberAlso= m1.gettingTextFromListWebElements(driver, m1.GettingTextFromOpenedPerConditionStepsXpath,"Getting Text From Opened Per Condition Steps");
				    	     //To Get Only The Step Names
				    	     // Remove numbers and special characters using regular expressions
				    	       for (String stepDescription : gettedTextOfPreConditionStepsWithNumberAlso) {
				   	           String alphabetsOnly = stepDescription.replaceAll("[0-9.]", "").trim();
				    	       gettedTextOfPreConditionSteps.add(alphabetsOnly);
				    	                                  }
				    	     //Making Use Of User Defined clickAction Method To Click On Cancel Button Of Opened Pre Condition
						       clickAction(driver, m1.CancelButtonOfOpenedPreCondition, "Cancel Button Of Opened Pre Conditio");
						       Thread.sleep(1500);
						     //Making Use Of Generic clickAction Method To Click On Clear Result Button
						       clickAction(driver,m1.ClearResultButtonXpath,"Clear Result Button Xpath" );
			                                 }
				                         }
			                        }
		                       } 
            //This Catch Block Will Act As Else Condition Is PreConditionElement Is Not Displayed Complied Will Come Here And Execute This Block 
			catch (Exception e) {
			System.out.println("So There Is No Pre Condition");
		}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------       
      //I am Declaring this out side condition and loop so scop will remain and easily accusable  
       List<String> gettedTextOfStepGroupSteps=new ArrayList<String>();
       List<String>  gettedTextOfOpenedStepGroupStepsWithNumberAlso=new ArrayList<String>();
        //This is For main Steps
        
         Thread.sleep(1500);
	   //Making Use Of User Defined gettingListWebElements Method To Get List Of Weblement From Opened First Script Steps Texts
       //Object Creating To Call Return Type From Method(m1)
         List<String> gettedText= m1.gettingTextFromListWebElements(driver, m1.OpenedFirstScriptStepsTextsXpath,"From Opened First Script Steps Texts");	 
	  
	 
	  //Replacing Lists(If You Want To Remove Only Step Group Word You Can Follow This Way By Replacing Your Customize  Step Group Remove)
	  for (int n = 0; n < gettedText.size(); n++) {
          String str = gettedText.get(n);
          if (str.equals("OpenBrowser - Step Group")) {
        	  gettedText.set(n, "Open Browser");
          } else if (str.equals("CloseBrowser - Step Group")) {
        	  gettedText.set(n, "Close Browser");
          } else if (str.equals("CloseAllBrowser - Step Group")) {
        	  gettedText.set(n, "Close All Browser");
          }
      }
	  //If Any Stop Group Is Present Opening That Step Group And Adding Into The List
	  for (int i = 0; i < gettedText.size(); i++) {
		  String stepDescription = gettedText.get(i);
          if (stepDescription.contains("Step Group")) {
                String modifiedStepDescription = stepDescription.replace("- Step Group", "");
                String modifiedStepDescriptions=modifiedStepDescription.trim();
                WebElement element= driver.findElement(By.xpath("//span[contains(text(),'"+modifiedStepDescriptions+"')]"));   
                //Making Use Of User Defined scrollTillElementIsvisable Method To Sctoll Till Post Condition Text elemeny is visable
          	    scrollTillElementIsvisable(driver,"//span[contains(text(),'"+modifiedStepDescriptions+"')]", "Post Condition Text");
          	    Thread.sleep(1000);
                element.click();
                // Making Use Of User Defined Explicit Wait Method To Wait Till Step Group Input Parameters Text Is Visible
	    	    WaitAndPerformAction(driver, m1.StepGroupInputParametersTextXpath, wait);
	    	    //Making Use of User Defined moveMouseAction Method To Move  mouse On Opened Step Group Steps Button
	    	    moveMouseAction(driver,m1.OpenedStepGroupStepsButtonXpath, "Opened Step Group Steps Button");
	    	    //Making Use Of User Defined clickAction Method To Click On Opened Step Group Steps Button
	    	    clickAction(driver,m1.OpenedStepGroupStepsButtonXpath,"Opened Step Group Steps Button" );
	    	    Thread.sleep(1500);
	    	    //Making Use Of User Defined gettingListWebElements Method To Get List Of Weblement From Getting Text From Opened Step Group Steps
	    	    //Object Creating To Call Return Type From Method(m1)
	    	    gettedTextOfOpenedStepGroupStepsWithNumberAlso= m1.gettingTextFromListWebElements(driver, m1.GettingTextFromOpenedStepGroupStepsXpath,"Getting Text From Opened Step Group Steps");
	    	    //To Get Only The Step Names
	    	    // Remove numbers and special characters using regular expressions
	    	    for (String stepGroupDescriptionText : gettedTextOfOpenedStepGroupStepsWithNumberAlso) {
	   	        String alphabetsOnly = stepGroupDescriptionText.replaceAll("[0-9.]", "").trim();
	   	        gettedTextOfStepGroupSteps.add(alphabetsOnly);
	    	           }
	    	    //remove first index
	    	    gettedText.remove(i);
	    	    // Add the stepGroupDescriptions to the gettedText list at the appropriate index
	    	    gettedText.addAll(i,gettedTextOfStepGroupSteps );
	    	    //Making Use Of User Defined clickAction Method To Click On Cancel Button Of Opened Pre Condition
			    clickAction(driver, m1.CancelButtonOfOpenedPreCondition, "Cancel Button Of Opened Pre Conditio");
			    gettedTextOfStepGroupSteps.clear();
			    gettedTextOfOpenedStepGroupStepsWithNumberAlso.clear();
	                   }
	                 }
           
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //I am Declaring this out side condition and loop so scop will remain and easily accusable  
     List<String> gettedTextOfPostConditionSteps=new ArrayList<String>();
     
	 //If Post Condition Element Is Dispalyed Go 
             try {
                   if(PostConditionElement.isDisplayed()) {
                	   Thread.sleep(500);
                	 //Making Use Of User Defined scrollTillElementIsvisable Method To Sctoll Till Post Condition Text elemeny is visable
                	  scrollTillElementIsvisable(driver,m1.PostConditionTextXpath , "Post Condition Text");
                	    if(PostConditionRightarrowInClosedElement.isDisplayed()) {
                		     PostConditionRightarrowInClosedElement.click();
                		     Thread.sleep(500);
                		   //Making Use Of gettingSizeFromListOfWebElements Generic Method
 				    	    int size=gettingSizeFromListOfWebElements(driver, m1.OpenedPostConditionStepsTextXpath, "Opened Post Condition Steps Text Xpath");
 				    	   //If There Are Many Pre condition so that for loop
				    	      for(int n=0;n<size;n++) {
				    		    Thread.sleep(500);
				    		    //Here i Directly Make Use Of Converting Xpath Into Element Because of updation
					    	    WebElement element = driver.findElement(By.xpath("//b[text()='Post Condition']/../following::div[@class='precondition-container']["+(n+1)+"]/..//span[text()]"));
					    		Thread.sleep(500);
					    		//Converted Elemnt I Am Clicking Here
					    		element.click();
					    		// Making Use Of User Defined Explicit Wait Method To Wait Till Step Group Input Parameters Text Is Visible
					    	    WaitAndPerformAction(driver, m1.StepGroupInputParametersTextXpath, wait);
					    	    //Making Use of User Defined moveMouseAction Method To Move  mouse On Opened Per Condition Steps Button
					    	    moveMouseAction(driver,m1.OpenedPostConditionStepsButtonXpath, "Opened PostCondition Steps Button");
					    	    //Making Use Of User Defined clickAction Method To Click On Opened PerCondition Steps Button
					    	    clickAction(driver,m1.OpenedPostConditionStepsButtonXpath,"Opened PostCondition Steps Button" );
					    	    Thread.sleep(1500);
					    	    //Making Use Of User Defined gettingListWebElements Method To Get List Of Weblement From Getting Text From Opened Per Condition Steps
					    	    //Object Creating To Call Return Type From Method(m1)
					    	    List<String>  gettedTextOfPostConditionStepsWithNumberAlso= m1.gettingTextFromListWebElements(driver, m1.GettingTextFromOpenedPostConditionStepsXpath,"Getting Text From Opened Post Condition Steps");
					    	    //To Get Only The Step Names
					    	    // Remove numbers and special characters using regular expressions
					    	    for (String stepDescription : gettedTextOfPostConditionStepsWithNumberAlso) {
					   	        String alphabetsOnly = stepDescription.replaceAll("[0-9.]", "").trim();
					    	    gettedTextOfPostConditionSteps.add(alphabetsOnly);
					    	                        }
					    	   //Making Use Of User Defined clickAction Method To Click On Cancel Button Of Opened Pre Condition
						    	clickAction(driver, m1.CancelButtonOfOpenedPreCondition, "Cancel Button Of Opened Pre Condition");
						    	Thread.sleep(1500);
						        //Making Use Of Generic clickAction Method To Click On Clear Result Button
						        clickAction(driver,m1.ClearResultButtonXpath,"Clear Result Button Xpath" );
						        //Removing Unwanted Things From Post Condition
						        for (int m = 0; m < gettedText.size(); m++) {
					    	          String str = gettedTextOfPostConditionSteps.get(m);
					    	          if (str.equals("close all")) {
					    	        	  gettedText.set(m, "Close All Browser");
					    	                    }
					    	          else if (str.equals("close")) {
						    	           gettedText.set(m, "Close All Browser");
					    	                                  }
					    	                       	   }
				    	                         }
                                           }
	                                   }
                                  }
           //This Catch Block Will Act As Else Condition Is PreConditionElement Is Not Displayed Complied Will Come Here And Execute This Block 
 			catch (Exception e) {
 			System.out.println("So There Is No Post Condition");
 		}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
          //I am Declaring This For Concatenate In One Variable
          List<String> concatenatedList = new ArrayList<String>();
          // Concatenate The Four Lists
          concatenatedList.addAll(gettedTextOfDependsOnScriptsSteps);
          concatenatedList.addAll(gettedTextOfPreConditionSteps);
          concatenatedList.addAll(gettedText);
          concatenatedList.addAll(gettedTextOfPostConditionSteps);
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
       //Remove Thing You Don't Want In Dumping So i Used This One You Can Customize This One
          List<String> keywordsToRemove = m1.removingWord;
         finalTextList = new ArrayList<String>();
         // Remove elements containing keywords 
         for (String element : concatenatedList) {
             boolean containsKeyword = false;
             for (String keyword :keywordsToRemove) {
                 if (element.toLowerCase().contains(keyword.toLowerCase())) {
                     containsKeyword = true;
                     break;
                 }
             }
             if (!containsKeyword) {
            	 finalTextList.add(element);
             }
          }
	   }
	}


