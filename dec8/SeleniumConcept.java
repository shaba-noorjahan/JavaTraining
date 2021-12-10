package com.testcase.dec8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/shazeena/Desktop/TestSelenium/Resource/chromedriver" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.macys.com");
		String text = driver.findElement(By.xpath("//*[@id=\"flexid_22672\"]/a/span")).getText();
		System.out.println(text);		

	}

}
