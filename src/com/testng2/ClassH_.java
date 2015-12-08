package com.testng2;

import org.testng.TestNG;

public class ClassH_ {

	public static void main(String[] args) 
	{				
	/*	XmlSuite suite = new XmlSuite();
		suite.setName("Sui");
		suite.setName("Sui");
		
		XmlTest test = new XmlTest(suite);
		test.setName("Test1");*/
			
		Class[] classes = new Class[1];
	    classes[0] = com.testng1.ClassA.class;
		//classes[1] = ClassJ.class;
		/*classes.add(new XmlClass("com.testng1.ClassA"));
		test.setXmlClasses(classes);*/
		
	/*	List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);*/
		TestNG tng = new TestNG();
		
		//tng.setXmlSuites(suites);
		tng.setTestClasses(classes);
		tng.run();
	}
}







