package com.utilities;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;


public class Common_Methods extends BaseTest{
	private static String suite = "Common_Methods";
	
	/**
	 * @author dinkar.s
	 * 
	 */
	public static void xpClickOnButtn(final String suite,String LocXpath) throws Throwable{
		
		if (driver(suite).findElement(By.xpath(LocXpath)).getText()!=null){
			try {
				String GetText=driver(suite).findElement(By.xpath(LocXpath)).getText();
				//Click on 'Submit' button
				driver(suite).findElement(By.xpath(LocXpath)).click();
				Reporter.log("Passed:- Successfully clicked on"+" "+ GetText+" Button");
			} catch (Exception e) {
				String GetText=driver(suite).findElement(By.xpath(LocXpath)).getText();
				Reporter.log("Failed:- Unable to clicked on "+" "+ GetText+" Button");	
			}
		}
			else if (driver(suite).findElement(By.xpath(LocXpath)).getAttribute("value")!=null) {
				try {
					String GetValueAttribute=driver(suite).findElement(By.xpath(LocXpath)).getAttribute("value");
					//Click on 'Submit' button
					driver(suite).findElement(By.xpath(LocXpath)).click();
					Reporter.log("Passed:- Successfully clicked on"+" "+ GetValueAttribute+" Button");
				} catch (Exception e) {
					String GetValueAttribute=driver(suite).findElement(By.xpath(LocXpath)).getAttribute("value");
					Reporter.log("Failed:- Unable to clicked on"+" "+ GetValueAttribute+" Button");	
				}
			}
			else if (driver(suite).findElement(By.xpath(LocXpath)).getAttribute("name")!=null) {
				try {
					String GetValueAttribute=driver(suite).findElement(By.xpath(LocXpath)).getAttribute("value");
					//Click on 'Submit' button
					driver(suite).findElement(By.xpath(LocXpath)).click();
					Reporter.log("Passed:- Successfully clicked on"+" "+ GetValueAttribute+" Button");
				} catch (Exception e) {
					String GetValueAttribute=driver(suite).findElement(By.xpath(LocXpath)).getAttribute("value");
					Reporter.log("Failed:- Unable to clicked on"+" "+ GetValueAttribute+" Button");	
				}
			}
			else {
				driver(suite).findElement(By.xpath(LocXpath)).click();
				Reporter.log("Passed:- Successfully clicked on Button");	
			}
		}
		
	
	/**
	 * @author dinkar.s
	 * 
	 */
	public static void idClickOnButtn(final String suite,String LocId) throws Throwable{
		
		if (driver(suite).findElement(By.id(LocId)).getText()!=null){
			try {
				String GetText=driver(suite).findElement(By.id(LocId)).getText();
				driver(suite).findElement(By.id(LocId)).click();
				Reporter.log("Passed:- Successfully clicked on"+" "+ GetText+" Button");
			} catch (Exception e) {
				String GetText=driver(suite).findElement(By.id(LocId)).getText();
				Reporter.log("Failed:- Unable to clicked on "+" "+ GetText+" Button");	
			}
		}
			else if (driver(suite).findElement(By.id(LocId)).getAttribute("value")!=null) {
				try {
					String GetValueAttribute=driver(suite).findElement(By.id(LocId)).getAttribute("value");
					driver(suite).findElement(By.id(LocId)).click();
					Reporter.log("Passed:- Successfully clicked on"+" "+ GetValueAttribute+" Button");
				} catch (Exception e) {
					String GetValueAttribute=driver(suite).findElement(By.id(LocId)).getAttribute("value");
					Reporter.log("Failed:- Unable to clicked on"+" "+ GetValueAttribute+" Button");	
				}
			}
			else if (driver(suite).findElement(By.id(LocId)).getAttribute("name")!=null) {
				try {
					String GetnameAttribute=driver(suite).findElement(By.id(LocId)).getAttribute("name");
					driver(suite).findElement(By.id(LocId)).click();
					Reporter.log("Passed:- Successfully clicked on"+" "+ GetnameAttribute+" Button");
				} catch (Exception e) {
					String GetnameAttribute=driver(suite).findElement(By.id(LocId)).getAttribute("name");
					Reporter.log("Failed:- Unable to clicked on"+" "+ GetnameAttribute+" Button");	
				}
			}
			else {
				driver(suite).findElement(By.id(LocId)).click();
				Reporter.log("Passed:- Successfully clicked on Button");	
			}
		}
	
	
	
	/**
	 * @author dinkar.s
	 * 
	 */
	public static void linkClickOnLinkText(final String suite,String LocLink) throws Throwable{
		String GetText=driver(suite).findElement(By.linkText(LocLink)).getText();
		try {
			//Click on 'Submit' button
			driver(suite).findElement(By.linkText(LocLink)).click();
			Reporter.log("Passed:- Successfully clicked on"+" "+ GetText+" Link");
		} catch (Exception e) {
			Reporter.log("Failed:- Unable to clicked on"+" "+ GetText+" Link");	
		}
	}
	
	
	/**
	 * @author dinkar.s
	 * 
	 */
	public static void xpVerifyText(final String suite, String LocXpath, String LocContain) throws Throwable{
		String PageTitle = driver(suite).getTitle();
		if (driver(suite).findElement(By.xpath(LocXpath)).getText()!=null && !driver(suite).findElement(By.xpath(LocXpath)).getText().equals("")){
        try {
        	
        	String GetText=driver(suite).findElement(By.xpath(LocXpath)).getText();
			Assert.assertTrue(driver(suite).findElement(By.xpath(LocXpath)).getText().contains(LocContain),"PageTitle:-"+PageTitle+"|"+"Text Name:-"+GetText+"|"+" Text is Not displayed");
			Reporter.log("Passed:-"+""+ "PageTitle:-"+PageTitle+"|"+"Text Name:-"+GetText+"|"+""+"Text is displayed");
		} 
		catch (final Throwable t) {
		Reporter.log("Failed:- "+t.getMessage());	
		throw t;
		}
	}
	/*	else if (driver(suite).findElement(By.xpath(LocXpath)).getText()!=null || !driver(suite).findElement(By.xpath(LocXpath)).getText().equals("")){
	        try {
	        	
	        	String GetText=driver(suite).findElement(By.xpath(LocXpath)).getText();
				Assert.assertTrue(driver(suite).findElement(By.xpath(LocXpath)).getText().contains(LocContain),"PageTitle:-"+PageTitle+"|"+"Text Name:-"+GetText+"|"+" Text is Not displayed");
				Reporter.log("Passed:-"+""+ "PageTitle:-"+PageTitle+"|"+"Text Name:-"+GetText+"|"+""+"Text is displayed");
			} 
			catch (final Throwable t) {
			Reporter.log("Failed:- "+t.getMessage());	
			throw t;
			}
		}*/
		else if (driver(suite).findElement(By.xpath(LocXpath)).getAttribute("value")!=null) {
			try {
	        	String GetValue=driver(suite).findElement(By.xpath(LocXpath)).getAttribute("value");
				Assert.assertTrue(driver(suite).findElement(By.xpath(LocXpath)).getAttribute("value").contains(LocContain),"PageTitle:-"+PageTitle+"|"+"Text Name:-"+GetValue+"|"+" Text is Not displayed");
				Reporter.log("Passed:-"+""+ "PageTitle:-"+PageTitle+"|"+"Text Name:-"+GetValue+"|"+""+"Text is displayed");
			} 
			catch (final Throwable t) {
			Reporter.log("Failed:- "+t.getMessage());	
			throw t;
			}
		}	
		}
	
	
	
	/**
	 * @author dinkar.s
	 * 
	 */
	public static void idVerifyText(final String suite, String LocId, String LocContain) throws Throwable{
		String PageTitle = driver(suite).getTitle();
		
		if (driver(suite).findElement(By.id(LocId)).getText()!=null && !driver(suite).findElement(By.id(LocId)).getText().equals("")){
        try {
        	
        	String GetText=driver(suite).findElement(By.id(LocId)).getText();
			Assert.assertTrue(driver(suite).findElement(By.id(LocId)).getText().contains(LocContain),"PageTitle:-"+PageTitle+"|"+"Text Name:-"+GetText+"|"+" Text is Not displayed");
			Reporter.log("Passed:-"+""+ "PageTitle:-"+PageTitle+"|"+"Text Name:-"+GetText+"|"+""+"Text is displayed");
		} 
		catch (final Throwable t) {
		Reporter.log("Failed:- "+t.getMessage());	
		throw t;
		}
	}
		/*else if (driver(suite).findElement(By.id(LocId)).getText()!=null || !driver(suite).findElement(By.id(LocId)).getText().equals("")){
	        try {
	        	
	        	String GetText=driver(suite).findElement(By.id(LocId)).getText();
				Assert.assertTrue(driver(suite).findElement(By.id(LocId)).getText().contains(LocContain),"PageTitle:-"+PageTitle+"|"+"Text Name:-"+GetText+"|"+" Text is Not displayed");
				Reporter.log("Passed:-"+""+ "PageTitle:-"+PageTitle+"|"+"Text Name:-"+GetText+"|"+""+"Text is displayed");
			} 
			catch (final Throwable t) {
			Reporter.log("Failed:- "+t.getMessage());	
			throw t;
			}
		}*/
		else if (driver(suite).findElement(By.id(LocId)).getAttribute("value")!=null) {
			try {
	        	String GetValue=driver(suite).findElement(By.id(LocId)).getAttribute("value");
				Assert.assertTrue(driver(suite).findElement(By.id(LocId)).getAttribute("value").contains(LocContain),"PageTitle:-"+PageTitle+"|"+"Text Name:-"+GetValue+"|"+" Text is Not displayed");
				Reporter.log("Passed:-"+""+ "PageTitle:-"+PageTitle+"|"+"Text Name:-"+GetValue+"|"+""+"Text is displayed");
			} 
			catch (final Throwable t) {
			Reporter.log("Failed:- "+t.getMessage());	
			throw t;
			}
		}	
        
	}
	
	
	/**
	 * @author dinkar.s
	 * 
	 */
	public static void xpVerifyDisplayTextBox(final String suite, String LocXpath) throws Throwable{
			String PageTitle = driver(suite).getTitle();
		if (driver(suite).findElement(By.xpath(LocXpath)).getAttribute("name")!=null) {
			try {
	        	String Name = driver(suite).findElement(By.xpath(LocXpath)).getAttribute("name");
				Assert.assertTrue(driver(suite).findElement(By.xpath(LocXpath)).isDisplayed(),"PageTitle:-"+PageTitle+"|"+ Name+" :- Text Box is Not displayed");
				Reporter.log("Passed:-"+""+ "PageTitle:-"+PageTitle+"|"+ Name+":-Text is displayed");
			} 
			catch (final Throwable t) {
			Reporter.log("Failed:- "+t.getMessage());	
			throw t;
			}
		}
		else if (driver(suite).findElement(By.xpath(LocXpath)).getAttribute("value")!=null) {
			try {
	        	String Value = driver(suite).findElement(By.xpath(LocXpath)).getAttribute("value");
				Assert.assertTrue(driver(suite).findElement(By.xpath(LocXpath)).isDisplayed(),"PageTitle:-"+PageTitle+"|"+ Value+" :- Text Box is Not displayed");
				Reporter.log("Passed:-"+""+ "PageTitle:-"+PageTitle+"|"+ Value+":-Text is displayed");
			} 
			catch (final Throwable t) {
			Reporter.log("Failed:- "+t.getMessage());	
			throw t;
			}
			
		}																					
		else if (driver(suite).findElement(By.xpath(LocXpath)).getAttribute("name")==null && driver(suite).findElement(By.xpath(LocXpath)).getAttribute("name")==null && driver(suite).findElement(By.xpath(LocXpath)).getText().equals("")) {
			
			try {
				Assert.assertTrue(driver(suite).findElement(By.xpath(LocXpath)).isDisplayed(),"PageTitle:-"+PageTitle+"|"+""+" :- Text Box is Not displayed");
				Reporter.log("Passed:-"+""+ "PageTitle:-"+PageTitle+"|"+ " "+":-Text is displayed");
			} 
			catch (final Throwable t) {
			Reporter.log("Failed:- "+t.getMessage());	
			throw t;
			}
		}
        
	}
	
	
	/**
	 * @author dinkar.s
	 * 
	 */
	public static void idVerifyDisplayTextBox(final String suite, String LocId) throws Throwable{
		String PageTitle = driver(suite).getTitle();
		if (driver(suite).findElement(By.id(LocId)).getAttribute("name")!=null) {
			try {
	        	String Name = driver(suite).findElement(By.id(LocId)).getAttribute("name");
	        	Assert.assertTrue(driver(suite).findElement(By.id(LocId)).isDisplayed(),"PageTitle:-"+PageTitle+"|"+ Name+" :- Text Box is Not displayed");
				Reporter.log("Passed:-"+""+ "PageTitle:-"+PageTitle+"|"+ Name+":- Text is displayed");
			} 
			catch (final Throwable t) {
			Reporter.log("Failed:- "+t.getMessage());	
			throw t;
			}	
		}
		else if (driver(suite).findElement(By.id(LocId)).getAttribute("value")!=null) {
			try {
	        	String Value = driver(suite).findElement(By.id(LocId)).getAttribute("value");
	        	Assert.assertTrue(driver(suite).findElement(By.id(LocId)).isDisplayed(),"PageTitle:-"+PageTitle+"|"+ Value+" :- Text Box is Not displayed");
				Reporter.log("Passed:-"+""+ "PageTitle:-"+PageTitle+"|"+ Value+":- Text is displayed");
			} 
			catch (final Throwable t) {
			Reporter.log("Failed:- "+t.getMessage());	
			throw t;
			}
		}
		else if (driver(suite).findElement(By.id(LocId)).getAttribute("name")==null && driver(suite).findElement(By.id(LocId)).getAttribute("value")==null && driver(suite).findElement(By.id(LocId)).getText().equals("")) {
			
			try {
				Assert.assertTrue(driver(suite).findElement(By.id(LocId)).isDisplayed(),"PageTitle:-"+PageTitle+"|"+""+" :- Text Box is Not displayed");
				Reporter.log("Passed:-"+""+ "PageTitle:-"+PageTitle+"|"+ " "+":-Text is displayed");
			} 
			catch (final Throwable t) {
			Reporter.log("Failed:- "+t.getMessage());	
			throw t;
			}
		}
		
	}
	
	/**
	 * @author dinkar.s
	 * 
	 */
	public static void idVerifySelectedTextBox(final String suite, String LocId) throws Throwable{
		
		String PageTitle = driver(suite).getTitle();
		if (driver(suite).findElement(By.id(LocId)).getAttribute("name")!=null) {
			try {
	        	String Name = driver(suite).findElement(By.id(LocId)).getAttribute("name");
	        	driver(suite).findElement(By.id(LocId)).isSelected();
				Reporter.log("Passed:-"+""+ "PageTitle:-"+PageTitle+"|"+ Name+":- Check Box is Selected");
			} 
			catch (final Throwable t) {
				Reporter.log("Passed:-Check Box is Not Selected");
				System.out.println("Passed:-Check Box is Not Selected");

			throw t;
			}	
		}
		else if (driver(suite).findElement(By.id(LocId)).getAttribute("value")!=null) {
			try {
	        	String Value = driver(suite).findElement(By.id(LocId)).getAttribute("value");
	        	driver(suite).findElement(By.id(LocId)).isSelected();
				Reporter.log("Passed:-"+""+ "PageTitle:-"+PageTitle+"|"+ Value+":- Check Box is Selected");
			} 
			catch (final Throwable t) {
				System.out.println("Passed:-Check Box is Not Selected");	

			throw t;
			}
		}
	}
	
	/**
	 * @author dinkar.s
	 * 
	 */
	public static void xpVerifySelectedTextBox(final String suite, String LocXpath) throws Throwable{
		
		String PageTitle = driver(suite).getTitle();
		if (driver(suite).findElement(By.xpath(LocXpath)).getAttribute("name")!=null) {
			try {
	        	String Name = driver(suite).findElement(By.xpath(LocXpath)).getAttribute("name");
				driver(suite).findElement(By.xpath(LocXpath)).isSelected();
				Reporter.log("Passed:-"+""+ "PageTitle:-"+PageTitle+"|"+ Name+":-Text is displayed");
			} 
			catch (final Throwable t) {
				System.out.println("Passed:-Check Box is Not Selected");

			throw t;
			}
		}
		else if (driver(suite).findElement(By.xpath(LocXpath)).getAttribute("value")!=null) {
			try {
	        	String Value = driver(suite).findElement(By.xpath(LocXpath)).getAttribute("value");
				driver(suite).findElement(By.xpath(LocXpath)).isSelected();
				Reporter.log("Passed:-"+""+ "PageTitle:-"+PageTitle+"|"+ Value+":-Text is displayed");
			} 
			catch (final Throwable t) {
				System.out.println("Passed:-Check Box is Not Selected");

			throw t;
			}
		}
	}
	
	
	/**
	 * @author dinkar.s
	 * 
	 */
	public static void xpVerifyEnabledTextBox(final String suite, String LocXpath) throws Throwable{
			String PageTitle = driver(suite).getTitle();
		if (driver(suite).findElement(By.xpath(LocXpath)).getAttribute("name")!=null) {
			try {
	        	String Name = driver(suite).findElement(By.xpath(LocXpath)).getAttribute("name");
				Assert.assertTrue(driver(suite).findElement(By.xpath(LocXpath)).isEnabled(),"PageTitle:-"+PageTitle+"|"+ Name+" :- Text Box is Not displayed");
				Reporter.log("Passed:-"+""+ "PageTitle:-"+PageTitle+"|"+ Name+":-Text is displayed");
			} 
			catch (final Throwable t) {
			Reporter.log("Failed:- "+t.getMessage());	
			throw t;
			}
		}
		else if (driver(suite).findElement(By.xpath(LocXpath)).getAttribute("value")!=null) {
			try {
	        	String Value = driver(suite).findElement(By.xpath(LocXpath)).getAttribute("value");
				Assert.assertTrue(driver(suite).findElement(By.xpath(LocXpath)).isEnabled(),"PageTitle:-"+PageTitle+"|"+ Value+" :- Text Box is Not displayed");
				Reporter.log("Passed:-"+""+ "PageTitle:-"+PageTitle+"|"+ Value+":-Text is displayed");
			} 
			catch (final Throwable t) {
			Reporter.log("Failed:- "+t.getMessage());	
			throw t;
			}
		}
        
	}
	
	
	/**
	 * @author dinkar.s
	 * 
	 */
	public static void idVerifyEnabledTextBox(final String suite, String LocId) throws Throwable{
		String PageTitle = driver(suite).getTitle();
		if (driver(suite).findElement(By.id(LocId)).getAttribute("name")!=null) {
			try {
	        	String Name = driver(suite).findElement(By.id(LocId)).getAttribute("name");
	        	Assert.assertTrue(driver(suite).findElement(By.id(LocId)).isEnabled(),"PageTitle:-"+PageTitle+"|"+ Name+" :- Text Box is Not displayed");
				Reporter.log("Passed:-"+""+ "PageTitle:-"+PageTitle+"|"+ Name+":- Text is displayed");
			} 
			catch (final Throwable t) {
			Reporter.log("Failed:- "+t.getMessage());	
			throw t;
			}	
		}
		else if (driver(suite).findElement(By.id(LocId)).getAttribute("value")!=null) {
			try {
	        	String Value = driver(suite).findElement(By.id(LocId)).getAttribute("value");
	        	Assert.assertTrue(driver(suite).findElement(By.id(LocId)).isEnabled(),"PageTitle:-"+PageTitle+"|"+ Value+" :- Text Box is Not displayed");
				Reporter.log("Passed:-"+""+ "PageTitle:-"+PageTitle+"|"+ Value+":- Text is displayed");
			} 
			catch (final Throwable t) {
			Reporter.log("Failed:- "+t.getMessage());	
			throw t;
			}
		}
		
	}
	
		/**
		 * @author dinkar.s
		 * 
		 */
		public static void xpClearTextBox(final String suite, String LocXpath) throws Throwable{
			String getTextBoxName=driver(suite).findElement(By.xpath(LocXpath)).getAttribute("name");
			driver(suite).findElement(By.xpath(LocXpath)).clear();
			Reporter.log("Passed:-"+""+ "Text Box Name:-"+getTextBoxName+":- Text is displayed");
		}
		
		/**
		 * @author dinkar.s
		 * 
		 */
		public static void idClearTextBox(final String suite, String LocId) throws Throwable{
			String getTextBoxName=driver(suite).findElement(By.id(LocId)).getAttribute("name");
			driver(suite).findElement(By.id(LocId)).clear();
			Reporter.log("Passed:-"+""+ "Text Box Name:-"+getTextBoxName+":- Text is displayed");
		}
		
		public static void Makepayment(final String suite, int Cardnumber, int Expdate, int Cvv) {
			
		}
	
	
}
