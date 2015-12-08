package com.testng3;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Reporter extends TestListenerAdapter{
	
	  @Override
	  public void onTestFailure(ITestResult tr) {
	    System.out.println("Fail");
	  }
	 
	  @Override
	  public void onTestSkipped(ITestResult tr) {
		System.out.println("Skipped");
	  }
	 
	  @Override
	  public void onTestSuccess(ITestResult tr) {
		  System.out.println("Passed");
	  }

}
