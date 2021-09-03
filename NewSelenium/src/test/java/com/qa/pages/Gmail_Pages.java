package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_Pages {
	WebDriver driver;
	
	
	@FindBy(xpath="//a[contains(text(),'Privacy')]")
	WebElement privacy;
	
	public WebElement getPrivacy() {
		return privacy;
	}
	
	public Gmail_Pages(WebDriver driver) {
		this.driver=driver;
    	PageFactory.initElements(driver, this);
    	  
      }

}
