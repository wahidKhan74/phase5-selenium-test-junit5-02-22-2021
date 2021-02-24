package com.ecommerce.test.web.external.elements;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class AlertTest {

	final String siteURL = "file:///home/wahidkhan74gmai/selenium-workspace/phase5-selenium-test-junit5-02-22-2021/static/javascript-alert.html";
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
	@DisplayName("Test :: Java Script Alert Window")
	void testAlertDailogWindow() throws InterruptedException {
		
		WebElement alertButton = driver.findElement(By.cssSelector("body > p:nth-child(4) > button"));
		alertButton.click();
		
		// Switch to alert
		Alert alert = driver.switchTo().alert();		
		assertEquals("Are you sure !", alert.getText());
		Thread.sleep(3000);
		alert.accept();
	}
	
	
	@Test
	@DisplayName("Test :: Java Script Confirmation Window with Accept")
	void testAlertConfirmationDailogWindow() throws InterruptedException {
		
		WebElement confirmButton = driver.findElement(By.cssSelector("body > p:nth-child(2) > button"));
		confirmButton.click();
		
		// Switch to alert
		Alert alert = driver.switchTo().alert();		
		assertEquals("Press a button !", alert.getText());
		Thread.sleep(3000);
		alert.accept();
	}
	
	@Test
	@DisplayName("Test :: Java Script Confirmation Window with Dismiss")
	void testAlertConfirmationDailogWindow2() throws InterruptedException {
		
		WebElement confirmButton = driver.findElement(By.cssSelector("body > p:nth-child(2) > button"));
		confirmButton.click();
		
		// Switch to alert
		Alert alert = driver.switchTo().alert();		
		assertEquals("Press a button !", alert.getText());
		Thread.sleep(3000);
		alert.dismiss();
	}

}
