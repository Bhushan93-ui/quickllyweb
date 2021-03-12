/**
 * 
 */
package com.quicklly.ShopByDepartGroceryPageObjects;
import com.quicklly.LoginPageObjects.*;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

//import com.quicklly.LoginPageObjects.Login;
import com.utilities.BaseTest;
import com.utilities.Xls_Reader;

/**
 * @author dinkar.s
 *
 */
public class ShopByDepartmentGrocery extends BaseTest{
	
	private static String suite = "ShopByDepartmentGrocery";
	
	
	 public static void ABC(final String suite) {
	try {
		driver(suite).findElement(By.id(getValueFromData("idzipcode"))).sendKeys("60611");
		driver.wait(5000);
		driver(suite).findElement(By.id(getValueFromData("idzipcodesubmitbtn"))).click();
		driver.wait(5000);
		driver(suite).findElement(By.className(getValueFromData("classnameShopByCart"))).click();
		Thread.sleep(5000);
		driver(suite).findElement(By.xpath(getValueFromData("classnameShopByCart"))).click();
		Thread.sleep(3000);
		driver(suite).findElement(By.xpath(getValueFromData("xpGrocery"))).click();
		Thread.sleep(5000);
		driver(suite).findElement(By.cssSelector(getValueFromData("csskamadarplaza"))).click();
		Thread.sleep(3000);
		driver(suite).findElement(By.xpath(getValueFromData("xpShopAllItemskamadarplaza"))).click();
	    Thread.sleep(3000);
		driver(suite).findElement(By.xpath(getValueFromData("xpkamadarplazacategoryGrocery"))).click();
		Thread.sleep(4000);
		driver(suite).findElement(By.xpath(getValueFromData("xpKamadarplazaProductSabudana"))).click();
		Thread.sleep(4000);
		driver(suite).findElement(By.xpath(getValueFromData("xpsabudanaAddButton"))).click();
		Thread.sleep(4000);

		driver(suite).findElement(By.xpath(getValueFromData("xpkamadarplazaproductattaRoyal"))).click();
		Thread.sleep(4000);

		driver(suite).findElement(By.xpath(getValueFromData("xpRoyalAttaAddButton"))).click();
		
		driver(suite).findElement(By.xpath(getValueFromData("xpcartButton"))).click();
		
		driver(suite).findElement(By.xpath(getValueFromData("idProceedToCheckout"))).click();
		
//		Login.SignIn(suite);
		
		driver(suite).findElement(By.xpath(getValueFromData("idDeliveryNotes"))).sendKeys("Test Order-Grocery");
		
		driver(suite).findElement(By.xpath(getValueFromData("idProceedToPayment"))).click();
		
		driver(suite).findElement(By.xpath(getValueFromData("xpPaymentPopupPanel"))).isSelected();
		
		
		
		
		 Xls_Reader x = new Xls_Reader(
	             System.getProperty("user.dir") + "\\config\\data.xlsx");
	    
		for (int i = 1; i <= 1; i++) {
	        // Enter user name
	        driver(suite).findElement(By.id(getValueFromData("idCardNumber")))
	                .sendKeys(x.getCellData("Sheet1", "CardNumber", i));
	        Reporter.log("Passed:- Successfully enter 'Card Number '");
	        // Enter Pwd
	        driver(suite).findElement(By.id(getValueFromData("idExpirationDate")))
	                .sendKeys(x.getCellData("Sheet1", "ExpiryDate", i));
	        Reporter.log("Passed:- Successfully enter 'Card Expiry date'");
	        
	        driver(suite).findElement(By.id(getValueFromData("idCvv"))).sendKeys(x.getCellData("Sheet1", "Cvv", i));

	        Reporter.log("Passed:- Successfully enter 'CVV Number'");
	        
	        // Click on Pay button
	        driver(suite).findElement(By.id(getValueFromData("idLoginbtn"))).click();
	        Reporter.log("Passed:- Successfully Clicked on 'Submit' Button");
	    }
	}
	catch (Exception e) {
		System.out.println(e);
		e.printStackTrace();
	}
	
	
	
	
	
	
}
}
