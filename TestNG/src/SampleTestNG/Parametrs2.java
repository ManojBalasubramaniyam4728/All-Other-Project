package SampleTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrs2 {
	
	@Test(dependsOnMethods = "MobileHomeLoneLogin")
	public void webHomeLone() {
		System.out.println("webHomeLone");
	}
	@Parameters({ "URL","API"})
	@Test
	public void MobileHomeLoneLogin(String urlname,String key) {
		System.out.println("MobileHomeLoneLogin");
		System.out.println(urlname);
		System.out.println(key);
     	}
	
	@Test(dependsOnMethods = "MobileHomeLoneLogin")
	public void APIHomeLone() {
		System.out.println("APIHomeLone");

	}
}
