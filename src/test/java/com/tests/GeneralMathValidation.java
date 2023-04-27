package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.GeneralMath;
import com.util.BaseClass;

public class GeneralMathValidation extends BaseClass{
	WebDriver driver;

	@BeforeClass
	public void start() {
		WebDriver driver = launchApplication();
		this.driver = driver;
	}
	
	@Test
	public void generalmathpage()
	{
		GeneralMath gm = new GeneralMath(driver);
		
		gm.Factorpage();
		gm.Factormethod();
	}
	

	@AfterClass
	public void end() 
	{
		driver.close();
	}

}
