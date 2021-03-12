/**
 * 
 */
package com.quicklly.ShopByDepartGroceryTC;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.quicklly.LoginPageObjects.Login;
import com.quicklly.ShopByDepartGroceryPageObjects.ShopByDepartmentGrocery;
import com.utilities.BaseTest;
import com.utilities.Xls_Reader;

/**
 * @author dinkar.s
 *
 */
public class ShopByDepartGroceryTC extends BaseTest {
	
	private static String suite = "ShopByDepartGroceryTC";
	
	@Test
	public static void ShopByDeptGrocery() throws Throwable {	
		ShopByDepartmentGrocery.ABC(suite);
	}

}
