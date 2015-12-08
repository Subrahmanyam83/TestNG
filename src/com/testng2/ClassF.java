package com.testng2;

import org.testng.annotations.Test;

public class ClassF {
	
	@Test (threadPoolSize = 3, invocationCount = 10,  timeOut = 20)

	public void F()
	{
		System.out.println("Printing F" );
		
	}

}
