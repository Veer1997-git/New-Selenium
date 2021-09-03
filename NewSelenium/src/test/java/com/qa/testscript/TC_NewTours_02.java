package com.qa.testscript;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.NewTours_Pages;

/*Case Study 8:

Goto Newtours application
Login with Credentials
Verify the default values selected in the Departing from is not same as Arriving In select box*/

public class TC_NewTours_02 extends TestBase {
      
	 @Test
	 @Parameters("url")
	 public void newtours(String url) {
		 NewTours_Pages newtours = new NewTours_Pages(driver);
		 
		//Goto Newtours --> http://demo.guru99.com/test/newtours//
		driver.get(url);
		
		//Verify the default values selected in the Departing from is not same 
		//as Arriving In select box
		
		newtours.getFlight().click();
		String fromDeparture = newtours.getDeparture().getFirstSelectedOption().getText();
		String fromMonth = newtours.getMonth().getFirstSelectedOption().getText();
		String fromDay = newtours.getDay().getFirstSelectedOption().getText();
		
		String toLoc = newtours.getToLoc().getFirstSelectedOption().getText();
		String toMonth = newtours.getToMon().getFirstSelectedOption().getText();
		String toDay = newtours.getToDay().getFirstSelectedOption().getText();
		
		if(fromDeparture.equals(toLoc) && fromMonth.equals(toMonth) && fromDay.equals(toDay))
			System.out.println("default values selected in the Departing from is same as Arriving In select box");
		else
			System.out.println("default values selected in the Departing from is not same as Arriving In select box");
}
}
