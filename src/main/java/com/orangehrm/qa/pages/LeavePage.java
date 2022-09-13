package com.orangehrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeavePage {
By pageTitle=By.className("oxd-topbar-header-title");
By Applybutton=By.xpath("//a[text()='Apply']");
By applyLeave=By.xpath("//h6[text()='Apply Leave']");
By assignleaveTitle=By.xpath("//h6[text()='Assign Leave']");
By Entitlements=By.xpath("//span[text()='Entitlements ']");
By calendericonclick=By.xpath("//label[text()='From Date']/ancestor::div[contains(@class,'oxd-input-group')]//input");
WebDriver driver;

public LeavePage(WebDriver driver)
{
	this.driver=driver;
}
public String getPageTitle()
{
	return driver.findElement(pageTitle).getText();
}
public String clickonApplyButton()
{
	return driver.findElement(Applybutton).getText();
}
public String applyLeavePrsernce() {
	driver.findElement(Applybutton).click();
	return driver.findElement(applyLeave).getText();
	}
public String entitlementsTitlePrseence()
{
	return driver.findElement(Entitlements).getText();
}
}