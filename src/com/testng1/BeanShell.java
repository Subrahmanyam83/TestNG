package com.testng1;

import org.testng.annotations.Test;

public class BeanShell {
	
	@Test(groups = {("Sanity"),("UAT")})
	public void abc1()
	{
		System.out.println("Executing Sanity and UAT Test Cases");
	}
	
	
	@Test(groups = {("Functional"),("Sanity")})
	public void abc2()
	{
		System.out.println("Executing Sanity and Functional Test Cases");
	}
	
	@Test(groups = {("Functional"),("UAT")})
	public void abc3()
	{
		System.out.println("Executing Functional and UAT Test Cases");
	}

}
