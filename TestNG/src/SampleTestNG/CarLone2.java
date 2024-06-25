package SampleTestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class CarLone2 {
	@AfterSuite
	public void Asuite() {
		System.out.println("I will Execute in sute at last no 1");
	}
	
		@Test(priority = 0)
		public void webCarLone() {
			System.out.println("webCarLone");

		}
	
		@Test(priority = 1)
		public void MobileCarLone() {
			System.out.println("MobileCarLone");
		}
		@Test(priority = 2)
		public void APICarLone() {
		}
	}


