package com.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LogInPage;
import com.mystore.pageobjects.SearchResultPage;

import junit.framework.Assert;

public class SearchResultsPageTest extends BaseClass{
	
	IndexPage ip;
	LogInPage lp;
	HomePage hp;
	SearchResultPage srp;
	
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
	public void validateProfuctAvailable()
	{
		ip=new IndexPage();
		srp=ip.SearchProduct("t-shirts");
		Assert.assertTrue(srp.validateProfuctAvailable());
	}
}
