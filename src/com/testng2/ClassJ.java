package com.testng2;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;

@Listeners({com.testng2.ClassI.class})
public class ClassJ {
	
	
	@Test(invocationCount =10)
	public void check()
	{
		System.out.println("In Check");
		Reporter.log("Check Was Called");
	}
}
