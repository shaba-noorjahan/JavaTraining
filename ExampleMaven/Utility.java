package com.shaba.maven_1.ExampleMaven;

import org.testng.Reporter;

import junit.framework.Assert;

public class Utility {
	public static void validateData(String actual, String exp,String msg) {
		//Assert.assertTrue("login button visibility",false);
		Assert.assertEquals(actual,exp);
		Reporter.log(msg+"passed");
		
		
		
		
		
		
	}

	

	
	}

	
	


