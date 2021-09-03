package com.qa.testscript;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.pages.Amazon_Pages;

/*Case Study 6:
1. Goto Amazon.in
2. Select <category>
2. Search for the <item name>
3. Click search button
4. Print all the collection of items that are loaded 
5. Get the Title & price of all the items and log the results


Books, Da vinci code
Electronics,Mobile phones
Furniture, Wooden tables*/

public class TC_Amazon extends TestBase{
	
	 @Test()
	 @Parameters("url")
	 public void amazon(String url) {
     Amazon_Pages amazon = new Amazon_Pages(driver);
		 
		//1. Goto Amazon.in
		 
		driver.get(url);
		
		//2.Select <category>, Books
		amazon.getCategoy().selectByVisibleText("Books");
		
		//2.Search for the <item name>, Da vinci code
		amazon.getSearchtextbox().sendKeys("Da vinci code");
		
		//3.Click search button
		amazon.getMagnifierBtn().click();
		
		//4.Print all the collection of items that are loaded
		List<WebElement> item = amazon.getSelectedItems();
		for(WebElement we : item ) {
			System.out.println(we.getText());
			System.out.println("****************************************");
		}
		
		//5.Get the Title & price of all the items and log the results
		List<WebElement> title = amazon.getTitle();
		List<WebElement> price = amazon.getPrice();
		for(WebElement we : title ) {
			System.out.println(we.getText());
		}
		System.out.println("****************************************");
		for(WebElement we : price) {
			System.out.println(we.getText());
		}
	driver.quit();
}
	 
//	 @DataProvider
//	 public Object[][] getData() {
//		 
//		 Object[][] data = new Object[3][2];
//		 
//		 //category list box
//		 data[0][0]="Books";
//		 data[1][0]="Electronics";
//		 data[2][0]="Furniture";
//		 
//		 //Item name field
//		 data[0][1]="Da vinci code";
//		 data[1][2]="Mobiles";
//		 data[2][3]="Wooden tables";
//		 return data; 
//		 
//		 
//		 
//	 }
//	 
	 
}
