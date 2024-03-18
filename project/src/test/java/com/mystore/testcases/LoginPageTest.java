package com.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LogInPage;

public class LoginPageTest extends BaseClass{
	
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
	public void login()
	{
		ip=new IndexPage();
		lp=ip.clickOnSignIn();
		hp=lp.login(props.getProperty("username"),props.getProperty("password"));
		System.out.println(hp.getUrl());
		
	}
}
