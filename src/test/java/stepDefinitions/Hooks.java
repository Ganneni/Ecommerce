package stepDefinitions;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.store.utilities.ExtentReport;
import com.store.utilities.GetScreenShot;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.store.utilities.TestBase;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestBase {
	
	
	private static Scenario scenario;
	
	public static String scenarioName;
	public static WebDriver driver;
	public static ExtentTest extTest;
	private ExtentReports reports;
	
	
	@Before
    public void openBrowser(Scenario s) throws MalformedURLException {
		
	    	
	    	driver = initializeDriver();
		    driver.manage().window().maximize();
	    	driver.manage().deleteAllCookies();
	    	driver.manage().window().maximize();
	    	this.scenario = s;
	    	scenarioName = scenario.getName();
	    	reports = ExtentReport.getInstance();
	    	extTest = reports.startTest(scenarioName);
	    	
	}

	     
   @After
   public void tearDown(Scenario s) throws IOException {
	   
	    this.scenario = s;
	    if(scenario.isFailed())
	    {
	      String screenShotPath = GetScreenShot.capture(driver, scenario.getName());
          extTest.log(LogStatus.FAIL, "Snapshot below: " + extTest.addScreenCapture(screenShotPath));
          
	    }
    
/*		if(scenario.isFailed()) {
	        try {
	        	   scenario.write("Current Page URL is " + driver.getCurrentUrl());
	               //byte[] screenshot = getScreenshotAs(OutputType.BYTES);
                   byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                   scenario.embed(screenshot, "image/png");
               
                 } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            	
                   System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }
	        
        }    */
		driver.quit();
		reports.endTest(extTest);
		reports.flush();
	        
    }	
}


   
