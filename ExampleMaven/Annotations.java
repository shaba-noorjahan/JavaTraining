package com.shaba.maven_1.ExampleMaven;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeTest
	public void before() {
		System.out.println("Before Test");
		
	}
    
	@AfterTest
	public void after() {
		System.out.println("After Test");
		
		}
	
	@Test
	public void test1() {
		System.out.println("Test1");
	}
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	
	
}
