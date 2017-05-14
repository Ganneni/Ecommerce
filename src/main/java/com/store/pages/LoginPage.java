package com.store.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.store.objRepository.LoginPageProperty;
import com.store.utilities.FindElements;

public class LoginPage extends FindElements {
	
	private By emailIdTxtBoxLocator = By.xpath(LoginPageProperty.emailAddressTxtBox.getProperty());
	private By createAccountBtnLocator = By.xpath(LoginPageProperty.createAccountBtn.getProperty());
	private By loginEmailIdLocator = By.xpath(LoginPageProperty.loginEmailId.getProperty());
	private By pwdLocator = By.xpath(LoginPageProperty.password.getProperty());
	private By signInBtnLocator = By.xpath(LoginPageProperty.signInBtn.getProperty());
	private By createAccountError = By.xpath(LoginPageProperty.createAccountError.getProperty());
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	public void enterEmailId(String emailId)
	{
		enterTextIntoTxtBox(emailIdTxtBoxLocator, emailId);
	}
	
	public void clickCreateAccountBtn()
	{
		clickOnButtonOrLink(createAccountBtnLocator);
	}
	public void enterSignInEmailId(String emailId)
	{
		this.enterTextIntoTxtBox(loginEmailIdLocator, emailId);
	}
	public void enterPassword(String pwd)
	{
		this.enterTextIntoTxtBox(pwdLocator, pwd);
	}
	public void clickOnSignIn()
	{
		this.clickOnButtonOrLink(signInBtnLocator);
	}
	public boolean checkErrorMessagePresents()
	{
		return this.checkIfElementPresent(createAccountError);
	}
}
