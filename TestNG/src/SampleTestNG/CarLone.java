package SampleTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CarLone {
	@AfterSuite
	public void Asuite() {
		System.out.println("I will Execute in sute at last no 1");
	}
	
		@Test
		public void webCarLone() {
			System.out.println("webCarLone");

		}
		@AfterClass
		public void Aclass() {
			System.out.println("After class in perticular class");
		}

		@AfterMethod
		public void Amethot() {
			System.out.println("I will Execute at each time after method in carlone");
		}
		@Test
		public void MobileCarLone() {
			System.out.println("MobileCarLone");

		}
		@BeforeMethod
		public void Bmethot() {
			System.out.println("I will Execute at each time before method in carlone");
		}
		@BeforeClass
		public void Bclass() {
			System.out.println("Befoure class in perticular class");
		}

		@Test(groups= {"smoke"})
		public void APICarLone() {
			System.out.println("APICarLone");

		}
		@BeforeSuite
		public void Bsuite() {
			System.out.println("I will Execute in sute at First no 1");
		}
		

	}


