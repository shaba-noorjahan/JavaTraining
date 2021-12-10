package com.testcase.dec9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/shazeena/Desktop/TestSelenium/Resource/chromedriver" );
		
		//gettitle findElement click sendkeys
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://login.yahoo.com");
		System.out.println(driver.getTitle());
		
		WebElement username = driver.findElement(By.id("login-username"));
		username.sendKeys("shaba_noorjahan@mystiquex.com");
		
		WebElement nextBtn=driver.findElement(By.id("login-signin"));
		nextBtn.click();

	}

}
