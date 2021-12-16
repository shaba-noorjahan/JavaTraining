package com.selenium.dec15;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/shazeena/Desktop/TestSelenium/Resource/chromedriver" );
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoqa.com/browser-windows");
System.out.println("1: "+driver.getWindowHandle());
driver.findElement(By.id("tabButton")).click();
driver.findElement(By.id("tabButton")).click();
ArrayList<String> list=new ArrayList<String>(driver.getWindowHandles());
for(String a:list) {
System.out.println(a);
}
//System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Click Button')]")).getText());
//driver.switchTo().window(list.get(1));
//System.out.println(driver.findElement(By.id("sampleHeading")).getText());
//driver.switchTo().window(list.get(0));


}

	}


