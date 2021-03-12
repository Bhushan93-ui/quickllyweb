package com.utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

public class HandleModelDialog extends BaseTest {
    private static String suite = "HandleModelDialog";
    static WebDriver driver;

    public static void WindowHandle(final String suite) throws Throwable {

        Set<String> windowids = driver(suite).getWindowHandles();
        System.out.println("Total no. of window :- " + windowids.size());
        Iterator<String> iter = windowids.iterator();

        try {
            String mainWindowId = iter.next();
            String childWindowId = iter.next();
            driver(suite).switchTo().window(childWindowId);
            Reporter.log("Successfully Switch on Child Window");
            driver(suite).close();
            driver(suite).switchTo().window(mainWindowId);
            Reporter.log("Successfully Back Switch on Main Window");

        } catch (Exception e) {
            Reporter.log("Unable to Switch on Main Window");
        }
    }

    public static void WindowHandleNew(final String suite) throws Throwable {

        Set<String> windowids = driver(suite).getWindowHandles();
        System.out.println("Total no. of window :- " + windowids.size());
        Iterator<String> iter = windowids.iterator();

        try {
            String mainWindowId = iter.next();
            String childWindowId = iter.next();
            driver(suite).switchTo().window(childWindowId);
            Reporter.log("Successfully Switch on Child Window");
            // Verify 'employer' Text Box
            Common_Methods.xpVerifyText(suite, getValueFromData("xpEmpText"),
                    getValueFromData("ContainEmpText"));
            driver(suite).close();
            driver(suite).switchTo().window(mainWindowId);
            Reporter.log("Successfully Back Switch on Main Window");

        } catch (Exception e) {
            Reporter.log("Unable to Switch on Main Window");
        }
    }

    public static void WindowHandleforSavedJob(final String suite)
            throws Throwable {

        Set<String> windowids = driver(suite).getWindowHandles();
        System.out.println("Total no. of window :- " + windowids.size());
        Iterator<String> iter = windowids.iterator();

        try {
            String mainWindowId = iter.next();
            String childWindowId = iter.next();
            driver(suite).switchTo().window(childWindowId);
            Reporter.log("Successfully Switch on Child Window");
            // Verify "Job title" textbox in the new window
            Common_Methods.xpVerifyDisplayTextBox(suite,
                    getValueFromData("xpJDJobTitleD"));
            // verify "Company name" text box in the New window
            Common_Methods.xpVerifyDisplayTextBox(suite,
                    getValueFromData("xpJDCompanynameD"));
            driver(suite).close();
            driver(suite).switchTo().window(mainWindowId);
            Reporter.log("Successfully Back Switch on Main Window");

        } catch (Exception e) {
            Reporter.log("Unable to Switch on Main Window");
        }
    }

    public static void termOfUseWindowHandle(final String suite)
            throws Throwable {
        Thread.sleep(1000);

        Set<String> windowids = driver(suite).getWindowHandles();
        System.out.println(
                "Total no. of window for Term Of Use:- " + windowids.size());
        Iterator<String> iter = windowids.iterator();

        try {
            String mainWindowId = iter.next();
            String childWindowId = iter.next();
            driver(suite).switchTo().window(childWindowId);
            Reporter.log("Successfully Switch on Child Window");
            try {
                // Verify 'Term of use' Text
                Assert.assertTrue(
                        driver(suite)
                                .findElement(By
                                        .xpath("//div[7]/div/div/div[1]/div/h1"))
                                .getText().contains("Terms of Use"),
                        "'Term of use' Text is Not displayed");
                Reporter.log("Passed:- 'Term of use' Text is displayed");
            } catch (final Throwable t) {
                Reporter.log("Failed:- " + t.getMessage());
                throw t;
            }
            driver(suite).close();
            driver(suite).switchTo().window(mainWindowId);
            Reporter.log("Successfully Back Switch on Main Window");

        } catch (Exception e) {
            Reporter.log("Unable to Switch on Main Window");
        }
    }

    public static void PrivacyOfMonsterWindowHandle(final String suite)
            throws Throwable {
        Thread.sleep(1000);

        Set<String> windowids = driver(suite).getWindowHandles();
        System.out.println("Total no. of window Of Privacy of Monster:- "
                + windowids.size());
        Iterator<String> iter = windowids.iterator();

        try {
            String mainWindowId = iter.next();
            String childWindowId = iter.next();
            driver(suite).switchTo().window(childWindowId);
            Reporter.log("Successfully Switch on Child Window");
            try {
                // Verify 'Privacy Commitment' Text
                Assert.assertTrue(
                        driver(suite)
                                .findElement(By
                                        .xpath("//div[7]/div/div/div[1]/div/div"))
                                .getText().contains("Privacy Commitment"),
                        "'Privacy Commitment' Text is Not displayed");
                Reporter.log("Passed:- 'Privacy Commitment' Text is displayed");
            } catch (final Throwable t) {
                Reporter.log("Failed:- " + t.getMessage());
                throw t;
            }
            driver(suite).close();
            driver(suite).switchTo().window(mainWindowId);
            Reporter.log("Successfully Back Switch on Main Window");

        } catch (Exception e) {
            Reporter.log("Unable to Switch on Main Window");
        }
    }

    public static void FaceBookWindowHandle(final String suite)
            throws Throwable {
        Thread.sleep(1000);

        Set<String> windowids = driver(suite).getWindowHandles();
        System.out.println(
                "Total no. of window Of FaceBook- " + windowids.size());
        Iterator<String> iter = windowids.iterator();

        try {
            String mainWindowId = iter.next();
            String childWindowId = iter.next();
            driver(suite).switchTo().window(childWindowId);
            Reporter.log("Successfully Switch on Child Window");

            // Verify 'Email or Phone:' Text

            // Verify 'Password:' Text

            driver(suite).close();
            driver(suite).switchTo().window(mainWindowId);
            Reporter.log("Successfully Back Switch on Main Window");

        } catch (Exception e) {
            Reporter.log("Unable to Switch on Main Window");
        }
    }

    public static void TwitterWindowHandle(final String suite)
            throws Throwable {
        Thread.sleep(1000);

        Set<String> windowids = driver(suite).getWindowHandles();
        System.out
                .println("Total no. of window Of Twitter- " + windowids.size());
        Iterator<String> iter = windowids.iterator();

        try {
            String mainWindowId = iter.next();
            String childWindowId = iter.next();
            driver(suite).switchTo().window(childWindowId);
            Reporter.log("Successfully Switch on Child Window");
            try {
                // Verify 'Share a link with your followers' Text
                Assert.assertTrue(
                        driver(suite).findElement(By.xpath("//*[@id='bd']/h2"))
                                .getText()
                                .contains("Share a link with your followers"),
                        "'Share a link with your followers' Text is Not displayed");
                Reporter.log(
                        "Passed:- 'Share a link with your followers' Text is displayed");
            } catch (final Throwable t) {
                Reporter.log("Failed:- " + t.getMessage());
                throw t;
            }
            try {
                // Verify 'Phone,Email, Username' Text
                Assert.assertTrue(
                        driver(suite).findElement(By.id("username_or_email"))
                                .isDisplayed(),
                        "'Phone,Email, Username' Text is Not displayed");
                Reporter.log(
                        "Passed:- 'Phone,Email, Username' Text is displayed");
            } catch (final Throwable t) {
                Reporter.log("Failed:- " + t.getMessage());
                throw t;
            }
            try {
                // Verify 'Password' Text
                Assert.assertTrue(
                        driver(suite).findElement(By.id("password"))
                                .isDisplayed(),
                        "'Password' Text is Not displayed");
                Reporter.log("Passed:- 'Password' Text is displayed");
            } catch (final Throwable t) {
                Reporter.log("Failed:- " + t.getMessage());
                throw t;
            }
            Thread.sleep(1000);
            driver(suite).close();
            driver(suite).switchTo().window(mainWindowId);
            Reporter.log("Successfully Back Switch on Main Window");

        } catch (Exception e) {
            Reporter.log("Unable to Switch on Main Window");
        }
    }

    public static void GooglePlusWindowHandle(final String suite)
            throws Throwable {
        Thread.sleep(1000);

        Set<String> windowids = driver(suite).getWindowHandles();
        System.out.println(
                "Total no. of window Of GooglePlus- " + windowids.size());
        Iterator<String> iter = windowids.iterator();

        try {
            String mainWindowId = iter.next();
            String childWindowId = iter.next();
            driver(suite).switchTo().window(childWindowId);
            Reporter.log("Successfully Switch on Child Window");
            try {
                // Verify 'Email
                Assert.assertTrue(
                        driver(suite).findElement(By.id("Email")).isDisplayed(),
                        "'Email is Not displayed");
                Reporter.log("Passed:- 'Email is displayed");
            } catch (final Throwable t) {
                Reporter.log("Failed:- " + t.getMessage());
                throw t;
            }
            try {
                // Verify 'Next' Button
                Assert.assertTrue(
                        driver(suite).findElement(By.id("next")).isDisplayed(),
                        "'Next' Button is Not displayed");
                Reporter.log("Passed:- 'Next' Button is displayed");
            } catch (final Throwable t) {
                Reporter.log("Failed:- " + t.getMessage());
                throw t;
            }
            Thread.sleep(1000);
            driver(suite).close();
            driver(suite).switchTo().window(mainWindowId);
            Reporter.log("Successfully Back Switch on Main Window");

        } catch (Exception e) {
            Reporter.log("Unable to Switch on Main Window");
        }
    }

    public static void LinkedinWindowHandle(final String suite)
            throws Throwable {
        Thread.sleep(1000);

        Set<String> windowids = driver(suite).getWindowHandles();
        System.out.println(
                "Total no. of window Of Linkedin- " + windowids.size());
        Iterator<String> iter = windowids.iterator();

        try {
            String mainWindowId = iter.next();
            String childWindowId = iter.next();
            driver(suite).switchTo().window(childWindowId);
            Reporter.log("Successfully Switch on Child Window");
            try {
                // Verify 'Email Address'
                Assert.assertTrue(
                        driver(suite).findElement(By.id("session_key-login"))
                                .isDisplayed(),
                        "'Email Address' is Not displayed");
                Reporter.log("Passed:- 'Email Address' is displayed");
            } catch (final Throwable t) {
                Reporter.log("Failed:- " + t.getMessage());
                throw t;
            }
            try {
                // Verify 'Password'
                Assert.assertTrue(driver(suite)
                        .findElement(By.id("session_password-login"))
                        .isDisplayed(), "'Password' is Not displayed");
                Reporter.log("Passed:- 'Password' is displayed");
            } catch (final Throwable t) {
                Reporter.log("Failed:- " + t.getMessage());
                throw t;
            }
            try {
                // Verify 'Singin' Button
                Assert.assertTrue(
                        driver(suite).findElement(By.id("btn-primary"))
                                .isDisplayed(),
                        "'Singin' Button is Not displayed");
                Reporter.log("Passed:- 'Singin' Button is displayed");
            } catch (final Throwable t) {
                Reporter.log("Failed:- " + t.getMessage());
                throw t;
            }

            Thread.sleep(1000);
            driver(suite).close();
            driver(suite).switchTo().window(mainWindowId);
            Reporter.log("Successfully Back Switch on Main Window");

        } catch (Exception e) {
            Reporter.log("Unable to Switch on Main Window");
        }
    }

    public static void ActionClassXpath(final String suite, String LocXpath)
            throws Throwable {
        Actions move = new Actions(driver(suite));
        WebElement ele1 = driver(suite).findElement(By.xpath(LocXpath));
        move.moveToElement(ele1).build().perform();
    }

    public static void ActionClassId(final String suite, String LocId)
            throws Throwable {
        Thread.sleep(3000);
        Actions move = new Actions(driver(suite));
        WebElement ele1 = driver(suite).findElement(By.id(LocId));
        move.moveToElement(ele1).build().perform();
    }

    public static void AllJobsThisRcuiterWindowandle(final String suite)
            throws Throwable {
        Thread.sleep(1000);

        Set<String> windowids = driver(suite).getWindowHandles();
        System.out.println("Total no. of window Of Privacy of Monster:- "
                + windowids.size());
        Iterator<String> iter = windowids.iterator();

        try {
            String mainWindowId = iter.next();
            String childWindowId = iter.next();
            driver(suite).switchTo().window(childWindowId);
            Reporter.log("Successfully Switch on Child Window");
            // Verify 'Company Name' in New Window
            Common_Methods.xpVerifyDisplayTextBox(suite,
                    getValueFromData("xpCompNameNewWindowD"));
            driver(suite).close();
            driver(suite).switchTo().window(mainWindowId);
            Reporter.log("Successfully Back Switch on Main Window");

        } catch (Exception e) {
            Reporter.log("Unable to Switch on Main Window");
        }
    }

    public static void SimilarJobsWindowHandle(final String suite)
            throws Throwable {
        Thread.sleep(1000);

        Set<String> windowids = driver(suite).getWindowHandles();
        System.out.println("Total no. of window Of Privacy of Monster:- "
                + windowids.size());
        Iterator<String> iter = windowids.iterator();

        try {
            String mainWindowId = iter.next();
            String childWindowId = iter.next();
            driver(suite).switchTo().window(childWindowId);
            Reporter.log("Successfully Switch on Child Window");
            // Verify 'Job link' in New Window
            Common_Methods.xpVerifyDisplayTextBox(suite,
                    getValueFromData("xpSimiliarJobsTextD"));
            driver(suite).close();
            driver(suite).switchTo().window(mainWindowId);
            Reporter.log("Successfully Back Switch on Main Window");

        } catch (Exception e) {
            Reporter.log("Unable to Switch on Main Window");
        }
    }
}
