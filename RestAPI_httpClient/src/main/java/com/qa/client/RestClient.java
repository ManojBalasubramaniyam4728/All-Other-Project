package com.qa.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestClient {

	//1.Get Without Header Method
	public CloseableHttpResponse getWithoutHeader(String url) throws IOException {

		CloseableHttpClient httpClient = HttpClients.createDefault();

        //http get request
		HttpGet httpGet = new HttpGet(url);

		//hit the get url
		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpGet);
         
		return closeableHttpResponse;
	}
	
//**********************************************************************************************************************************************************		

	//2.Get With Header Method
	public CloseableHttpResponse getWithHeader(String url,HashMap<String, String> headerMap) throws ClientProtocolException, IOException {
	CloseableHttpClient httpClient=	HttpClients.createDefault();
	
	//http get request
	HttpGet httpGet=new HttpGet(url);
	
	//Adding Header Key Value To GetMethod
	for (Map.Entry<String, String> entry : headerMap.entrySet()) {
		httpGet.addHeader(entry.getKey(),entry.getValue());
	}
	
	//hit the get url
	CloseableHttpResponse CloseableHttpResponse=httpClient.execute(httpGet);
	
    return CloseableHttpResponse;
		
	}
	
//**********************************************************************************************************************************************************		
    
	//3.Post Method
	public CloseableHttpResponse post(String url,String entityString, HashMap<String, String> headerMap) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		
		//http Post request
		HttpPost httpPost=new HttpPost(url);
		
		//paylod
		httpPost.setEntity(new StringEntity(entityString));
		
		
		//Adding Header Key Value To PostMethod
		for (Map.Entry<String, String> entry : headerMap.entrySet()) {
			httpPost.addHeader(entry.getKey(),entry.getValue());
		}
		
		//hit the get url
		CloseableHttpResponse CloseableHttpResponse=httpClient.execute(httpPost);
		
	    return CloseableHttpResponse;
	}
	
//**********************************************************************************************************************************************************		
	
	//4.PUT Method
	 public CloseableHttpResponse put(String url,String entityString,HashMap<String, String> headerMap) throws ClientProtocolException, IOException {
		CloseableHttpClient HttpClient=HttpClients.createDefault();
		
		//http Put request
		HttpPut httpPut=new HttpPut(url);
		
		//Adding Header Key Value To PutMethod
		for(Map.Entry<String, String> entry:headerMap.entrySet()) {
			httpPut.addHeader(entry.getKey(), entry.getValue());
		}
		
		//Hit the get url
		CloseableHttpResponse closeableHttpResponse=HttpClient.execute(httpPut);
	
		return closeableHttpResponse;
	}
	 
//**********************************************************************************************************************************************************		
		
	 //5.Delete Method
	 public CloseableHttpResponse delete(String url,HashMap<String, String> headerMap) throws ClientProtocolException, IOException {
		 CloseableHttpClient httpClient= HttpClients.createDefault();
		 
		 //http Put request
		 HttpDelete httpDelete=new HttpDelete(url);
		 
		//Adding Header Key Value To DeleteMethod
		 for(Map.Entry<String, String> entry:headerMap.entrySet()) {
			 httpDelete.addHeader(entry.getKey(),entry.getValue());
		 }
		 
		//Hit the get url
		CloseableHttpResponse closeableHttpResponse=httpClient.execute(httpDelete);
		
		return closeableHttpResponse;
	}
}
