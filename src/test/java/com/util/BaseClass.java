package com.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;

	public ReadFromPropertiesFile properties = new ReadFromPropertiesFile();

	public String url = properties.getApplicationUrl();
	public String browser = properties.getBrowserType();

	public void launchBrowser() {
		try {

			
			if (browser.equalsIgnoreCase("chrome") || browser.equalsIgnoreCase("google chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("ff") || browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}

		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}

	public WebDriver launchApplication() {
		try {

			launchBrowser();

			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}

		return driver;
	}

}