package com.shaba.maven_1.JunitMokito;

public class Calculator {

	CalculatorService service;
	public Calculator(CalculatorService service)
	{
		
		this.service=service;
		}
	public int perform(int i,int j)
	{
		return service.add(i, j)*i;
	}
	
	
	

}
