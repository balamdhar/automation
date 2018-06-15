package com.automation.test.stepdefinition;

import org.openqa.selenium.By;

import com.automation.test.CucumberRunner;

import cucumber.api.java.en.When;

public class SearchText extends CucumberRunner {

	@When("^I type \"(.*?)\"$")
	public void searchText(String text) throws Throwable {

		driver.findElement(By.cssSelector("input[name='q']")).sendKeys(text);

	}

}
