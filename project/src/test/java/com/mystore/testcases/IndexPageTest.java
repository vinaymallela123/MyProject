package com.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;

import junit.framework.Assert;

public class IndexPageTest extends BaseClass {
	
	IndexPage ip;
	
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
	public void veriyLogo()
	{
		ip=new IndexPage();
		boolean result=ip.validateLogo();
		Assert.assertTrue(result);		
	}
	
	@Test
	public void validateTitle()
	{
		String title=ip.getTitlee();
		Assert.assertEquals(title, "My Shop");
	}
	
	

	
}
