package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Pages {
	WebDriver driver;
	
	@FindBy(id = "searchDropdownBox")
	WebElement categoy;

	public Select getCategoy() {
		Select cat = new Select(categoy);
		return cat;
	}
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchtextbox;
	
	public WebElement getSearchtextbox() {
		return searchtextbox;
	}
	
	@FindBy(id = "nav-search-submit-button")
	WebElement magnifierBtn;
	
	public WebElement getMagnifierBtn() {
		return magnifierBtn;
	}
	
	@FindBy(xpath = "//div[@data-component-type='s-search-result']")
	List<WebElement> selectedItems;
	
	public List<WebElement> getSelectedItems() {
		return selectedItems; 
	}
	@FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal']")
	List<WebElement> title;
	
	public List<WebElement> getTitle() {
		return title;
	}

	@FindBy(xpath = "//span[@class='a-price-whole']")
	List<WebElement> price;

	public List<WebElement> getPrice() {
		return price;
	}

	public Amazon_Pages(WebDriver driver) {
		this.driver=driver;
    	PageFactory.initElements(driver, this);
    	  
      }
}
