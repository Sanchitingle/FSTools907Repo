package com.nt.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void testSumWithPositives() {
		
		int x=100;
		int y=200;
		int expected=300;
		ArithmeticService ar=new ArithmeticService();
		int actual=ar.sum(x,y);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testSumWithNegatives() {
		
		int x=-100;
		int y=-200;
		int expected=-300;
		ArithmeticService ar=new ArithmeticService();
		int actual=ar.sum(x,y);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testSumWithMixedValues() {
		
		int x=-100;
		int y=200;
		int expected=100;
		ArithmeticService ar=new ArithmeticService();
		int actual=ar.sum(x,y);
		assertEquals(expected,actual);
	}
    
    }

