package com.selenium.dec21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/shazeena/Desktop/TestSelenium/Resource/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/frames");
		//*[@id="framesWrapper"]/div[1]
        System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Sample Iframe page There')]")).getText());
        
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));
        
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		driver.switchTo().parentFrame();
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Sample Iframe page There')]")).getText());
	}
	}


