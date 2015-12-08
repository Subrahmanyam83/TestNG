package com.testng.factory;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {
	
	
	 private int m_numberOfTimes;
	  public TestClass(int numberOfTimes) {
	    m_numberOfTimes = numberOfTimes;
	  }
	  
	  @BeforeMethod
	  public void callBefore()
	  {
		System.out.println("In Before Method");
	  }
	 
	  @Test
	  public void testServer() {
		  int i;
	   for ( i = 0; i < m_numberOfTimes; i++) {
	    System.out.println("Called "+(i+1)+"times");
	    }
	   System.out.println("***********************");
	   System.out.println("End of "+i+"loop");
	  }

	  @AfterMethod
	  public void callAfter()
	  {
		System.out.println("Calling After Method");
	  }
	  
}
