package com.testng2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class ClassI implements IAnnotationTransformer {
	
	@Override
	public void transform(ITestAnnotation itest, Class testClass, Constructor testConstructor, Method method) {
		if ((method.getName().equals("check"))) {
			((ITestAnnotation) itest).setInvocationCount(5);
			
		}
	}
}
