package com.qa.testscript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class TestBase {
    public  WebDriver driver;
         
   @BeforeClass 
    public void initilalization() {
    	   //Opening browser
    	
    		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\Drivers\\chromedriver.exe");
    	    driver = new ChromeDriver();
    	    driver.manage().window().maximize();	
    }
   
   @AfterClass
    public void tearDown() {
    	//close browser
    	driver.close();
    }
   
    
}




