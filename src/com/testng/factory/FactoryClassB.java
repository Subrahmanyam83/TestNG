package com.testng.factory;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class FactoryClassB {
	
	private int m;
	@Factory(dataProvider = "dp")
	public FactoryClassB(int n) 
	{
	m=n;   
	}
	 
	@DataProvider(name="dp")
	static public Object[][] dp() {
	  return new Object[][] {
	    new Object[] { 10 },
	    new Object[] { 7 },
	    new Object[] { 6 },
	    new Object[] { 23 },
	    new Object[] { 65 }
	  };
	  }
	
	
	//@org.testng.annotations.Test
	@org.testng.annotations.Test
	public void Test()
	{
		int x;
		for (x= 1;x<=m; x++)
		{
			System.out.println("Calling "+x+"times");
		}
		System.out.println("End of "+x+ "loop");
	}
	}

