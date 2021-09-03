package com.qa.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_Ebay_03 extends TestBase {

	@Test
public void Register() {
		
		System.out.println(driver.findElement(By.linkText("register")).getAttribute("register"));
		
   }
}