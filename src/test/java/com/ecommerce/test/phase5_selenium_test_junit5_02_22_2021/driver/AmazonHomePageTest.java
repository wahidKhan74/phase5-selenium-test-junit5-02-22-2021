package com.ecommerce.test.phase5_selenium_test_junit5_02_22_2021.driver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class AmazonHomePageTest {
	
	final String siteURL = "https://www.amazon.in/";
	final String driverPath = "/home/wahidkhan74gmai/selenium-workspace/phase5-selenium-test-junit5-02-22-2021/driver/geckodriver";
	WebDriver driver;
	
	@BeforeEach
	void setUpForDriverAndBrowserLaunch() {
		// setup selenium system properties
		System.setProperty("webdriver.gecko.driver", driverPath);
		// create instance for firefox
		driver = new FirefoxDriver();
		// launch Browser
		driver.get(siteURL);
	}

	@AfterEach
	void tearDown() {
//		driver.quit();
		driver.close();
	}

	@Test
	@DisplayName("Test :: Amazon Hme Page Title")
	void testAmazonHomePageTitle() {
		String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actual = driver.getTitle();
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Test :: Amazon Hme Page Source URL")
	void testAmazonHomePageSourceURL() {
		String expected = siteURL;
		String actual = driver.getCurrentUrl();
		assertEquals(expected, actual);
	}

}
