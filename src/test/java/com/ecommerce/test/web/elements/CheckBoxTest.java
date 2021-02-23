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

class CheckBoxTest {

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
	@DisplayName("Test :: CheckBox Exist")
	void testToVerifyCheckBoxExist() {
		
		WebElement checkBox1 = driver.findElement(By.id("vehicle1"));
		assertEquals(true, checkBox1.isDisplayed());
		assertEquals(true, checkBox1.isEnabled());
		assertEquals(false, checkBox1.isSelected());
		
		// selected checkbox
		WebElement checkBox2 = driver.findElement(By.id("vehicle2"));
		assertEquals(true, checkBox2.isDisplayed());
		assertEquals(true, checkBox2.isEnabled());
		assertEquals(true, checkBox2.isSelected());
		
		WebElement checkBox3 = driver.findElement(By.id("vehicle3"));
		assertEquals(true, checkBox3.isDisplayed());
		assertEquals(true, checkBox3.isEnabled());
		assertEquals(false, checkBox3.isSelected());
	}
	
	@Test
	@DisplayName("Test :: CheckBox Click")
	void testToVerifyCheckBoxClick() {
		
		WebElement checkBox = driver.findElement(By.id("vehicle1"));
		checkBox.click();
		assertEquals(true, checkBox.isSelected());
		
	}
}
