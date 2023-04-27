package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.util.BaseClass;
import com.util.ReadFromExcelFile;
import com.util.ReadFromPropertiesFile;

public class GeneralMath  extends BaseClass {

	WebDriver driver;
	
	public GeneralMath(WebDriver driver) {
		this.driver = driver;
	}
	ReadFromExcelFile testInput = new ReadFromExcelFile();

	ReadFromPropertiesFile properties = new ReadFromPropertiesFile();
	
	By generalmathlocator = By.xpath(properties.getLocator("generamath"));
	By factorlocator = By.xpath(properties.getLocator("factor"));
    By selectlocator = By.name(properties.getLocator("select"));
    By valuelocator = By.name(properties.getLocator("value"));
    By factorbutonlocator = By.xpath(properties.getLocator("factorbttn"));
    
    
    
    public void Factorpage()
    {
    	try {
    		driver.findElement(generalmathlocator).click();
    		driver.findElement(factorlocator).click();
    		
    		
    		
    	}
    	catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
			
		}
    }
    
    public void Factormethod() {
    	try {

		Select select1 = new Select(driver.findElement(selectlocator));
		select1.selectByVisibleText("All");
		
		String factornum = testInput.readTestDataExcel().get("factorvalue");
		driver.findElement(valuelocator).sendKeys(factornum);
		
		driver.findElement(factorbutonlocator).click();
		
    	}
    	catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
			
		}
    }
    
}
