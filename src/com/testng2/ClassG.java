package com.testng2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassG {
	
	@Test
	public void A()
	{
		System.out.println("Printing A");
		Assert.assertEquals(1, 0);
		
		
	}
	
	@Test
	public void B()
	{
		System.out.println("Printing B");
		Assert.assertEquals(1, 1);
		
	}

}
