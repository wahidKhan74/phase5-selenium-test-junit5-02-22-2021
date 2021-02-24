package com.ecommerce.test.web.external.elements;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class BrowserWindowTest {
	
	final String siteURL = "https://www.amazon.in/";
	final String driverPath = "/home/wahidkhan74gmai/selenium-workspace/phase5-selenium-test-junit5-02-22-2021/driver/geckodriver";
	WebDriver driver;

	@BeforeEach
	void setUpForDriverAndBrowserLaunch() {
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.get(siteURL);
	}

	@AfterEach
	void tearDown() {
		driver.close();
	}

	@Test
	@DisplayName("Test :: Browser Location Popup")
	void testToVerifyLocationWindowWithAmazon() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("nav-global-location-slot")).click();
		Thread.sleep(3000);
		
		//1. find main window
		String mainWindow = driver.getWindowHandle();
		
		//2. get all windows
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		
		while(itr.hasNext()) {
			String childWindow = itr.next();
			driver.switchTo().window(childWindow);
			
			// find new popup window elements
			driver.findElement(By.id("GLUXZipUpdateInput")).sendKeys("500038");
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("#GLUXZipUpdate > span > input")).click();
		}
		
		driver.switchTo().window(mainWindow);
		Thread.sleep(3000);
	}

}
