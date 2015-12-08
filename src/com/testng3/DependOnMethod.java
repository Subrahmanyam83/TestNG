/*package com.testng3;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DependOnMethod {
	
	
	@Parameters ({"One"})
	@Test (groups = {"GROUP1"} )
	public void main_function(String name)
	{
		System.out.println("Executing 'main_function' method");
		String a = "subrahmanyam1";
		Assert.assertEquals(name, a);
	
		
	}
	
	@Test (dependsOnMethods = {"main_function"})
	public void sub_function()
	{
		System.out.println("Executing 'sub_function' method");
	
	}

}*/
