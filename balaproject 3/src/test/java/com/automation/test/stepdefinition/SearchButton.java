package com.automation.test.stepdefinition;

import org.openqa.selenium.By;

import com.automation.test.CucumberRunner;

import cucumber.api.java.en.Then;

public class SearchButton extends CucumberRunner {

	@Then("^I click search button$")
	public void searchButton() throws Throwable {
		if(driver.findElement(By.xpath(".//*[@value='Google Search']")).isDisplayed()){
			driver.findElement(By.xpath(".//*[@value='Google Search']")).click();	
		}
		else {
			
		}
		driver.findElement(By.xpath(".//*[@value='Search']")).click();

	}

}
