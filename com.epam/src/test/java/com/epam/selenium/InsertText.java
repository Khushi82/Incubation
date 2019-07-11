package com.epam.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class InsertText {
	
	SetUp setup = new SetUp();
	WebDriver driver=setup.setUp();
  @Test
  public void insertThroughJS() {
	  driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("document.getElementById('identifierId').value='khushivarshney@gmail.com';");

	 
  }
  @Test
  public void insertThroughActions() {
	  
	  driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	    Actions act = new Actions(driver);
	    WebElement ele =driver.findElement(By.xpath("//input[@id='identifierId']"));
		System.out.println(act.sendKeys("khushivarshney@gmail.com")); 
  }
}
