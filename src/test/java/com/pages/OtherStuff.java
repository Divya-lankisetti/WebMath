package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.util.BaseClass;
import com.util.ReadFromExcelFile;
import com.util.ReadFromPropertiesFile;

public class OtherStuff extends BaseClass {

	WebDriver driver;

	public OtherStuff(WebDriver driver) {
		this.driver = driver;
	}

	ReadFromExcelFile testInput = new ReadFromExcelFile();

	ReadFromPropertiesFile properties = new ReadFromPropertiesFile();

	By othrstufflocator = By.xpath(properties.getLocator("otherstuffpage"));
	By basicmathlocator = By.xpath(properties.getLocator(("basicmath")));
	By firststboxlocator = By.name(properties.getLocator("1stbox"));
	By secondboxlocator = By.name(properties.getLocator("2ndbox"));
	By largetsnumberlocator = By.name(properties.getLocator("3rdlargestnumber"));
	By smallestnumberlocator = By.name(properties.getLocator("3rdsmallestnumber"));
	By fourthboxlocator = By.name(properties.getLocator("4thbox"));
	By fifthboxlocator = By.name(properties.getLocator("5thboxdecimal"));
	By sixthboxlocator = By.name(properties.getLocator("6thbox"));
	By seventhboxlocator = By.name(properties.getLocator("7thboxtotal"));
	By doitbuttonlocator = By.xpath(properties.getLocator("doit"));

	public void Otherstuffpage() {
		try {
			driver.findElement(othrstufflocator).click();
			driver.findElement(basicmathlocator).click();

		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());

		}
	}

	public void basicmath() {
		try {

			Select firstbox = new Select(driver.findElement(firststboxlocator));
			firstbox.selectByVisibleText("Addition problems");

			Select secondbox = new Select(driver.findElement(secondboxlocator));
			secondbox.selectByVisibleText("Whole numbers");
			
			String largestnum = testInput.readTestDataExcel().get("largestnumber");
			driver.findElement(largetsnumberlocator).sendKeys(largestnum);
			
			String smallestnum = testInput.readTestDataExcel().get("smallestnumber");
			driver.findElement(smallestnumberlocator).sendKeys(smallestnum);
			
			Select yesno = new Select(driver.findElement(fourthboxlocator));
			yesno.selectByVisibleText("Yes");
			
			
			String decimalnum = testInput.readTestDataExcel().get("decimalnumbers");
			driver.findElement(fifthboxlocator).sendKeys(decimalnum);
			
			Select yesnoselction = new Select(driver.findElement(sixthboxlocator));
			yesnoselction.selectByVisibleText("Yes");
			
			String totalnum = testInput.readTestDataExcel().get("totalcount");
			driver.findElement(seventhboxlocator).sendKeys(totalnum);         
			
            driver.findElement(doitbuttonlocator).click();
			
			
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());

		}
	}

}
