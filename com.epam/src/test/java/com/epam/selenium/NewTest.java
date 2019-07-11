package com.epam.selenium;

import org.testng.annotations.Test;

public class NewTest {
  @Test(testName="test1")
  public void test() {
	  System.out.println("you are in test 1");
  }
  
  @Test(testName ="test2")
  public void test2()
  {
	  System.out.println("You are in test 2");
  }
}
