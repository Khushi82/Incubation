package com.epam.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import bsh.classpath.BshClassPath.GeneratedClassSource;

@Test
public class ScreenShot {
 
	SetUp setUp = new SetUp();
	WebDriver driver = setUp.setUp();
	
	@Test(testName= "a")
	public void takeScreenShot() throws IOException
	{
		driver.get("https://mvnrepository.com/artifact/org.apache.commons/commons-io/1.3.2");
		this.takeSS(driver,"C:\\Users\\Khushi_Varshney\\Downloads\\SS");
	}

	private void takeSS(WebDriver driver, String path) throws IOException {
		
		
		TakesScreenshot ss= (TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File target = new File(path) ;
		FileUtils.copyFileToDirectory(source, target);
		
			
	}
	
	@Test(testName="b")
	public void takeSc1(String name) throws IOException
	{
		driver.get("https://www.google.com/");
		System.out.println(name);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(name);
		
	}


	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}
