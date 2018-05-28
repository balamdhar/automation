package com.automation.test.stepdefinition;

import org.testng.Assert;

import com.automation.test.CucumberRunner;

import cucumber.api.java.en.Given;

public class Homepage extends CucumberRunner {

	@Given("^I am on google page$")
	public void googlePage() throws Throwable {

		String title = driver.getTitle();

		Assert.assertEquals(true, title.contains("Google"));
	}

}
