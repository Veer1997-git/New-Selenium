package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testscript.TestBase;

public class RadioButtons_Pages extends TestBase {
     WebDriver driver;
     
	 @FindBy(xpath=("//input[@value='Wed']"))
	 WebElement WedRadioBtn;
	 
	 @FindBy(xpath=("//input[@value='Mon']"))
	 WebElement MonRadioBtn1;
	 
	 @FindBy(xpath=("//input[@name='red']"))
	 WebElement RedradioBtn;
	 
	 @FindBy(xpath=("//input[@name='Orange']"))
	 WebElement OrangeradioBtn;

	public WebElement getWedRadioBtn() {
		return WedRadioBtn;
	}

	public WebElement getMonRadioBtn1() {
		return MonRadioBtn1;
	}

	public WebElement getRedradioBtn() {
		return RedradioBtn;
	}

	public WebElement getOrangeradioBtn() {
		return OrangeradioBtn;
	}

	public RadioButtons_Pages(WebDriver driver) {
		this.driver=driver;
    	PageFactory.initElements(driver, this);
    	  
      }
	 
}
