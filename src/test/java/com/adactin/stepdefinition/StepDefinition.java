package com.adactin.stepdefinition;


import org.openqa.selenium.WebDriver;
import com.adacitin.pom.HomePage;
import baseclass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.AdactinRunner;

public class StepDefinition extends BaseClass{
	
	public static WebDriver driver = AdactinRunner.driver ;
	HomePage h = new HomePage(driver);
	
	@Given("^user Launch The Adactin Url$")
	
	public void user_Launch_The_Adactin_Url() throws Throwable {
		
		
		getUrl("https://adactinhotelapp.com/");
		
	    
	}

	@When("^user enter the username in username field$")
	public void user_enter_the_username_in_username_field() throws Throwable {
		
		userInput(h.getUsername(), "Dineshkasiraman34215");
	   
	}

	@When("^/When : user enter the password in password field$")
	public void when_user_enter_the_password_in_password_field() throws Throwable {
	  
		userInput(h.getPassword(), "P07C68");
	}

	@Then("^user click the login Button  and it navigates to search hotel page$")
	public void user_click_the_login_Button_and_it_navigates_to_search_hotel_page() throws Throwable {
		clickOnElement(h.getLoginbtn());
	   
	}


}

