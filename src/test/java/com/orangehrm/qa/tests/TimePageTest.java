package com.orangehrm.qa.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orangehrm.qa.basetest.BaseTest;
import com.orangehrm.qa.pages.HomePage;
import com.orangehrm.qa.pages.TimePage;



public class TimePageTest extends BaseTest {
WebDriver driver;
TimePage timepage;
@BeforeClass
public void before()
{
 HomePage homepage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
 timepage=homepage.ClickonTimeButton();
}
@Test
public void getSlectEmp()
{
	boolean actual=timepage.getSelectEmp();
	Assert.assertEquals(actual,true);
}
@Test
public void isViewButtonPresent()
{
	boolean actual=timepage.isViewButtonPresent();
	Assert.assertEquals(actual, true);
}
}
