package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath="//span[normalize-space()='Add my first address']")
	WebElement firstAddress;
	
	@FindBy(xpath="//span[normalize-space()='Order history and details']")
	WebElement OrderHistoryDetails;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean validateMyFirstAddress()
	{
		return Action.isDisplayed(driver, firstAddress);
	}
	
	public boolean validateOrderHistoryDetails()
	{
		return Action.isDisplayed(driver, OrderHistoryDetails);
	}
	public String getUrl()
	{
		String homeurl=driver.getCurrentUrl();
		return homeurl;
	}

}
