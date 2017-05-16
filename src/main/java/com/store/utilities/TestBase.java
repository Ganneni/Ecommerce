package com.store.utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestBase {
	
    private WebDriver driver;
	private String executionEnv = System.getProperty("type");
	
	public WebDriver initializeDriver(){
//		if(sBrowser.equalsIgnoreCase("Firefox")){
//			driver = new FirefoxDriver();
//		}else if(sBrowser.equalsIgnoreCase("Chrome")){
//			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\BrowserDrivers\\chromedriver.exe");
//			driver = new ChromeDriver();
//		}else if(sBrowser.equalsIgnoreCase("IE")){
//			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\BrowserDrivers\\IEDriverServer.exe");
//			driver = new InternetExplorerDriver();
//		}
		
		if(executionEnv != null && executionEnv.equals("Grid"))
		{
			DesiredCapabilities dc= null;
			String browserName = System.getProperty("browser");
			if(browserName.equals("Firefox"))
				dc= DesiredCapabilities.firefox();
			else if(browserName.equals("Chorme"))
				dc= DesiredCapabilities.chrome();
			else if(browserName.equals("IE"))
                dc= DesiredCapabilities.internetExplorer();
			else
				dc = DesiredCapabilities.firefox();
			dc.setPlatform(Platform.ANY);
			try
			{
				driver = new RemoteWebDriver(new URL("http://localhost:7654/wd/hub"),dc);
			}catch(MalformedURLException e)
			{
				e.printStackTrace();
			}
		}
		return driver;
	}


}
