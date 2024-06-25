package com.qa.tests;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.base.TestBase;
import com.qa.client.RestClient;
import com.qa.data.Users;

public class PutAPITest extends TestBase{

	TestBase testbase;
	String baseURL;
	String ServiceURL;
	String url;
	RestClient restClient;
	CloseableHttpResponse closeableHttpResponse;
	String name;
	String updateJob;

	@BeforeMethod
	public void setUP() throws IOException {
		testbase = new TestBase();
		baseURL = prop.getProperty("BaseURL");
		ServiceURL = prop.getProperty("UpdateEndPoin");
		url = baseURL + ServiceURL;
	}

	@Test
	public void putAPITest() throws IOException {
	  restClient = new RestClient();
		
      HashMap<String, String> headerMap=new HashMap<String, String>();
      headerMap.put("Content-Type", "application/json");
      
     //Jackson API:
      ObjectMapper mapper=new ObjectMapper();
      name=prop.getProperty("Name");
      updateJob=prop.getProperty("UpdateJob");
      Users users=new Users(name,updateJob);
      
      //Object to json file:
      mapper.writeValue(new File(jsonFilePath),users);
      
      //Object to json file:
      String usersJsonString= mapper.writeValueAsString(users);
      System.out.println(usersJsonString);
      
      closeableHttpResponse=restClient.put(url, usersJsonString, headerMap);
      
      //validation
	  //1.Status code
      int statusCode=closeableHttpResponse.getStatusLine().getStatusCode();
      Assert.assertEquals(statusCode,RESPONSE_STATUS_CODE_200);
      
      //2.JsonString
      String responseString= EntityUtils.toString(closeableHttpResponse.getEntity(),"UTF-8");
      JSONObject responseJson=new JSONObject(responseString);
      System.out.println("The Response from API is:"+responseJson);
      
      //Json to Object(jackson.databind)
      Users usersRestOBJ=mapper.readValue(responseString, Users.class);
      System.out.println(usersRestOBJ);
      
      //CreatedAt is genrating in runtime so i user setter method
	  String updatedAt=usersRestOBJ.getupdatedAt();
	  users.setupdatedAt(updatedAt);
	  
	  //Printing after setting the value
	  System.out.println(usersRestOBJ);
	  
	  //Verifying CreatedAt
	  Assert.assertEquals(users.getupdatedAt(), usersRestOBJ.getupdatedAt());

	  // 3.All Headers

	  Header[] headerArray = closeableHttpResponse.getAllHeaders();

	  HashMap<String, String> allHader = new HashMap<String, String>();

	  for (Header header : headerArray) {
			allHader.put(header.getName(), header.getValue());
				}

	  System.out.println("All headers-->" + allHader);
			}
  }
