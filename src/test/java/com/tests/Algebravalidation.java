package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.util.BaseClass;
import com.pages.Algebra;

public class Algebravalidation extends BaseClass{
	WebDriver driver;

	@BeforeClass
	public void start() {
		WebDriver driver = launchApplication();
		this.driver = driver;
	}

	
	@Test
	public void algebra()
	{
		Algebra  ag = new Algebra(driver);
		ag.algebrapage();
		ag.complexsub();
	}


	@AfterClass
	public void end() 
	{
		driver.close();
	}
}
