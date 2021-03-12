package com.quicklly.zipcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.quicklly.LoginPageObjects.Login;
import com.utilities.BaseTest;
import com.utilities.Common_Methods;
import com.utilities.Xls_Reader;

public class ZipcodeTC extends BaseTest {

    private static String suite = "LoginTC";

    /**
     * @author Dinkar Singh
     * @throws Throwable
     * 
     */
    @Test
    public void verifyLoginPageFunctionlity() throws Throwable {
        Thread.sleep(3000);
        // Call 'verifyLoginGUIPage' Method
        Login.verifyLoginGUIPage(suite);
        // Verify 'UserName' Text Box is enabled
        Common_Methods.idVerifyEnabledTextBox(suite,
                getValueFromData("idUserName"));
        // Verify 'Password' Text Box is enabled
        Common_Methods.idVerifyEnabledTextBox(suite,
                getValueFromData("idPassword"));
        // Click on 'Sign In' Button
        Common_Methods.xpClickOnButtn(suite, getValueFromData("xpSignin"));
        // Verify 'Please enter a value in User Name'
        Common_Methods.xpVerifyText(suite, getValueFromData("xpErorUSrName"),
                getValueFromData("ContainErorUSrName"));
        // Close Error PopUp
        Common_Methods.xpClickOnButtn(suite,
                getValueFromData("xpSignClosePopUP"));
        Actions move = new Actions(driver(suite));
        WebElement obj = driver(suite)
                .findElement(By.xpath(getValueFromData("xpMouseSing")));
        move.moveToElement(obj).perform();
        Xls_Reader x = new Xls_Reader(
                System.getProperty("user.dir") + "\\config\\data.xlsx");
        int rcount = x.getRowCount("Sheet1");
        for (int i = 2; i <= rcount; i++) {

            // Enter 'Invalid' User Name
            driver(suite).findElement(By.id(getValueFromData("idUserName")))
                    .sendKeys(x.getCellData("Sheet1", "invalidEmailid", i));
            Reporter.log(
                    "Passed:- Enter Invalid User Name in the 'User name' Text Box");
            // Click on 'Sign In' Button
            Common_Methods.xpClickOnButtn(suite, getValueFromData("xpSignin"));
            // Verify 'Please enter a value in Password'
            Common_Methods.xpVerifyText(suite,
                    getValueFromData("xpErorUSrName"),
                    getValueFromData("ContainErorPWD"));
            // Close Error PopUp
            Common_Methods.xpClickOnButtn(suite,
                    getValueFromData("xpSignClosePopUP"));
            WebElement obj1 = driver(suite)
                    .findElement(By.xpath(getValueFromData("xpMouseSing")));
            move.moveToElement(obj1).perform();
            // Clear 'User Name' Text Field
            driver(suite).findElement(By.id(getValueFromData("idUserName")))
                    .clear();
            // Enter 'Invalid' Password
            driver(suite).findElement(By.id(getValueFromData("idPassword")))
                    .sendKeys(x.getCellData("Sheet1", "invalidmobileNum", i));
            // Click on 'Sign In' Button
            Common_Methods.xpClickOnButtn(suite, getValueFromData("xpSignin"));
            // Verify 'Please enter a value in User Name.'
            Common_Methods.xpVerifyText(suite,
                    getValueFromData("xpErorUSrName"),
                    getValueFromData("ContainErrorInvalidUsr"));
            // Close Error PopUp
            Common_Methods.xpClickOnButtn(suite,
                    getValueFromData("xpSignClosePopUP"));
            WebElement obj2 = driver(suite)
                    .findElement(By.xpath(getValueFromData("xpMouseSing")));
            move.moveToElement(obj2).perform();
            // Enter 'Invalid' User Name
            driver(suite).findElement(By.id(getValueFromData("idUserName")))
                    .sendKeys(x.getCellData("Sheet1", "invalidEmailid", i));
            Reporter.log(
                    "Passed:- Enter Invalid User Name in the 'User name' Text Box");
            // Click on 'Sign In' Button
            Common_Methods.xpClickOnButtn(suite, getValueFromData("xpSignin"));
            // Verify 'Please recheck, Username/E-mail id/Password is
            // incorrect.'
            Common_Methods.xpVerifyText(suite,
                    getValueFromData("xpInvalidUsrPwd"),
                    getValueFromData("ContainRechkUsrPwd"));
            // Click on 'Forget UserName' Link
            Common_Methods.idClickOnButtn(suite,
                    getValueFromData("idForgetName"));
            Thread.sleep(2000);
            // Verify 'Forgot UserName' Heading Text
            Common_Methods.xpVerifyText(suite,
                    getValueFromData("xpForgetUsrNameText"),
                    getValueFromData("ContainForgetName"));
            // Verify 'Email Address' Text
            Common_Methods.xpVerifyText(suite,
                    getValueFromData("xpForgotEmailText"),
                    getValueFromData("ContainForgotEmailText"));
            // Verify 'Email Address' Text Box is enabled
            Common_Methods.idVerifyEnabledTextBox(suite,
                    getValueFromData("idForgotEmailTextBox"));
            // Click on 'Submit' Button
            Common_Methods.xpClickOnButtn(suite,
                    getValueFromData("xpForgotSubmitButtn"));
            // Verify 'Please enter the recepient's email address' Text
            Common_Methods.xpVerifyText(suite,
                    getValueFromData("xpPlzEntrEmailError"),
                    getValueFromData("ContainPlzEntrEmailError"));
            // Click on 'Cross' Button
            Common_Methods.idClickOnButtn(suite,
                    getValueFromData("idCloseForgotPopup"));
            Thread.sleep(1000);
            // Click on 'Forgot Password' Link
            Common_Methods.idClickOnButtn(suite,
                    getValueFromData("idForgetPwd"));
            Thread.sleep(2000);
            // Verify 'ForGot Password' Text
            Common_Methods.xpVerifyText(suite,
                    getValueFromData("xpForgtPwdTextPopUp"),
                    getValueFromData("ContainForgetPwd"));
            // Verify 'Email Address' Text
            Common_Methods.xpVerifyText(suite,
                    getValueFromData("xpForgotPwdEmailText"),
                    getValueFromData("ContainForgotEmailText"));
            // Verify 'Email Address' Text Box is enabled
            Common_Methods.idVerifyEnabledTextBox(suite,
                    getValueFromData("idForgotEmailTextBox"));
            // Click on 'Submit' Button
            Common_Methods.xpClickOnButtn(suite,
                    getValueFromData("xpForgotSubmitButtn"));
            // Verify 'Please enter the recepient's email address' Text
            Common_Methods.xpVerifyText(suite,
                    getValueFromData("xpPlzEntrEmailError"),
                    getValueFromData("ContainPlzEntrEmailError"));
            // Click on 'Cross' Button
            Common_Methods.idClickOnButtn(suite,
                    getValueFromData("idCloseForgotPopup"));
            // Clear 'User Name' Text Field
            driver(suite).findElement(By.id(getValueFromData("idUserName")))
                    .clear();
            // Enter 'Valid' User Name
            driver(suite).findElement(By.id(getValueFromData("idUserName")))
                    .sendKeys(x.getCellData("Sheet1", "newUsername", i));
            Reporter.log(
                    "Passed:- Enter Valid User Name in the 'User name' Text Box");
            // Enter 'Valid' Password
            driver(suite).findElement(By.id(getValueFromData("idPassword")))
                    .sendKeys(x.getCellData("Sheet1", "newPassword", i));
            Thread.sleep(4000);
            // Click on 'Sign In' Button
            Common_Methods.idClickOnButtn(suite,
                    getValueFromData("idSignInButtonText"));
            Thread.sleep(3000);
            Common_Methods.idClickOnButtn(suite,
                    getValueFromData("idaaCancelPopup"));
            Thread.sleep(1000);
            // Verify 'Profile' Heading is display
            Common_Methods.xpVerifyDisplayTextBox(suite,
                    getValueFromData("xpProfileheading"));

        }
    }

}
