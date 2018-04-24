package com.test;

import org.junit.Assert;
import org.junit.Test;

public class JunitTest {

	@Test
	public void junitTest() {
		System.out.println("yes 1==1");
		Assert.assertTrue(1==1);
	}
	@Test
	public void junitTest1() {
		Assert.assertFalse(1==2);
		System.out.println("no 1 != 2");
	}
	
}
