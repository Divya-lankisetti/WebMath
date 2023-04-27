package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.util.BaseClass;
import com.util.ReadFromExcelFile;
import com.util.ReadFromPropertiesFile;

public class K8Math extends BaseClass {

	WebDriver driver;

	public K8Math(WebDriver driver) {
		this.driver = driver;
	}

	ReadFromExcelFile testInput = new ReadFromExcelFile();

	ReadFromPropertiesFile properties = new ReadFromPropertiesFile();

	By k8mathlocator = By.xpath(properties.getLocator("k-8math"));
	By dividelocator = By.xpath(properties.getLocator("divide"));
	By divisorlocator = By.name(properties.getLocator("divisorbox"));
	By dividendlocator = By.name(properties.getLocator("dividendbox"));
	By button = By.xpath(properties.getLocator("dividendbox"));

	public void k8mathpage() {
		try {
			driver.findElement(k8mathlocator).click();
			driver.findElement(dividelocator).click();

		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());

		}
	}

	public void divide() {
		try {
			String divisor = testInput.readTestDataExcel().get("divisorvalue");
			driver.findElement(divisorlocator).sendKeys(divisor);

			String dividend = testInput.readTestDataExcel().get("dividendvalue");
			driver.findElement(dividendlocator).sendKeys(dividend);

			driver.findElement(button).click();

		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());

		}
	}

}
