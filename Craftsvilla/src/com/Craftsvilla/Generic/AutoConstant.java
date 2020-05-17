package com.Craftsvilla.Generic;

public interface AutoConstant {
	
	String CHROME_KEY="webdriver.chrome.driver";
	String CHROME_VALUE=".//Driver//chromedriver.exe";
	String GECKO_KEY="webdriver.gecko.driver";
	String GECKO_VALUE=".//Driver//geckodriver.exe";
	String APP_URL="https://www.craftsvilla.com";
	String FILE_PATH=".//InputData//Credentials.xslx";

}


/// In interface all methods are Public and Abstract by default and also all Variables are public and Final.
/// Other class always Implements Interface.