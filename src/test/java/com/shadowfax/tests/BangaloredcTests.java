package com.shadowfax.tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.shadowfax.pages.BangaloredcPages;
import com.shadowfax.pages.GurgaondcPages;
import com.shadowfax.pages.LoginPage;
import com.shadowfax.tests.BaseAutomationTest.WEB_DRIVER;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("ShadowFax")
@Feature("Bangaloredc")
public class BangaloredcTests extends BaseAutomationTest {

	private static final Logger logger = Logger.getLogger(BangaloredcTests.class.getName());
	private LoginPage loginPage;
	private GurgaondcPages gurgaondcPage;
	private BangaloredcPages bangaloredcPage;
	public WebDriver driver;

	@BeforeClass
	@Parameters({ "siteURL", "browser" })
	public void initshadowfaxLogin(String siteURL, String browser) throws Exception {
		logger.info("Starting of initshadowfaxLogin method in BangaloredcTests");
		this.driver = this.getWebDriver(browser, WEB_DRIVER.BANGOLORE_DC);
		driver.get(siteURL);
		driver.manage().window().maximize();
		this.loginPage = new LoginPage(this.driver);
		this.gurgaondcPage = new GurgaondcPages(this.driver);
		this.bangaloredcPage = new BangaloredcPages(this.driver);
		logger.info("Ending of initshadowfaxLogin method in BangaloredcTests");
	}

	@Test(priority = 1, description = " Test Case #1, Verify UserName")
	@Description("Test Case #1, Verify UserName")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #1, Verify UserName")
	public void verifyUserName() throws InterruptedException {
		logger.info("Starting of verifyUserName method");
		gurgaondcPage.enterlblUserName(testDataProp.getProperty("userName1"));
		gurgaondcPage.enterlblPassword(testDataProp.getProperty("password1"));
		gurgaondcPage.clickOnbtnSignin();
		logger.info("Ending of verifyUserName method");
	}

	@Test(priority = 2, description = " Test Case #2, Verify bangaloredcPage")
	@Description("Test Case #2, Verify bangaloredcPage")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #2, Verify bangaloredcPage")
	public void verifyReceiveMms() throws InterruptedException {
		logger.info("Starting of verifyReceiveMms method");
		bangaloredcPage.clickOnbtnReceiveMms();
		bangaloredcPage.clickOnbtnMmReachingDc();
		Thread.sleep(3000);
		bangaloredcPage.clickOntxtSelectTransport();
		Thread.sleep(3000);
		bangaloredcPage.clickOndropDwnThreeLines();
		bangaloredcPage.clickOnbtnThreeLines();
		Assert.assertEquals(bangaloredcPage.txtbtnAssertMsg(), 
				expectedAssertionsProp.getProperty("assert.msg"));
		Thread.sleep(3000);
		bangaloredcPage.entertxtScanSealNum(testDataProp.getProperty("seal.no"));
		bangaloredcPage.clickOnbtnSubmitPrint();
		// Assert.assertEquals(bangaloredcPage.textMessageDoesNotExist(),
		expectedAssertionsProp.getProperty("scan.seal.num");
		logger.info("Ending of verifyReceiveMms method");
	}

	@Test(priority = 3, description = " Test Case #3 , Verify bangaloredcPage")
	@Description("Test Case #3, Verify bangaloredcPage")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #3, Verify bangaloredcPage")
	public void verifyForWardOperations() throws InterruptedException {
		logger.info("Starting of verifyForWardOperations method");
		bangaloredcPage.clickOnbtnForwardOperations();
		Thread.sleep(3000);
		bangaloredcPage.clickOnbtnReceiveManifests();
		Thread.sleep(5000);
		bangaloredcPage.clickOnbtnManifestsToBeReceived();
		Assert.assertEquals(bangaloredcPage.txtbtnSealNoAssertMsg(), 
				expectedAssertionsProp.getProperty("Assert.msg.Seal"));
		Thread.sleep(3000);
		//bangaloredcPage.clickOnbarCodeSealNum(testDataProp.getProperty("seal.no"));
		bangaloredcPage.clickOnbtnShowDetails();
		//Assert.assertEquals(bangaloredcPage.txtbtnViaDcAssertMsg(),expectedAssertionsProp.getProperty("via.assert.msg"));
		logger.info("Ending of verifyForWardOperations method");
	}

	@Test(priority = 4, description = " Test Case #4 , Verify bangaloredcPage")
	@Description("Test Case #4, Verify bangaloredcPage")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #4, Verify bangaloredcPage")
	public void verifyReceiveManifests() throws InterruptedException {
		logger.info("Starting of verifyReceiveManifests method");
		bangaloredcPage.clickOnbtnReceive();
		Thread.sleep(3000);
		Assert.assertEquals(bangaloredcPage.txtbtnTagAssertMsg(), 
				expectedAssertionsProp.getProperty("tag.msg"));
		bangaloredcPage.clickOnbtnScanItemHere(testDataProp.getProperty("scan.item"));
		Assert.assertEquals(bangaloredcPage.txtbtnOriginHubAssertMsg(),
				expectedAssertionsProp.getProperty("Origin.Hub"));
		Thread.sleep(3000);
		bangaloredcPage.clickOnbtnCreateManifests();

		logger.info("Ending of verifyReceiveManifests method");
	}
	
	@Test(priority = 4, description = " Test Case #4 , Verify bangaloredcPage")
	@Description("Test Case #4, Verify bangaloredcPage")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #4, Verify bangaloredcPage")
	public void verifyToHubOdersdOfManifest() throws InterruptedException {
		logger.info("Starting of verifyToHubOdersdOfManifest method");
		
		bangaloredcPage.clickOnbtnToHubOdersForM();
		Thread.sleep(3000);
		Assert.assertEquals(bangaloredcPage.txtMsgAssertNavigate(),
				expectedAssertionsProp.getProperty("msg.navigate"));
		bangaloredcPage.clickOnbtnSelectHub1();
		bangaloredcPage.clickOnbtnSelectBlrDomlur1();
		Thread.sleep(3000);
		bangaloredcPage.clickOnboxSelectScanItem(testDataProp.getProperty("scan.item"));
		Assert.assertEquals(bangaloredcPage.txtmsgAssertBoxFeild(),
				expectedAssertionsProp.getProperty("msg.box.feild"));
		bangaloredcPage.clickOnboxSealNo(testDataProp.getProperty("seal.no.ToHub"));
		bangaloredcPage.clickOnboxSaveBtn();
		
		logger.info("Starting of verifyToHubOdersdOfManifest method");
	}
		
		@Test(priority = 5, description = " Test Case #5 , Verify bangaloredcPage")
		@Description("Test Case #5, Verify bangaloredcPage")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #5, Verify bangaloredcPage")
		public void verifyToHubManifestsForMm() throws InterruptedException {
			logger.info("Starting of verifyToHubManifestsForMm method");
			
	    bangaloredcPage.clickOnbtnViewDshBrd();
	    Thread.sleep(3000);
	    //Assert.assertEquals(bangaloredcPage.txtmsgAssertRow(),
				//expectedAssertionsProp.getProperty("msg.assert.row"));
		bangaloredcPage.clickOnbtnToHubManifestsForMm();
		Thread.sleep(3000);
		
		logger.info("Starting of verifyToHubManifestsForMm method");
		}
		
		@Test(priority = 6, description = " Test Case #6 , Verify bangaloredcPage")
		@Description("Test Case #6, Verify bangaloredcPage")
		@Severity(SeverityLevel.BLOCKER)
		@Story("Test Case #6, Verify bangaloredcPage")
		public void verifySelectHub() throws InterruptedException {
			logger.info("Starting of verifySelectHub method");
			
		bangaloredcPage.clickOnbtnSelectHub1();
		Assert.assertEquals(bangaloredcPage.txtassertMsgToHub(),
				expectedAssertionsProp.getProperty("msg.assert.to.hub"));
		bangaloredcPage.clickOnbtnSelectBlrDomlur1();
		bangaloredcPage.clickOnbtnSelectManifestType();   
		bangaloredcPage.clickOnbtnSelectDcHub();
		//Assert.assertEquals(bangaloredcPage.txtAssertLayout(),
				//expectedAssertionsProp.getProperty("msg.Assert.layout"));
		Thread.sleep(3000);
		//bangaloredcPage.clickOnbtnToHubScanSealNum(testDataProp.getProperty("seal.no.ToHub"));
		bangaloredcPage.clickOnbtnBangaloredc();
		
		logger.info("Ending of verifySelectHub method");
	}
	/*
	 * @AfterClass public void quitdriver() { driver.quit(); }
	 */
}