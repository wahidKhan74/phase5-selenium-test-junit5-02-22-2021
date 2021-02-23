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
import org.openqa.selenium.support.ui.Select;

class SelectDropDownTest {

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
	@DisplayName("Test :: For Select First Element")
	void testForFirstSelectOption() throws InterruptedException {
		
		WebElement select = driver.findElement(By.id("vehicle"));		
		Select vehicleSelect = new Select(select);
		vehicleSelect.selectByVisibleText("Bike");
		
		WebElement selectedElm = vehicleSelect.getFirstSelectedOption();		
		assertEquals("Bike", selectedElm.getText());
		
		Thread.sleep(3000);
		
	}
	
	@Test
	@DisplayName("Test :: For Select 2nd Index Element")
	void testForSecondIndexSelectOption() throws InterruptedException {
		
		WebElement select = driver.findElement(By.id("vehicle"));		
		Select vehicleSelect = new Select(select);
		vehicleSelect.selectByIndex(2);
		
		WebElement selectedElm = vehicleSelect.getFirstSelectedOption();		
		assertEquals("Train", selectedElm.getText());
		
		Thread.sleep(3000);
		
	}

}
