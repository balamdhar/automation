package com.automation.test.stepdefinition;

import org.openqa.selenium.By;

import com.automation.test.CucumberRunner;

import cucumber.api.java.en.Then;

public class Clearpage extends CucumberRunner {
	

	@Then("^I clear search textbox$")
	public void Clear() throws Throwable {

		driver.findElement(By.cssSelector("input[name='q']")).clear();

	}

}
