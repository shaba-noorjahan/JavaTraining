package com.shaba.maven_1.ExampleMaven;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class XampleTest {
	private static final boolean False = false;
	static WebDriver driver;
	SoftAssert sa;
	@Test(priority=0)
	public void launchURL() {
		
		System.setProperty("webdriver.chrome.driver","chromedriver" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		//driver.quit();
		
		}
    @Test(priority=1)
    
	public void login() {
		String title=driver.getTitle();
		
		AssertJUnit.assertEquals("Swag Labs",title);
		
		sa=new SoftAssert();
		
		//sa.assertEquals(title,"Swag Labs","Login page title");
		System.out.println("::::::"+driver.findElement(By.id("login-button")).isDisplayed());
		//Reporter.log("login page testing started");
		Reporter.log(title);
		Reporter.log(driver.findElement(By.id("login_credentials")).getText());
		
		Utility.validateData(title,"Swag Labs","login page title");
		Utility.validateData(title,"Swag Labs","dropDown page title");
		
		//sa.assertTrue(driver.findElement(By.id("Login-button")).isDisplayed());
		//AssertJUnit.assertTrue("login button visible",false);
		
		//System.out.println(":::: "+driver.findElement(By.xpath("//*[@id=\"login_credentials\"]/text()[1]")).getText());
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
       // System.out.println(":::: "+driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/text()")).getText()); 	
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		Reporter.log("login page testing ended");
		
	}
	@Test(priority=2)
	public void dropDown() {
		
		Select s=new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		s.selectByIndex(2);
		//sa.assertAll();
		driver.quit();
		}
	public void After(){
		sa.assertAll();
		
	}
}
