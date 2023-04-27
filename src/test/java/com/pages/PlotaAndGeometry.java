package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.util.BaseClass;
import com.util.ReadFromExcelFile;
import com.util.ReadFromPropertiesFile;

public class PlotaAndGeometry extends BaseClass {

	WebDriver driver;

	public PlotaAndGeometry(WebDriver driver) {
		this.driver = driver;
	}

	ReadFromExcelFile testInput = new ReadFromExcelFile();

	ReadFromPropertiesFile properties = new ReadFromPropertiesFile();

	By plotngeolocator = By.xpath(properties.getLocator("plotsGeometry"));
	By xyplotlocator = By.xpath(properties.getLocator("xyplot"));
	By yboxlocator = By.name(properties.getLocator("ybox"));
	By colorselection = By.name(properties.getLocator("colorselection"));
	By plotlocator = By.xpath(properties.getLocator("plotbutton"));
	
	
	public void plotsandgeometrypage() {
		try {
			driver.findElement(plotngeolocator).click();
			driver.findElement(xyplotlocator).click();

		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());

		}
	}
	
	public void xyplot() {
		try {

			
			String plotvalue = testInput.readTestDataExcel().get("yvalue");
			driver.findElement(yboxlocator).sendKeys(plotvalue);
			
			Select colorselect = new Select(driver.findElement(colorselection));
			colorselect.selectByVisibleText("Red");
			
			
			driver.findElement(plotlocator).click();
			
	    	}
	    	catch (Exception e) {
				System.out.println("Exception is " + e.getMessage());
				
			}
	    }
	}
	
