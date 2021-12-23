package com.selenium.dec22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/shazeena/Desktop/TestSelenium/Resource/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.lambdatest.com/");
		
		Actions act=new Actions(driver);
		
		WebElement data=driver.findElement(By.xpath("//button[text()='Resources ']"));
		
		act.moveToElement(data).build().perform();

	}

}
