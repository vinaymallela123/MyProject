package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class LogInPage extends BaseClass {
	
	@FindBy(xpath="//input[@id='email']")
	WebElement userName;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement Password;
	
	@FindBy(xpath="//span[normalize-space()='Sign in']")
	WebElement signInBtn;
	
	@FindBy(xpath="//input[@id='email_create']")
	WebElement emailForNewAccount;
	
	@FindBy(xpath="//span[normalize-space()='Create an account']")
	WebElement createAccountBtn;	
	
	public LogInPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String user ,String pass)
	{
		Action.type(userName, user);
		Action.type(Password, pass);
		Action.click(driver, signInBtn);
		return new HomePage();
	}
	
	public AccountCreationPage createNewAccount(String newEmail)
	{
		Action.type(emailForNewAccount, newEmail);
		Action.click(driver, createAccountBtn);
		return new AccountCreationPage();
	}
	

}
