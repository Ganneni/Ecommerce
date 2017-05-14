package com.store.objRepository;

public enum MyAccountPageProperty {
	
	userName("//a[@class='account']/span"),
	signOut("//a[@class='logout']"),
	contactUs("//a[@title='Contact Us']");
	
	 private String Property;
		
		private MyAccountPageProperty(String Property)
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
