package com.quicklly.LoginTC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.internal.IResultListener;
import org.testng.internal.TestResult;

import com.quicklly.LoginPageObjects.Login;
import com.quicklly.ScreenshortListner.ScreenshotListener;
import com.utilities.BaseTest;
import com.utilities.Common_Methods;
import com.utilities.Xls_Reader;

import groovyjarjarantlr4.v4.parse.ANTLRParser.exceptionGroup_return;
import com.quicklly.ScreenshortListner.ScreenshotListener;
public class LoginTC extends BaseTest {
	

   private static String suite = "LoginTC";
    ScreenshotListener screenshot = new ScreenshotListener();

    /**
     * @author dinkar.s
     * @throws Throwable
     * 
     */
    @Test
    public void verifyLoginPageFunctionlity() throws Throwable {
       // Thread.sleep(3000);
        // Call 'verifyLoginGUIPage' Method
    	//without listner for screenshot
        Login.SignIn(suite);        

        
    }
    
    
   
    }
	



