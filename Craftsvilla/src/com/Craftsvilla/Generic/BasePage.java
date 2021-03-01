package com.Craftsvilla.Generic;

import org.apache.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
	
	public WebDriver driver=null;
	public Logger log=Logger.getLogger(BasePage.class);
	
	public BasePage(WebDriver Browser)
	{
		driver=Browser;
	}

	public void verifytitle(String exptitle)
	{
		WebDriverWait w=new WebDriverWait(driver, 20);
		String actualtitle=null;
		try
		{
		
			w.until(ExpectedConditions.titleContains(exptitle));
			 actualtitle=driver.getTitle();
			Assert.assertEquals(actualtitle, exptitle);
			log.info(actualtitle+"and the"+exptitle+"Matched");
			
		}
		catch(Exception e)
		{
				
			log.error(actualtitle+"and the"+exptitle+"did not Matched"+e);
		
	}
	
}

public void verifyElementPresent(WebElement ele)
{
	WebDriverWait w=new WebDriverWait(driver, 20);
	try
	{
		w.until(ExpectedConditions.visibilityOf(ele));
		
        log.info(ele+" is Visible");
		
	}
	
	catch(Exception e)
	{
		log.error(ele+" is not visible");
		
	}
}



public void mousehover(WebElement Ele)
{
	try
	{
		Actions action=new Actions(driver);
		action.moveToElement(Ele).perform();
		log.info(Ele+" Identified");
	}
	
	catch(Exception e)
	{
		log.error(Ele+"Not Identified");
	}
	
	
}

String CHROME_KEY="webdriver.chrome.driver";
	String CHROME_VALUE=".//Driver//chromedriver.exe";
	String GECKO_KEY="webdriver.gecko.driver";
	String GECKO_VALUE=".//Driver//geckodriver.exe";
	String APP_URL="https://www.craftsvilla.com";
	String FILE_PATH=".//InputData//Credentials.xslx";

}



