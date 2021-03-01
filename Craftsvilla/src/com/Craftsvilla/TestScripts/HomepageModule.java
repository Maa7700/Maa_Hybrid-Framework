package com.Craftsvilla.TestScripts;

import org.testng.annotations.Test;

import com.Craftsvilla.Generic.BaseTest;
import com.Craftsvilla.POMPages.HomePage;

public class HomepageModule extends BaseTest
{
   HomePage hp=null;
	@Test
	public void TC_01Homepage()
	{
		hp=new HomePage(driver);
		try
		{
			
			hp.setvalueforsearch("Maaa");
			hp.movetosareelink();
			hp.clickKart();
			hp.clickonaccountbutton();
			hp.clicklogout();
			
			
			
	
		
			
		}
		catch(Exception e)
		{
			
		}
		
	}
	
}
