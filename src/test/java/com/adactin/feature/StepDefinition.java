package com.adactin.feature;
import org.openqa.selenium.WebDriver;
import com.adacitin.pom.PageObjectManager;
import com.reader.ConfigurationHelper;
import baseclass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.AdactinRunner;

public class StepDefinition extends BaseClass{
	public static WebDriver driver = BaseClass.driver;
	//public static WebDriver driver = AdactinRunner.driver ;
	public static PageObjectManager p = new PageObjectManager (driver);
	
	@Given("^user Launch The Adactin Url$")
	public void user_Launch_The_Adactin_Url() throws Throwable {
		String url = ConfigurationHelper.getInstance().getInstanceCR().geturl();
		getUrl(url);
	}

	//@When("^user enter the username in username field$")
	//public void user_enter_the_username_in_username_field() throws Throwable {
		
	//	userInput(p.getHomePage().getUsername(), "Dineshkasiraman34215");
	//}
	

	//@When("^user enter the password in password field$")
	//public void user_enter_the_password_in_password_field() throws Throwable {
	  
		//userInput(p.getHomePage().getPassword(), "P07C68");
		
	//}
	@When("^user enter the \"([^\"]*)\" in username field$")
	public void user_enter_the_in_username_field(String username) throws Throwable {
		userInput(p.getHomePage().getUsername(), username);	
		
	}

	@When("^user enter the \"([^\"]*)\" in password field$")
	public void user_enter_the_in_password_field(String password) throws Throwable {
		userInput(p.getHomePage().getPassword(), password );
		
	}
	
	
	
	

	@Then("^user click the login Button  and it navigates to search hotel page$")
	public void user_click_the_login_Button_and_it_navigates_to_search_hotel_page() throws Throwable {
	    
		clickOnElement(p.getHomePage().getLoginbtn());
	}
}

