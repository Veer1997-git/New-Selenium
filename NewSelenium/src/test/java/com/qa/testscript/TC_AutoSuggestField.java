package com.qa.testscript;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AutoSuggestField_Pages;
import com.qa.utility.ExcelUtility;

/*Case Study 5: The following case study is to demonstrate on how to retrieve the 
	values from Auto suggest fields.

	1. Open Browser
	2. Launch google url
	3. Search for "Automation Testing"
	4. Fetch all the items loaded in the auto suggest field and print
	5. Click on Search button
	6. Get the title should be same as search term*/

public class TC_AutoSuggestField extends TestBase {

	@Test                  //(dataProvider="getData")
	@Parameters("url")
	public void google(String url) throws InterruptedException {
		AutoSuggestField_Pages page = new AutoSuggestField_Pages(driver);
		// Launch the google URL
		driver.get(url);

		// Search for "Automation Testing"

		page.getSearchbox().sendKeys("Automation Testing");

		// Fetch all the items loaded in the auto suggest field and print
		
		Thread.sleep(5000);
		List<WebElement> searchItem = page.getSuggestedNames();
		for (WebElement l : searchItem) {
			System.out.println(l.getText());
			Reporter.log(l.getText());
			
		}

		// Click on Search button
		page.getMagnifier().submit();

		// Get the title should be same as search term

		if (driver.getTitle().contains("Automation Testing"))
			Reporter.log("search item and title Both are equal ", true);
		else
			Reporter.log("search item and title Both are nor equal ", true);

	}

//	@DataProvider
//	public String[][] getData() throws IOException{
//		
//		
////		Object[][] data = new Object[3][2];
////		
////		//Category list box
////		data[0][0]="";
////		data[1][0]="";
////		data[2][0]="";
////		
////		//Item name field
////		data[0][1]="";
////		data[1][1]="";
////		data[2][1]="";
//		
//		
//		String xFile =  "C:\\Users\\Admin\\eclipse-workspace\\NewSelenium\\src\\test\\java\\com\\qa\\testdata\\Inputdata.xlsx";
//		String xSheet = "Sheet1";
//		
//		int rowCount = ExcelUtility.getRowCount(xFile, xSheet);
//		int cellCount = ExcelUtility.getCellCount(xFile, xSheet, rowCount);
//		
//		String[][] data = new String[rowCount][cellCount];
//		
//		for(int i=1; i<=rowCount; i++) {
//			for(int j=0; j<cellCount; j++) {
//				data[i-1][j]= ExcelUtility.getCelldata(xFile, xSheet, i, j);
//				
//			}
//		}
//		
//		
//		return data;
//}
//


}
