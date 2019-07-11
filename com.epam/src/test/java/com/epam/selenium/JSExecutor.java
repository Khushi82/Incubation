package com.epam.selenium;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class JSExecutor {

	SetUp setUp = new SetUp();
	WebDriver driver = setUp.setUp();

	@Test
	public void fluentWait() {
		driver.get(
				"https://autorqa.events.epam.com/");

		Wait wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.withMessage("time expired")
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(ElementNotVisibleException.class);
		WebElement el = (WebElement) wait.until(new Function<WebDriver,WebElement>(){

			@Override
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.xpath("//div[@class='evnt-card-cell']"));
			}
		});

	}

}
