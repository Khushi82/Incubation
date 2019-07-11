package com.epam.selenium;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class DownloadFolder {
	@Test
	public void setCapability() {

		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile fProfile = new FirefoxProfile();
		fProfile.setPreference("browser.download.folderList", 2);
		fProfile.setPreference("browser.download.manager.showWhenStarting", false);
		fProfile.setPreference("browser.download.dir", "C:\\Users\\Khushi_Varshney\\Downloads\\SS");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Khushi_Varshney\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://unsplash.com/search/photos/download");
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		WebElement elelment = (WebElement) wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {

				return driver.findElement(By.xpath("//img[@alt='two green parrots perched on tree branch during daytime']"));
			}
		});
		
		
		System.out.println(elelment.getText());
		elelment.click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class='_2Aga-']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			System.out.println(string);
		}
		/*WebElement ele = (WebElement) driver.switchTo().alert();
		System.out.println(ele.getText());
		ele.sendKeys(Keys.TAB);
		ele.sendKeys(Keys.RETURN);
		ele.click();*/
	}
}
