package com.epam.selenium.listeners;

import org.openqa.selenium.WebDriver;
import org.testng.IExecutionListener;
import org.testng.annotations.Test;

import com.epam.selenium.SetUp;

public class ExecutionListener implements IExecutionListener{


	@Override
	public void onExecutionStart() {
			System.out.println("Execution started");
		
	}

	@Override
	public void onExecutionFinish() {
			System.out.println("Execution ended");		
	}
}
