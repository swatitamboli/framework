package com.orangehrm.qa.tests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.orangehrm.qa.basetest.BaseTest;
import com.orangehrm.qa.constants.Constants;
import com.orangehrm.qa.pages.HomePage;
import com.orangehrm.qa.pages.LeavePage;
public class LeavePageTest extends BaseTest {
LeavePage leavepage;
	WebDriver driver;
	@BeforeClass
	public void before()
	{
	 HomePage homepage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	 leavepage=homepage.ClickOnLeaveButton();
	}
	@Test
	public void verifyTitle() {
		String actaul=leavepage.getPageTitle();
		Assert.assertEquals(actaul,Constants.LEAVE_PAGE_TITLE);
	}
	@Test
	public void applyButtonTitle() {
		String actaul=leavepage.clickonApplyButton();
		Assert.assertEquals(actaul, Constants.APPLY_PAGE_TITLE);
	}
	@Test
	public void verifyLeaveApplyTitle() 
	{
		String actaul=leavepage.applyLeavePrsernce();
		Assert.assertEquals(actaul, Constants.APPLY_LEAVE_PAGE_TITLE);
	}
	@Test
	public void verifyEntitlementsTitle() 
	{
	String actual=leavepage.entitlementsTitlePrseence();
		Assert.assertEquals(actual,Constants.ENTITLEMENTS_NAME);
	}
	
}