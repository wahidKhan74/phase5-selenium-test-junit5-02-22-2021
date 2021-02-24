package com.ecommerce.test.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StandardJunitTest {

	@BeforeAll
	static void setUpBeforeClass() {
		System.out.println("-- Before All Test --- ");
	}

	@AfterAll
	static void tearDownAfterClass(){
		System.out.println("-- After All Test --- ");
	}

	@BeforeEach
	void setUp() {
		System.out.println("-- Before Each Test --- ");
	}

	@AfterEach
	void tearDown()  {
		System.out.println("-- After Each Test --- ");
	}

	@Test
	void testCall1() {
		System.out.println("-- Test Call 1--- ");
	}
	
	@Test
	void testCall2() {
		System.out.println("-- Test Call 2--- ");
	}

}
