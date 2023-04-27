package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.util.BaseClass;
import com.util.ReadFromExcelFile;
import com.util.ReadFromPropertiesFile;

public class TrignCalculus extends BaseClass {

	WebDriver driver;

	public TrignCalculus(WebDriver driver) {
		this.driver = driver;
	}

	ReadFromExcelFile testInput = new ReadFromExcelFile();

	ReadFromPropertiesFile properties = new ReadFromPropertiesFile();

	By Trinometrylocator = By.xpath(properties.getLocator("TrignometryCalculus"));
	By derivativelocator = By.xpath(properties.getLocator("derivatives"));
	By valueboxlocator = By.name(properties.getLocator("valuebox"));
	By variableboxlocator = By.name(properties.getLocator("variablebox"));
    By buttonlocator = By.xpath(properties.getLocator("clickbutton"));
    
    public void trignometrandcalculuspage() {
		try {
			driver.findElement(Trinometrylocator).click();
			driver.findElement(derivativelocator).click();

		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());

		}
	}
	
    public void findaderivative()
    {
try {
	
			String expression = testInput.readTestDataExcel().get("expressionbox");
			driver.findElement(valueboxlocator).sendKeys(expression);
			
			String variablebox = testInput.readTestDataExcel().get("variable");
			driver.findElement(variableboxlocator).sendKeys(variablebox);
			
			
			driver.findElement(buttonlocator).click();
			
	    	}
	    	catch (Exception e) {
				System.out.println("Exception is " + e.getMessage());
				
			}
	    }
    }
    
  
