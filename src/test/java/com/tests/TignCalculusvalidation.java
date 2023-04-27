package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.TrignCalculus;
import com.util.BaseClass;

public class TignCalculusvalidation extends BaseClass {
	WebDriver driver;

	@BeforeClass
	public void start() {
		WebDriver driver = launchApplication();
		this.driver = driver;
	}

	@Test
	public void trignometry() {
		TrignCalculus tc = new TrignCalculus(driver);
		tc.trignometrandcalculuspage();
		tc.findaderivative();
	}

	
	@AfterClass
	public void end() 
	{
		driver.close();
	}
	
}

