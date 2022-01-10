package test.cucumber.ProjectCucumber;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DefClass {
	
     static WebDriver driver;
    @Given("I want to launch the browser")
	public void step1() {
    	System.setProperty("webdriver.chrome.driver","chromedriver" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
    	 System.out.println("step1");
	}
    @And("Launch the ecom website")
    public void step2() {
    	System.out.println("step 2 ");
    }
      @And("Login into the application")
      public void step3() {
    	  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
  		
  		driver.findElement(By.name("password")).sendKeys("secret_sauce");
  		
  		driver.findElement(By.id("login-button")).click();
  		
    	  System.out.println("step3");
    	  
      }
      @When("I click on dropdown filter") 
      public void step4() {
    	  Select s=new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
  		  s.selectByIndex(1);
    	  System.out.println("step4");
    	  
      }
      @And("select the data")
      public void step5() {
    	  System.out.println("step5"); 
    	  
      }
     @Then("")
     public void step6() {
    	 System.out.println("step6"); 
    	 
     }
     @And("validate the filtered data")
     public void step7() {
    	 System.out.println("I completed the test"); 
    	 
     }
     
}
