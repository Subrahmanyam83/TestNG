package com.testng3;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DependentOnGroups {
	
	@Parameters({"name.1"})
	@Test(groups = {"main.1"})
	public void abc(String x)
	{
		String a = "Subrahmanyam1";
		Assert.assertEquals(x, a);
		System.out.println("Executing 1");
	}
	
	@Parameters({"name.2"})
	@Test(groups = {"main.2"})
	public void abc1(String y)
	{
		String b = "Subrahmanyam2";
		Assert.assertEquals(y, b);
		System.out.println("Executing 2");
	}

	@Test(dependsOnGroups = {"main.*"})
		public void check(){
		System.out.println("Executed 4");
	}

}
