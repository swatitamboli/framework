package com.orangehrm.qa.tests;

import java.util.List;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.orangehrm.qa.basetest.BaseTest;
import com.orangehrm.qa.constants.Constants;
import com.orangehrm.qa.pages.HomePage;


public class HomePageTest extends BaseTest {
	static Logger log=Logger.getLogger(HomePageTest.class.getName());
	HomePage homePage;
	
	@BeforeClass
	public void beforeClass()
	{
		 homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test
	public void verifyUserName()
	{
		String actualUsername = homePage.getUsername();
		log.info("Expected username :"+Constants.HOME_PAGE_USERNAME);
		Assert.assertEquals(actualUsername, Constants.HOME_PAGE_USERNAME);
	}

	
	@Test
	public void verifyMenuItems()
	{
		List<String> actualList = homePage.getMenuItems();
		System.out.println(actualList);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualList.size(), Constants.HOME_PAGE_MENU_ITEMS.size());
		log.info("Expected MenuList :"+Constants.HOME_PAGE_MENU_ITEMS);
		softAssert.assertEquals(actualList, Constants.HOME_PAGE_MENU_ITEMS);
		softAssert.assertAll();
		
	}
	
}
