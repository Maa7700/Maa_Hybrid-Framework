package com.Craftsvilla.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class BaseTest implements AutoConstant {
	public static WebDriver driver=null;
	public WebDriverWait wait=null;
	
	@org.testng.annotations.Parameters("browser")
	@BeforeMethod
	public void LaunchURL(String browser)
	{
		if(browser.equalsIgnoreCase("CHROME"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			 driver =new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("FIREFOX"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Invalid Login");
			System.exit(0);
		}
		
		driver.manage().deleteAllCookies();
		wait=new WebDriverWait(driver, 10);
		System.out.println(driver.getWindowHandle());
		driver.manage().window().maximize();
		driver.get(APP_URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	
	public void LoggedOut()
	{
      driver.quit();
	}
}
