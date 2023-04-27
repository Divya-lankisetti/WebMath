package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.pages.Homepage;
import com.util.BaseClass;

public class HomepageValidation  extends BaseClass{
	WebDriver driver;

	@BeforeClass
	public void start() {
		WebDriver driver = launchApplication();
		this.driver = driver;
	}

	
	@Test
	public void HomePageselection()
	{
		Homepage hp = new Homepage(driver);
		hp.HomePageselection();
		hp.SimpleIntrest();
	}
	
	
	@AfterClass
	public void end() {
		driver.close();
	}

	
	
	
	
	
}
