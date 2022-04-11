package com.adacitin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	
	public WebDriver driver;


	public SearchHotel(WebDriver driver2) {
    this.driver=driver2;
    PageFactory.initElements(driver, this);
    

}

	public WebElement getReset() {
		return reset;
	}
	public void setReset(WebElement reset) {
		this.reset = reset;
	}
	public WebElement getCheckindate() {
		return checkindate;
	}
	public void setCheckindate(WebElement checkindate) {
		this.checkindate = checkindate;
	}
	public WebElement getCheckoutdate() {
		return checkoutdate;
	}
	public void setCheckoutdate(WebElement checkoutdate) {
		this.checkoutdate = checkoutdate;
	}
	public WebElement getHot() {
		return hot;
	}
	public void setHot(WebElement hot) {
		this.hot = hot;
	}
	public WebElement getLocation() {
		return location;
	}
	public void setLocation(WebElement location) {
		this.location = location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public void setHotels(WebElement hotels) {
		this.hotels = hotels;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public void setHotel(WebElement hotel) {
		this.hotel = hotel;
	}
	public WebElement getHote() {
		return hote;
	}
	public void setHote(WebElement hote) {
		this.hote = hote;
	}
	public WebElement getHo() {
		return ho;
	}
	public void setHo(WebElement ho) {
		this.ho = ho;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}
	@FindBy(xpath ="//input[@type='reset']")
	private WebElement reset ;
	@FindBy(xpath ="//input[@id='datepick_in']")
	private WebElement checkindate ;
	@FindBy(xpath ="//input[@id='datepick_out']")
	private WebElement checkoutdate ;
	@FindBy(xpath ="//select[@id='adult_room']")
	private WebElement hot;
	@FindBy(xpath ="//select[@id='location']")
	private WebElement location;
	@FindBy(xpath ="//select[@id='hotels']")
	private WebElement hotels;
	@FindBy(xpath ="//select[@id='room_type']")
	private WebElement hotel;
	@FindBy(xpath ="//select[@id='room_nos']")
	private WebElement hote;
	@FindBy(xpath ="//select[@id='child_room']")
	private WebElement ho;
	@FindBy(xpath ="//input[@id='Submit']")
	private WebElement submit;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
