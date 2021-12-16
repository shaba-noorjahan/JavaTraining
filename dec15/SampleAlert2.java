package com.selenium.dec15;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SampleAlert2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/shazeena/Desktop/TestSelenium/Resource/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("promtButton")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Sending Data to Alert");
		driver.switchTo().alert().accept();
		
         
	}

}
