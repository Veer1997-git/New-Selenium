package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoSuggestField_Pages {
	WebDriver driver;
	@FindBy(name = "q")
	WebElement searchbox;

	@FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/ul")
	List<WebElement> suggestedNames;
	
	@FindBy(xpath ="//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")
	WebElement magnifier;

	public WebElement getMagnifier() {
		return magnifier;
	}
	
	public WebElement getSearchbox() {
		return searchbox;
	}

	public List<WebElement> getSuggestedNames() {
		return suggestedNames;
	}

	public AutoSuggestField_Pages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
