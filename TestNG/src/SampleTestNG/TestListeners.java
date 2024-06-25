package SampleTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestListeners {
	
	@Test
	public void test() {
		System.out.println("This is for passed script");
	}
	
	@Test
	public void test1() {
		System.out.println("This is for failed script");
		Assert.assertTrue(false);
	}

}
