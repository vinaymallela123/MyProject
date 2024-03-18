package com.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LogInPage;

import junit.framework.Assert;

public class HomePageTest extends BaseClass {
	IndexPage ip;
	LogInPage lp;
	HomePage hp;
	
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
	public void validateMyFirstAddress()
	{
		ip= new IndexPage();
		lp=new LogInPage();
		hp=new HomePage();
		
		lp=ip.clickOnSignIn();
		hp=lp.login(props.getProperty("username"), props.getProperty("password"));
		Assert.assertTrue(hp.validateMyFirstAddress());
		
	}

	@Test
	public void validateOrderHistoryDetails()
	{
		ip= new IndexPage();
		lp=new LogInPage();
		hp=new HomePage();
		
		lp=ip.clickOnSignIn();
		hp=lp.login(props.getProperty("username"), props.getProperty("password"));
		Assert.assertTrue(hp.validateOrderHistoryDetails());
		
	}
}
