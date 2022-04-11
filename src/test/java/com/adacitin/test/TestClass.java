package com.adacitin.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.adacitin.pom.BookHotel;
import com.adacitin.pom.HomePage;
import com.adacitin.pom.PageObjectManager;
import com.adacitin.pom.RecheckHotel;
import com.adacitin.pom.SearchHotel;
import com.adacitin.pom.SelectHotel;
import com.reader.ConfigurationHelper;

import baseclass.BaseClass;

public class TestClass extends BaseClass {
	public static WebDriver driver = null;
	
	//public static PageObjectManager p = new PageObjectManager (driver);
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
        String browser = ConfigurationHelper.getInstance().getInstanceCR().getbrowser();
		driver = browserLaunch(browser);
		
		String url = ConfigurationHelper.getInstance().getInstanceCR().geturl();
		getUrl(url);
		
		implicityWait();
		
		PageObjectManager p = new PageObjectManager (driver);
		
		//HomePage hp = new HomePage(driver);
		printText(p.getHomePage().getText());
		implicityWait();
		userInput(p.getHomePage().getUsername(), "Dineshkasiraman34215");
		userInput(p.getHomePage().getPassword(), "TPD93W");
		clickOnElement(p.getHomePage().getLoginbtn());

		SearchHotel sh = new SearchHotel(driver);
		clickOnElement(sh.getReset());
		clearOnElement(sh.getCheckindate());
		userInput(sh.getCheckindate(), "30/01/2022");
		clearOnElement(sh.getCheckoutdate());
		userInput(sh.getCheckoutdate(), "15/02/2022");
		implicityWait();
		userInput(sh.getHot(), "3");
		userInput(sh.getLocation(), "Paris");
		userInput(sh.getHotels(), "Hotel Sunshine");
		userInput(sh.getHotel(), "Super Deluxe");
		userInput(sh.getHote(), "3");
		userInput(sh.getHo(), "3");
		clickOnElement(sh.getSubmit());
		
		//SelectHotel sl = new SelectHotel(driver);
		clickOnElement(p.getSelectHotel().getTick());
		clickOnElement(p.getSelectHotel().getTi());

		BookHotel bh = new BookHotel(driver);
		userInput(bh.getFn(), "Dinesh");
		userInput(bh.getLn(), "kp");
		userInput(bh.getAdd(), "n0:11,nehru.kottivakkan,paris-6072202.");
		userInput(bh.getCard(), "6014235652613214");
		userInput(bh.getH(), "VISA");
		sleep();
		selectbyvalue(bh.getHe(), "3");
		userInput(bh.getHr(), "2022");
		userInput(bh.getHre(), "197");
		action(bh.getMvcc());

		RecheckHotel rh = new RecheckHotel(driver);
		action(rh.getmvccc());
		selectbyvalue(rh.getLocationn(), "Paris");
		selectbyvalue(rh.getHotelse(), "Hotel Sunshine");
		clickOnElement(rh.getHotelsez());
		screenshot();
	}

}
