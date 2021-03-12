package com.quicklly.LoginTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.quicklly.LoginPageObjects.Login;
import com.utilities.BaseTest;
import com.utilities.Common_Methods;
import com.utilities.Xls_Reader;

public class LoginTC extends BaseTest {

    private static String suite = "LoginTC";

    /**
     * @author dinkar.s
     * @throws Throwable
     * 
     */
    @Test
    public void verifyLoginPageFunctionlity() throws Throwable {
       // Thread.sleep(3000);
        // Call 'verifyLoginGUIPage' Method
        Login.SignIn(suite);              }
    }
	



