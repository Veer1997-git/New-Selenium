package com.qa.testscript;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.pages.Ebay_Pages;

/*Case study 1: Demonstrate the following case study by locating each element with
different types of locators.

1. Open Browser
2. Launch ebay.in url
3. Click on register link
4. Enter First name as smith
5. Enter Last name as Kim
6. Enter email ID as test@test.com
7. Enter password as mercury
8. select / enable the Show check box
9. Click on Create account button*/

public class TC_Ebay_01 extends TestBase {
	 
	     @Test
	     @Parameters({"url","firstname","lastname","email_id","password"})
	     public void ebay(String url,String firstname,String lastname,String email_id,String password)  { 
	     Ebay_Pages ebaypage = new Ebay_Pages(driver);
	    	
		  //2. Launch ebay.in url
	       driver.get(url);
	    	
	 	  //3. Click on register link
	        ebaypage.getRegister().click();
	        
	      //Enter First name as smith  
	        ebaypage.getFirstname().sendKeys(firstname);
	        
	      //5. Enter Last name as Kim
	        ebaypage.getLastname().sendKeys(lastname);
	        
	      //6. Enter email ID as test@test.com
	        ebaypage.getEmail().sendKeys(email_id);
	        
	      //7. Enter password as mercury
	        ebaypage.getPassword().sendKeys(password);
	        
	      //8.select / enable the Show check box 
	        ebaypage.getShowpassword().click();
	        
	      //9.Click on Create account button 
	        ebaypage.getRegister().click();
	        
	     }  
	     
}

