package com.epam.selenium.dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
  @DataProvider(name="dp1")
  public Object[][] f() {
	  return new Object[][]{{"Hello"},{"Bello"}};
  }
}
