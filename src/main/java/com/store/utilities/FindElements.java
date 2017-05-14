package com.store.utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElements {

	private WebDriver driver;
	
	public void waitExplicitTillElementLoaded(By by)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		//WebElement ele = (WebElement)wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	public void waitExplicitTillElementLoaded(String str)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(str)));
	}
	public void waitExplicitTillElementLoaded(WebElement webEle)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(webEle));
	}
	
	public FindElements(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickOnButtonOrLink(By property)
	{
		//waitExplicitTillElementLoaded(property);
		driver.findElement(property).click();
		
	}
	public void selectByVisibleTextFromDropDown(By property,String testData)
	{
		Select select =  new Select(driver.findElement(property));
		select.selectByVisibleText(testData);
	}
	public void selectByValueFromDropDown(By property, String testData)
	{
		Select select =  new Select(driver.findElement(property));
		select.selectByValue(testData);
		
	}
	public void enterTextIntoTxtBox(By property,String testData)
	{
		
		driver.findElement(property).sendKeys(testData);
		
	}
	public void selectRadioButtonOrChkBox(By property)
	{
		driver.findElement(property).click();
		
	}
	public void enterTxtIntoTxtBoxUsingJavaScriptUsingId(String Id, String testData)
	{
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
    	jse.executeScript("document.getElementById(arguments[0]).value=arguments[1]",Id,testData);
			
    
	}
	public String getTextOfElement(By property)
	{
		return driver.findElement(property).getText();
	}
	public boolean checkIfElementPresent(By property)
	{
		return driver.findElement(property).isDisplayed();
	}
	
	
}
