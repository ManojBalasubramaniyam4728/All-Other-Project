package com.qa.tests;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class DeleteAPITest extends TestBase{

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
	public void deleteAPITest() throws IOException {
	  restClient = new RestClient();
		
      HashMap<String, String> headerMap=new HashMap<String, String>();
      headerMap.put("Content-Type", "application/json");
      
      closeableHttpResponse=restClient.delete(url, headerMap);
      
      //1.Status Code:
      int statusCode=  closeableHttpResponse.getStatusLine().getStatusCode();
      Assert.assertEquals(statusCode, RESPONSE_STATUS_CODE_204);
      
	}

}
