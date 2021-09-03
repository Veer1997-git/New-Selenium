package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fedex_Pages {
    WebDriver driver;
    @FindBy(xpath = "//span[contains(text(),'Sign Up/Log In')]")
    WebElement login;
    
    public WebElement getLogin() {
    	return login;
    }
    
	@FindBy(id = "NavLoginUserId")
	WebElement username;
	
	@FindBy(id = "NavLoginPassword")
	WebElement password;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Remember Me')]")
	WebElement rememberMe;
	
	public WebElement getRememberMe() {
		return rememberMe;
	}
	
	@FindBy(xpath = "//button[contains(text(),'Log In')]")
	WebElement loginBtn;
	
	public WebElement LoginBtn() {
		return loginBtn;
	}
	
	public Fedex_Pages(WebDriver driver) {
		this.driver=driver;
    	PageFactory.initElements(driver, this);
    	  
      }
}
