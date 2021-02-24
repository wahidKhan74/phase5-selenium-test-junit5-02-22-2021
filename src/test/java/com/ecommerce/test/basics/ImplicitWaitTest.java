package com.ecommerce.test.basics;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class ImplicitWaitTest {

	final String siteURL = "https://www.amazon.in/";
	final String driverPath = "/home/wahidkhan74gmai/selenium-workspace/phase5-selenium-test-junit5-02-22-2021/driver/geckodriver";
	WebDriver driver;

	@BeforeEach
	void lauchBrowser() {
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(siteURL);
	}

	@AfterEach
	void closeBrowser() {
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
	
}
