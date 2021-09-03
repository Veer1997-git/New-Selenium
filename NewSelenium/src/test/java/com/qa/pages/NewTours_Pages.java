package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testscript.TestBase;

public class NewTours_Pages extends TestBase{
    WebDriver driver;
	@FindBy(linkText = "Flights")
	WebElement flight;
	
	public WebElement getFlight() {
		return flight;
	}
	
	@FindBy(xpath = "//select[@name='passCount']")
	WebElement count;

	public Select getCount() {
		Select cnt = new Select(count);
		return cnt;
	}
	@FindBy(xpath = "//select[@name='fromPort']")
	WebElement departure;
	
	@FindBy(xpath = "//select[@name='fromMonth']")
	WebElement month;
	
	@FindBy(xpath = "//select[@name='fromDay']")
	WebElement day;
	
	public Select getDeparture() {
		Select fromDrpt = new Select(departure);
		return fromDrpt;
	}

	public Select getMonth() {
		Select fromMth = new Select(month);
		return fromMth;
	}

	public Select getDay() {
		Select fromDay = new Select(day);
		return fromDay;
	}
	
	@FindBy(xpath = "//select[@name='toPort']")
	WebElement toLoc;
	
	@FindBy(xpath = "//select[@name='toMonth']")
	WebElement toMon;
	
	@FindBy(xpath = "//select[@name='toDay']")
	WebElement toDay;
	
	public Select getToLoc() {
		Select loc = new Select(toLoc);
		return loc;
	}

	public Select getToMon() {
		Select mon = new Select(toMon);
		return mon;
	}

	public Select getToDay() {
		Select d = new Select(toDay);
		return d;
	}
	
	@FindBy(xpath = "//input[@name='userName']")
	WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public NewTours_Pages(WebDriver driver) {
		this.driver=driver;
    	PageFactory.initElements(driver, this);
    	  
      }
}
