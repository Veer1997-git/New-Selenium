package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rediff_pages {

	 WebDriver driver;
	 @FindBy(name ="homePagetitle")
		WebElement homePagetitle;

	 @FindBy(name ="LoginPagetitle")
		WebElement LoginPagetitle;
	 
	 @FindBy(name="submit")
		WebElement submit;
	 
	 @FindBy(linkText="SignIn")
		WebElement SignIn;
	 
	 @FindBy(name="RediffOR")
		WebElement RediffOR;
		
		
		public WebElement homePagetitle() {
			return homePagetitle;
		}

		public WebElement LoginPagetitle () {
			return LoginPagetitle;
		}
		
		public WebElement submit() {
			return submit;
		}
		
		public WebElement SignIn() {
			return SignIn ;
		}
		
		public WebElement get_SignLink() {
			return get_SignLink();
		}

		public WebElement RediffOR() {
			return RediffOR ;
		}
	public Rediff_pages (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	}


