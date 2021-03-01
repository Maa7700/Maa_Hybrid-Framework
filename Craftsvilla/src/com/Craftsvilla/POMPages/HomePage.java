package com.Craftsvilla.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Craftsvilla.Generic.BasePage;


public class HomePage extends BasePage
{
  
	@FindBy(xpath="//input[@id='searchval']")
	private WebElement SearchValue;
	
	
	
	@FindBy(xpath="//a[@id='cartCount']")
	private WebElement Kart;
	
	
	@FindBy(xpath="//a[@href='/womens-clothing/sarees/?MID=megamenu_sarees_seeall']")
	private WebElement Sareelink;
	
	@FindBy(xpath="//a[@class='dropdown dropdown-toggle']")
	private WebElement MyAccount;
	
	@FindBy(xpath="//a[@class='js-logout']")
	private WebElement Logout;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	

	public void setvalueforsearch(String value)
	{
		try
		{
			verifyElementPresent(SearchValue);
			SearchValue.sendKeys("Value");
			log.info(value+"has set to"+SearchValue);
		}
		
	
	catch(Exception e)
	
	{
		log.error("Value is not going to set");
	}
	
	}


	public void clickKart()
	{
		
		try
		{
			verifyElementPresent(Kart);
			Kart.click();
			log.info("Kart Button Clickable");
		}
		
		catch(Exception e)
		{
			log.error("Button Not Clickable");
		}
		
	}
		public void movetosareelink()
		{
			try
			{
				verifyElementPresent(Sareelink);
				mousehover(Sareelink);
				log.info("Move to sareelink");
				
			}
		
			catch(Exception e)
			{
				log.error("Unable to move to sareelink");
			}

		}
		
		public void clickonaccountbutton()
		{
			try
			{
				verifyElementPresent(MyAccount);
				MyAccount.click();
				log.info("click on"+MyAccount);
				
			}
			
			catch(Exception e)
			{
				log.error("Unable to click on"+MyAccount);
			}
		}
		
		
		public void clicklogout()
		{
			try {
				
				verifyElementPresent(Logout);
				Logout.click();
				log.info("Sucesfully"+Logout);
				
			}
			catch(Exception e)
			{
				log.error(Logout+"Unsucessfull");
			}
		}
		
}





