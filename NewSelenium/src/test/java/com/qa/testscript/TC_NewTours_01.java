package com.qa.testscript;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.NewTours_Pages;

/*Case Study 7: 
Goto Newtours --> http://demo.guru99.com/test/newtours/
Enter Login Credential of Username & Password as "mercury"
Click on Signin Button
Select the passengers count as "4" using select object by index
Select Departure location, Month & Date using select by Value
Select Arrival location, Month,& Date  using select by Visible Text
Click on Continue booking the flight ticket.*/

public class TC_NewTours_01 extends TestBase{
	 @Test
	 @Parameters("url")
	 public void newtours(String url) {
		 NewTours_Pages obj = new NewTours_Pages(driver); 
		 
		//Goto Newtours --> http://demo.guru99.com/test/newtours//
		driver.get(url);
   
       //Enter Login Credential of Username & Password as "mercury"
       //Click on Signin Button
		
       //Select the passengers count as "4" using select object by index
		obj.getFlight().click();
		obj.getCount().selectByIndex(3);//Starts with 0 thats y 3 instead of 4
		
       //Select Departure location, Month & Date using select by Value
		obj.getDeparture().selectByValue("Paris");
		obj.getMonth().selectByValue("4");
		obj.getDay().selectByValue("27");
		
       //Select Arrival location, Month,& Date  using select by Visible Text
		obj.getToLoc().selectByVisibleText("London");
		obj.getToMon().selectByVisibleText("April");
	    obj.getToDay().selectByVisibleText("27");
		
       //Click on Continue booking the flight ticket.
	    
}
}
