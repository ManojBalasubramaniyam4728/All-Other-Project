package DataProviderFromExcel;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.XLUtils;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DataDrivenTest_AddNewEmployees extends XLUtils{

	@Test(dataProvider = "empDataProvider")
	public void PostNewEmployees(String ename,String esal,String eage) throws IOException, InterruptedException {
		
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		
		RequestSpecification httpRequst=RestAssured.given();
		
		//Here we created data whitch we can send along with the past request
		JSONObject requestParams=new JSONObject();
		requestParams.put("Name", ename);
		requestParams.put("Sal", esal);
		requestParams.put("Age", eage);
		
		//Add a header etting the request body is a json
		httpRequst.header("Content-Type", "application/json");
		
		//Add The Json to the Body of the Requset
		httpRequst.body(requestParams.toJSONString());
		
		//Post Request
		Response response=httpRequst.request(Method.POST,"/create");
		
		//Capture response body to perform validations
		String responseBody=response.getBody().asString();
		
		System.out.println("The Response Body-->"+responseBody);
		
		Assert.assertEquals(responseBody.contains(ename), true);
		Assert.assertEquals(responseBody.contains(esal), true);
		Assert.assertEquals(responseBody.contains(eage), true);
		int statusCode=response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	 //Data Provider From Excel
	 @DataProvider(name="empDataProvider")
	 String[][] getEmpData() throws IOException{
		
		//Read data from excel
		String path=filePath;
		int rownum=getRowCount(path, "Sheet1");
		int colcount=getCellCount(path,"Sheet1", 1);
		String empdata[][]=new String [rownum][colcount];
		
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				empdata[i-1][j]=getCellData(path, "Sheet1", i, j);
			}
		}
		
		return empdata;
	}
}
