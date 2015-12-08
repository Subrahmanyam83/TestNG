package com.testng3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameterization {
	
@Test(dataProvider="abc")
	
public void xyz (String username, String password, String email)
	
	{
		System.out.println(username + "---" +password +  "----" + email);
		System.out.println("hiiii");
	}

@DataProvider
public Object[][] abc()

{
	Object[][] data = new Object[2][3];
	
	// Data Set 1
	data[0][0]= "username1";
	data[0][1]= "password1";
	data[0][2]="email1";
	
	//Data Set 2
	
	data[1][0]= "username2";
	data[1][1]= "password2";
	data[1][2]="email2";
	
	return data;
}
}
