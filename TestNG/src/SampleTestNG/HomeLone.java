package SampleTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLone {
	@AfterTest
	public void IWillExecuteLast() {
		System.out.println("I Will Execute Last");
	}
	@Test(groups= {"smoke"})
	public void webHomeLone() {
		System.out.println("webHomeLone");

	}

	@Test
	public void MobileHomeLoneLogin() {
		System.out.println("MobileHomeLoneLogin");

	}
	@Test
	public void MobileHomeLoneSignOut() {
		System.out.println("MobileHomeLoneSignOut");

	}
	@Test(groups= {"smoke"})
	public void MobileHomeLoneSignIn() {
		System.out.println("MobileHomeLoneSignIn");

	}

	@Test
	public void APIHomeLone() {
		System.out.println("APIHomeLone");

	}
	@BeforeTest
	public void IWillExecuteFirst() {
		System.out.println("I Will Execute First");
	}

}
