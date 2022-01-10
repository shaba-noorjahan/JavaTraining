package test.cucumber.ProjectCucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DefOutline {

	@Given("^I want to write a step with ([^\"]*)$")
	public void step1(String name) {
		System.out.println(name);
	}

	@Then("^I verify the ([^\"]*) in step$")
	public void step3(String name) {
		System.out.println(name);
	}
	
	@When("I check for the {int} in step")
	public void step2(int num) {
		System.out.println(num);

	}

}
