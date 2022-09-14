package com.orangehrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimePage {
	By selectEmp=By.xpath("//h6[text()='Select Employee']");
	By veiwButton=By.xpath("//button[@type='submit']");
WebDriver driver;
public TimePage(WebDriver driver)
{
	this.driver=driver;
}
public boolean getSelectEmp() 
{
	return driver.findElement(selectEmp).isDisplayed();
}
public boolean isViewButtonPresent()
{
	return driver.findElement(veiwButton).isDisplayed();
}
}

