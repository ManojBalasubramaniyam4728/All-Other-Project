package SampleTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Helper_Attrubutes_Of_TestNG {
	@AfterTest
	public void IWillExecuteLast() {
		System.out.println("I Will Execute Last");
	}

	@Test
	public void webHomeLone() {
		System.out.println("webHomeLone");

	}

	@Test(timeOut = 4000)
	// @Test
	public void MobileHomeLoneLogin() {
		System.out.println("MobileHomeLoneLogin");

	}

	@Test
	public void MobileHomeLoneSignOut() {
		System.out.println("MobileHomeLoneSignOut");

	}

	@Test(dependsOnMethods = { "webHomeLone", "MobileHomeLoneLogin" })
//	@Test
	public void MobileHomeLoneSignIn() {
		System.out.println("MobileHomeLoneSignIn");

	}

	@Test(enabled = false)
	// @Test
	public void APIHomeLone() {
		System.out.println("APIHomeLone");

	}

	@BeforeTest
	public void IWillExecuteFirst() {
		System.out.println("I Will Execute First");
	}

}
