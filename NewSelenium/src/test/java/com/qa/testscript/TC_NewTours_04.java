package com.qa.testscript;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.NewTours_Pages;

/*Case Study 18:

Goto Newtours --> http://newtours.demoaut.com/
Enter Login Credential of Username & Password as "mercury"
Click on Signin Button
Check if  'India' is present or not in the Departing from list box.
*/

public class TC_NewTours_04 extends TestBase {

	@Test
	@Parameters("url")
	public void newtours18(String url) {
		int count = 0;
		NewTours_Pages newtours = new NewTours_Pages(driver);

		driver.get(url);

		// Check if 'India' is present or not in the Departing from list box.

		newtours.getFlight().click();

		List<WebElement> items = newtours.getDeparture().getOptions();
		for (WebElement present : items) {
			String dropdownOptionValue = present.getText();
			if (dropdownOptionValue.equals("India")) {
				System.out.println("India is present in the dropdown list");
				count++;
				break;
			}
		}
		if (count == 0)
			System.out.println("India is not present in the dropdown list");
		    Reporter.log("India is not present in the dropdown list");

	}
}

