package com.qa.tests;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;
import com.qa.utill.TestUtill;

public class GetAPITest extends TestBase {

	TestBase testbase;
	String baseURL;
	String ServiceURL;
	String url;
	RestClient restClient;
	CloseableHttpResponse closeableHttpResponse;

	@BeforeMethod
	public void setUP() throws IOException {
		testbase = new TestBase();
		baseURL = prop.getProperty("BaseURL");
		ServiceURL = prop.getProperty("serviceURL");
		url = baseURL + ServiceURL;
	}

	@Test(priority = 1)
	public void getAPITestWithoutHeader() throws IOException {
		restClient = new RestClient();

		closeableHttpResponse = restClient.getWithoutHeader(url);

		// a.Status code
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code-->" + statusCode);
		// validation
		Assert.assertEquals(statusCode, RESPONSE_STATUS_CODE_200, "Status Code Is Not 200");

//**********************************************************************************************************************************************************		

		// b.Json String
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");

		JSONObject responseJson = new JSONObject(responseString);
		System.out.println("Response Json-->" + responseJson);

		// Single Value Assertion
		// page
		String page = TestUtill.getValueByJpath(responseJson, "/page");
		System.out.println("value of the page-->" + page);
		// validation
		Assert.assertEquals(Integer.parseInt(page), 1);

		// per_Page
		String perPageValue = TestUtill.getValueByJpath(responseJson, "/per_page");
		System.out.println("value of perPage-->" + perPageValue);
		// validation
		Assert.assertEquals(Integer.parseInt(perPageValue), 6);

		// total
		String total = TestUtill.getValueByJpath(responseJson, "/total");
		System.out.println("value of total-->" + total);
		// validation
		Assert.assertEquals(Integer.parseInt(total), 12);

		// total_pages
		String total_pages = TestUtill.getValueByJpath(responseJson, "/total_pages");
		System.out.println("value of total_pages-->" + total_pages);
		// validation
		Assert.assertEquals(Integer.parseInt(total_pages), 2);

		// Getting the value from Json Array
		// First Data in Json Array
		String last_name = TestUtill.getValueByJpath(responseJson, "/data[0]/last_name");
		String id = TestUtill.getValueByJpath(responseJson, "/data[0]/id");
		String avatar = TestUtill.getValueByJpath(responseJson, "/data[0]/avatar");
		String first_name = TestUtill.getValueByJpath(responseJson, "/data[0]/first_name");
		String email = TestUtill.getValueByJpath(responseJson, "/data[0]/email");
		// Printing in console
		System.out.println("Data in Last Name-->" + last_name);
		System.out.println("Data in Id-->" + id);
		System.out.println("Data in Avatar-->" + avatar);
		System.out.println("Data in First Name-->" + first_name);
		System.out.println("Data in Email-->" + email);
		// Validation
		Assert.assertEquals(last_name, "Bluth");
		Assert.assertEquals(Integer.parseInt(id), 1);
		Assert.assertEquals(avatar, "https://reqres.in/img/faces/1-image.jpg");
		Assert.assertEquals(first_name, "George");
		Assert.assertEquals(email, "george.bluth@reqres.in");

		// Second Data in Json Array
		String last_name1 = TestUtill.getValueByJpath(responseJson, "/data[1]/last_name");
		String id1 = TestUtill.getValueByJpath(responseJson, "/data[1]/id");
		String avatar1 = TestUtill.getValueByJpath(responseJson, "/data[1]/avatar");
		String first_name1 = TestUtill.getValueByJpath(responseJson, "/data[1]/first_name");
		String email1 = TestUtill.getValueByJpath(responseJson, "/data[1]/email");
		// Printing in console
		System.out.println("Data in Last Name-->" + last_name1);
		System.out.println("Data in Id-->" + id1);
		System.out.println("Data in Avatar-->" + avatar1);
		System.out.println("Data in First Name-->" + first_name1);
		System.out.println("Data in Email-->" + email1);
		// Validation
		Assert.assertEquals(last_name1, "Weaver");
		Assert.assertEquals(Integer.parseInt(id1), 2);
		Assert.assertEquals(avatar1, "https://reqres.in/img/faces/2-image.jpg");
		Assert.assertEquals(first_name1, "Janet");
		Assert.assertEquals(email1, "janet.weaver@reqres.in");

		// Third Data in Json Array
		String last_name2 = TestUtill.getValueByJpath(responseJson, "/data[2]/last_name");
		String id2 = TestUtill.getValueByJpath(responseJson, "/data[2]/id");
		String avatar2 = TestUtill.getValueByJpath(responseJson, "/data[2]/avatar");
		String first_name2 = TestUtill.getValueByJpath(responseJson, "/data[2]/first_name");
		String email2 = TestUtill.getValueByJpath(responseJson, "/data[2]/email");
		// Printing in console
		System.out.println("Data in Last Name-->" + last_name2);
		System.out.println("Data in Id-->" + id2);
		System.out.println("Data in Avatar-->" + avatar2);
		System.out.println("Data in First Name-->" + first_name2);
		System.out.println("Data in Email-->" + email2);
		// Validation
		Assert.assertEquals(last_name2, "Wong");
		Assert.assertEquals(Integer.parseInt(id2), 3);
		Assert.assertEquals(avatar2, "https://reqres.in/img/faces/3-image.jpg");
		Assert.assertEquals(first_name2, "Emma");
		Assert.assertEquals(email2, "emma.wong@reqres.in");

		// Fourth Data in Json Array
		String last_name3 = TestUtill.getValueByJpath(responseJson, "/data[3]/last_name");
		String id3 = TestUtill.getValueByJpath(responseJson, "/data[3]/id");
		String avatar3 = TestUtill.getValueByJpath(responseJson, "/data[3]/avatar");
		String first_name3 = TestUtill.getValueByJpath(responseJson, "/data[3]/first_name");
		String email3 = TestUtill.getValueByJpath(responseJson, "/data[3]/email");
		// Printing in console
		System.out.println("Data in Last Name-->" + last_name3);
		System.out.println("Data in Id-->" + id3);
		System.out.println("Data in Avatar-->" + avatar3);
		System.out.println("Data in First Name-->" + first_name3);
		System.out.println("Data in Email-->" + email3);
		// Validation
		Assert.assertEquals(last_name3, "Holt");
		Assert.assertEquals(Integer.parseInt(id3), 4);
		Assert.assertEquals(avatar3, "https://reqres.in/img/faces/4-image.jpg");
		Assert.assertEquals(first_name3, "Eve");
		Assert.assertEquals(email3, "eve.holt@reqres.in");

		// Fiveth Data in Json Array
		String last_name4 = TestUtill.getValueByJpath(responseJson, "/data[4]/last_name");
		String id4 = TestUtill.getValueByJpath(responseJson, "/data[4]/id");
		String avatar4 = TestUtill.getValueByJpath(responseJson, "/data[4]/avatar");
		String first_name4 = TestUtill.getValueByJpath(responseJson, "/data[4]/first_name");
		String email4 = TestUtill.getValueByJpath(responseJson, "/data[4]/email");
		// Printing in console
		System.out.println("Data in Last Name-->" + last_name4);
		System.out.println("Data in Id-->" + id4);
		System.out.println("Data in Avatar-->" + avatar4);
		System.out.println("Data in First Name-->" + first_name4);
		System.out.println("Data in Email-->" + email4);
		// Validation
		Assert.assertEquals(last_name4, "Morris");
		Assert.assertEquals(Integer.parseInt(id4), 5);
		Assert.assertEquals(avatar4, "https://reqres.in/img/faces/5-image.jpg");
		Assert.assertEquals(first_name4, "Charles");
		Assert.assertEquals(email4, "charles.morris@reqres.in");

		// Sixth Data in Json Array
		String last_name5 = TestUtill.getValueByJpath(responseJson, "/data[5]/last_name");
		String id5 = TestUtill.getValueByJpath(responseJson, "/data[5]/id");
		String avatar5 = TestUtill.getValueByJpath(responseJson, "/data[5]/avatar");
		String first_name5 = TestUtill.getValueByJpath(responseJson, "/data[5]/first_name");
		String email5 = TestUtill.getValueByJpath(responseJson, "/data[5]/email");
		// Printing in console
		System.out.println("Data in Last Name-->" + last_name5);
		System.out.println("Data in Id-->" + id5);
		System.out.println("Data in Avatar-->" + avatar5);
		System.out.println("Data in First Name-->" + first_name5);
		System.out.println("Data in Email-->" + email5);
		// Validation
		Assert.assertEquals(last_name5, "Ramos");
		Assert.assertEquals(Integer.parseInt(id5), 6);
		Assert.assertEquals(avatar5, "https://reqres.in/img/faces/6-image.jpg");
		Assert.assertEquals(first_name5, "Tracey");
		Assert.assertEquals(email5, "tracey.ramos@reqres.in");

//**********************************************************************************************************************************************************		
		// c.All Headers

		Header[] headerArray = closeableHttpResponse.getAllHeaders();

		HashMap<String, String> allHader = new HashMap<String, String>();

		for (Header header : headerArray) {
			allHader.put(header.getName(), header.getValue());
		}

		System.out.println("All headers-->" + allHader);
	}

	
//**********************************************************************************************************************************************************		
//**********************************************************************************************************************************************************		
	

	@Test(priority = 2)
	public void getAPITestWithHeader() throws IOException {
		restClient = new RestClient();
		
		HashMap<String, String> headerMap=new HashMap<String, String>();
		headerMap.put("Content-Type", "application/json");

		closeableHttpResponse = restClient.getWithHeader(url,headerMap);

		// a.Status code
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code-->" + statusCode);
		// validation
		Assert.assertEquals(statusCode, RESPONSE_STATUS_CODE_200, "Status Code Is Not 200");

//**********************************************************************************************************************************************************		

		// b.Json String
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");

		JSONObject responseJson = new JSONObject(responseString);
		System.out.println("Response Json-->" + responseJson);

		// Single Value Assertion
		// page
		String page = TestUtill.getValueByJpath(responseJson, "/page");
		System.out.println("value of the page-->" + page);
		// validation
		Assert.assertEquals(Integer.parseInt(page), 1);

		// per_Page
		String perPageValue = TestUtill.getValueByJpath(responseJson, "/per_page");
		System.out.println("value of perPage-->" + perPageValue);
		// validation
		Assert.assertEquals(Integer.parseInt(perPageValue), 6);

		// total
		String total = TestUtill.getValueByJpath(responseJson, "/total");
		System.out.println("value of total-->" + total);
		// validation
		Assert.assertEquals(Integer.parseInt(total), 12);

		// total_pages
		String total_pages = TestUtill.getValueByJpath(responseJson, "/total_pages");
		System.out.println("value of total_pages-->" + total_pages);
		// validation
		Assert.assertEquals(Integer.parseInt(total_pages), 2);

		// Getting the value from Json Array
		// First Data in Json Array
		String last_name = TestUtill.getValueByJpath(responseJson, "/data[0]/last_name");
		String id = TestUtill.getValueByJpath(responseJson, "/data[0]/id");
		String avatar = TestUtill.getValueByJpath(responseJson, "/data[0]/avatar");
		String first_name = TestUtill.getValueByJpath(responseJson, "/data[0]/first_name");
		String email = TestUtill.getValueByJpath(responseJson, "/data[0]/email");
		// Printing in console
		System.out.println("Data in Last Name-->" + last_name);
		System.out.println("Data in Id-->" + id);
		System.out.println("Data in Avatar-->" + avatar);
		System.out.println("Data in First Name-->" + first_name);
		System.out.println("Data in Email-->" + email);
		// Validation
		Assert.assertEquals(last_name, "Bluth");
		Assert.assertEquals(Integer.parseInt(id), 1);
		Assert.assertEquals(avatar, "https://reqres.in/img/faces/1-image.jpg");
		Assert.assertEquals(first_name, "George");
		Assert.assertEquals(email, "george.bluth@reqres.in");

		// Second Data in Json Array
		String last_name1 = TestUtill.getValueByJpath(responseJson, "/data[1]/last_name");
		String id1 = TestUtill.getValueByJpath(responseJson, "/data[1]/id");
		String avatar1 = TestUtill.getValueByJpath(responseJson, "/data[1]/avatar");
		String first_name1 = TestUtill.getValueByJpath(responseJson, "/data[1]/first_name");
		String email1 = TestUtill.getValueByJpath(responseJson, "/data[1]/email");
		// Printing in console
		System.out.println("Data in Last Name-->" + last_name1);
		System.out.println("Data in Id-->" + id1);
		System.out.println("Data in Avatar-->" + avatar1);
		System.out.println("Data in First Name-->" + first_name1);
		System.out.println("Data in Email-->" + email1);
		// Validation
		Assert.assertEquals(last_name1, "Weaver");
		Assert.assertEquals(Integer.parseInt(id1), 2);
		Assert.assertEquals(avatar1, "https://reqres.in/img/faces/2-image.jpg");
		Assert.assertEquals(first_name1, "Janet");
		Assert.assertEquals(email1, "janet.weaver@reqres.in");

		// Third Data in Json Array
		String last_name2 = TestUtill.getValueByJpath(responseJson, "/data[2]/last_name");
		String id2 = TestUtill.getValueByJpath(responseJson, "/data[2]/id");
		String avatar2 = TestUtill.getValueByJpath(responseJson, "/data[2]/avatar");
		String first_name2 = TestUtill.getValueByJpath(responseJson, "/data[2]/first_name");
		String email2 = TestUtill.getValueByJpath(responseJson, "/data[2]/email");
		// Printing in console
		System.out.println("Data in Last Name-->" + last_name2);
		System.out.println("Data in Id-->" + id2);
		System.out.println("Data in Avatar-->" + avatar2);
		System.out.println("Data in First Name-->" + first_name2);
		System.out.println("Data in Email-->" + email2);
		// Validation
		Assert.assertEquals(last_name2, "Wong");
		Assert.assertEquals(Integer.parseInt(id2), 3);
		Assert.assertEquals(avatar2, "https://reqres.in/img/faces/3-image.jpg");
		Assert.assertEquals(first_name2, "Emma");
		Assert.assertEquals(email2, "emma.wong@reqres.in");

		// Fourth Data in Json Array
		String last_name3 = TestUtill.getValueByJpath(responseJson, "/data[3]/last_name");
		String id3 = TestUtill.getValueByJpath(responseJson, "/data[3]/id");
		String avatar3 = TestUtill.getValueByJpath(responseJson, "/data[3]/avatar");
		String first_name3 = TestUtill.getValueByJpath(responseJson, "/data[3]/first_name");
		String email3 = TestUtill.getValueByJpath(responseJson, "/data[3]/email");
		// Printing in console
		System.out.println("Data in Last Name-->" + last_name3);
		System.out.println("Data in Id-->" + id3);
		System.out.println("Data in Avatar-->" + avatar3);
		System.out.println("Data in First Name-->" + first_name3);
		System.out.println("Data in Email-->" + email3);
		// Validation
		Assert.assertEquals(last_name3, "Holt");
		Assert.assertEquals(Integer.parseInt(id3), 4);
		Assert.assertEquals(avatar3, "https://reqres.in/img/faces/4-image.jpg");
		Assert.assertEquals(first_name3, "Eve");
		Assert.assertEquals(email3, "eve.holt@reqres.in");

		// Fiveth Data in Json Array
		String last_name4 = TestUtill.getValueByJpath(responseJson, "/data[4]/last_name");
		String id4 = TestUtill.getValueByJpath(responseJson, "/data[4]/id");
		String avatar4 = TestUtill.getValueByJpath(responseJson, "/data[4]/avatar");
		String first_name4 = TestUtill.getValueByJpath(responseJson, "/data[4]/first_name");
		String email4 = TestUtill.getValueByJpath(responseJson, "/data[4]/email");
		// Printing in console
		System.out.println("Data in Last Name-->" + last_name4);
		System.out.println("Data in Id-->" + id4);
		System.out.println("Data in Avatar-->" + avatar4);
		System.out.println("Data in First Name-->" + first_name4);
		System.out.println("Data in Email-->" + email4);
		// Validation
		Assert.assertEquals(last_name4, "Morris");
		Assert.assertEquals(Integer.parseInt(id4), 5);
		Assert.assertEquals(avatar4, "https://reqres.in/img/faces/5-image.jpg");
		Assert.assertEquals(first_name4, "Charles");
		Assert.assertEquals(email4, "charles.morris@reqres.in");

		// Sixth Data in Json Array
		String last_name5 = TestUtill.getValueByJpath(responseJson, "/data[5]/last_name");
		String id5 = TestUtill.getValueByJpath(responseJson, "/data[5]/id");
		String avatar5 = TestUtill.getValueByJpath(responseJson, "/data[5]/avatar");
		String first_name5 = TestUtill.getValueByJpath(responseJson, "/data[5]/first_name");
		String email5 = TestUtill.getValueByJpath(responseJson, "/data[5]/email");
		// Printing in console
		System.out.println("Data in Last Name-->" + last_name5);
		System.out.println("Data in Id-->" + id5);
		System.out.println("Data in Avatar-->" + avatar5);
		System.out.println("Data in First Name-->" + first_name5);
		System.out.println("Data in Email-->" + email5);
		// Validation
		Assert.assertEquals(last_name5, "Ramos");
		Assert.assertEquals(Integer.parseInt(id5), 6);
		Assert.assertEquals(avatar5, "https://reqres.in/img/faces/6-image.jpg");
		Assert.assertEquals(first_name5, "Tracey");
		Assert.assertEquals(email5, "tracey.ramos@reqres.in");

//**********************************************************************************************************************************************************		
		// c.All Headers

		Header[] headerArray = closeableHttpResponse.getAllHeaders();

		HashMap<String, String> allHader = new HashMap<String, String>();

		for (Header header : headerArray) {
			allHader.put(header.getName(), header.getValue());
		}

		System.out.println("All headers-->" + allHader);
	}

}
