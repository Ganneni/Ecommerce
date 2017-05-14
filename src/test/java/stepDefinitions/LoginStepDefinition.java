package stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.store.pages.HomePage;
import com.store.pages.LoginPage;
import com.store.pages.MyAccountPage;
import com.store.utilities.ExtentReport;
import com.store.utilities.TestBase;

import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

@SuppressWarnings("deprecation")
public class LoginStepDefinition {
	
	private WebDriver driver;
	private LoginPage loginPageObj;
	private MyAccountPage myAccountPageObj;
	private ExtentTest extTest;

	
	public LoginStepDefinition()
	{
		driver = Hooks.driver;
    	extTest = Hooks.extTest;
	}
	
	@When("^I enter \"([^\"]*)\",\"([^\"]*)\"$")
	public void i_enter(String emailId, String password) {
		
		loginPageObj = new LoginPage(driver);
		loginPageObj.enterSignInEmailId(emailId);
		loginPageObj.enterPassword(password);
		extTest.log(LogStatus.INFO, "Enter sign in credentials");
		
	    
	}
	@And("^I click on SignIn button$")
	public void i_click_on_SignIn_button(){
		
		loginPageObj.clickOnSignIn();
		extTest.log(LogStatus.INFO, "Clicked on sign in button");
		
	}

	@Then("^I can successfully login into my account with \"([^\"]*)\"$")
	public void i_can_successfully_login_into_my_account_with(String username) {
		
		
		myAccountPageObj = new MyAccountPage(driver);
		String actualuserName = myAccountPageObj.getUserName();
		if(username.equalsIgnoreCase(actualuserName))
		{
			extTest.log(LogStatus.INFO, "Login Successful");
		}
		else
		{
			extTest.log(LogStatus.FAIL, "Login Failure");
			Assert.fail("Login failure");
		
		}
			
		    
	}
	@Then("^I SignOut$")
	public void i_SignOut()
	{
		myAccountPageObj.clickSignOut();
		
	}



}
