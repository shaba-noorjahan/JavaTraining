package com.selnium.dec16;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/shazeena/Desktop/TestSelenium/Resource/chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://demoqa.com/alerts");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("promtButton"))));
		
		//Wait fluentWait = (Wait) new FluentWait(driver)
		 //       .withTimeout(Duration.ofSeconds(30))
		  //      .pollingEvery(Duration.ofSeconds(5))
		  //      .ignoring(NoSuchElementException.class)
		   //     .until(ExpectedConditions.visibilityOf(driver.findElement(By.id("promtButton"))));
		
		
driver.findElement(By.id("promtButton")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Sending data to alert");
		driver.switchTo().alert().dismiss();
	}
		
		
		
	
		
		
		

	}


