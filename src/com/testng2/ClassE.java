package com.testng2;

import org.testng.annotations.Test;

public class ClassE {
	
	@Test (alwaysRun = true)
	public void abc()
	{
		System.out.println("Executing abc");
	}

	@Test (dependsOnMethods={"abc"})
	public void def() 
	{
		System.out.println("Executing def");
	}
	
	@Test()	
	public void b()
	{
		System.out.println("Executing B");
	}
}
