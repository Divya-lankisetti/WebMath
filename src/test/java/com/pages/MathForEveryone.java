package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.util.BaseClass;
import com.util.ReadFromExcelFile;
import com.util.ReadFromPropertiesFile;

public class MathForEveryone extends BaseClass {

	WebDriver driver;

	public MathForEveryone(WebDriver driver) {

		this.driver = driver;
	}

	ReadFromExcelFile testInput = new ReadFromExcelFile();

	ReadFromPropertiesFile properties = new ReadFromPropertiesFile();

	By mathforeveryonelocator = By.xpath(properties.getLocator("mathforeveryone"));
	By lengthlocator = By.xpath(properties.getLocator("length"));
	By unitsboxlocator = By.name(properties.getLocator("unitsbox1"));
	By selectionbox1locator = By.name(properties.getLocator("selectionbox1"));
	By selectionbox2locator = By.name(properties.getLocator("selectionbox2"));
	By convrbttnlocator = By.xpath(properties.getLocator("convertbttn"));

	public void unitsconversiononLength()
	{
		try {
		driver.findElement(mathforeveryonelocator).click();
		driver.findElement(lengthlocator).click();
		
		String enterunits = testInput.readTestDataExcel().get("units");
		driver.findElement(unitsboxlocator).sendKeys(enterunits);

		Select selection1 = new Select(driver.findElement(selectionbox1locator));
		selection1.selectByVisibleText("meter(s)");
		
		Select selection2 = new Select(driver.findElement(selectionbox2locator));
		selection2.selectByVisibleText("millimeter(s)");
		
		
		driver.findElement(convrbttnlocator).click();
		
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
			
		}
	}
	
	
}
