package com.qa.testscript;

import org.testng.annotations.Test;

import com.qa.pages.Gmail_Pages;

/*Case Study 11:
Working With Multiple Window of a Browser
1. Goto Gmail Create account URL
2.  Click on Term of Service
3.  Click on Privacy Policy
4. After all the windows are opened fetch the title & all the links avialable in each of the window*/ 

public class TC_Gmail extends TestBase{
	
	public TC_Gmail() {
	   	  super();
	 }
	 @Test
	 public void gmail() {
		 Gmail_Pages gmail = new Gmail_Pages(driver);
		 
        //1.Goto Gmail Create account URL
		 
		driver.get("https://www.google.com/gmail/");
	
        //2.Click on Term of Service
		gmail.getPrivacy().click();
		
        //3.Click on Privacy Policy
        //4.After all the windows are opened fetch the title & all the links avialable in each of the window

}
}
