package Manual_Dumping_In_FireFlink;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

public class A5_TestData_And_MainMethod_To_Run_With_User_Input {

//Team Before Clicking On Run Button Follow The Instruction That I Have Commented Out Below

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
   /*I Have Used Multi Level Inheritance As You Can See  
     5 Class If Want To Run Make Sure You Have 5 Class.
     In Below I have Given Pom Dependencies Also Refer That One Also

      Team I Made Full Generic You Guys Can See The code If
      Possible Make Still More Generic  And User Friendly */

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		

  /*See This Will Follow Only This Type Of Template Mention Below If 
  You Not Created Template Like This Follow This Kind Of Template
  ______________________________________________________________________________________________________________
 |                                                                                                              |
 | Test Case Name       Requirement Id       Status                                                             |
 | XXXXXXXXXXXX         XXXXXX               XXXX                                                               |
 |                                                                                                              |
 | Created By           Created On            Reviewed By                                                        |
 | XXXXX                XXXXX                XXXXX                                                              |
 |                                                                                                              |
 | Reviewed On                                                                                                  |
 | XXXXX                                                                                                        |
 |  __________________________________________________________________________________________________________  |
 | |    |SL No|Test Case ID|Test Description|Test Data|Test Step|Expected Result|Actual Result|Status|Comments| |
 | |____|_____|____________|________________|_________|_________|_______________|_____________|______|________| |
 |______________________________________________________________________________________________________________|  
   
   */

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		

//Pre-Requisite:-
  /* Team You Have To Follow 4 Pre Requisite Before Running This
  
    *1.Make Sure That You Have Set The License As 
      Default In Which You Want To Dump Manual Test Case
  
    *2.Make Sure That In Which Script You Want to Dump.
       Manual Test Case As To Be Empty (Means in script 
       After Automation ,Manual Test Case As To Be (+)Button) 
       If It Is Manual Test Case And After Opening That It Shows 
       Empty ,Than Delete Manual Test Case Only
 
     *3.Test Data Section As To Filled manually 

     *4.Once Confirm Verification Step As Filled Correctly If Not Fill Manually */
	
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	   
    //Pom Dependencies

/*<dependencies>
<dependency>
		<groupId>org.seleniumhq.selenium</groupId>
		<artifactId>selenium-java</artifactId>
		<version>4.8.2</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/org.testng/testng -->
	<dependency>
		<groupId>org.testng</groupId>
		<artifactId>testng</artifactId>
		<version>7.7.1</version>
		<scope>test</scope>
	</dependency>
	<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
	<dependency>
		<groupId>org.apache.poi</groupId>
		<artifactId>poi-ooxml</artifactId>
		<version>5.2.2</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
	<dependency>
		<groupId>org.apache.poi</groupId>
		<artifactId>poi</artifactId>
		<version>5.2.2</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
	<dependency>
		<groupId>io.github.bonigarcia</groupId>
		<artifactId>webdrivermanager</artifactId>
		<version>3.8.1</version>
	</dependency>

</dependencies>
</project>*/

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		//Team Edit The Value Of Non Static Data By seeing to Variable 
		 
	    // Static Data's Which Remains Same Throughout
		// Url
		public static String WebUrl = "https://app.fireflink.com/signin";
		// Explicit Wait
		public static int wait = 20;
		// Web Driver
		public static WebDriver driver;
		// Final Value(Getted Text) In List
		public static List<String> finalTextList;
		//Map
		public static Map<String, String> keyValue;
		// Non Static Data's Which Varying Person To Person And Project To Project 
		// Email Id
		public String EmaiId="jidos50815@imdutex.com";
		// Password
		public String Password = "Password@123";
		// Praject Name(Pass The Parject Name As Execitly As In Fireflink)
		public String PrajectName = "GoFillForm";
		// Module Name(Pass The First Module Name As Execitly As In Fireflink)
		public String ModuleName = "Master Entries";
		// Script Name(Pass The First Module Names Script Name As Execitly As I Fireflink)
		public String ScripetName = "SA010_Verify whether super admin is able to delete Facilities";
		//Requirement Id
		public String RequirementId = "SA010";
		//Created By
		public String CreatedBy = "Manoj";
		//Created By
		public String ReviewedBy = "Rajesh";
		//Test Description
		public String TestDescription = "Verify whether super admin is able to delete Facilities";
		//Test Case Id
	    // public String TestCaseId = "GA002";
		//Remove Thing You Don't Want In Dumping
		public List<String> removingWord= Arrays.asList("Wait", "press","Refresh browser","Mouse drag and drop","listbox","Get text","Get size","excel", "Generate random", "Concatenate objectiveName","Concatenate","DesiredCapability create");
	   //"Print Value","Browser window scroll"

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
		// Main method
		public static void main(String[] args) throws InterruptedException {

		// Calling User Define Method To Run Enter Classes In Package
			A4_Writing_Getted_List_Into_FireFlink.writingGettedListIntoManuelTestCase();
	       }

      }


    /*Leaving This Code at This Point  
        Manoj B*/