package com.store.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.store.objRepository.HomePageProperty;
import com.store.utilities.FindElements;

public class HomePage extends FindElements{
	
 // private WebDriver driver;
  //private FindElements findelementsObj;
  
  
  private By signInLinkLocator = By.xpath(HomePageProperty.signInLink.getProperty());
  
  public HomePage(WebDriver driver)
  {
	  super(driver);
	  
  }
  
  public void clickOnSignIn()
  {
	  clickOnButtonOrLink(signInLinkLocator);
  }
  
	
	

}
