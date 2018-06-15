package com.automation.test;

import java.util.List;

import org.testng.TestNG;
import org.testng.collections.Lists;

public class MainDriver {

	public static void main(String[] args) {
			TestNG testng = new TestNG();
			List<String> suites = Lists.newArrayList();
			suites.add("testng.xml");//path to xml..
			testng.setTestSuites(suites);
			testng.run();

		}
	}


