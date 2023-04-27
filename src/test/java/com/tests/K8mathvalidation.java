package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.util.BaseClass;
import com.pages.K8Math;

public class K8mathvalidation extends BaseClass{
	WebDriver driver;

	@BeforeClass
	public void start() {
		WebDriver driver = launchApplication();
		this.driver = driver;
	}
	
	@Test
	public void k8math()
	{
		K8Math k8 = new K8Math(driver);
		k8.k8mathpage();
		k8.divide();
	}
	
	@AfterClass
	public void end() 
	{
		driver.close();
	}


}
