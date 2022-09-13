package com.orangehrm.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class HomePage {
	
	WebDriver driver;
	static Logger log=Logger.getLogger(HomePage.class.getName());
	
	//WebElement 
	By username = By.className("oxd-userdropdown-name");
	
	By menuItemNames = By.xpath("//span[contains(@class, 'oxd-main-menu-item--name')]");
	
	By pageHeader = By.xpath("//h6[text()='PIM']");
	By leaveButton=By.xpath("//a[@href='/web/index.php/leave/viewLeaveModule']");
	By adminButton=By.xpath("//span[text()='Admin']");
	By timeButton=By.xpath("//sapn[text()='Time']");
	By dashboradButton=By.xpath("//span[text()='Dashboard']");
			
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	//PageActions
	
	public String getUsername()
	{
		log.info("Inside Homepage"+" getUsernameMethod");
		String user=driver.findElement(username).getText();
		log.info("username found :"+user);
		return user;
	}
	
	
	public String getTitle()
	{
		log.info("Inside Homepage"+"  getTitleMethod");
		String title=driver.findElement(pageHeader).getText();
		log.info("Title :"+title);
		return title;
	}
	
	
	public List<String> getMenuItems()
	{
		log.info("Inside Homepage"+"  getMenuItemsMethod");
		List<WebElement> list = driver.findElements(menuItemNames);
		
		List<String> names = new ArrayList();
		
		
		for(WebElement e:  list)
		{
			 names.add(e.getText());
		}
		log.info("Menu list :"+names);
		return names;
	}
	public LeavePage ClickOnLeaveButton()
	{
		driver.findElement(leaveButton).click();
		return new LeavePage(driver);
	}
	public AdminPage ClickOnAdminButton()
	{
		driver.findElement(adminButton).click();
		return new AdminPage(driver);
	}
}
