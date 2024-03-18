package com.mystore.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Properties props;

	@BeforeTest
	public void loadProperties() throws IOException { 
		props=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\vinayma\\eclipse-workspace\\project\\Configuration\\Config.properties");
		props.load(fis);
	}
	
	
	public static void launchApp(String browserName)
	{
			
//		String browserName=props.getProperty("browser");
		
		if(browserName.contains("Chrome"))
		{
			driver=new ChromeDriver();
		}
//		else if(browserName.equalsIgnoreCase("Firefox"));
//		{
//			driver=new FirefoxDriver();	
//		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(props.getProperty("url"));
	}
	

}
