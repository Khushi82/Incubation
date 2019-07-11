package com.epam.selenium.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Testlistener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test started"+ result.getTestName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test succeded "+ result.getTestName());		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test failes "+ result.getTestName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped "+ result.getTestName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("test slightly failed "+ result.getTestName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("test started "+ context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test finished"+ context.getName());
		
	}

}
