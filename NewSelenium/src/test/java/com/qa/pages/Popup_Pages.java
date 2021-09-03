package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Popup_Pages{
	WebDriver driver;
	
	@FindBy(xpath = ("/html/body/button"))
	WebElement btn1;
	
	public WebElement getBtn1() {
		return btn1;
	}
	
	public Popup_Pages(WebDriver driver) {
		this.driver=driver;
    	PageFactory.initElements(driver, this);
    	  
      }

	
	
	

}
