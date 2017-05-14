package com.store.objRepository;

public enum RegistrationPageProperty {

	maleGenderRadioButton("//input[@id='id_gender1']"),
	femaleGenderRadioButton("//input[@id='id_gender2']"),
	cFirstNameTxtBox("//*[@id='customer_firstname']"),
	cLastNameTxtBox("//*[@id='customer_lastname']"),
	emailTxtBox("//*[@id='email']"),
	pwdTxtBox("//*[@id='passwd']"),
	dobDayDrpDown("//*[@id='days']"),
	dobMonDrpDown("//*[@id='months']"),
	dobYearDrpDown("//*[@id='years']"),
	newsSignUPChkBox("//*[@id='newsletter']"),
	splOffersChkBox("//*[@id='optin']"),
	firstNameTxtBox("//*[@id='firstname']"),
	lastNameTxtBox("//*[@id='lastname']"),
	companyTxtBox("//*[@id='company']"),
	add1TxtBox("//*[@id='address1']"),
	add2TxtBox("//*[@id='address2']"),
	cityTxtBox("//*[@id='city']"),
	stateDrpDown("//*[@id='id_state']"),
	postcodeTxtBox("postcode"),
	countryDrpDown("//*[@id='id_country']"),
	addInformationTxtArea("//*[@id='other']"),
	homePhoneTxtBox("//*[@id='phone']"),
	MobPhoneTxtBox("//*[@id='phone_mobile']"),
	aliasAddTxtBox("//*[@id='alias']"),
	submitBtn("//*[@id='submitAccount']");
	
    private String Property;
	
	private RegistrationPageProperty(String Property)
	{
		this.Property = Property;
	}
	public void setProperty(String property)
	{
		this.Property = property;
	}
	public String getProperty()
	{
		return this.Property;
	}
	
	
	
	
	
	
	
	
	
}
