package com.adacitin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{

public WebDriver driver;
		public HomePage(WebDriver driver2) {
        this.driver=driver2;
        PageFactory.initElements(driver, this);
        

}
		public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getText() {
		return text;
	}

		@FindBy(id="username")
		private WebElement username;

		@FindBy(id="password")
		private WebElement password;
		
		@FindBy(id="login")
		private WebElement loginbtn;
		
		@FindBy(xpath ="/html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[1]")
		private WebElement text;
		
		
		
		
		
		
		
		
		
		
	}


