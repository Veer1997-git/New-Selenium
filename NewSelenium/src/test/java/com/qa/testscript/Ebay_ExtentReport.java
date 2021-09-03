//
//	package com.qa.testscript;
//
//	import java.io.IOException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
//	public class Ebay_ExtentReport extends BaseTest {
//	@BeforeTest
//		public void startReport()
//		{
//			htmlReporter = new ExtentHtmlReporter("test-output/Extent Report/Google.html");
//            htmlReporter.config().setDocumentTitle("Test Automation Report");
//            htmlReporter.config().setReportName("Functional Testing");
//            htmlReporter.config().setTheme(Theme.DARK);
//            
//            XReport=new ExtentReports();
//            XReport.attachReporter(htmlReporter);
//            XReport.setSystemInfo("HostName","LocalHost");
//            XReport.setSystemInfo("OS", "Windows");
//            XReport.setSystemInfo("Browser", "Chrome");
//	}
//		
//		
//		
//	
//		@Test(dataProvider="getData")
//		@Parameters({"xpath2"})
//		public void TC_10(String xpath,String key,String xpath2)
//		{
//			XTest=XReport.createTest("TC_10");
//			driver.findElement(By.xpath(xpath)).sendKeys(key);
//			driver.findElement(By.xpath(xpath2)).getText();
////		googlepage.searchTerm(xpath1).sendKeys(key); 
////			googlepage.getSuggestedBox(xpath2).getText();
//			System.out.println(driver.findElement(By.xpath(xpath2)).getText());
//			driver.findElement(By.xpath(xpath2)).submit();
////			googlepage.getSuggestedBox(xpath2).submit();
//	     if(driver.getTitle()==key)
//	     {
//	    	 System.out.println("same");
//	     }
//	     else
//	     {
//	    	 System.out.println("not same");
//	     }
//		}
//		/*
//@AfterMethod
//		
//		public void tearDown(ITestResult result)
//		{
////			
//			if(result.getStatus()==ITestResult.FAILURE)
//			{
//				XTest.log(Status.FAIL,"The status failed is"+result.getName());
//				XTest.log(Status.FAIL,"The status failed is"+result.getThrowable());
//			}
//			else if(result.getStatus()==ITestResult.SUCCESS)
//			{
//				XTest.log(Status.PASS, "The status passed is"+result.getName());
//			}
//			else if(result.getStatus()==ITestResult.SKIP)
//			{
//				XTest.log(Status.SKIP, "The status skipped is"+ result.getName());
//			}
//		}
//@AfterTest
//public void endReport()
//{
//	driver.quit();
//	XReport.flush();
//}
//*/
//@DataProvider
//public String[][] getData() throws IOException
//{
//	String xFile="F:\\Exercise\\destinationqa\\src\\test\\java\\com\\qa\\test\\Google\\GoogleInput.xlsx";
//	String xSheet="Sheet1";
//	int rowcount=ExcelUtility.getRowCount(xFile, xSheet);
//	int colcount=ExcelUtility.getCellCount(xFile, xSheet, rowcount);
//	String data[][]=new String[rowcount][colcount];
//	for(int i=1;i<=rowcount;i++)
//	{
//		for(int j=0;j<colcount;j++)
//		{
//			data[i-1][j]=ExcelUtility.getCellData(xFile, xSheet, i,j);
//		}
//	}
//	return data;
//	
//
//	}
//	}
