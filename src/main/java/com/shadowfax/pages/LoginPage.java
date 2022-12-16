package com.shadowfax.pages;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseAutomationPage {
	public static final Logger logger = Logger.getLogger(LoginPage.class.getName());

	public static final String Assert = null;

	@FindBy(xpath = "//input[@id='input_ecom_username']")
	private WebElement lblUserName;
	@FindBy(xpath = "//input[@id='input_ecom_password']")
	private WebElement lblPassword;
	@FindBy(xpath = "//button[@id='btn_ecom_signin']")
	private WebElement btnSignin;
	@FindBy(xpath = "//li[@id='link_logout']")
	private WebElement btnLogout;

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickOnlblUserName(String userName) {
		logger.info("Starting of clickOnUserName Method");
		clickOnWebElementjs(lblUserName);
		sendKeys(lblUserName, userName);
		logger.info("Ending of clickOnUserName Mathod");
	}

	public void clickOnlblPassword(String Password) {
		logger.info("Starting of clickOnPassword Method");
		clickOnWebElementjs(lblPassword);
		sendKeys(lblPassword, Password);
		logger.info("Ending of clickOnPassword Mathod");
	}

	public void clickOnbtnSignin() {
		logger.info("Starting of clickOnSigninBtn Method");
		clickOnWebElementjs(btnSignin);
		logger.info("Ending of clickOnSigninBtn Method");
	}

	public void clickOnbtnLogout() {
		logger.info("Starting of clickOnbtnLogout Method");
		clickOnWebElementjs(btnLogout);
		logger.info("Ending of clickOnbtnLogout Method");
	}
}
