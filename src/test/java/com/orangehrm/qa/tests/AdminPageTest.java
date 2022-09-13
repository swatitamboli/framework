package com.orangehrm.qa.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orangehrm.qa.basetest.BaseTest;
import com.orangehrm.qa.pages.AdminPage;
import com.orangehrm.qa.pages.HomePage;

public class AdminPageTest extends BaseTest{
WebDriver driver;
AdminPage adminPage;
@BeforeClass
public void before()
{
 HomePage homepage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
 adminPage=homepage.ClickOnAdminButton();
}
@Test
public void vrifyUserName() 
{
	boolean actual=adminPage.getUsername();
	Assert.assertEquals(actual,true);

}
@Test
public void isSearchButtonPresent() 
{
	boolean actual=adminPage.isSearchButtonPresent();
	Assert.assertEquals(actual, true);
}
}