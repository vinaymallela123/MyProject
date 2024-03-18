	package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class IndexPage extends BaseClass {

	@FindBy(xpath="//a[@class=\"login\"]")
	WebElement signInBtn;
	
	@FindBy(xpath="//img[@class=\"logo img-responsive\"]")
	WebElement logo;
	
	@FindBy(id="search_query_top")
	WebElement searchBox;
	
	@FindBy(name="submit_search")
	WebElement searchButton;
	
	public IndexPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateLogo()
	{
		return Action.isDisplayed(driver, logo);
		
	}
	
	public String getTitlee()
	{
		String myStoreTitle=driver.getTitle();
		return myStoreTitle;
	}
	
	public LogInPage clickOnSignIn()
	{
		Action.click(driver, signInBtn);
		return new LogInPage();
	}
	
	public SearchResultPage SearchProduct(String productName)
	{
		Action.type(searchBox, productName);
		Action.click(driver, searchButton);
		return new SearchResultPage();
	}
	

}
