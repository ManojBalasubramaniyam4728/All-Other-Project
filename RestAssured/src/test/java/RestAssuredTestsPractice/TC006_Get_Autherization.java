package RestAssuredTestsPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC006_Get_Autherization {
	
	@Test(priority = 1)
	public void getOneWay() {
		
		//Specify base URI
		RestAssured.baseURI="https://postman-echo.com/basic-auth";
		
		//Basic Authentication
	    PreemptiveBasicAuthScheme basicAuth=new PreemptiveBasicAuthScheme();
		basicAuth.setUserName("postman");
		basicAuth.setPassword("password");
		
		RestAssured.authentication=basicAuth;
		
		//Request Object
		RequestSpecification httpRequest=RestAssured.given();
		
		//Response Object
		Response response=httpRequest.request(Method.GET);
		//Print The response in the console
		//Get only response from whole respons
		String responseBody=response.getBody().asString();
		System.out.println("The Response Body is-->"+responseBody);
		
		//Status Code Verification
	    int statusCode=	response.getStatusCode();
	    System.out.println("The Status Code Is-->"+statusCode);
	    Assert.assertEquals(statusCode, 200);
	    
	    //Status Line Verification
	    String statusLine=response.getStatusLine();
	    System.out.println("The Satus line Is-->"+statusLine);
	    Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	}
	
	@Test(priority = 2)
	public void getAnotherWay() {
		
		//Specify base URI
		RestAssured.baseURI="https://postman-echo.com/basic-auth";
		
		
		//Request Object and Basic Authentication
		RequestSpecification httpRequest=RestAssured.given().auth().preemptive().basic("postman", "password");
		
		//Response Object
		Response response=httpRequest.request(Method.GET);
		
		//Print The response in the console
		//Get only response from whole respons
		String responseBody=response.getBody().asString();
		System.out.println("The Response Body is-->"+responseBody);
		
		//Status Code Verification
	    int statusCode=	response.getStatusCode();
	    System.out.println("The Status Code Is-->"+statusCode);
	    Assert.assertEquals(statusCode, 200);
	    
	    //Status Line Verification
	    String statusLine=response.getStatusLine();
	    System.out.println("The Satus line Is-->"+statusLine);
	    Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	}



}
