package com.quicklly.RegistrationTC;

import java.math.BigDecimal;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.utilities.HandleModelDialog;
import com.utilities.TestConstants;
import com.utilities.Xls_Reader;
import com.quicklly.RegistrationPageObjects.Registration;
import com.utilities.BaseTest;
import com.utilities.CheckAlert;
import com.utilities.Common_Methods;

public class RegistrationTC extends BaseTest{

	private static String suite="RegistrationTC";
	
	/**
	 * @author dinkar.s
	 * 
	 */
	@Test
	public void verifySignUpPageFunctionality() throws Throwable{
		driver(suite).navigate().back();
		Thread.sleep(12000);
		//Click on 'Upload' Button
		Common_Methods.xpClickOnButtn(suite, getValueFromData("xpClickOnUploadResume"));
		//Click on 'Sing In Here' Button
		Common_Methods.xpClickOnButtn(suite, getValueFromData("xpSignInHereBuntn"));
		Reporter.log("Passed:- Successfully clicked on 'Sign In Here' Button");
		Thread.sleep(1000);
		driver(suite).navigate().back();
		Thread.sleep(1000);
		//Call 'verifyGUIofSignUpPage' Method
		Registration.verifyGUIofSignUpPage(suite);
		//Click on 'Create Now' Button
		Common_Methods.idClickOnButtn(suite, getValueFromData("idCreateNowButtn"));
		
	
		//Call 'handleAlert' Method
		CheckAlert.handleAlert(suite);
		//Call 'verifySignInValidation' Method
		//Registration.verifySignInValidation(suite);
		Xls_Reader x=new Xls_Reader(System.getProperty("user.dir")+"\\config\\data.xlsx");
		 int rcount=x.getRowCount("Sheet1");
		 for(int i=2 ;i<=rcount ;i++){
			//Enter 50 characters with Space and special Characters in the 'First Name' Text Box
			driver(suite).findElement(By.id(getValueFromData("idFirstNameTextBox"))).sendKeys(x.getCellData("Sheet1", "maxFirstName", i));
			Reporter.log("Passed:- Successfully Enter Only 50 characters with Space and special Characters in the 'First Name' Text Box");
			//Enter 50 characters with Space and special Characters in the 'Last Name' Text Box
			driver(suite).findElement(By.id(getValueFromData("idLastNameTextBox"))).sendKeys(x.getCellData("Sheet1", "maxLastName", i));
			Reporter.log("Passed:- Successfully Enter 50 characters with Space and special Characters in the 'Last Name' Text Box");
}}}
