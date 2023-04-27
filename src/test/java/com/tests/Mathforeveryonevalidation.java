package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.util.BaseClass;
import com.pages.MathForEveryone;
public class Mathforeveryonevalidation extends BaseClass{
	WebDriver driver;

	@BeforeClass
	public void start() {
		WebDriver driver = launchApplication();
		this.driver = driver;
	}
	
	@Test
	
	public void mathpageselection()
	{
		MathForEveryone mathpage = new MathForEveryone(driver);
		
		mathpage.unitsconversiononLength();
	}
	
	
	
	
	
	
	
	@AfterClass
	public void end() 
	{
		driver.close();
	}

}
