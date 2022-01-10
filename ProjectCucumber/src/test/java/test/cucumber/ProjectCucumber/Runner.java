package test.cucumber.ProjectCucumber;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(features="FeatureFile",glue= {"test.cucumber.ProjectCucumber"},
plugin= {"pretty","html:files/Report.html"})
public class Runner extends AbstractTestNGCucumberTests{
	@Test
	public void t1() {

	
	
	
	

	
	}

}
