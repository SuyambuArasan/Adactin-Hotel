package com.adacitin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecheckHotel {
	

	public WebDriver driver;


	public RecheckHotel(WebDriver driver2) {
    this.driver=driver2;
    PageFactory.initElements(driver, this);
    

}


	public WebElement getmvccc() {
		return mvccc;
	}
	public void setReset(WebElement mvccc) {
		this.mvccc = mvccc;
	}
	public WebElement getLocationn() {
		return locationn;
	}
	public void setLocationn(WebElement locationn) {
		this.locationn = locationn;
	}
	public WebElement getHotelse() {
		return hotelse;
	}
	public void setHotelse(WebElement hotelse) {
		this.hotelse = hotelse;
	}
	public WebElement getHotelsez() {
		return hotelsez;
	}
	public void setHotelsez(WebElement hotelsez) {
		this.hotelsez = hotelsez;
	}
	@FindBy(partialLinkText ="Search Hotel")
	private WebElement mvccc ;
	@FindBy(xpath ="//select[@id='location']")
	private WebElement locationn;
	@FindBy(xpath ="//select[@id='hotels']")
	private WebElement hotelse;
	@FindBy(xpath ="//input[@id='Submit']")
	private WebElement hotelsez;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
