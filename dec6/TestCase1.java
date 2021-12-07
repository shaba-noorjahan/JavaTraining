package com.shaba.dec6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.setProperty("webdriver.chrome.driver","/Users/shazeena/Desktop/SeleniumTraining/Resource/chromedriver" );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		WebElement user=driver.findElement(By.xpath("//div[@class='form_group']"));
		user.sendKeys("shaba");
		

	}

}
