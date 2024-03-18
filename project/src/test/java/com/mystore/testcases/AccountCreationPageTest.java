package com.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AccountCreationPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LogInPage;

import junit.framework.Assert;

public class AccountCreationPageTest extends BaseClass {
	
	IndexPage ip;
	LogInPage lp;
	AccountCreationPage acp;
	
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String browser)
	{
		launchApp(browser);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void validateAccountCreatePage()
	{
		ip=new IndexPage();
		lp=ip.clickOnSignIn();
		acp=lp.createNewAccount("vtu123@gmail.com");
		Assert.assertTrue(acp.validateAccountCreatePage());
		
	}

}
