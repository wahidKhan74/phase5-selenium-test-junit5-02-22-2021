package com.ecommerce.test.web.external.screenshot;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

class BrowserWindowsScreenShotTest {


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
	@DisplayName("Test :: Amazon Home Page Screen Shot")
	void testToTakeScreenShotOfAmazonHomePage() throws IOException {
		
		// type cast driver object to screen shot object
		TakesScreenshot tsc = (TakesScreenshot) driver;
		
		// take screen shot as file
		File src = tsc.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("/home/wahidkhan74gmai/selenium-screenshots/amazon.in.png"));
		
	}

}
