package com.shadowfax.tests;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.shadowfax.pages.GurgaondcPages;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("ShadowFax")
@Feature("Gurgaondc")
public class GurgaondcTests extends BaseAutomationTest {
	private static final Logger logger = Logger.getLogger(GurgaondcTests.class.getName());
	private GurgaondcPages gurgaondcPage;
	public WebDriver driver;

	@BeforeClass
	@Parameters({ "siteURL", "browser" })
	public void initshadowfaxLogin(String siteURL, String browser) throws Exception {
		logger.info("Starting of initshadowfaxLogin method in GurgaondcTests");

		this.driver = this.getWebDriver(browser, WEB_DRIVER.GURGON_DC);
		driver.get(siteURL);
		driver.manage().window().maximize();
		this.gurgaondcPage = new GurgaondcPages(this.driver);
		logger.info("Ending of initshadowfaxLogin method in GurgaondcTest ");
	}

	@Test(priority = 1, description = " Test Case #1 , Verify UserName")
	@Description("Test Case #1, Verify UserName")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #1, Verify UserName")
	public void verifyUserName() throws InterruptedException {
		logger.info("Starting of verifyUserName method");
		gurgaondcPage.enterlblUserName(testDataProp.getProperty("userName"));
		gurgaondcPage.enterlblPassword(testDataProp.getProperty("password"));
		gurgaondcPage.clickOnbtnSignin();
		logger.info("Ending of verifyUserName method");
	}

	@Test(priority = 2, description = " Test Case #2 , Verify UserName")
	@Description("Test Case #2, Verify UserName")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #2, Verify UserName")
	public void verifyOrdersReachingDc() throws InterruptedException {
		logger.info("Starting of verifyOrdersReachingDc method");
		gurgaondcPage.clickOnbtnForwardOperations();
		gurgaondcPage.clickOnbtnReceiveManifests();
		Assert.assertEquals(gurgaondcPage.gettextForwardOperations(), 
				expectedAssertionsProp.getProperty("for.oper"));
		gurgaondcPage.clickOnbtnOrdersReachingDc();
		Assert.assertEquals(gurgaondcPage.gettextWarehousePickup(), 
				expectedAssertionsProp.getProperty("war.up"));
		gurgaondcPage.enterSelectClient(testDataProp.getProperty("value.client"));
		gurgaondcPage.clickOnfeildSelectOption();
		gurgaondcPage.enterOrdersDcAwbNo(testDataProp.getProperty("scan.awb.no"));
		logger.info("Ending of verifyOrdersReachingDc method");
	}

	@Test(priority = 3, description = " Test Case #3 , Verify UserName")

	@Description("Test Case #3, Verify UserName")

	@Severity(SeverityLevel.BLOCKER)

	@Story("Test Case #3, Verify UserName")
	public void verifyPrimaryScan() throws InterruptedException {
		logger.info("Starting of verifyPrimaryScan method");
		gurgaondcPage.clickOnbtnReceiveManifests();
		gurgaondcPage.clickOnOrdersForPrimaryScan();
		gurgaondcPage.enterAwbNum(testDataProp.getProperty("scan.item"));
		gurgaondcPage.clickOnbtnReceiveManifests(); 
		//Assert.assertEquals(gurgaondcPage.getAWBdoesnotexistText(), expectedAssertionsProp.getProperty("Message"));
		logger.info("Ending of verifyPrimaryScan method");
	}

	@Test(priority = 4, description = " Test Case #4 , Verify UserName")
	@Description("Test Case #4, Verify UserName")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #4, Verify UserName")
	public void verifySecondaryScan() throws InterruptedException {
		logger.info("Starting of verifySecondaryScan method");
		gurgaondcPage.clickOnOrdersForScondaryScan(); 
		//Assert.assertEquals(gurgaondcPage.gettextSecondaryScan(), expectedAssertionsProp.getProperty("second.s"));
		gurgaondcPage.enterScanAwbNo(testDataProp.getProperty("scan.awb.no"));
		gurgaondcPage.clickOnbtnAwbVolumeWeight();
		gurgaondcPage.enterfeildDeadWeight(testDataProp.getProperty("dead.weight"));
		gurgaondcPage.clickOnbtnSubmit(); 
		//Assert.assertEquals(gurgaondcPage.getNoItemFoundText(),expectedAssertionsProp.getProperty("pop.msg"));
		logger.info("Ending of verifySecondaryScan method");
	}

	@Test(priority = 5, description = " Test Case #5 , Verify UserName")
	@Description("Test Case #5, Verify UserName")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #5, Verify UserName")
	public void verifyCreateManifests() throws InterruptedException {
		logger.info("Starting of verifyCreateManifests method");
		gurgaondcPage.clickfeildCreateManifests();
		/*
		 * gurgaondcPage.clickOnbtnOrdersForManifests();
		 * gurgaondcPage.clickOnbtnDestinationDc(); 
		 * gurgaondcPage.enterBangaloreDcDrop(testDataProp.getProperty("select.Dc")); 
		 * gurgaondcPage.clickOnbtnSelectBangaloreDc(); Thread.sleep(3000); 
		 * gurgaondcPage.clickOnbtnSelectHub(); 
		 * gurgaondcPage.clickOnbtnSelectBlrDomlur(); Thread.sleep(2000); 
		 * gurgaondcPage.clickOnbtnScanItemDomlur(testDataProp.getProperty("scan.item"
		 *  Thread.sleep(2000);
		 */		
		gurgaondcPage.clickOnbtnToBaggingDc();
		gurgaondcPage.enterScanItem(testDataProp.getProperty("scan.item"));
		gurgaondcPage.enterWeight(testDataProp.getProperty("dead.weight"));
		gurgaondcPage.enterTxtSealNo(testDataProp.getProperty("seal.no"));
		gurgaondcPage.clickOnbtnSave();
		// Assert.assertEquals(gurgaondcPage.gettxtMessageInvaild(),expectedAssertionsProp.getProperty("scan.item");
		logger.info("Ending of verifyCreateManifests method");
	}

	@Test(priority = 6, description = " Test Case #6 , Verify UserName")
	@Description("Test Case #6, Verify UserName")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #6, Verify UserName")
	public void verifyToBaggingDc() throws InterruptedException {
		logger.info("Starting of verifyToBaggingDc method");
		gurgaondcPage.clickOnbtnDshBrd();
		gurgaondcPage.clickOnbtnManifestForMm();
		Assert.assertEquals(gurgaondcPage.gettxtbtnBaggingDcAssert(),
				expectedAssertionsProp.getProperty("msg.pop.vaild"));
		gurgaondcPage.enterBangaloreDcDrop(testDataProp.getProperty("select.Dc"));
		gurgaondcPage.clickOnbtnSelectBangaloreDc();
		gurgaondcPage.enterScanSealNo(testDataProp.getProperty("seal.no"));
		Thread.sleep(3000);
		gurgaondcPage.clickOnbtnSaveBox();
		Assert.assertEquals(gurgaondcPage.gettxtbtnBaggingDcAssert(),
				expectedAssertionsProp.getProperty("msg.pop.vaild"));
		Thread.sleep(2000);
		gurgaondcPage.clickOnbtnTransit();
		logger.info("Ending of verifyToBaggingDc method");
	}

	@Test(priority = 7, description = " Test Case #7 , Verify UserName")
	@Description("Test Case #7, Verify UserName")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Test Case #7, Verify UserName")
	public void verifyTransit() throws InterruptedException {
		logger.info("Starting of verifyTransit method");

		gurgaondcPage.clickOnbtnSelectType();
		Thread.sleep(2000);
		Assert.assertEquals(gurgaondcPage.gettxtbtnConfirmTransit(), 
				expectedAssertionsProp.getProperty("msg.ransit"));
		gurgaondcPage.clickOnbtnCoLoader();
		gurgaondcPage.clickOnbtnSelectCoLoader();
		gurgaondcPage.clickOnbtnSelectThreeLines();
		gurgaondcPage.clickOnbtnVehicleNo(testDataProp.getProperty("vehicle.num"));
		gurgaondcPage.enterLorNum(testDataProp.getProperty("lor.Num"));
		Thread.sleep(3000);
		Assert.assertEquals(gurgaondcPage.gettxtMsgUploadLorImg(),
				expectedAssertionsProp.getProperty("Msg.Upload.Lor.Img"));
		gurgaondcPage.clickOnbtnUploadLorImg(BASE_DIR + FILE_SEPARATOR + testDataProp.getProperty("File.Upload"));
		Thread.sleep(3000);
		gurgaondcPage.clickOnbtnCirform();
		Thread.sleep(3000);
		gurgaondcPage.clickOnbtnGurgaondc();
		Thread.sleep(3000);
		gurgaondcPage.clickOnbtnLogout();
		logger.info("Ending of verifyTransit method");
	}

	@AfterClass
	public void quitdriver() {
		quitDriver(WEB_DRIVER.GURGON_DC);
	}

}
