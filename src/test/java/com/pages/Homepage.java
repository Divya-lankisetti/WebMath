package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.util.BaseClass;
import com.util.ReadFromExcelFile;
import com.util.ReadFromPropertiesFile;

public class Homepage extends BaseClass {

	WebDriver driver;

	public Homepage(WebDriver driver) {

		this.driver = driver;
	}

	ReadFromExcelFile testInput = new ReadFromExcelFile();

	ReadFromPropertiesFile properties = new ReadFromPropertiesFile();

	By Homelocator = By.xpath(properties.getLocator("Homepage"));
	By selectionboxlocator = By.xpath(properties.getLocator("Selectionbox"));
	By principalamntlocator = By.name(properties.getLocator("principalamount"));
	By intrestratelocator = By.name(properties.getLocator("interestrate"));
	By intrestselectionlocator = By.name(properties.getLocator("interestselection"));
	By intresttimelocator = By.name(properties.getLocator("interesttime"));
	By timeselectionlocator = By.name(properties.getLocator("timeselection"));
	By findamountbttnlocator = By.xpath(properties.getLocator("findamount"));

	public void HomePageselection() {
		Select select = new Select(driver.findElement(selectionboxlocator));

		select.selectByVisibleText("Interest, Simple");

	}

	public void SimpleIntrest() {

		try {

			String principalamnt = testInput.readTestDataExcel().get("principalamount");
			driver.findElement(principalamntlocator).sendKeys(principalamnt);

			String intrstrate = testInput.readTestDataExcel().get("rateinpercent");
			driver.findElement(intrestratelocator).sendKeys(intrstrate);

			Select select1 = new Select(driver.findElement(intrestselectionlocator));
			select1.selectByVisibleText("Month");

			String intrsttime = testInput.readTestDataExcel().get("intresttimelocator");
			driver.findElement(intresttimelocator).sendKeys(intrsttime);

			Select select2 = new Select(driver.findElement(timeselectionlocator));
			select2.selectByVisibleText("Month(s)");

			driver.findElement(findamountbttnlocator).click();

		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
			
		}
	}
}
