package com.Craftsvilla.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Craftsvilla.Generic.BasePage;

public class SigninPage extends BasePage
{
	
	@FindBy(id="login-signup-msg")
	private WebElement LBL_Msg;
	
	@FindBy(id="emailId")
	 WebElement TXT_Email;
	
	@FindBy(id="continueBtn")
		private WebElement BTN_Continue;
	
	@FindBy(xpath="//input[@id='emailId']")
	private WebElement TXT_MobileNum;
	
	@FindBy(xpath="//span[@class='term-checkbox']")
	private WebElement BTN_Agree;
	
	@FindBy(xpath="//div[text()='CONTINUE']")
	private WebElement BTN_Click;
	
	public SigninPage(WebDriver driver)
	
	{
	    super(driver);
	PageFactory.initElements(driver, this);

}
	
	public void setEmail(String email)
	{
		try
		{
		verifyElementPresent(TXT_Email);
		TXT_Email.sendKeys("arangmaa@gmail.com");
		log.info(email+"has sent to"+TXT_Email);
		}
		catch(Exception e)
		{
			log.error(email+"Not sent successfully");
	}
	}
	
		public void clickoncontinue()
		{
		try
		{
			
			verifyElementPresent(BTN_Continue);
			BTN_Continue.click();
			log.info("Button Clickable");
			
			
		}
		
		catch(Exception e)
				{
			log.error("Button not clickable");
		}
		
	}
}



	