package com.orangehrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {
	By systemUsername=By.xpath("//h5[text()='System Users']");
	By searchButton=By.xpath("//button[@type='submit']");
	WebDriver driver;
	public AdminPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public boolean getSystemUsername() 
	{
		
		return driver.findElement(systemUsername).isDisplayed();
	}
	public boolean isSearchButtonPresent() 
	{
	return driver.findElement(searchButton).isDisplayed();	
	}
}
