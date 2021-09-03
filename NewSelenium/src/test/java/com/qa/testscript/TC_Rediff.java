package com.qa.testscript;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.Rediff_pages;

/*Case Study 4:Example for Navigate()

1. Open Browser
2. Launch url Rediff.com
3. Get & print the title of the home page
4. Click on Sign in
5. get& Print the title of the Login page
6. Go Back to the previous page using navigate method 
7. get the title & check if it same as home page
8. Use forward method & get the page title & check if it same as Login page
9. Close all the browser entities.*/

public class TC_Rediff extends TestBase{

	 @Test
	 @Parameters("url")
	 public void rediff(String url) {
		 Rediff_pages rediff = new Rediff_pages(driver);
		 
		// 2.Launch url Rediff.com
		 
		 driver.get(url);
		 
		 //3.Get & print the title of the home page
		 
		 String homePageTitle = driver.getTitle();
		 System.out.println("Home Page Title : "+homePageTitle);
		 
		 //4.Click on Sign in
		 rediff.SignIn().click();
		 
		 //5.get& Print the title of the Login page
		 
		 String loginPageTitle = driver.getTitle();
		 System.out.println("Login Page Title : "+loginPageTitle);
		 
		 //6.Go Back to the previous page using navigate method 
		 driver.navigate().back();
		 
		 
		 //7. get the title & check if it same as home page
		 
		 String homePageTitle1 = driver.getTitle();
			if(homePageTitle1.equals(homePageTitle))
				System.out.println("Title is same as home page");
			else
				System.out.println("Title is not same as home page");
			
		 //8.Use forward method & get the page title & check if it same as Login page
		    
			driver.navigate().forward();
			String loginPageTitle1 = driver.getTitle();
			if(loginPageTitle1.equals(loginPageTitle))
				System.out.println("Title is same as login page");
			else
				System.out.println("Title is not same as login page");
			
		//9.Close all the browser entities
			driver.quit();	
		 
	 }
}
