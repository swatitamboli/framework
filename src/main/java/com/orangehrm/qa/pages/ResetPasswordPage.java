package com.orangehrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPasswordPage {
WebDriver driver;
By resetbutton=By.xpath("//button[@type='submit']");
By username=By.xpath("//label[text()='Username']");
By requried=By.xpath("//span[text()='Required']");
By cancelbutton=By.xpath("//button[@type='button']");
By textmsg=By.xpath("//p[text()='Please enter your username to identify your account to reset your password']");
public ResetPasswordPage(WebDriver driver)
{
	this.driver=driver;
}
public boolean resetButton()
{
driver.findElement(resetbutton).click();
	return driver.findElement(requried) .isDisplayed();
}
public boolean isusernmaepresent() {
	return driver.findElement(username).isDisplayed();
}
public boolean cancelButton() {
	return driver.findElement(cancelbutton).isDisplayed();
}
public boolean checktextmsg() {
	return driver.findElement(textmsg).isDisplayed();
}
}
