package com.testng1;

import org.testng.annotations.Test;

public class ClassA 
{

	@Test (groups={"Samsung"} )
	
	public String  B1()
	{
		System.out.println("Executing Samsung");
		String a = "abc";
		return a;
	}
	
	
	@Test (groups={"HTC"})
	
	public void B2()
	{
		System.out.println("Executing HTC");
	}
	
	
	
	@Test(groups={"Vodafone"})
	
	public void B3()
	{
		System.out.println("Executing Vodafone");
	}
	
	
	
	@Test(groups={"Airtel"})
	public void B4()
	
	{
		System.out.println("Executing Airtel");
	}
	
	
	
}
