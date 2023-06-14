package com.trello.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trello.genericutility.BaseClass;

public class TrelloCreatedBoardPage extends BaseClass {
	WebDriver driver;

	public TrelloCreatedBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@aria-label='Show menu']//span[@class='css-snhnyn']")
	private WebElement showMenuOption;

	@FindBy(xpath = "//a[@class='board-menu-navigation-item-link js-open-more']")
	private WebElement moreOption;

	@FindBy(xpath = "//a[contains(text(),'Close board…')]")
	private WebElement closeBoardOption;

	@FindBy(xpath = "//input[@value='Close']")
	private WebElement closeOption;

	@FindBy(xpath = "//button[normalize-space()='Permanently delete board']")
	private WebElement permanentlyDeleteBoardOptioon;

	@FindBy(xpath = "//button[normalize-space()='Delete']")
	private WebElement deleteOption;

	@FindBy(xpath = "//span[@class='placeholder']")
	private WebElement addAnotherListButton;

	@FindBy(xpath = "//input[@placeholder='Enter list title…']")
	private WebElement enterListTitleTextField1;

	@FindBy(xpath = "//input[@placeholder='Enter list title…']")
	private WebElement enterListTitleTextField2;

	@FindBy(xpath = "//input[@value='Add list']")
	private WebElement addListButton;

	@FindBy(xpath = "(//a[@aria-label='List actions'])[4]")
	private WebElement addedListTesting;

	@FindBy(xpath = "(//a[@aria-label='List actions'])[5]")
	private WebElement addedListPending;

	public WebElement getAddedListTesting() {
		return addedListTesting;
	}

	public WebElement getAddedListPending() {
		return addedListPending;
	}

	public WebElement getShowMenuOption() {
		return showMenuOption;
	}

	public WebElement getMoreOption() {
		return moreOption;
	}

	public WebElement getCloseBoardOption() {
		return closeBoardOption;
	}

	public WebElement getCloseOption() {
		return closeOption;
	}

	public WebElement getPermanentlyDeleteBoardOptioon() {
		return permanentlyDeleteBoardOptioon;
	}

	public WebElement getDeleteOption() {
		return deleteOption;
	}

	public WebElement getAddAnotherListButton() {
		return addAnotherListButton;
	}

	public WebElement getEnterListTitleTextField1() {
		return enterListTitleTextField1;
	}

	public WebElement getEnterListTitleTextField2() {
		return enterListTitleTextField2;
	}

	public WebElement getAddListButton() {
		return addListButton;
	}
}