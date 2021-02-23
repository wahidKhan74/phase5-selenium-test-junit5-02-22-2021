package com.ecommerce.test.web.elements;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class RadioButtunTest {

	final String siteURL = "file:///home/wahidkhan74gmai/selenium-workspace/phase5-selenium-test-junit5-02-22-2021/static/radio-checkbox-button.html";
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
	@DisplayName("Test :: RadioButtons Exist")
	void testToVerifyRadioButtonsExist() {
		
		WebElement radio1 = driver.findElement(By.id("male"));
		assertEquals(true, radio1.isDisplayed());
		assertEquals(true, radio1.isEnabled());
		assertEquals(false, radio1.isSelected());
		
		WebElement radio2 = driver.findElement(By.id("female"));
		assertEquals(true, radio2.isDisplayed());
		assertEquals(true, radio2.isEnabled());
		assertEquals(false, radio2.isSelected());
		
		WebElement radio3 = driver.findElement(By.id("other"));
		assertEquals(true, radio3.isDisplayed());
		assertEquals(true, radio3.isEnabled());
		assertEquals(false, radio3.isSelected());
	}
	
	@Test
	@DisplayName("Test :: RadioButtons Click")
	void testToVerifyRadioButtonsClick() {
		
		WebElement radio1 = driver.findElement(By.id("male"));
		radio1.click();
		assertEquals(true, radio1.isSelected());
		
	}
	
	@Test
	@DisplayName("Test :: RadioButtons Click2")
	void testToVerifyRadioButtonsClick2() {
		
		WebElement radio2 = driver.findElement(By.id("female"));
		radio2.click();
		assertEquals(true, radio2.isSelected());
		
	}

}
