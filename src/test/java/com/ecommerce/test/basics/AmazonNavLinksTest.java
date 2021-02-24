package com.ecommerce.test.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class AmazonNavLinksTest {

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
	@DisplayName("Test : Mobile Link Verification")
	void testMobileNavigationLink() {
		WebElement mobileLink = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(3)"));
		mobileLink.isDisplayed();
		mobileLink.isEnabled();
		mobileLink.click();		
		String expected = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		assertEquals(expected, driver.getTitle());
	}
	
	@Test
	@DisplayName("Test : Todays Deals Link Verification")
	void testTodayDealNavigationLink() {
		WebElement mobileLink = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(4)"));
		mobileLink.isDisplayed();
		mobileLink.isEnabled();
		mobileLink.click();		
		String expected = "Amazon.in Today's Deals: Great Savings. Every Day.";
		assertEquals(expected, driver.getTitle());
	}

	// TODO :: WAT for all possible nav links (min 5 more links)
	
}
