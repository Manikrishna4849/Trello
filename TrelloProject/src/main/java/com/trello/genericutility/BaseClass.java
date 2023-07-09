package com.trello.genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
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
	//@Parameters("browserName")
	// String browserName
	public void configBeforemethod() throws Exception {
		String browserName = fileutils.readCommondata("browser");
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("edge")) {
			EdgeOptions options=new EdgeOptions();
			options.addArguments("--disable-notifications");
			driver = new EdgeDriver(options);
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
