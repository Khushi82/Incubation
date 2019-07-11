package com.epam.selenium;

import java.awt.List;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * actions
 * normal sendkeys
 * jsexecutor 
 * list
 * select 
 * */

public class DropDown {

	SetUp set = new SetUp();
	WebDriver driver = set.setUp();
	WebElement element;
	@BeforeMethod
	public void beforeMethod()
	{
		driver.get("https://www.cleartrip.com/");	
		element=driver.findElement(By.xpath("//select[@id='Adults']"));
	}
	
	
	@Test(enabled=false)
	public void actions() {
	
		Actions action = new Actions(driver);
		action.moveToElement(element).click();
		action.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN);
		action.sendKeys(Keys.RETURN);
		action.build().perform();
	}
	
	@Test(enabled=true)
	public void select()
	{
		Select select = new Select(element);
		select.selectByIndex(2);
		java.util.List<WebElement> list = select.getOptions();
		for(WebElement el : list)
		{
			System.out.println(el.getText());
			if(el.getText().equals("4"))
				el.click();
		}
		
	}
	@Test(enabled=false)
	public void jsExecutor()
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('Adults').options[4].text");
	}
	
	

}
