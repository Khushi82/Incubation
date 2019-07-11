package com.epam.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SetUp {
	
	WebDriver driver;
	public WebDriver setUp()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Khushi_Varshney\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		return driver = new FirefoxDriver();
		
	}
}
