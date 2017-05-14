package com.store.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.store.objRepository.RegistrationPageProperty;
import com.store.utilities.FindElements;

import cucumber.api.java.gl.E;

public class RegistrationPage extends FindElements {

	private By maleGenderLocator = By.xpath(RegistrationPageProperty.maleGenderRadioButton.getProperty());
	private By femaleGenderLocator = By.xpath(RegistrationPageProperty.femaleGenderRadioButton.getProperty());
	private By cFirstNameLocator = By.xpath(RegistrationPageProperty.cFirstNameTxtBox.getProperty());
	private By cLastNameLocator = By.xpath(RegistrationPageProperty.cLastNameTxtBox.getProperty());
	private By emailLocator = By.xpath(RegistrationPageProperty.emailTxtBox.getProperty());
	private By pwdLocator = By.xpath(RegistrationPageProperty.pwdTxtBox.getProperty());
	private By dobDayLocator = By.xpath(RegistrationPageProperty.dobDayDrpDown.getProperty());
	private By dobMonLocator = By.xpath(RegistrationPageProperty.dobMonDrpDown.getProperty());
    private By dobYearLocator = By.xpath(RegistrationPageProperty.dobYearDrpDown.getProperty());
    private By newsSignUPLocator = By.xpath(RegistrationPageProperty.newsSignUPChkBox.getProperty());
    private By optInLocator = By.xpath(RegistrationPageProperty.splOffersChkBox.getProperty());
    private By firstNameLocator = By.xpath(RegistrationPageProperty.firstNameTxtBox.getProperty());
    private By lastNameLocator = By.xpath(RegistrationPageProperty.lastNameTxtBox.getProperty());
    private By comPanyLocator = By.xpath(RegistrationPageProperty.companyTxtBox.getProperty());
    private By addressLine1Locator = By.xpath(RegistrationPageProperty.add1TxtBox.getProperty());
    private By addressLine2Locator = By.xpath(RegistrationPageProperty.add2TxtBox.getProperty());
    private By cityLocator = By.xpath(RegistrationPageProperty.cityTxtBox.getProperty());
    private By stateLocator = By.xpath(RegistrationPageProperty.stateDrpDown.getProperty());
    private By countryLocator = By.xpath(RegistrationPageProperty.countryDrpDown.getProperty());
    private By addlInfoLocator = By.xpath(RegistrationPageProperty.addInformationTxtArea.getProperty());
    private By homePhoneLocator = By.xpath(RegistrationPageProperty.homePhoneTxtBox.getProperty());
    private By mobilePhoneLocator = By.xpath(RegistrationPageProperty.MobPhoneTxtBox.getProperty());
    private By aliasAddressLocator = By.xpath(RegistrationPageProperty.aliasAddTxtBox.getProperty());
    private By submitBtnLocator = By.xpath(RegistrationPageProperty.submitBtn.getProperty());
    private String postCodeId = RegistrationPageProperty.postcodeTxtBox.getProperty();
    
    private WebDriver driver;
	
	public RegistrationPage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
	}
	public void selectGender(String gender)
	{
	     if(gender.equals("Mr."))
	    	 this.selectRadioButtonOrChkBox(maleGenderLocator);
	     else
	    	 this.selectRadioButtonOrChkBox(femaleGenderLocator);
		
	}
	public void enterCFirstName(String cFirstName)
	{
		this.enterTextIntoTxtBox(cFirstNameLocator, cFirstName);
	}
	public void enterCLastName(String cLastName)
	{
	    this.enterTextIntoTxtBox(cLastNameLocator, cLastName);	
	}
	public void enterEmail(String email)
	{
		this.enterTextIntoTxtBox(emailLocator, email);
	}
	public void enterPwd(String password)
	{
		this.enterTextIntoTxtBox(pwdLocator, password);
	}
	public void selectDobDay(String day)
	{
		this.selectByValueFromDropDown(dobDayLocator, day);
	}
	public void selectDobMon(String mon)
	{
		this.selectByValueFromDropDown(dobMonLocator, mon);
	}
	public void selectDobYear(String year)
	{
		this.selectByValueFromDropDown(dobYearLocator, year);
	}
	public void enterFirstName(String fname)
	{
		this.enterTextIntoTxtBox(firstNameLocator, fname);
	}
	public void enterLastName(String lname)
	{
		this.enterTextIntoTxtBox(lastNameLocator, lname);
		
	}
	public void enterCompany(String company)
	{
		this.enterTextIntoTxtBox(comPanyLocator, company);
	}
	public void enterAddressline1(String addr1)
	{
		this.enterTextIntoTxtBox(addressLine1Locator, addr1);
	}
	public void enterAddressLine2(String Addr2)
	{
		this.enterTextIntoTxtBox(addressLine2Locator, Addr2);
		
	}
	public void enterCity(String city)
	{
		this.enterTextIntoTxtBox(cityLocator, city);
	}
	public void selectState(String state)
	{
		this.selectByVisibleTextFromDropDown(stateLocator, state);
	}
	public void selectCountry(String country)
	{
	    this.selectByVisibleTextFromDropDown(countryLocator, country);	
	}
	public void enterPostcode(String postcode)
	{
		this.enterTxtIntoTxtBoxUsingJavaScriptUsingId(postCodeId, postcode);
	}
	public void enterAddlInformation(String addInfo)
	{
		this.enterTextIntoTxtBox(addlInfoLocator, addInfo);
	}
	public void enterHomePhone(String homePhone)
	{
		this.enterTextIntoTxtBox(homePhoneLocator, homePhone);
	}
	public void enterMobilePhone(String mobile)
	{
	    this.enterTextIntoTxtBox(mobilePhoneLocator, mobile);	
	}
	public void enterAliasAddress(String aliasAddress)
	{
		this.enterTextIntoTxtBox(aliasAddressLocator, aliasAddress);
	}
	public void clickSubmitBtn()
	{
		this.clickOnButtonOrLink(submitBtnLocator);
	}
	public void checkBoxSelection(String input)
	{
		if(input.equalsIgnoreCase("Both"))
		{
		  this.selectRadioButtonOrChkBox(newsSignUPLocator);
		  this.selectRadioButtonOrChkBox(optInLocator);
		}
		if(input.equalsIgnoreCase("News"))
			this.selectRadioButtonOrChkBox(newsSignUPLocator);
		if(input.equalsIgnoreCase("Optin"))
			this.selectRadioButtonOrChkBox(optInLocator);
			
	}
	
	
}
