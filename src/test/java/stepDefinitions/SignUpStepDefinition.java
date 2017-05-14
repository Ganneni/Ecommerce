package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.store.utilities.ExtentReport;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.store.pages.HomePage;
import com.store.pages.RegistrationPage;
import com.store.pages.LoginPage;
import com.store.utilities.TestBase;

import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpStepDefinition {
	
	private WebDriver driver;
	private HomePage homePageObj;
	private LoginPage loginPageObj;
	private RegistrationPage registrationPageObj;
	private ExtentTest extTest;
	
	
	public SignUpStepDefinition()
	{
		driver = Hooks.driver;
		extTest = Hooks.extTest;
		
	}
	
	@Given("^I launched online store home page$")
	public void i_launched_online_store_home_page()  {
		
		   driver.get("http://www.automationpractice.com/");
		   homePageObj = new HomePage(driver);
		  
	}

	@When("^I clicked SignIn link$")
	public void i_clicked_SignIn_link()  {
		
		homePageObj.clickOnSignIn();
		loginPageObj = new LoginPage(driver);
	   
	}

	@Then("^I can see login page$")
	public void i_can_see_login_page()  {
		
			    
	}

	@When("^I enter \"([^\"]*)\" and click on create account button$")
	public void i_enter_and_click_on_create_account_button(String emailId) throws InterruptedException {
		
		loginPageObj.enterEmailId(emailId);
		loginPageObj.clickCreateAccountBtn();
		Thread.sleep(5000);
		
	}

	@Then("^I can see Registration page$")
	public void i_can_see_Registration_page(){
		
		if(loginPageObj.checkErrorMessagePresents())
		{
			extTest.log(LogStatus.FAIL, "Invalid email id");
			Assert.fail("Failed because of invalid email address while account creation");
		}
		
		registrationPageObj =  new RegistrationPage(driver); 
		
	}
	

	
	@When("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_enter(String gender, String CFname, String CLname, String pwd, String day, String month, String year, String chkBoxesInfo, String company, String add1, String add2, String city, String state, String postcode, String AddInfo, String homephone, String mobilephone) {
		registrationPageObj.selectGender(gender);
		registrationPageObj.enterCFirstName(CFname);
		registrationPageObj.enterCLastName(CLname);
		registrationPageObj.enterPwd(pwd);
		registrationPageObj.selectDobDay(day);
		registrationPageObj.selectDobMon(month);
		registrationPageObj.selectDobYear(year);
		registrationPageObj.checkBoxSelection(chkBoxesInfo);
		registrationPageObj.enterCompany(company);
		registrationPageObj.enterAddressline1(add1);
		registrationPageObj.enterAddressLine2(add2);
		registrationPageObj.enterCity(city);
		registrationPageObj.selectState(state);
		registrationPageObj.enterPostcode(postcode);
		registrationPageObj.enterAddlInformation(AddInfo);
		registrationPageObj.enterHomePhone(homephone);
		registrationPageObj.enterMobilePhone(mobilephone);
		
		
		
	}
	
	
	@When("^I click on Register Button$")
	public void i_click_on_Register_Button() {
		
		registrationPageObj.clickSubmitBtn();
	   
	}

	@Then("^I get registered successfully$")
	public void i_get_registered_successfully() {
	    
	}



}
