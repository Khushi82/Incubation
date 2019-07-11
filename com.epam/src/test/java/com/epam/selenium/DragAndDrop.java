package com.epam.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {

	SetUp setUp = new SetUp();
	WebDriver driver = setUp.setUp();
	
  @Test
  public void dragAndDrop() {
	  
	  driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebElement source = driver.findElement(By.xpath("//img[@id='drag1']"));
	  WebElement dest = driver.findElement(By.xpath("//div[@id='div1']"));
	  Actions ac = new Actions(driver);
	  ac.dragAndDrop(source, dest).click();
  }
}
