package com.epam.selenium.listeners;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Hookable implements IHookable {

	@Override
	public void run(IHookCallBack callBack, ITestResult testResult) {

		Object[] p = callBack.getParameters();
		if(p[0].equals("abc"))
		{
			System.out.println("ignored due to invalid");
		}
		else
		{
			callBack.runTestMethod(testResult);
		}
		
	}
	@Test(dataProvider="dp")
	public void printUser(String name,String lastName)
	{
		System.out.println(name+" "+lastName);
	}
	@DataProvider(name="dp")
	public Object[][] dataProvider()
	{
		return new Object[][] {{"abc","xyz"},{"hello","bello"}};
		
	}

}
