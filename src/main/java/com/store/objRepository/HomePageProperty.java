package com.store.objRepository;

public enum HomePageProperty {

	
	 signInLink("//*[@class='login']");
	
	 private String Property;
		
		private HomePageProperty(String Property)
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
