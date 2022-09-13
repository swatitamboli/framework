package com.orangehrm.qa.basetest;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.orangehrm.qa.driverfactory.DriverFactory;
import com.orangehrm.qa.listeners.screenshotUtil;
import com.orangehrm.qa.pages.HomePage;
import com.orangehrm.qa.pages.LoginPage;
import com.orangehrm.qa.utils.propConfig;

public class BaseTest {
	static Logger log=Logger.getLogger(BaseTest.class.getName());
	private DriverFactory df;
	protected WebDriver driver;
	protected LoginPage loginPage;
	protected Properties prop;
	@BeforeTest
	public void setup() throws IOException
	{
		prop=propConfig.loadProperties("ST");
		df = new DriverFactory();
		driver = df.init_driver();
		log.info("Driver file is initilized");
		driver.get(prop.getProperty("baseurl"));
		log.info("url opened :"+prop.getProperty("baseurl"));
		loginPage = new LoginPage(driver);
		
	}
	
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	@AfterMethod
	public void afterMethod(ITestResult result)
	{
		System.out.println("In After Method");
		System.out.println(result.getStatus());
		if(result.getStatus() == ITestResult.FAILURE)
		{
			String screenshotName = result.getMethod().getMethodName();
			screenshotUtil.takeScreenshot(driver, screenshotName);
			
		}
}
}