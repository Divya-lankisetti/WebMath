package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.OtherStuff;
import com.util.BaseClass;

public class OtherStuffValidation extends BaseClass {
	WebDriver driver;

	@BeforeClass
	public void start() {
		WebDriver driver = launchApplication();
		this.driver = driver;
	}

	@Test
	public void basicmathpage() {
		OtherStuff tc = new OtherStuff(driver);
		tc.Otherstuffpage();
		tc.basicmath();

}

	@AfterClass
	public void end() 
	{
		driver.close();
	}
	
}