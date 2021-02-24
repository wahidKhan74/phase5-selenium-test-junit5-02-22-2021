package com.ecommerce.test.basics;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHomePageSourceTest {

	// 1. formulate test domain URL
	final String siteURL = "https://www.amazon.in/";
	final String driverPath = "/home/wahidkhan74gmai/selenium-workspace/phase5-selenium-test-junit5-02-22-2021/driver/geckodriver";

	@Test
	@DisplayName("Amazon Test :: Verification of Source URL")
	public void testAmazonHomeSourceURL() {

		// 2. set selenium properties
		System.setProperty("webdriver.gecko.driver", driverPath);

		// 3. Instantiating selenium web driver
		WebDriver driver = new FirefoxDriver();

		// 3.1 Launch browser
		driver.get(siteURL);
		
		assertEquals(siteURL, driver.getCurrentUrl());
		
		driver.close();

	}

}
