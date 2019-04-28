package com.suite3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Google {

	@Test
	public void test3()
	{
		System.setProperty("webdriver.ie.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}
}
