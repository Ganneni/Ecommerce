package com.store.objRepository;

public enum LoginPageProperty {
	
	emailAddressTxtBox("//*[@id='email_create']"),
	createAccountBtn("//*[@id='SubmitCreate']"),
	loginEmailId("//*[@id='email']"),
	password("//*[@id='passwd']"),
	signInBtn("//*[@id='SubmitLogin']"),
	createAccountError("//*[@id='create_account_error']");
	
	
    private String Property;
	
	private LoginPageProperty(String Property)
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
