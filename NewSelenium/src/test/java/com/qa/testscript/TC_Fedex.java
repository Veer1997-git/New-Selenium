package com.qa.testscript;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.Fedex_Pages;

/*Case Study : 13

1. Goto http://www.fedex.com/sg/
2. Verify whther the User ID & Password text box is available or not?
3. Get & Print the already available default text avaialable User ID & Password Text box 
   & Set new value.
4. Get & Print the default text available on the list object & Select any one item in the list box
5. Verify the Remember me check box, should be selected by default.
6. Click on the Login button using Submit().*/
public class TC_Fedex extends TestBase {

	@Test
	@Parameters("url")
	public void fedex(String url) {
		Fedex_Pages fedex = new Fedex_Pages(driver);

		// 1.Goto http://www.fedex.com/sg/

		driver.get(url);

		// 2.Verify whther the User ID & Password text box is available or not?

		fedex.getLogin().click();
		System.out.println("Verify whther the User ID & Password text box is available or not");
		System.out.println("User name:" + fedex.getUsername().isDisplayed());
		System.out.println("Password:" + fedex.getPassword().isDisplayed());

		/*
		 * 3.Get & Print the already available default text avaialable User ID &
		 * Password Text box & Set new value.
		 */

		System.out.println("Default username value : " + fedex.getUsername().getText());
		System.out.println("Default password value : " + fedex.getPassword().getText());

		// 4.Get & Print the default text available on the list object & Select any one
		// item in the list box

		// 5.Verify the Remember me check box, should be selected by default.

		System.out.println("**********************************************");
		System.out.println("Verify the Remember me check box, should be selected by default.");
		System.out.println(fedex.getRememberMe().isSelected());

		// 6.Click on the Login button using Submit().
		// fedex.getLogin().submit();
	}
}
