package com.store.utilities;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReport {
private static ExtentReports extent;
	
	public static ExtentReports getInstance(){
	if(extent == null){
		Date d = new Date();
		String fileName = d.toString().replace(":", "-").replace(" ", "_")+".html";
		//System.out.println(System.getProperty("user.dir"));
		extent = new ExtentReports("C:\\report\\"+fileName, true, DisplayOrder.NEWEST_FIRST);
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\ReportsConfig.xml"));
		extent.addSystemInfo("Selenium Version", "2.53.1").addSystemInfo("Environment","QA");
	}
	
	return extent;		
}
}
