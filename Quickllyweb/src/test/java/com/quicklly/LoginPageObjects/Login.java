package com.quicklly.LoginPageObjects;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.utilities.BaseTest;
import com.utilities.Common_Methods;
import com.utilities.Xls_Reader;

public class Login extends BaseTest {

    private static String suite = "Login";
    
    public static void NavigatetoSigninpopup(final String suite) throws Throwable {
    	
    	
    		driver(suite).findElement(By.id(getValueFromData("idzipcode"))).sendKeys("60611");
    		driver(suite).findElement(By.id(getValueFromData("idzipcodesubmitbtn"))).click();
    		driver(suite).findElement(By.xpath(getValueFromData("xpclose"))).click();
    		driver(suite).findElement(By.xpath(getValueFromData("xpyouraccount"))).click();
    		Thread.sleep(5000);
    		
    		
    		driver(suite).findElement(By.xpath(getValueFromData("xpyouraccount"))).click();
    		driver(suite).findElement(By.xpath(getValueFromData("xpsignButton"))).click();
    		driver(suite).findElement(By.xpath(getValueFromData("xpsigninPanel"))).click();
    		   		
    		
    	}
    
    	
    	
    

    public static void SignIn(final String suite)
        
    
            throws Throwable {
        try {
        	NavigatetoSigninpopup(suite);
//        	driver(suite).findElement(By.id(getValueFromData("idzipcode"))).sendKeys("60611");
//    		driver(suite).findElement(By.id(getValueFromData("idzipcodesubmitbtn"))).click();
    		
        	Thread.sleep(5000);
            Reporter.log(
                    "***********SuccessFully Login with New User***********");
            Xls_Reader x = new Xls_Reader(
                    System.getProperty("user.dir") + "\\config\\data.xlsx");
            // Don't change size it's dependent on other test cases
            for (int i = 2; i <= 2; i++) {
                // Enter user name
                driver(suite).findElement(By.id(getValueFromData("idUseremail")))
                        .sendKeys(x.getCellData("Sheet1", "newUsername", i));
                Reporter.log("Passed:- Successfully enter 'User Name'");
                // Enter Pwd
                driver(suite).findElement(By.id(getValueFromData("idPassword")))
                        .sendKeys(x.getCellData("Sheet1", "newPassword", i));
                Reporter.log("Passed:- Successfully enter 'Password'");
                // Click on Submit button
                driver(suite).findElement(By.id(getValueFromData("idLoginbtn"))).click();
                Reporter.log("Passed:- Successfully Clicked on 'Submit' Button");
                
            }
        } catch (Exception e) {
            Reporter.log("Failed:- Login Page is Not Found");
            
            
        }
    }

    public static void verifyLoginGUIPage(final String suite) throws Throwable {
        // Verify 'User name' Text Box is display
        Common_Methods.idVerifyDisplayTextBox(suite,
                getValueFromData("idUserName"));
        // Verify 'Password' Text Box is display
        Common_Methods.idVerifyDisplayTextBox(suite,
                getValueFromData("idPassword"));
        // Verify 'Submit' Button Text Box is display
        Common_Methods.xpVerifyDisplayTextBox(suite,
                getValueFromData("xpSignin"));
        // Verify 'Forget Username' Link
        Common_Methods.idVerifyText(suite, getValueFromData("idForgetName"),
                getValueFromData("ContainForgetName"));
        // Verify 'Forget Password' Link
        Common_Methods.idVerifyText(suite, getValueFromData("idForgetPwd"),
                getValueFromData("ContainForgetPwd"));
      
    }

   
}
