package com.testng3;

import org.testng.annotations.Test;

    @Test (threadPoolSize = 3, invocationCount = 10,  timeOut = 10000) 
    public class ClassLevelAnnotation  {
	
	public void abc()
	{
		System.out.println("Executing abc");
	}

	public void xyz()
	{
		System.out.println("Executing xyz");
	}
}
