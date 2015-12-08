package com.testng.test;

public class Class1 {

	@Test(dataProvider="abc")
	public void xyz (String username, String password, String email) {
		System.out.println(username + "---" +password + "----" + email);
		System.out.println("hiiii"); }
	@DataProvider public Object[][] abc() {
		Object[][] data = new Object[2][3];
		return data;
	}

}
