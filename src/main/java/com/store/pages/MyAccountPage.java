package com.store.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.store.objRepository.MyAccountPageProperty;
import com.store.utilities.FindElements;

public class MyAccountPage extends FindElements{
	
	private By userNameLocator = By.xpath(MyAccountPageProperty.userName.getProperty());
	private By signOutLocator = By.xpath(MyAccountPageProperty.signOut.getProperty());
	private By contactUsLocator = By.xpath(MyAccountPageProperty.contactUs.getProperty());
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	public String getUserName()
	{
		return this.getTextOfElement(userNameLocator);
		
	}
	public void clickSignOut()
	{
		this.clickOnButtonOrLink(signOutLocator);
	}
	public void clickContactUs()
	{
		this.clickOnButtonOrLink(contactUsLocator);
	}
	

}
