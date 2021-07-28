package com.ss.cfsd.m6;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	Calculator obj = new Calculator();

	@Test
	public void add() {
		assertEquals(new Integer(4), obj.add(1, 3));
	}
	
	@Test
	public void subtract() {
		assertEquals(new Integer(7), obj.subtract(11, 4));
	}
	
	@Test
	public void multiply() {
		assertEquals(new Integer(64), obj.multiply(8, 8));
	}
	
	@Test
	public void divide() {
		assertEquals(new Integer(9), obj.divide(81, 9));
	}
}
