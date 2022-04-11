package com.adacitin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {
	
	
	public WebDriver driver;
	private HomePage hp ;
	private SelectHotel sl;
	
	
	public PageObjectManager(WebDriver driver2) {
		 this.driver=driver2;
		 PageFactory.initElements(driver, this);	
	
	}

	public HomePage getHomePage() {
		
		 hp = new HomePage(driver);
		return hp;
		
	
	}
	
	public SelectHotel getSelectHotel() {
		 sl = new SelectHotel(driver);
		return sl;
		

	}
	
	public WebDriver getDriver() {
		return driver;
	
	
	

}
	
	
	
	
	
}
