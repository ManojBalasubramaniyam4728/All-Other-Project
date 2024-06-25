package SampleTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	
@Test(dataProvider = "getData")
public void dates(String uName,String Pass) {
	System.out.println(uName);
	System.out.println(Pass);
	
}
@DataProvider
public Object[][] getData() {
	        //Colomn1,//Colomn2
	//row1 -> userName,Password     //Good cridet score
	//row2 -> userName,Password     //not good cridet score
	//row3 -> userName,Password     //fraude cridet score
	//row4 -> userName,Password     //fraude but haveing good cridet score
	Object[][] data= new Object[4][2];
	//1set
	data[0][0]="FirstUserName";
	data[0][1]="FristPassword";
	//2set
    data[1][0]="SecoundUserName";
    data[1][1]="SecoundPassword";
	//3set
    data[2][0]="TiredUserName";
    data[2][1]="TiredPassword";
     //4set
    data[3][0]="FourtUserName";
    data[3][1]="FourtPassword";
    return data;
	
}
	
	
	
}
