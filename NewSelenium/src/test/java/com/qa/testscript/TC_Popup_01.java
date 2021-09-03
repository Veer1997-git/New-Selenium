package com.qa.testscript;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.qa.pages.Popup_Pages;

/*Case Study 15

1. Goto the Specific URL --> popup.html
2. Click on Tryit Button
3. get the text on the pop up window
4. Accept the pop up window
5. Click again on the tryit button
6. Dismiss the pop up window*/

public class TC_Popup_01 extends TestBase {
    
	@Test
	@Parameters("url")
	public void pop1(String url) throws InterruptedException {
		
		   Popup_Pages pop = new Popup_Pages(driver);
		   
	       //Goto the Specific URL --> popup.html
	        driver.get(url);
	        
	        //2.Click on Tryit Button
	        pop.getBtn1().click();
	        
	        //3.get the text on the pop up window
	        driver.switchTo().alert().getText();
	        
	        //4.Accept the pop up window
	        Thread.sleep(3000);
			driver.switchTo().alert().accept();
			
			//5.Click again on the tryit button
	        pop.getBtn1().click();
	        
	        //6.Dismiss the pop up window
	        Thread.sleep(3000);
			driver.switchTo().alert().dismiss();
	        
	        
	       
	}
}
