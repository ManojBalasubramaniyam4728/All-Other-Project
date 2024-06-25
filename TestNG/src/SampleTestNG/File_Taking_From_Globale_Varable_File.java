package SampleTestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class File_Taking_From_Globale_Varable_File {
	@Test
	public void file() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\user\\eclipse-workspace\\TestNG\\src\\SampleTestNG\\Data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("userName"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("url"));
	}
}
