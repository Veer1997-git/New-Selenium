package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Ebay_Pages {
	WebDriver driver;
	 
	 @FindBy(linkText=("register"))
     WebElement register;
	 
	 @FindBy(id=("firstname"))
     WebElement Firstname;
	
	 @FindBy(id=("lastname"))
     WebElement Lastname;
	 
	 @FindBy(id=("Email"))
     WebElement Email;
	 
	 @FindBy(id=("password"))
     WebElement Password;
	 
	 @FindBy(id=("showpassword"))
     WebElement Showpassword;
	 
	 
	 
	 public WebElement getRegister() {
		return register;
	}

	public WebElement getFirstname() {
		return Firstname;
	}


	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getShowpassword() {
		return Showpassword;
	}

	public Ebay_Pages(WebDriver driver) {
			this.driver=driver;
	    	PageFactory.initElements(driver, this);
	    	  
	      }

	
}
