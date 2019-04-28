package com.suite2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Snapdeel {

	@Test
	public void test2()
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.snapdeal.com");
		driver.quit();
	}
}
