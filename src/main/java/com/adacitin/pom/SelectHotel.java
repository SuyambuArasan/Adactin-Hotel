package com.adacitin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	public WebDriver driver;


	public SelectHotel(WebDriver driver2) {
    this.driver=driver2;
    PageFactory.initElements(driver, this);
    

}
	
	
	
	
	@FindBy(xpath ="//input[@id='radiobutton_0']")
	private WebElement tick ;
	public WebElement getTick() {
		return tick;
	}
	public void setTick(WebElement tick) {
		this.tick = tick;
	}
	public WebElement getTi() {
		return ti;
	}
	public void setTi(WebElement ti) {
		this.ti = ti;
	}
	@FindBy(xpath ="//input[@id='continue']")
	private WebElement ti ;
	
	
	
	
	
	
	
}
