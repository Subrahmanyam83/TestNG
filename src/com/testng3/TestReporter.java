package com.testng3;

import junit.framework.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({com.testng3.Reporter.class})
public class TestReporter {

	@Test(invocationCount =10)
	public void passedTest()
	{
	Assert.assertEquals("Hi", "Hii");		
	}
	
	@Test
	public void failedTest()
	{
	Assert.assertEquals("Hi", "Hi");		
	}
	
	@Test()
	public void skipTest()
	{
	throw new SkipException(null);
	}	
}
