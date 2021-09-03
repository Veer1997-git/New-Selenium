package com.qa.testscript;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.RadioButtons_Pages;

/*Case Study 3: 
The following case study is to demonstrate on how to perform user events on check box 
and radio buttons.

2. Launch url http://destinationqa.com/aut/RadioButtons.html
3. Check if Wednesday radio button is selected by default under Radio button section
4. Select Monday radio button
5. Check if Red & Yellow Radio buttons are selected.
   If yes, deselect Red and select Orange*/

public class TC_RadioButtons extends TestBase {
	      
	      @Test
	      @Parameters("url")
	      public void destinationQA(String url) throws InterruptedException {
	    	  RadioButtons_Pages dp = new RadioButtons_Pages(driver);	  
          //2. Launch url http://destinationqa.com/aut/RadioButtons.html
	     
	    	  driver.get(url);
	      
	      //3.Check if Wednesday radio button is selected by default under Radio button section
	     
	      boolean selected = dp.getWedRadioBtn().isSelected();
	      System.out.println("Wednesday radio button is selected by default or not :"+selected);
	      
	      //4.Select Monday radio button
	      Thread.sleep(3000);
	      dp.getMonRadioBtn1().click();
	      
	      //5.Check if Red & Yellow Radio buttons are selected.
	      
	      Thread.sleep(3000);
	      dp.getRedradioBtn().click();
	      dp.getOrangeradioBtn().click();
	      boolean selected1 = dp.getRedradioBtn().isSelected();
	      boolean selected2 = dp.getOrangeradioBtn().isSelected();
	      System.out.println("Red radio button is selected or not :"+selected1);
	      System.out.println("Orange radio button is selected or not :"+selected2);
	      
	      //6.If yes, deselect Red and select Orange
	      
	      if(selected1 == true && selected2 == true) {
	    	  dp.getRedradioBtn().click();
	    	  dp.getOrangeradioBtn().click();
	      }
	      }
}
