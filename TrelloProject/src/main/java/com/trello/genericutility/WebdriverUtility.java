package com.trello.genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {

	public void implicityWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}

	public WebElement explicityMethod(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(element)); // pass
		return ele;
	}

	public boolean explicitywaitForCompleteTitle(WebDriver driver, String actualTitle) throws IOException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		boolean title = wait.until(ExpectedConditions.titleIs(actualTitle));// to compare given title we have to pass
																			// the title
		return title;
	}

	public boolean explicitWaitForPartialTitle(WebDriver driver, String expectedTitle) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		boolean value = wait.until(ExpectedConditions.titleContains(expectedTitle));
		return value;
	}

	public boolean explicityPartialurl(WebDriver driver, String expectedUrl) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		boolean value = wait.until(ExpectedConditions.urlContains(expectedUrl));
		return value;

	}

}
