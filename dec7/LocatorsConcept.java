package com.testcase.dec7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	public static void main(String[] args) {
		
		//get currenturl close
		
		System.setProperty("webdriver.chrome.driver","/Users/shazeena/Desktop/TestSelenium/Resource/chromedriver" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		
		
				
		
		
	}

}
