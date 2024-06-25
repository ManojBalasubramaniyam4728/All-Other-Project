package RestAssuredTestsPractice;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.data.Users;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_Post {

	@Test
	public void post() {
		
	//Specify base URI
	RestAssured.baseURI="https://reqres.in";
	
	//Request Object
	RequestSpecification httpRequest=RestAssured.given();
	
	//Request Payload Sending along with post request
	
	JSONObject requestParams=new JSONObject();
	requestParams.put("name", "morpheus");
	requestParams.put("job", "leader");
	Users users=new Users("morpheus","leader");
	
	httpRequest.header("Content-Type", "application/json");

	//Puting body payload into httpRequest
	httpRequest.body(requestParams.toJSONString());
	
	//Response object
	Response response=httpRequest.request(Method.POST,"/api/users");
	
	//Print The response in the console
    //Get only response from whole respons
	String responseBody=response.getBody().asString();
	System.out.println("The Response Body is-->"+responseBody);
	
	//Status Code Verification
    int statusCode=	response.getStatusCode();
    System.out.println("The Status Code Is-->"+statusCode);
    Assert.assertEquals(statusCode, 201);
    
    //Status Line Verification
    String statusLine=response.getStatusLine();
    System.out.println("The Satus line Is-->"+statusLine);
    Assert.assertEquals(statusLine, "HTTP/1.1 201 Created");
    
    //Body Validation Through Json path finders
     String nameBefoure=users.getName();
     String nameAfter=response.jsonPath().get("name");
     System.out.println("The name is-->"+nameAfter);
     Assert.assertEquals(nameAfter, nameBefoure);
	
     
     String jobBefoure=users.getJob();
     String jobAfter=response.jsonPath().get("job");
     System.out.println("The job is-->"+jobAfter);
     Assert.assertEquals(jobAfter, jobBefoure);
     
     String id=response.jsonPath().get("id");
     //setter method because it genrated in run time
     users.setId(id);
     String settedID=users.getId();
     System.out.println("The id is-->"+id);
     Assert.assertEquals(id, settedID);
     
     String createdAt=response.jsonPath().get("createdAt");
     //setter method because it genrated in run time
     users.setCreatedAt(createdAt);
     String settedcreatedAt=users.getCreatedAt();
     System.out.println("The createdAt is-->"+createdAt);
     Assert.assertEquals(createdAt, settedcreatedAt);
     
     //Validating Headers
     String contentType=response.header("Content-Type");
     System.out.println("Content-Type-->"+contentType);
     Assert.assertEquals(contentType, "application/json; charset=utf-8");
    
	}

}
