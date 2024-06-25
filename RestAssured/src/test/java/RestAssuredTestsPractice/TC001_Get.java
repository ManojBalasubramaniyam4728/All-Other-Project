package RestAssuredTestsPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_Get {

	@Test
	public void get() {
		
		//Specify base URI
		RestAssured.baseURI="https://reqres.in";
		
		//Request Object
		RequestSpecification httpRequest=RestAssured.given();
		
		//Response Object
		Response response=httpRequest.request(Method.GET, "/api/users?page=2");
		
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
