package SampleTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parametrs {
	
	
	@Parameters({"URL"})
	@Test
	public void webHomeLone(String urlname) {
		System.out.println("webHomeLone");
		System.out.println(urlname);

	}

	@Test(dependsOnMethods = "webHomeLone")
	public void MobileHomeLoneLogin() {
		System.out.println("MobileHomeLoneLogin");

	}

	@Test(dependsOnMethods = "webHomeLone")
	public void APIHomeLone() {
		System.out.println("APIHomeLone");

   }
}
