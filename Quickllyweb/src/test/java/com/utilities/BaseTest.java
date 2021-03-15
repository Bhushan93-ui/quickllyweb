package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.xml.transform.Result;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import com.quicklly.ScreenshortListner.ScreenshotListener;

import org.openqa.selenium.*;

import org.testng.*;




/***
 * 
 * @author dinkar
 *
 */
public class BaseTest  {

	public static WebDriver driver = null;
	protected static Properties prop = null;
	protected static String propertiesPath1 = TestConstants.OR_DIR + "/AddtocartOR.properties";
	protected static String propertiesPath2 = TestConstants.OR_DIR + "/LoginOR.properties";
	protected static String propertiesPath3 = TestConstants.OR_DIR + "/RegistrationOR.properties";
	protected static String propertiesPath4 = TestConstants.OR_DIR + "/SignInOR.properties";
	protected static String propertiesPath5 = TestConstants.OR_DIR + "/ZipcodeOR.properties";
	protected static String propertiesPath6 = TestConstants.OR_DIR + "/ShopbyDepartmentOR.properties";
	ScreenshotListener Screenshot =new ScreenshotListener();
	@BeforeMethod
	public void browserLaunch() throws Throwable {

		// DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		// capabilities.setCapability("acceptInsecureCerts", true);
		// capabilities.setJavascriptEnabled(true);
		// capabilities.setCapability("marionette", true);
		//
		// FirefoxProfile profile = new FirefoxProfile();
		//
		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Driver\\geckodriver.exe");
		// driver = new FirefoxDriver(profile);

		//
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//
		// System.setProperty("webdriver.ie.driver","C:\\Driver\\IEDriverServer_x64_2.47.0\\IEDriverServer.exe");
		// driver=new InternetExplorerDriver();

		final FileInputStream quicklly1 = new FileInputStream(propertiesPath1);
		final FileInputStream quicklly2 = new FileInputStream(propertiesPath2);
		final FileInputStream quicklly3 = new FileInputStream(propertiesPath3);
		final FileInputStream quicklly4 = new FileInputStream(propertiesPath4);
		final FileInputStream quicklly5 = new FileInputStream(propertiesPath5);
		final FileInputStream quicklly6 = new FileInputStream(propertiesPath6);
		// final FileInputStream fileInputStreamForDatalogin = new
		// FileInputStream(propertyFileForDataPathlogin);

		prop = new Properties();
		prop.load(quicklly1);
		prop.load(quicklly2);
		prop.load(quicklly3);
		prop.load(quicklly4);
		prop.load(quicklly5);
		prop.load(quicklly6);
		// prop.load(fileInputStreamForDatalogin);

		final String baseUrl = prop.getProperty(TestConstants.TARGET_ENV + ".url");
		Reporter.log("Using application URL " + baseUrl);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String suite = null;
		// Thread.sleep(2000);
		// Call 'WindowHandle' Method
//        HandleModelDialog.WindowHandle(suite);
//        Thread.sleep(12000);
		// Call Sign Button

		if (null != quicklly1) {
			quicklly1.close();
		}
		if (null != quicklly2) {
			quicklly2.close();
		}
		if (null != quicklly1) {
			quicklly3.close();
		}
		if (null != quicklly4) {
			quicklly4.close();
		}
		if (null != quicklly5) {
			quicklly5.close();
		}
		if (null != quicklly6) {
			quicklly6.close();
		}

	}

	

	protected static WebDriver driver(final String suite) {
		return BaseTest.driver;
	}

	
	@AfterMethod
	public void firefoxBrowserClose(ITestResult testResult) throws Exception {
 try {
		propertiesPath1 = TestConstants.OR_DIR + "/AddtocartOR.properties";
		propertiesPath2 = TestConstants.OR_DIR + "/LoginOR.properties";
		propertiesPath3 = TestConstants.OR_DIR + "/RegistrationOR.properties";
		propertiesPath4 = TestConstants.OR_DIR + "/SignInOR.properties";
		propertiesPath5 = TestConstants.OR_DIR + "/ZipcodeOR.properties";
		propertiesPath6 = TestConstants.OR_DIR + "/ShopbyDepartmentOR.properties";
		Screenshot.onTestFailure(testResult); 
 }
 
 
		// try {
		//
		// Actions move= new Actions(driver);
		// WebElement src=
		// driver.findElement(By.xpath(getValueFromData("xpSrc")));
		// move.moveToElement(src).perform();
		// Thread.sleep(2000);
		// WebElement logOut=
		// driver.findElement(By.xpath(getValueFromData("xpLogOut1")));
		// move.moveToElement(logOut).perform();
		// driver.findElement(By.xpath(getValueFromData("xpLogOut1"))).click();
		// Reporter.log("Passed:- Successfully LogOut Application");
		// Thread.sleep(3000);
		// } catch (Exception e) {
		// Reporter.log("Passed:- Unable to LogOut Application");
		// }
 catch (Exception exl)
 {
	 Screenshot.onTestFailure(testResult); 
		exl.getMessage();	
 }
	}
 
 
	
	
	
	@AfterSuite
	 public void aftersuite() {
		 if (null != driver) {
				driver.close();
				driver.quit();
			}
	}
	 

	protected static void pause() throws InterruptedException {
		Thread.sleep(TestConstants.PAUSE_MILLIS);
	}

	public static String getValueFromData(final String key) {
		return prop.getProperty(key);
	}
	
	  public static void onTestFailure(ITestResult result) {
	  
	  Calendar calendar = Calendar.getInstance(); SimpleDateFormat formater = new
	  SimpleDateFormat("dd_MM_yyyy_hh_mm_ss"); String methodName =
	  result.getName(); if(!result.isSuccess()){ File scrFile =
	  ((TakesScreenshot)BaseTest.driver).getScreenshotAs(OutputType.FILE); try {
	  String reportDirectory = new
	  File(System.getProperty("user.dir")).getAbsolutePath() + "/Errorscreenshot";
	  File destFile = new File((String)
	  reportDirectory+"/failure_screenshots/"+methodName+"_"+formater.format(
	  calendar.getTime())+".png"); FileUtils.copyFile(scrFile, destFile);
	  System.out.println("Successfully captured a screenshot"); } catch
	  (IOException e) { e.printStackTrace(); } } }
	  
	  public static void onFailure(String suite) {
		  
		  Calendar calendar = Calendar.getInstance(); SimpleDateFormat formater = new
		  SimpleDateFormat("dd_MM_yyyy_hh_mm_ss"); 
		 // String methodName = result.getName(); 
		//  if(!result.isSuccess())
		//  { 
			  File scrFile =
		  ((TakesScreenshot)BaseTest.driver).getScreenshotAs(OutputType.FILE); try {
		  String reportDirectory = new
		  File(System.getProperty("user.dir")).getAbsolutePath() + "/Errorscreenshot";
		  File destFile = new File((String)
		  reportDirectory+"/failure_screenshots/"+suite+"_"+formater.format(
		  calendar.getTime())+".png"); FileUtils.copyFile(scrFile, destFile);
		  System.out.println("Successfully captured a screenshot"); } catch
		  (IOException e) { e.printStackTrace();
		//  }
		  }
	  }
	 
	/*public static void screenShot(ITestResult testResult) throws IOException
	{
		if (testResult.getStatus() == ITestResult.FAILURE) {
			System.out.println(testResult.getStatus());

			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String Path = "./Errorscreenshot/" + testResult.getName()
					+ new SimpleDateFormat("MM-dd-yyyy_hh-mm-ss").format(new GregorianCalendar().getTime()) + ".png";
			FileUtils.copyFile(scrFile, new File(Path));
			Reporter.log("<a href='"+ destFile.getAbsolutePath() + "'> <img src='"+ destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");
		         //on failed condition in testng report
		         //   Reporter.log("<a href='"+ destFile.getAbsolutePath() + "'> <img src='"+ destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");
		         
			System.out.println("Successfully captured a screenshot");
			
		}
	}*/
	/*public static void fgtscreenShot(WebDriver driver){
		//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
		//if(ITestResult.FAILURE==result.getStatus()){
				try{ 
					// To create reference of TakesScreenshot
					TakesScreenshot screenshot=(TakesScreenshot)driver;
					// Call method to capture screenshot
					File src=screenshot.getScreenshotAs(OutputType.FILE);
					// Copy files to specific location 
					// result.getName() will return name of test case so that screenshot name will be same as test case name
					File screen= new File("config//get.png");
					FileUtils.copyFile(src, screen);
					//Reporter.log("<br><img src='"+src+" height=’300’ width=’300’/><br>");
					Reporter.log("<br><img src='"+screen+"' height='400' width='400'/><br>");
					System.out.println("Successfully captured a screenshot");
				}catch (Exception e){
					System.out.println("Exception while taking screenshot "+e.getMessage());
			//	} 
		}
		 //	}
		}*/
}
