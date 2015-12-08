package com.testng1;

import org.testng.annotations.Test;

public class ClassB 
{
	
	@Test(groups={"nokia.test"} )
	
	public void B1()
	{
		System.out.println("Executing B1");
	}
	
	public void B2()
	{
		System.out.println("Executing B2");
	}
	
	
	@Test(groups={"blackberry.test"})
	
	public void B3()
	{
		System.out.println("Executing B3");
	}
	
	public void B4()
	
	{
		System.out.println("Executing B4");
	}
	
	
	

}
