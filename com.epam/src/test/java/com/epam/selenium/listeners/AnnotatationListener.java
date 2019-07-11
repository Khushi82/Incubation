package com.epam.selenium.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import com.epam.selenium.dataproviders.*;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

import com.epam.selenium.dataproviders.DataProviders;

public class AnnotatationListener implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

		if(testMethod.getName().equals("a"))
		{
			System.out.println(testMethod.getName());
			annotation.setEnabled(false);
		}
		
		
		else if (testMethod.getName().equals("b"))
		{
			annotation.setDataProvider("f");
			annotation.setDataProviderClass(DataProviders.class);
		}
		
	}

}
