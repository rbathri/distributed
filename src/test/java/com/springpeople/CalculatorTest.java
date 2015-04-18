package com.springpeople;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calculator;
	@Before
	public void init()
	{
		calculator=new Calculator();
	}
	@Test
	public void testAdd()
	{
		Assert.assertEquals(5, calculator.add(2, 3));
		
	}
	
	@Test
	public void testMultiply()
	{
		Assert.assertEquals(6, calculator.multiply(2, 3));
		
	}
	
	@After
	public void clear()
	{
		calculator=null;
	}

}
