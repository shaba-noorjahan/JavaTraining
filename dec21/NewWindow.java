package com.selenium.dec21;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","/Users/shazeena/Desktop/TestSelenium/Resource/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demoqa.com/browser-windows");
		String mainwindow=driver.getWindowHandle();
		driver.findElement(By.id("windowButton")).click();
		
		
		ArrayList<String> handles=new ArrayList<String>(driver.getWindowHandles());
		String window2=handles.get(1);
		for (String id:handles) {
			System.out.println(id);
		}
		driver.switchTo().window(window2);
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
	}
		
			
		}


