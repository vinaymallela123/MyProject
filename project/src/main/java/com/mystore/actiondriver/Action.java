package com.mystore.actiondriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mystore.base.BaseClass;

public class Action extends BaseClass {
	
	public static void click(WebDriver driver, WebElement locatorName)
	{
		Actions act=new Actions(driver);
		act.moveToElement(locatorName).click().build().perform();
	}
	
	
	public static boolean isDisplayed(WebDriver driver, WebElement locatorName)
	{
		boolean flag=false;
		flag=locatorName.isDisplayed();
		if(flag)
		{
			System.out.println("Elemenbt is displayed");
		}
		else
		{
			System.out.println("Element is not displayed");
		}
		return flag;
	}
	
	public static boolean type(WebElement locatorName, String text)
	{
		boolean flag=false;
		flag=locatorName.isDisplayed();
		locatorName.clear();
		locatorName.sendKeys(text);
		flag=true;
		
		if(flag)
		{
			System.out.println("Successfully entered the text");
		}
		else
		{
			System.out.println("Unable to enter the text");
		}
		return flag;
	}

}
