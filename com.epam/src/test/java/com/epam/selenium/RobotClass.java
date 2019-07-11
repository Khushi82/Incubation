package com.epam.selenium;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.InputEvent;

import javax.print.DocFlavor.INPUT_STREAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RobotClass {

	SetUp setUp = new SetUp();
	WebDriver driver = setUp.setUp();

	@Test
	public void f() throws AWTException {

		driver.get("https://www.cleartrip.com/");
		Robot robot = new Robot();
		// Rectangle screenRect = new Rectangle(5, 5, 5, 5);
		// //robot.createScreenCapture(screenRect);
		// System.out.println(robot.getPixelColor(10,100));
		// robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		WebElement element = driver.findElement(By.xpath("//select[@id='Adults']"));
		org.openqa.selenium.Point p = element.getLocation();
		int x = p.getX();
		int y = p.getY();
		robot.mouseMove(x, y);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	}
}



/*
 * xpaths
 * 
 * xpath /following-sibling::*
 * xpath..
 * xpath/parent:::*
 * xpath/preceding-sibling::*
 * 
 * 
 * 
 * 
 * 
 * */
 