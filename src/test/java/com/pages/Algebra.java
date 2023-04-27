package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.util.BaseClass;
import com.util.ReadFromExcelFile;
import com.util.ReadFromPropertiesFile;

public class Algebra extends BaseClass {

	WebDriver driver;

	public Algebra(WebDriver driver) {
		this.driver = driver;
	}

	ReadFromExcelFile testInput = new ReadFromExcelFile();

	ReadFromPropertiesFile properties = new ReadFromPropertiesFile();

	By algebralocator = By.xpath(properties.getLocator("algebra"));
	By subtractlocator = By.xpath(properties.getLocator("subtract"));
	By numberboxlocator = By.name(properties.getLocator("numberbox"));
	By buttonlocator = By.xpath(properties.getLocator("clickbttn"));

	public void algebrapage() {
		try {
			driver.findElement(algebralocator).click();
			driver.findElement(subtractlocator).click();
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());

		}
	}

	public void complexsub() {
		try {
			String cmplxnumber = testInput.readTestDataExcel().get("complexnumber");
			driver.findElement(numberboxlocator).sendKeys(cmplxnumber);

			driver.findElement(buttonlocator).click();

		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());

		}
	}

}
