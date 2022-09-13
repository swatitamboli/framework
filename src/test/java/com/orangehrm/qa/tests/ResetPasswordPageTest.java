package com.orangehrm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.orangehrm.qa.basetest.BaseTest;
import com.orangehrm.qa.pages.ResetPasswordPage;
public class ResetPasswordPageTest extends BaseTest {
	ResetPasswordPage resetpasswordpage;
@BeforeClass
public void beforeclass() 
{
resetpasswordpage=loginPage.resetpassword();
}
@Test
public void clickButton() {
	boolean actual=resetpasswordpage.resetButton();
	Assert.assertEquals(actual, true);
	}
@Test
public void verifyUsername() {
boolean actaul=resetpasswordpage.isusernmaepresent();
Assert.assertEquals(actaul,true);
}
@Test
public void verifyCancelButton(){
	boolean actual=resetpasswordpage.cancelButton();
	Assert.assertEquals(actual, true);
}
@Test
public void verifytTextMsg()
{
	boolean actual=resetpasswordpage.checktextmsg();
	Assert.assertEquals(actual, true);
}
}
