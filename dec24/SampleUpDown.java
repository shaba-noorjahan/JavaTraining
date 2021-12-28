package com.shaba.dec24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleUpDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/shazeena/Desktop/TestSelenium/Resource/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
		WebElement user = driver.findElement(By.id("user-name"));
		user.sendKeys("Hello");
		
		Actions act=new Actions(driver);
		act.click(user).build().perform();
		//act.sendKeys(user,"Hello");
		act.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).build().perform();
		//Keys.COMMAND
		act.keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).build().perform();
		
		act.sendKeys(Keys.TAB).build().perform();
		act.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).build().perform();
	}

}
