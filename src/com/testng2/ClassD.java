package com.testng2;

import org.testng.annotations.Test;

public class ClassD {
	
	@Test(groups = {"checkintest", "broken"} )
	public void testMethod1() {
		
		System.out.println("Executing testMethod1");
	}
	
	
	@Test(groups = {"checkintest", "Live" } )
	public void testMethod2() {
		
		System.out.println("Executing testMethod2");
	}
	
	@Test(groups = {"checkintest", "Sanity" } )
	public void testMethod3() {
		
		System.out.println("Executing testMethod3");
	}
	
	@Test(groups = {"checkintest","UAT" } )
	public void testMethod4() {
		
		System.out.println("Executing testMethod4");
	}

	

}
