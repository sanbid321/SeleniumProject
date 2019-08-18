package com.automation;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class TestngAssertsScript {

	@Test
	public void TestVerify()
	{
		Reporter.log("Before Validation");
//		TestngAsserts testAsserts = new TestngAsserts(111, "Santa");
//		TestngAsserts testngAsserts1 = new TestngAsserts(111, "Santa");
//		Assert.assertNotSame(testngAsserts1, testAsserts);
		Reporter.log("After Validation");
		
	}
}
