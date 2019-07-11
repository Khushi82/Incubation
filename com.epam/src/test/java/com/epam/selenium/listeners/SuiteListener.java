package com.epam.selenium.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteListener implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		System.out.println("Suite Started");
		
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("Suite Ended");		
	}

}
