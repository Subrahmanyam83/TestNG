package com.testng2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassC {

	@Parameters({"firstname","secondname"})
	@Test(invocationCount =10)
	
	public void C1 (String firstname, String secondname)
	{
		System.out.println("First Name is "+ firstname);
		System.out.println("Second Name is"+ secondname);
	}
	
	@Parameters({"firstname","secondname"})
	@BeforeClass
	public void abc(@Optional("sql")String firstname, String secondname)
	{
		System.out.println(firstname + secondname);
	}
}
