package com.assignment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaxServiceTest {

	@Autowired
	TaxService taxService;

	// Test case for happy scenario 1
	@Test
	void testGetCalculatedTaxSlab1() {
		assertEquals(0d,this.taxService.getCalculatedTax(1200d));
	}

	// Test case for happy scenario 2
	@Test
	void testGetCalculatedTaxSlab2() {
		assertEquals(1200d,this.taxService.getCalculatedTax(12000d));
	}


	// Test case for happy scenario 3
	@Test
	void testGetCalculatedTaxSlab3() {
		assertEquals(6600d,this.taxService.getCalculatedTax(33000d));
	}

	// Test case for failure scenario
	@Test
	void testGetCalculatedTaxFailure() {
		assertEquals(1200d, this.taxService.getCalculatedTax(13000d));
	}


}
