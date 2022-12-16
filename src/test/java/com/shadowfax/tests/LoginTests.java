package com.shadowfax.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.shadowfax.pages.LoginPage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("ShadowFax")
@Feature("Login")
public class LoginTests extends BaseAutomationTest {
	private static final Logger logger = Logger.getLogger(LoginTests.class.getName());
	protected LoginPage loginPage;

	@BeforeClass
	@Parameters({ "siteURL", "browser" })
	public void initshadowfaxLogin(String siteURL, String browser) throws Exception {
		logger.info("Starting of initshadowfaxLogin method in LoginTest");
		this.driver = this.getWebDriver(browser, WEB_DRIVER.LOGIN_DRIVER);
		this.loginPage = new LoginPage(this.driver);
		logger.info("Ending of initshadowfaxLogin method in LoginTest");

	}

	@Test(priority = 1, description = " Test Case #1 , Verify UserName")
	@Description("Test Case #1, Verify UserName")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #1, Verify UserName")
	public void verifyUserName() throws InterruptedException {
		logger.info("Starting of verifyUserName method");

		loginPage.clickOnlblUserName(testDataProp.getProperty("userName"));
		loginPage.clickOnlblPassword(testDataProp.getProperty("Password"));
		loginPage.clickOnbtnSignin();
		loginPage.clickOnbtnLogout();
		// String loginText = this.loginPage.getLoginText();
		//Assert.assertEquals(loginText, expectedAssertionsProp.getProperty("All orders"));

		logger.info("Ending of verifyUserName method");

	}

	@AfterClass
	public void quitdriver() {

	}

}
