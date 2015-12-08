package com.testng.factory;

import org.testng.annotations.Factory;

public class FactoryClassA {
	 @Factory
		 public Object[] createInstances() {
		   Object[] result = new Object[3]; 
		   for (int i = 0; i < 3; i++) {
		      result[i] = new TestClass((i+1) * 10);
		    }
		    return result;
		  }
		}
