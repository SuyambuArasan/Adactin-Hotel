package com.adacitin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	
	public WebDriver driver;

	public BookHotel(WebDriver driver2) {
    this.driver=driver2;
    PageFactory.initElements(driver, this);

}
	

	@FindBy(xpath ="//input[@id='first_name']")
	private WebElement fn ;	

	public WebElement getFn() {
		return fn;
	}
	public void setFn(WebElement fn) {
		this.fn = fn;
	}
	public WebElement getLn() {
		return ln;
	}
	public void setLn(WebElement ln) {
		this.ln = ln;
	}
	public WebElement getAdd() {
		return add;
	}
	public void setAdd(WebElement add) {
		this.add = add;
	}
	public WebElement getCard() {
		return card;
	}
	public void setCard(WebElement card) {
		this.card = card;
	}
	public WebElement getH() {
		return h;
	}
	public void setH(WebElement h) {
		this.h = h;
	}
	public WebElement getHe() {
		return he;
	}
	public void setHe(WebElement he) {
		this.he = he;
	}
	public WebElement getHr() {
		return hr;
	}
	public void setHr(WebElement hr) {
		this.hr = hr;
	}
	public WebElement getHre() {
		return hre;
	}
	public void setHre(WebElement hre) {
		this.hre = hre;
	}
	public WebElement getMvcc() {
		return mvcc;
	}
	public void setMvcc(WebElement mvcc) {
		this.mvcc = mvcc;
	}
	@FindBy(xpath ="//input[@id='last_name']")
	private WebElement ln ;
	
	@FindBy(xpath ="//textarea[@id='address']")
	private WebElement add ;
	@FindBy(xpath ="//input[@id='cc_num']")
	private WebElement card ;
	@FindBy(xpath ="//select[@id='cc_type']")
	private WebElement h ;
	@FindBy(xpath ="//select[@id='cc_exp_month']")
	private WebElement he ;
	@FindBy(xpath ="//select[@id='cc_exp_year']")
	private WebElement hr ;
	@FindBy(xpath ="//input[@id='cc_cvv']")
	private WebElement hre ;
	@FindBy(partialLinkText ="Booked Itinerary")
	private WebElement mvcc ;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
