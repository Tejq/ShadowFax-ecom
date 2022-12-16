package com.shadowfax.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BangaloredcPages extends BaseAutomationPage {

	public static final Logger logger = Logger.getLogger(LoginPage.class.getName());

	@FindBy(xpath = "//span[contains(text(),'Receive MMs')]")
	private WebElement btnReceiveMms;
	@FindBy(xpath = "(//div[@id='card_cntingDC_mnfDshbrd'])")
	private WebElement btnMmReachingDc;
	@FindBy(xpath = "(//div[@id='drpdwn_selectTransport_recvmnf'])")
	private WebElement txtSelectTransport;
	@FindBy(xpath = "(//input[@id='input_sealNo_recvmnf'])")
	private WebElement txtScanSealNum;
	@FindBy(xpath = "//div[@id='drpdwn_selectTransport_recvmnf']/div[@class='selectize-input']")
	private WebElement dropDwnThreeLines;
	@FindBy(xpath="(//span[contains(text(),'lines of coloader with line one here and lin')])['2']")
	private WebElement btnThreeLines;
	@FindBy(xpath = "//input[@id='input_sealNo_recvmnf']")
	private WebElement enterScanSealNum;
	@FindBy(xpath="//span[contains(text(),'Receive MMs')]")
	private WebElement btnAssertMsg;
	@FindBy(xpath = "//span[contains(text(),'The given manifest code: rdfghjklh2345 does not exist')][1]")
	private WebElement txtMessage;
	@FindBy(xpath="//input[@id='input_dc_fwd_ops_rcv_MNF_connect_dc_MNF_search']")
	private WebElement enterBarCodeSealNum;
	@FindBy(xpath = "//button[@id='toggle_menu_forward_ops']")
	private WebElement btnForwardOperations;
	@FindBy(xpath = "//span[contains(text(),'Receive Manifests')]['1']")
	private WebElement btnReceiveManifests;
	@FindBy(xpath= "(//div[@id='card_dc_fwd_ops_rcv_from_connect_DC_MNF_to_rcv'])")
	private WebElement btnManifestsToBeReceived;
	@FindBy(xpath = "(//input[@id='input_dc_fwd_ops_rcv_MNF_connect_dc_MNF_search'])")
	private WebElement barCodeSealNoTxtFeild;
	@FindBy(xpath="//div[contains(text(),'Search By Barcode/Seal Number:')]")
	private WebElement btnSealNoAssertMsg;
	@FindBy(xpath="//button[@id='btn_submiPrnt_recvMnf']")
	private WebElement btnSubmitPrint;
	@FindBy(xpath="//input[@id='input_dc_fwd_ops_rcv_MNF_connect_dc_MNF_search']")
	private WebElement barCodeSealNum;
	@FindBy(xpath="//input[@id='btn_dc_fwd_ops_rcv_MNF_connect_dc_MNF_show_details']") 
	private WebElement btnShowDetails;
	@FindBy(xpath="//span[contains(text(),'Received at Via DC (0)')]['2']")
	private WebElement btnViaDcAssertMsg;
	@FindBy(xpath="(//button[contains(@class,'space-right-sm space-bottom-none')])")
	private WebElement btnReceive;
	@FindBy(xpath="//h4[contains(text(),'Forward Operations -> Receive Manifest')]")
	private WebElement btnTagAssertMsg;
	//@FindBy(xpath="//div[contains(text(),'Scan Item Here')]//following-sibling::div[@class='spinner-container hide-xs ng-scope flex-xs-100 flex-50']")
	@FindBy(xpath="(//input[@ng-model=\"baggingDcMfstCtrl.itemForReceiving\"])[1]")
	private WebElement btnScanItemHere;
	@FindBy(xpath="//div[contains(text(),'Origin Hub: NCR Bijwasan DC')]")
	private WebElement btnOriginHubAssertMsg;
	@FindBy(xpath = "//span[contains(text(),'Create Manifests')]")
	private WebElement btnCreateManifests;
	@FindBy(xpath="(//div[@id='card_dc_fwd_ops_crt_to_hub_orders_for_MNF'])")
	private WebElement btnToHubOdersForM;
	@FindBy(xpath = "(//input[contains(@class,'ui-select-search ui-select-toggle')])[3]")
	private WebElement btnSelectHub1;
	@FindBy(xpath = "//span[contains(text(),'BLR_Domlur')]")
	private WebElement btnSelectBlrDomlur1;
	@FindBy(xpath="//input[@id='input_dc_fwd_ops_crt_scan_item_for_MNF_hub']")
	private WebElement boxSelectScanItem;
	@FindBy(xpath="//h4[contains(text(),'No items to show!')]")
	private WebElement msgAssertBoxFeild;
	@FindBy(xpath="//h4[contains(text(),'Forward Operations -> Create Manifest')]")
	private WebElement MsgAssertNavigate;
	@FindBy(xpath="//input[@ng-model='hubDcManifestCtrl.seal_number']")
	private WebElement boxSealNo;
	@FindBy(xpath="//button[@id='btn_dc_fwd_ops_crt_save_MNF_for_hub']")
	private WebElement boxSaveBtn;
	@FindBy(xpath="//span[@ng-hide='dcFwdCreateCtrl.showHide']")
	private WebElement btnViewDshBrd;
	@FindBy(xpath="//div[@id='card_dc_fwd_ops_crt_to_hub_MNF_for_MM']")
	private WebElement btnToHubManifestsForMm;
	@FindBy(xpath="(//div[@class='selectize-input'])[4]")
	private WebElement btnSelectManifestType;
	@FindBy(xpath="//span[contains(text(),'DcHub')]")
	private WebElement btnSelectDcHub;
	@FindBy(xpath="//input[@id='input_dc_fwd_ops_scan_MNF_seal_for_hub']")
	private WebElement btnToHubScanSealNum;
	@FindBy(xpath="//div[@class='layout-row']")
	private WebElement txtmsgAssertRow;
	@FindBy(xpath="//h4[contains(text(),'No manifests to show!')]")
	private WebElement txtassertMsgToHub;
	@FindBy(xpath="//div[@class='space-top-sm layout-xs-column layout-row']")
	private WebElement txtAssertLayout;
	@FindBy(xpath="//div[@id='link_username']")
	private WebElement btnBangaloredc;

	public BangaloredcPages(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickOnbtnReceiveMms() {
		logger.info("Starting of clickOnbtnReceiveMms Method");
		clickOnWebElementjs(btnReceiveMms);
		logger.info("Ending of clickOnbtnReceiveMms Mathod");
	}


	public void clickOnbtnMmReachingDc() {
		logger.info("Starting of clickOnbtnMmReachingDc Method");
		clickOnWebElementjs(btnMmReachingDc);
		logger.info("Ending of clickOnbtnMmReachingDc Mathod");
	}

	public void clickOntxtSelectTransport() {
		logger.info("Starting of clickOntxtSelectTransport Method");
		clickOnWebElementjs(txtSelectTransport);
		logger.info("Ending of clickOntxtSelectTransport Mathod");
	}

	public void clickOndropDwnThreeLines() {
		logger.info("Starting of clickondropDwnThreeLines Method");
		clickOnWebElementjs(dropDwnThreeLines);
		logger.info("Ending of clickondropDwnThreeLines Mathod");
	}

	public void clickOnbtnThreeLines() {
		logger.info("Starting of clickOnbtnThreeLines Method");
		clickOnWebElementjs(btnThreeLines);
		logger.info("Ending of clickOnbtnThreeLines Mathod");	
	}
	
	public String txtbtnAssertMsg() {
		logger.info("Starting of txtbtnAssertMsg Method");
		logger.info("Ending of txtbtnAssertMsg Mathod");
		return getText(btnAssertMsg);
	}
	
	public void entertxtScanSealNum(String rdfghjklh2345) {
		logger.info("Starting of entertxtScanSealNum Method");
		clickOnWebElementjs(txtScanSealNum);
		sendKeys(txtScanSealNum, rdfghjklh2345);
		txtScanSealNum.sendKeys(Keys.CONTROL + "a" + Keys.ENTER);
		logger.info("Ending of entertxtScanSealNum Mathod");
	}

	public String textMessageDoesNotExist() {
		logger.info("Starting of textMessageDoesNotExist Method");
		logger.info("Ending of textMessageDoesNotExist Mathod");
		return getText(txtMessage);
	}
	
	public void enterBarCodeSealNum(String SealNo) {
		logger.info("Starting of enterBarCodeSealNum Method");
		//clickOnWebElementjs(enterBarCodeSealNum);
		sendKeys(enterBarCodeSealNum, SealNo);
		logger.info("Ending of enterBarCodeSealNum Mathod");
	}

	public void clickOnbtnForwardOperations() {
		logger.info("Starting of clickOnbtnForwardOperations Method");
		clickOnElement(btnForwardOperations);
		logger.info("Ending of clickOnbtnForwardOperations Mathod");
	}
	
	public void clickOnbtnReceiveManifests() {
		logger.info("Starting of clickOnbtnReceiveManifests Method");
		clickOnWebElementjs(btnReceiveManifests);
		logger.info("Ending of clickOnbtnReceiveManifests Mathod");
	}
	
	public void clickOnbtnManifestsToBeReceived() {
		logger.info("Starting of clickOnbtnManifestsToBeReceived Method");
		clickOnElement(btnManifestsToBeReceived);
		logger.info("Ending of clickOnbtnManifestsToBeReceived Mathod");
	}
	
	public void clickOnbarCodeSealNoTxtFeild(String SealNum) {
		logger.info("Starting of clickOnbarCodeSealNoTxtFeild Method");
		clickOnElement(barCodeSealNoTxtFeild);
		barCodeSealNoTxtFeild.sendKeys(Keys.CONTROL + "a" + Keys.ENTER);
		logger.info("Ending of clickOnbarCodeSealNoTxtFeild Mathod");
	}
	
	public String txtbtnSealNoAssertMsg() {
			logger.info("Starting of txtbtnSealNoAssertMsg Method");
			logger.info("Ending of txtbtnSealNoAssertMsg Mathod");
			return getText(btnSealNoAssertMsg);	
	}
	
	public void clickOnbtnSubmitPrint() {
		logger.info("Starting of clickOnbtnSubmitPrint Method");
		clickOnElement(btnSubmitPrint);
		logger.info("Ending of clickOnbtnSubmitPrint Mathod");
	}
	
	public void clickOnbarCodeSealNum(String BarCodeSeal) {
		logger.info("Starting of clickOnbarCodeSealNum Method");
		clickOnElement(barCodeSealNum);
		barCodeSealNum.sendKeys(Keys.CONTROL + "a" + Keys.ENTER);
		logger.info("Ending of clickOnbarCodeSealNum Mathod");
	}
	
	public void clickOnbtnShowDetails() {
		logger.info("Starting of clickOnbtnShowDetails Method");
		clickOnElement(btnShowDetails);
		logger.info("Ending of clickOnbtnShowDetails Mathod");
	}
	
	public String txtbtnViaDcAssertMsg() {
		logger.info("Starting of txtbtnViaDcAssertMsg Method");
		logger.info("Ending of txtbtnViaDcAssertMsg Mathod");
		return getText(btnViaDcAssertMsg);
	}
	
	public void clickOnbtnReceive() {
		logger.info("Starting of clickOnbtnReceive Method");
		clickOnElement(btnReceive);
		logger.info("Ending of clickOnbtnReceive Mathod");
	}
	
	public String txtbtnTagAssertMsg() {
		logger.info("Starting of txtbtnTagAssertMsg Method");
		logger.info("Ending of txtbtnTagAssertMsg Mathod");
		return getText(btnTagAssertMsg);
	}
	
	public void clickOnbtnScanItemHere(String SealNum) {
		logger.info("Starting of clickOnbtnScanItemHere Method");
		clickOnElement(btnScanItemHere);
		sendKeys(btnScanItemHere, SealNum);
		sendKeys(btnScanItemHere, Keys.CONTROL + "a" + Keys.ENTER);
		//btnScanItemHere.sendKeys(Keys.CONTROL + "a" + Keys.ENTER);
		logger.info("Ending of clickOnbtnScanItemHere Mathod");
	}
	
	public String txtbtnOriginHubAssertMsg() {
		logger.info("Starting of txtbtnOriginHubAssertMsg Method");
		logger.info("Ending of txtbtnOriginHubAssertMsg Mathod");
		return getText(btnOriginHubAssertMsg);
   }
	
	public void clickOnbtnCreateManifests() {
		logger.info("Starting of clickOnbtnCreateManifests Method");
		clickOnWebElementjs(btnCreateManifests);
		logger.info("Ending of clickOnbtnCreateManifests Mathod");
	}
	
	public void clickOnbtnToHubOdersForM() {
		logger.info("Starting of clickOnbtnToHubOdersForM Method");
		clickOnWebElementjs(btnToHubOdersForM);
		logger.info("Ending of clickOnbtnToHubOdersForM Mathod");	
	}
	
	public void clickOnbtnSelectHub1() {
		logger.info("Starting of clickOnbtnSelectHub1 Method");
		clickOnElement(btnSelectHub1);
		logger.info("Ending of clickOnbtnSelectHub1 Mathod");	
	}
	
	public void clickOnbtnSelectBlrDomlur1() {
		logger.info("Starting of clickOnbtnSelectBlrDomlur1 Method");
		clickOnElement(btnSelectBlrDomlur1);
		logger.info("Ending of clickOnbtnSelectBlrDomlur1 Mathod");	
	}
	
	public void clickOnboxSelectScanItem(String ScanItem) {
		logger.info("Starting of clickOnboxSelectScanItem Method");
		clickOnWebElementjs(boxSelectScanItem);
		sendKeys(boxSelectScanItem,ScanItem);
		sendKeys(boxSelectScanItem, Keys.CONTROL + "a" + Keys.ENTER);
		logger.info("Ending of clickOnboxSelectScanItem Mathod");	
	}
	
	public String txtmsgAssertBoxFeild() {
		logger.info("Starting of txtmsgAssertBoxFeild Method");
		logger.info("Ending of txtmsgAssertBoxFeild Mathod");
		return getText(msgAssertBoxFeild);
}
	
	public String txtMsgAssertNavigate() {
		logger.info("Starting of txtMsgAssertNavigate Method");
		logger.info("Ending of txtMsgAssertNavigate Mathod");
		return getText(MsgAssertNavigate);
}
	
	public void clickOnboxSealNo(String Sealno) {
		logger.info("Starting of clickOnboxSealNo Method");
		clickOnWebElementjs(boxSealNo);
		sendKeys(boxSealNo,Sealno);
		logger.info("Ending of clickOnboxSealNo Mathod");	
}
	
	public void clickOnboxSaveBtn() {
		logger.info("Starting of clickOnboxSaveBtn Method");
		clickOnWebElementjs(boxSaveBtn);
		logger.info("Ending of clickOnboxSaveBtn Mathod");	
	}
	
	public void clickOnbtnViewDshBrd() {
		logger.info("Starting of clickOnbtnViewDshBrd Method");
		clickOnWebElementjs(btnViewDshBrd);
		logger.info("Ending of clickOnbtnViewDshBrd Mathod");	
	}
	
	public void clickOnbtnToHubManifestsForMm() {
		logger.info("Starting of clickOnbtnToHubManifestsForMm Method");
		clickOnWebElementjs(btnToHubManifestsForMm);
		logger.info("Ending of clickOnbtnToHubManifestsForMm Mathod");	
	}
	
	public void clickOnbtnSelectManifestType() {
		logger.info("Starting of clickOnbtnSelectManifestType Method");
		clickOnWebElementjs(btnSelectManifestType);
		logger.info("Ending of clickOnbtnSelectManifestType Mathod");	
	}
	
	public void clickOnbtnSelectDcHub() {
		logger.info("Starting of clickOnbtnSelectDcHub Method");
		clickOnElement(btnSelectDcHub);
		logger.info("Ending of clickOnbtnSelectDcHub Mathod");	
	}
	
	public String txtmsgAssertRow() {
		logger.info("Starting of txtmsgAssertRow Method");
		logger.info("Ending of txtmsgAssertRow Mathod");
		return getText(txtmsgAssertRow);
    }
	
	public void clickOnbtnToHubScanSealNum(String ScanSeal) {
		logger.info("Starting of clickOnbtnToHubScanSealNum Method");
		clickOnWebElementjs(btnToHubScanSealNum);
		btnToHubScanSealNum.sendKeys(Keys.CONTROL + "a" + Keys.ENTER);
		logger.info("Ending of clickOnbtnToHubScanSealNum Mathod");	
	}
	
	public String txtassertMsgToHub() {
		logger.info("Starting of txtassertMsgToHub Method");
		logger.info("Ending of txtassertMsgToHub Mathod");
		return getText(txtassertMsgToHub);
    }
	
	public String txtAssertLayout() {
		logger.info("Starting of txtAssertLayout Method");
		logger.info("Ending of txtAssertLayout Mathod");
		return getText(txtAssertLayout);
    }
	
	public void clickOnbtnBangaloredc() {
		logger.info("Starting of clickOnbtnBangaloredc Method");
		clickOnElement(btnBangaloredc);
		logger.info("Ending of clickOnbtnBangaloredc Mathod");	
	}
}