package com.testng.test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite()
	public void beforeSuite(){System.out.println("Running Before Suite");}
	
	@BeforeTest
	public void beforeTest(){ System.out.println("Running Before Test");}

	
	@BeforeClass
	public void beforeClass() {System.out.println("Running Before Class");}
	
	@BeforeMethod
	public void beforeMethod(){ System.out.println("Running Before Method");}
	
	

	
	@Test(alwaysRun =true )
	private void testingOne() {System.out.println("XTR");}
	
	@Test
	public void testingTwo() {System.out.println("Running Test Two");}
	
	@Test
	public void testingThree() {System.out.println("Running Test Three");}
	
	
	
	
	
	@AfterMethod
	public void afterMethod() {System.out.println("Running After Method");}
	
	@AfterClass
	public void afterClass(){ System.out.println("Running After Class");}
	
	@AfterTest
	public void afterTest() {System.out.println("Running After Test");}
	
	@AfterSuite	
	public void afterSuite(){System.out.println("Running After Suite");	}

}
