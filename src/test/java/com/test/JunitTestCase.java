package com.test;

import org.junit.Assert;
import org.junit.Test;


public class JunitTestCase {
	
	@Test
	public void junitTest()  {
		Assert.assertTrue("hikrutika".equals("hi"));
		System.out.println("Test case executed...");
	}
}
