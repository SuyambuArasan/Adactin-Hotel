package com.adactin.feature;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import baseclass.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src\\test\\java\\com\\adactin\\feature\\adactin.feature",
		//glue="StepDefinition",
		monochrome = true,
		tags = "@Check",
		//dryRun = true
		 //strict = true
		//plugin = "pretty"
		plugin = { "pretty"	,"html:target/htmlreport.html" ,
				"junit:target/jsonreport.xml",
				"json:target/jsonreport.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/extentreport.html"
				
		}
		
		)
		
public class AdactinRunner {

	
	public static WebDriver driver ;
	
	@BeforeClass
	public static void setUp()   {
      
		driver = BaseClass.browserLaunch("chrome");
		
	}
	
	@AfterClass
		public static void tearDown()  {
		
		//driver.close();
		
	}
	
	
}
