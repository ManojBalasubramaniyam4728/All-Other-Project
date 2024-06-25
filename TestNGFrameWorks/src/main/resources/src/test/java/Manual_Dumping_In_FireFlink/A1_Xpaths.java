package Manual_Dumping_In_FireFlink;

public class A1_Xpaths extends A5_TestData_And_MainMethod_To_Run_With_User_Input{

	    //Xpaths
		//Email Id Textfield Xpath
		public String EmaiIdXpath="//input[@placeholder='Enter your email']";
		//Password Textfield Xpath
		public String PasswordTextfieldXpath="//input[@placeholder='Enter your password']";
		//Signin Button Xpath
		public String SignInButtonXpath="//button[@type='submit']";
		//Projects Tab Xpath
		public String ProjectsTabXpath="//span[text()='"+PrajectName+"']";
		//Root Modul Text Xpath
		public String RootModulTextXpath="//span[@title='Root Module']";
		//Module Name Text Xpath
		public String ModuleNameTextXpath="//span[@title='"+ModuleName+"']";
		//Expander Opend Module Name
		public String ExpanderOpendModuleButton="//span[@class='fancytree-expander']";
		//Script Name Text Xpath
		public String ScriptNameTextXpath="//span[@title='"+ScripetName+"']";
		//Opened Script Name Text Xpath
		public String OpenedScriptNameText="//label[text()='"+ScripetName+"']";
		//Clear Result Button Xpath
		public String ClearResultButtonXpath="//img[@title='Quick Run Settings']/../..//span[@title='Clear Result']";
		//Opened First Script Steps Texts Xpath
		public String OpenedFirstScriptStepsTextsXpath="//span[@id='step-break' and(@class=' step-name-truncate')]";
		//Pre Condition Text Xpath
		public String PreConditionTextXpath="//b[text()='Pre Condition']";
		//Post Condition Text Xpath
		public String PostConditionTextXpath="//b[text()='Post Condition']";
		//Depends On Scripts Text Xpath
		public String DependsOnScriptsTextXpath="//b[text()='Depends On Scripts']";
		//Per Condition Rightarrow In Closed Button Xpath
		public String PerConditionRightarrowInClosedButtonXpath="//img[@id='precondition-rightarrow']";
		//Opened Pre Condition Steps Text Xpath
		public String OpenedPreConditionStepsTextXpath="//b[text()='Pre Condition']/../following::div[@class='precondition-container']";
		//Step Group Input Parameters Text Xpath
		public String StepGroupInputParametersTextXpath="//span[text()='Step Group Input Parameters']";
		//Opened Depends On Scripts Text Xpath
		public String OpenedDependsOnScriptsTextXpath=" //span[contains(text(),'Depends on Scripts')]";
		//Open Step Group Input Parameters Steps Button Xpath
		public String OpenedPerConditionStepsButtonXpath="//span[text()='Steps']/*";
		//Getting Text From Opened PerCondition Steps Xpath
		public String GettingTextFromOpenedPerConditionStepsXpath="//span[text()='Steps']/*//div[text()]";
	    // Cancel Button Of Opened Pre Condition
		public String CancelButtonOfOpenedPreCondition="//button[text()='Cancel']";
		//Post Condition Rightarrow In Closed Button Xpath
		public String PostConditionRightarrowInClosedButtonXpath="//img[@id='postcondition-rightarrow']";
		//Opened Post Condition Steps Text Xpath
		public String OpenedPostConditionStepsTextXpath="//input[@id=\"rootPostConditionCheckbox\"]/../following::div/span[text()]";
		//Open Step Group Input Parameters Steps Button Xpath
		public String OpenedPostConditionStepsButtonXpath="//span[text()='Steps']/*";
	    //Getting Text From Opened PerCondition Steps Xpath
		public String GettingTextFromOpenedPostConditionStepsXpath="//span[text()='Steps']/*//div[text()]";
	    //Depends On Scripts Text Xpath
		public String DependsOnScriptsRightarrowInClosedButtonXpath="//img[@id='dependscript-rightarrow']";
	    //Opened Depends On Scripts Steps Text Xpath
		public String OpenedDependsOnScriptsStepsTextXpath="//img[@id='dependscript-rightarrow']/../following::div[@class='precondition-container']";
	    //Getting Text From Opened PerCondition Steps Xpath
		public String GettingTextFromOpenedDependsOnScriptsXpath="//ol[@class='fontPoppinsRegularMd']//li[text()]";
	    //Open Step Group Input Parameters Steps Button Xpath
		public String OpenedStepGroupStepsButtonXpath="//span[text()='Steps']/*";
	    //Getting Text From Opened PerCondition Steps Xpath
		public String GettingTextFromOpenedStepGroupStepsXpath="//span[text()='Steps']//div//p[text()]";
		//Manual Test Case Link Xpath
		public String ManualTestCaseLinkXpath="//button[text()='+ Manual Test Case']";
		//Manual Test Name Text Xpath
		public String TestCaseNameTextXpath="//span[text()='Test Case Name']";
		//Requirement Id Textfield Xpath
		public String RequirementIdTextfieldXpath="//input[@id='Requirement Id']";
		//Created By Textfield Xpath
		public String CreatedByTextfieldXpath="//input[@id='Created By']";
		//Crated On Date Xpath
		public String CratedOnDateXpath="//input[@id='Created On']";
		//Todays Date Xpath
		public String TodaysDateXpath="//div[contains(@class,'day--today')]";
		//Reviewed By Textfield Xpath
		public String ReviewedByTextfieldXpath="//input[@id='Reviewed By']";
		//Reviewed On Data Xpath
		public String ReviewedOnDataXpath="//input[@id='Reviewed on']";
		//Number of Row
		public String NumberOfRowXpath="//td[@class='testStepTable fontPoppinsRegularSm']";
		//First Row As To Be Added Icon
		public String FirstRowAsToBeAddedIconXpath="(//td[@class='testStepTable fontPoppinsRegularSm']//button)[1]";
		//Insert row Below Button
		public String InsertrowbelowButtonXpath="//span[text()='Insert row below']";
		//Insert row Below Button
		public String SaveButtonXpath="//button[text()='Save']";
		//Variables Button
		public String VariablesXpath="//span[text()='Variables']";
		//Local Variables Button
		public String LocalVariablesXpath="//label[text()='Local Variables']";
		//Variables Drop Down Button
		public String VariablesDropDownButtonXpath="//button[@type='button']/..//span[text()='Open options']/..//img";
		//Global Variables Button
		public String GlobalVariablesButtonXpath="//label[text()='Global Variables']";
		//key pairs
		public String keyXpath="//td[1]";
		//value pairs
		public String valueXpath="//td[2]";
		
}
