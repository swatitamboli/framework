package com.orangehrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {
	By Username=By.xpath("/label[text()='Username']/following::input");
	By searchButton=By.xpath("//button[@type='submit']");
	WebDriver driver;
	public AdminPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public boolean getUsername() 
	{
		
		return driver.findElement(Username).isDisplayed();
	}
	public boolean isSearchButtonPresent() 
	{
	return driver.findElement(searchButton).isDisplayed();	
	}
}
