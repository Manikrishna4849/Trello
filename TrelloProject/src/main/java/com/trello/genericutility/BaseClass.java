package com.trello.genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	public FileUtility fileutils = new FileUtility();
	public WebdriverUtility webdriverutils = new WebdriverUtility();
	public ExcelUtility excelUtility = new ExcelUtility();

	@BeforeMethod
	@Parameters("browserName")
	public void configBeforemethod(String browserName) throws Exception {
		// String browserName = fileutils.readCommondata("browser");
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(fileutils.readCommondata("url"));
	}

	@AfterMethod
	public void configAfterMethod() {
		driver.manage().window().minimize();
		driver.quit();
	}
}
