package com.shaba.maven_1.JunitMokito;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	
	Calculator c=null;
	CalculatorService service= mock(CalculatorService.class);
	@Before
	public void setUp()
	{
		c=new Calculator(service);
		
	}
	
	    
	     @Test
			public void add()
			{
		when(service.add(2, 3)).thenReturn(5);
		assertEquals(10,c.perform(2, 3));
	}

	     
	     
}
