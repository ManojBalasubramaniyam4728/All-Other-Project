package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	
	public int RESPONSE_STATUS_CODE_200=200;
	public int RESPONSE_STATUS_CODE_201=201;
	public int RESPONSE_STATUS_CODE_204=204;
	public int RESPONSE_STATUS_CODE_500=500;
	public int RESPONSE_STATUS_CODE_400=400;
	public int RESPONSE_STATUS_CODE_401=401;
	
	
	public String propertiesfilePath="C:\\Users\\user\\eclipse-workspace\\RestAPI\\src\\main\\java\\com\\qa\\base\\config.properties";
	public String jsonFilePath="C:\\Users\\user\\eclipse-workspace\\RestAPI\\src\\main\\java\\com\\qa\\data\\users.json";
	public Properties prop;
	
 public TestBase()  {
	 try {
	prop =new Properties();
	FileInputStream fis =new FileInputStream(propertiesfilePath);
	prop.load(fis);
    }
	 catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	 catch (IOException e) {
		e.printStackTrace();
	}
  }
}
