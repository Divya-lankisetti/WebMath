package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.PlotaAndGeometry;
import com.util.BaseClass;

public class PlotsandGeometryValidation extends BaseClass {
	WebDriver driver;

	@BeforeClass
	public void start() {
		WebDriver driver = launchApplication();
		this.driver = driver;
	}

	@Test
	public void plotngeometry() {
		PlotaAndGeometry pg = new PlotaAndGeometry(driver);
		pg.plotsandgeometrypage();
		pg.xyplot();

	}

	@AfterClass
	public void end() {
		driver.close();
	}
}