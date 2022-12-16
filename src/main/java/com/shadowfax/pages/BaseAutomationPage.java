package com.shadowfax.pages;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.jsoup.Connection.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseAutomationPage {
	private static final Logger logger = Logger.getLogger(Base.class.getName());

	protected WebDriver driver = null;
	private static String TEST_FILE_PATH = null;
	public BaseAutomationPage(WebDriver driver) {
		this.driver = driver;
		if (TEST_FILE_PATH == null) {
			TEST_FILE_PATH = getTestFilePath();
			logger.debug("In Constructor " + TEST_FILE_PATH);
		}
		PageFactory.initElements(driver, this);
	}

	public String getTestFilePath() {
		logger.info("Starting of selectDropdown method");

		String path = "src/test/resources";
		File file = new File(path);

		logger.info("Ending of selectDropdown method");

		return file.getAbsolutePath();
	}

	protected void selectDropdown(String xpath, String value) {
		logger.info("Starting of selectDropdown method");

		Select conditions = new Select(driver.findElement(By.xpath(xpath)));
		conditions.selectByValue(value);

		logger.info("Ending of selectDropdown method");
	}

	public void scrollDown(int scroll) {
		logger.info("Starting of scrollDown method");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, " + scroll + ")");

		logger.info("Ending of scrollDown method");
	}

	public void explicitWait(WebElement webElement) {
		logger.info("Staritng of explicitWait method");

		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.visibilityOf(webElement));

		logger.info("Ending of explicitWait method");
	}

	public void implicitWait() {
		logger.info("Starting of implicitWait Method");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		logger.info("Ending of implicitWait Method");
	}

	public void clickOnWebElementjs(WebElement webelement) {
		logger.info("Starting of clickOnWebElement method");

		JavascriptExecutor jsExec = (JavascriptExecutor) driver;
		jsExec.executeScript("arguments[0].click();", webelement);

		logger.info("Ending of clickOnWebElement method");
	}

	public String getUniqueNumber(String value) {
		logger.info("Starting of getUniqueNumber method");
		logger.info("Ending of getUniqueNumber method");

		Random rand = new Random();
		// Generate random integers in range 0 to 99
		int rand_int1 = rand.nextInt(100);

		return value + rand_int1;
	}

	public String randomNumber(int digits) {
		logger.info("Starting of randomNumber method");
		logger.info("Ending of randomNumber method");

		return String.valueOf(RandomStringUtils.randomNumeric(digits));
	}

	public static String generateRandomEmail(int length) {
		logger.info("Starting of generateRandomEmail Method");

		String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_-.";
		String email = "";
		String temp = RandomStringUtils.random(length, allowedChars);
		email = temp.substring(0, temp.length() - 9) + "@gmail.com";

		logger.info("Ending of generateRandomEmail Method");
		return email;
	}

	public void switchToNewWindow() {
		logger.info("Starting of switchToNewWindow method");

		// To Open new window and check Assertions
		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));

		logger.info("Ending of switchToNewWindow method");
	}

	public void closeWindow() {
		logger.info("Starting of closeWindow method");

		// Recent window will be closed and returns back
		driver.close();
		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(0));

		logger.info("Ending of closeWindow method");
	}

	public void waitUntilElementVisible(WebDriver driver, String xpath) {
		logger.info("Starting of waitUntilElementVisible method");

		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

		logger.info("Ending of waitUntilElementVisible method");
	}

	public void refresh() {
		logger.info("Starting of refresh method");

		driver.navigate().refresh();

		logger.info("Ending of refresh method");
	}

	public void mouseHoverActions(WebElement webElement) {
		logger.info("Starting of mouseHoverActions method");

		Actions action = new Actions(driver);
		action.moveToElement(webElement).build().perform();

		logger.info("Ending of mouseHoverActions method");
	}

	public void mouseHoverAndClick(WebElement webElement) {
		logger.info("Starting of mouseHoverAndClick method");

		Actions action = new Actions(driver);
		action.moveToElement(webElement).click().build().perform();

		logger.info("Ending of mouseHoverAndClick method");
	}

	public void slider(WebElement webElement, int xCoordinate) {
		logger.info("Starting of slider method");

		Actions actions = new Actions(driver);
		actions.dragAndDropBy(webElement, xCoordinate, 0).perform();

		logger.info("Ending of slider method");
	}

	public void sleep(int sec) {
		logger.info("Starting of sleep Method");

		try {
			Thread.sleep(sec);
		} catch (InterruptedException e) {
			logger.error("Error occurred while using sleep method ", e);

		}

		logger.info("Ending of sleep Method");
	}

	public enum MOBILE_ACTIONS {
		CLICK, VISIBILE, TOAST
	}

	protected WebElement findElement(WebElement webelement, MOBILE_ACTIONS mobileActions) {
		try {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
			switch (mobileActions) {
			case CLICK:
				wait.until(ExpectedConditions.elementToBeClickable(webelement));
				break;
			case VISIBILE:
				wait.until(ExpectedConditions.visibilityOf(webelement));
				break;
			default:
				wait.until(ExpectedConditions.visibilityOf(webelement));

			}
		} catch (TimeoutException | StaleElementReferenceException ex) {
			logger.info("Webelement exception{}" + webelement, ex);
		}

		return webelement;
	}

	protected void clickOnElement(WebElement webelement) {
		findElement(webelement, MOBILE_ACTIONS.CLICK).click();
	}

	protected String getText(WebElement webelement) {
		return findElement(webelement, MOBILE_ACTIONS.VISIBILE).getText();
	}

	protected boolean checkElementPresence(WebElement webelement) {
		return findElement(webelement, MOBILE_ACTIONS.VISIBILE).isDisplayed();
	}

	protected void sendKeys(WebElement webelement, String keys) {
		findElement(webelement, MOBILE_ACTIONS.VISIBILE).sendKeys(keys);
	}

	protected void clear(WebElement webelement) {
		findElement(webelement, MOBILE_ACTIONS.VISIBILE).clear();
	}
	
}