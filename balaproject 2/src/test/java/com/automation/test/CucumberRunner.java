package com.automation.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		strict = true,
		monochrome = true, 
		features = "./features",
		glue = "com.automation.test.stepdefinition",
		plugin = {"pretty", "html:target/cucumber-html-report" },
		tags={"@Regression,@JunitScenario,@TestngScenario"})

public class CucumberRunner extends AbstractTestNGCucumberTests {

	public static Properties config = null;
	public static WebDriver driver = null;

	public void LoadConfigProperty() throws IOException {
//		config = new Properties();		
//		InputStream ip = Thread.currentThread().getContextClassLoader().getResourceAsStream("config/config.properties");
//		config.load(ip);
		config = new Properties();
		FileInputStream ip = new FileInputStream(
		System.getProperty("user.dir") + "/config/config.properties");
		config.load(ip);
	}

	public void openBrowser() throws Exception {
		LoadConfigProperty();
		if (config.getProperty("browserType").equals("Firefox")) {

			driver = new FirefoxDriver();
		} else if (config.getProperty("browserType").equals("Chrome")) {
//			System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
//			driver = new ChromeDriver();
			System.out.println("message 1");
//			String path=System.getProperty("user.dir")+"\driverschromedriver.exe";
//			System.out.println(path);
			System.setProperty("webdriver.chrome.driver",
					"/home/bala/Softwares/chromedriver");
//		        System.setProperty("webdriver.chrome.driver",path);
		        
			driver = new ChromeDriver();
		}
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void implicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public void pageLoad(int time) {
		driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
	}

	public void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	public void setEnv() throws Exception {
		LoadConfigProperty();
		String baseUrl = config.getProperty("siteUrl");
		driver.get(baseUrl);
	}

	public static String currentDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String cal1 = dateFormat.format(cal.getTime());
		return cal1;
	}

	@BeforeSuite(alwaysRun = true)
	public void setUp() throws Exception {
		openBrowser();
		System.out.println("message 21");
		maximizeWindow();
		System.out.println("message 22");
		implicitWait(30);
		System.out.println("message 23");
		deleteAllCookies();
		System.out.println("message 24");
		setEnv();
		System.out.println("message 2");
	}

	@AfterClass(alwaysRun = true)
	public void takeScreenshot() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File( "screenshot.png"));

	}

	@AfterMethod(alwaysRun = true)
	public void tearDownr(ITestResult result) throws IOException {
		if (result.isSuccess()) {
			File imageFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String failureImageFileName = result.getMethod().getMethodName()
					+ new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime()) + ".png";
			File failureImageFile = new File( failureImageFileName);
			FileUtils.copyFile(imageFile, failureImageFile);
		}

	}

	@AfterSuite(alwaysRun = true)
	public void quit() throws IOException, InterruptedException {
		driver.quit();
	}
}
