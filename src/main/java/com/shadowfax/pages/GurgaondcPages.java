package com.shadowfax.pages;

import org.apache.log4j.Logger;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GurgaondcPages extends BaseAutomationPage {

	public static final Logger logger = Logger.getLogger(LoginPage.class.getName());

	@FindBy(xpath = "//input[@id='input_ecom_username']")
	private WebElement lblUserName;
	@FindBy(xpath = "//input[@id='input_ecom_password']")
	private WebElement lblPassword;
	@FindBy(xpath = "//button[@id='btn_ecom_signin']")
	private WebElement btnSignin;
	@FindBy(xpath = "//button[@id=\"toggle_menu_forward_ops\"]")
	private WebElement btnForwardOperations;
	@FindBy(xpath = "//a[@id=\"link_menu_dc_fwd_rcv_manifest\"]//span[contains(text(),' Receive Manifests')]")
	private WebElement btnReceiveManifests;
	@FindBy(xpath = " //h4[contains(text(),'Forward Operations -> Receive Manifest')]")
	private WebElement textForwardOperations;
	@FindBy(xpath = "(//h5[contains(text(),'Orders Reaching DC')])[1]")
	private WebElement btnOrdersReachingDc;
	@FindBy(xpath = "//input[@id='input_dc_warehouse_pickup_scan_awb']")
	private WebElement enterOrdersDcAwbNo;
	@FindBy(xpath = " //h4[contains(text(),'Warehouse Pickup')]")
	private WebElement textWarehousePickup;
	@FindBy(xpath = "(//input[@class='ui-select-search ui-select-toggle ng-pristine ng-untouched ng-valid'])[1]")
	private WebElement enterSelectClient;
	@FindBy(xpath = "//div[@class='option ui-select-choices-row-inner']")
	private WebElement feildSelectOption;
	@FindBy(xpath = "//div[@id='card_dc_fwd_ops_rcv_from_client_orders_for_prim_scan']")
	private WebElement OrdersForPrimaryScan;
	@FindBy(xpath = " //div[@id=\"card_dc_fwd_ops_rcv_from_client_orders_for_secd_scan\"]")
	private WebElement OrdersForScondaryScan;
	@FindBy(xpath = "//div[@id='card_dc_fwd_ops_rcv_from_client_orders_for_secd_scan']")
	private WebElement textSecondaryScan;
	@FindBy(xpath = "//div[@id='card_dc_fwd_ops_rcv_send_to_DC']")
	private WebElement btnSendToDc;
	@FindBy(xpath = "//div[@id='card_dc_fwd_ops_rcv_send_to_HUB']")
	private WebElement btnHub;
	@FindBy(xpath = "//div[@id='card_dc_fwd_ops_rcv_from_connect_DC_MNF_to_rcv']")
	private WebElement btnManifestsToBeRecevied;
	@FindBy(xpath = "//span[contains(text(),'Other DC')]")
	private WebElement otherDcTxtFeild;
	@FindBy(xpath = "//div[@class='ui-select-container selectize-control single ng-valid']")
	private WebElement manifestTxtFeild;
	@FindBy(xpath = "//input[@id='input_dc_fwd_ops_dc_MNF_search']")
	private WebElement barCodeSealNoTxtFeild;
	@FindBy(xpath = "//input[@id='btn_dc_fwd_ops_dc_MNF_show_details']")
	private WebElement btnShowDetails;
	@FindBy(xpath = "//span[contains(text(),'AWB not found in Shadowfax system, cannot be picked')]")
	private WebElement textAwbNoNotFound;
	@FindBy(xpath = "//input[@id='input_dc_secondary_scan_awb']")
	private WebElement enterScanAwbNo;
	@FindBy(xpath = "//span[contains(text(),'Delivery Request with the given AWB does not exist')]")
	private WebElement textAWBdoesnotexist;
	@FindBy(xpath = "//input[@id='input_dc_primary_scan_awb']")
	private WebElement enterAwbNum;
	@FindBy(xpath = "//span[@id='btn_dc_secondary_scan_volume_weight_w<0.5']")
	private WebElement btnAwbVolumeWeight;
	@FindBy(xpath = "//input[@id='input_dc_secondary_dead_weight']")
	private WebElement enterfeildDeadWeight;
	@FindBy(xpath = "(//button[@id='btn_dc_secondary_scan_dead_weight_submit'])")
	private WebElement btnSubmit;
	@FindBy(xpath = "(//div[@id='card_dc_fwd_ops_crt_to_connect_dc_orders_for_MNF'])")
	private WebElement btnToBaggingDc;
	@FindBy(xpath = "//span[contains(text(),'No item found for the given awb number')]")
	private WebElement txtNoItemFound;
	@FindBy(xpath = "//span[contains(text(),'Create Manifests')]")
	private WebElement feildCreateManifests;
	@FindBy(xpath = "//div[@id='card_dc_fwd_ops_crt_to_dc_orders_for_MNF']")
	private WebElement lblToOthersDc;
	@FindBy(xpath = "//span[contains(text(),'Other DC')]")
	private WebElement btnOtherDc;
	@FindBy(xpath = "//div[@class='option ui-select-choices-row-inner']")
	private WebElement feildToOtherDc;
	@FindBy(xpath = "(//div[@id='drpdown_dc_fwd_ops_crt_MNF_or_MM'])")
	private WebElement btnManifest;
	@FindBy(xpath = "//div[@class='option ui-select-choices-row-inner'][1]")
	private WebElement btnManifestFeild;
	@FindBy(xpath = "(//div[@id='drpdown_dc_fwd_ops_crt_MNF_to_dc_from_dc'])")
	private WebElement btnDropDwn;
	@FindBy(xpath = "(//div[@class='option ui-select-choices-row-inner'])[2]")
	private WebElement btnBangaloreDc;
	@FindBy(xpath = "(//div[@id='drpdown_dc_fwd_ops_crt_MNF_to_hub_from_dc'])")
	private WebElement btnSelectDropDwn;
	@FindBy(xpath = "(//div[@class='option ui-select-choices-row-inner'])[6]")
	private WebElement btnDomlurHub;
	@FindBy(xpath = "(//input[@id='input_dc_fwd_ops_crt_scan_item_for_MNF_to_bagging_dc'])")
	private WebElement enterScanItem;
	@FindBy(xpath = "//h4[contains(text(),'The selected item is not valid')][1]")
	private WebElement txtMessageInvaild;
	@FindBy(xpath = "(//span[@ng-hide='dcFwdCreateCtrl.showHide'])")
	private WebElement btnDshBrd;
	@FindBy(xpath = "//div[@id='card_dc_fwd_ops_crt_to_connect_dc_MNF_for_MM']")
	private WebElement btnManifestForMm;
	@FindBy(xpath = "(//input[@id='input_dc_fwd_ops_crt_MNF_weight_to_bagging_dc'])")
	private WebElement enterWeight;
	@FindBy(xpath = "(//input[@id='input_dc_fwd_ops_crt_MNF_seal_no_to_bagging_dc'])")
	private WebElement enterTxtSealNo;
	@FindBy(xpath = "//button[@id='btn_dc_fwd_ops_crt_save_MNF_to_bagging_dc']")
	private WebElement btnSave;
	@FindBy(xpath = "//div[@id='card_dc_fwd_ops_crt_to_dc_MNF_for_MM']")
	private WebElement btnManifestsForMm;
	@FindBy(xpath = "//h4[contains(text(),'Forward Operations -> Create Manifest')]")
	private WebElement btnBaggingDcAssert;
	@FindBy(xpath = "//div[@class=\"ui-select-match ng-hide\"]//following-sibling::input[@ng-class=\"{'ui-select-search-hidden':!$select.searchEnabled}\"]")
	private WebElement btnBangaloreDcDrop;
	@FindBy(xpath = "//div[@class='option ui-select-choices-row-inner']//span[contains(text(),'Bangalore ')]")
	private WebElement btnSelectBangaloreDc;
	@FindBy(xpath = "//input[@id='input_dc_fwd_ops_scan_MNF_seal_to_bagging_dc']")
	private WebElement enterScanSealNo;
	@FindBy(xpath = "//button[@id='btn_dc_fwd_ops_crt_save_MM_to_bagging_dc']")
	private WebElement btnSaveBox;
	@FindBy(xpath = "//div[@class=\"flex-35\"]//button[@id=\"btn_dc_fwd_ops_crt_mark_MM_to_transit_to_bagging_dc\"]//div//following-sibling::span[contains(text(),'Transit')]")
	private WebElement btnTransit;
	@FindBy(xpath = "//md-toolbar[contains(text(),'Confirm Transit')]")
	private WebElement btnConfirmTransit;
	@FindBy(xpath = "//select[@id='drpdwn_dc_hub_to_dc_transit_type']['2']")
	private WebElement btnSelectType;
	@FindBy(xpath = "//option[contains(text(),'Co-Loader')]")
	private WebElement btnCoLoader;
	@FindBy(xpath = "//div[@id='drpdwn_dc_hub_to_dc_coloader']")
	private WebElement btnSelectCoLoader;
	@FindBy(xpath = "//span[contains(text(),'three lines of coloader with line one here and lin [Medium : Road Medium ]')]['2']")
	private WebElement btnSelectThreeLines;
	@FindBy(xpath = "(//input[@id='input_dc_hub_to_dc_coloader_vehicle_num'])")
	private WebElement btnVehicleNo;
	@FindBy(xpath = "(//input[@id='input_dc_hub_to_dc_lor_num'])['2']")
	private WebElement enterLorNum;
	@FindBy(xpath = "(//input[@id='ngf-podBtn'])[2]")
	private WebElement btnUploadLorImg;
	@FindBy(xpath = "//div[@id='card_dc_fwd_ops_crt_to_dc_orders_for_MNF']")
	private WebElement btnOrdersForManifests;
	@FindBy(xpath = "(//div[@id='drpdown_dc_fwd_ops_crt_MNF_to_dc_from_dc'])")
	private WebElement btnDestinationDc;
	@FindBy(xpath = "(//div[@id='drpdown_dc_fwd_ops_crt_MNF_to_hub_from_dc'])")
	private WebElement btnSelectHub;
	@FindBy(xpath = "//span[contains(text(),'BLR_Domlur')]")
	private WebElement btnSelectBlrDomlur;
	@FindBy(xpath = "//input[@id='input_dc_fwd_ops_crt_scan_item_for_MNF_to_dc_feature']")
	private WebElement btnScanItemDomlur;
	@FindBy(xpath = "//span[contains(text(),'Upload LOR Slip Image')]")
	private WebElement txtMsgUploadLorImg;
	@FindBy(xpath = "(//button[@id='btn_dc_hub_to_dc_confirm_transit_for_coloader'])[1]")
	private WebElement btnCirform;
	@FindBy(xpath = "(//button[@id='btn_dc_hub_to_dc_cancel_transit'])")
	private WebElement btnCancel;
	@FindBy(xpath = "//input[@id='btn_dc_fwd_ops_rcv_connect_dc_MM_show_details']")
	private WebElement btnShowDetails1;
	@FindBy(xpath = "//div[contains(text(),'gurgaondc')]")
	private WebElement btnGurgaondc;
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	private WebElement btnLogout;
	
	
	public GurgaondcPages(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void enterlblUserName(String gurgaondc) {
		logger.info("Starting of clickUserName Method");
		clickOnWebElementjs(lblUserName);
		sendKeys(lblUserName, gurgaondc);
		logger.info("Ending of clickUserName Mathod");
	}

	public void enterlblPassword(String gurgaondc123) {
		logger.info("Starting of clickPassword Method");
		clickOnWebElementjs(lblPassword);
		sendKeys(lblPassword, gurgaondc123);
		logger.info("Ending of clickPassword Mathod");
	}

	public void clickOnbtnSignin() {
		logger.info("Starting of clickOnSigninBtn Method");
		clickOnWebElementjs(btnSignin);
		logger.info("Ending of clickOnSigninBtn Method");
	}

	public void clickOnbtnForwardOperations() {
		logger.info("Starting of clickOnbtnforwardOperations Method");
		clickOnElement(btnForwardOperations);
		logger.info("Ending of clickOnforwardOperations Method");
	}

	public void clickOnbtnReceiveManifests() {
		logger.info("Starting of clickOnbtnReceiveManifests Method");
		clickOnElement(btnReceiveManifests);
		logger.info("Ending of clickOnbtnReceiveManifests Mathod");
	}

	public void enterOrdersDcAwbNo(String OrdersDcAwbNo) {
		logger.info("Starting of enterOrdersDcAwbNo Method");
		clickOnWebElementjs(enterOrdersDcAwbNo);
		sendKeys(enterOrdersDcAwbNo, OrdersDcAwbNo);
		enterOrdersDcAwbNo.sendKeys(Keys.CONTROL + "a" + Keys.ENTER);
		logger.info("Ending of enterOrdersDcAwbNo Mathod");
	}

	public void clickOnbtnOrdersReachingDc() {
		logger.info("Starting of clickOnbtnOrdersReachingDc Method");
		clickOnWebElementjs(btnOrdersReachingDc);
		logger.info("Ending of clickOnbtnOrdersReachingDc Mathod");
	}

	public void enterSelectClient(String SelectClient) {
		logger.info("Starting of enterSelectClient Method");
		clickOnElement(enterSelectClient);
		sendKeys(enterSelectClient, SelectClient);
		logger.info("Ending of enterSelectClient Mathod");
	}

	public void clickOnfeildSelectOption() {
		logger.info("Starting of clickOnfeildSelectOption Method");
		clickOnElement(feildSelectOption);
		logger.info("Ending of clickOnfeildSelectOption Mathod");
	}

	public String textAwbNoNotFound() {
		logger.info("Starting of textAwbNoNotFound Method");
		logger.info("Ending of textAwbNoNotFound Mathod");
		return getText(textAwbNoNotFound);
	}

	public void clickOnOrdersForPrimaryScan() {
		logger.info("Starting of clickOnOrdersForPrimaryScan Method");
		clickOnWebElementjs(OrdersForPrimaryScan);
		logger.info("Ending of clickOnOrdersForPrimaryScan Mathod");
	}

	public void clickOnOrdersForScondaryScan() {
		logger.info("Starting of clickOnOrdersForScondaryScan Method");
		clickOnWebElementjs(OrdersForScondaryScan);
		logger.info("Ending of clickOnOrdersForScondaryScan Mathod");
	}

	public void clickOnbtnSendToDc() {
		logger.info("Starting of clickOnbtnSendToDc Method");
		clickOnElement(btnSendToDc);
		logger.info("Ending of clickOnbtnSendToDc Mathod");
	}

	public void clickOnbtnHub() {
		logger.info("Starting of clickOnbtnHub Method");
		clickOnElement(btnHub);
		logger.info("Ending of clickOnbtnHub Mathod");
	}

	public void clickOnbtnManifestsToBeRecevied() {
		logger.info("Starting of clickOnbtnManifestsToBeRecevied Method");
		clickOnElement(btnManifestsToBeRecevied);
		logger.info("Ending of clickOnbtnManifestsToBeRecevied Mathod");
	}

	public void clickOnOtherDcTxtFeild() {
		logger.info("Starting of clickOnbtnOtherDcTxtFeild Method");
		clickOnElement(otherDcTxtFeild);
		logger.info("Ending of clickOnOtherDcTxtFeild Mathod");
	}

	public void clickOnManifestTxtFeild() {
		logger.info("Starting of clickOnbtnManifestTxtFeild Method");
		clickOnElement(manifestTxtFeild);
		logger.info("Ending of clickOnManifestTxtFeild Mathod");
	}

	public void clickOnbarCodeSealNoTxtFeild(String sealNum) {
		logger.info("Starting of clickOnbarCodeSealNoTxtFeild Method");
		clickOnElement(barCodeSealNoTxtFeild);
		sendKeys(barCodeSealNoTxtFeild, sealNum);
		logger.info("Ending of clickOnbarCodeSealNoTxtFeild Mathod");
	}

	public void clickOnbtnShowDetails() {
		logger.info("Starting of clickOnbtnShowDetails Method");
		clickOnElement(btnShowDetails);
		logger.info("Ending of clickOnbtnShowDetails Mathod");
	}

	public void enterScanAwbNo(String AwbNo) {
		logger.info("Starting of enterScanAwbNo Method");
		sendKeys(enterScanAwbNo, AwbNo);
		enterScanAwbNo.sendKeys(Keys.CONTROL + "a" + Keys.ENTER);
		logger.info("Ending of enterOnbtnScanAwbNo Mathod");
	}

	public String getAWBdoesnotexistText() {
		logger.info("Starting of getAWBdoesnotexistText method");
		logger.info("Ending of getAWBdoesnotexistText method");
		return getText(textAWBdoesnotexist);
	}

	public void enterAwbNum(String AwbNum) {
		logger.info("Starting og enterAwbNum Method");
		clickOnWebElementjs(enterAwbNum);
		sendKeys(enterAwbNum, AwbNum);
		enterAwbNum.sendKeys(Keys.CONTROL + "a" + Keys.ENTER);
		logger.info("Ending of enterAwbNum Mathod");
	}

	public void clickOnbtnAwbVolumeWeight() {
		logger.info("Starting og clickOnbtnAwbVolumeWeight Method");
		clickOnWebElementjs(btnAwbVolumeWeight);
		logger.info("Ending of clickOnbtnAwbVolumeWeight Mathod");
	}

	public void enterfeildDeadWeight(String DeadWeight) {
		logger.info("Starting og enterfeildDeadWeight Method");
		clickOnWebElementjs(enterfeildDeadWeight);
		sendKeys(enterfeildDeadWeight, DeadWeight);
		logger.info("Ending of enterfeildDeadWeight Mathod");
	}

	public void clickOnbtnSubmit() {
		logger.info("Starting og clickOnbtnSubmit Method");
		clickOnWebElementjs(btnSubmit);
		logger.info("Ending of clickOnbtnSubmit Mathod");
	}

	public void clickOnbtnToBaggingDc() {
		logger.info("Starting og clickOnbtnToBaggingDc Method");
		clickOnElement(btnToBaggingDc);
		logger.info("Ending of clickOnbtnToBaggingDc Mathod");
	}

	public String getNoItemFoundText() {
		logger.info("Starting of getNoItemFoundText method");
		logger.info("Ending of getNoItemFoundText method");
		return getText(txtNoItemFound);
	}

	public void clickfeildCreateManifests() {
		logger.info("Starting og clickfeildCreateManifests Method");
		clickOnElement(feildCreateManifests);
		logger.info("Ending of clickfeildCreateManifests Mathod");
	}

	public String gettextForwardOperations() {
		logger.info("Starting of gettextForwardOperations method");
		logger.info("Ending of gettextForwardOperations method");
		return getText(textForwardOperations);
	}

	public String gettextWarehousePickup() {
		logger.info("Starting of gettextWarehousePickup method");
		logger.info("Ending of gettextWarehousePickup method");
		return getText(textWarehousePickup);
	}

	public String gettextSecondaryScan() {
		logger.info("Starting of gettextSecondaryScan method");
		logger.info("Ending of gettextSecondaryScan method");
		return getText(textSecondaryScan);
	}

	public void clickOnlblToOthersDc() {
		logger.info("Starting of clickOnlblToOthersDc method");
		clickOnElement(lblToOthersDc);
		logger.info("Ending of clickOnlblToOthersDc method");
	}

	public void clickOnbtnOtherDc() {
		logger.info("Starting of clickOnbtnOthersDc method");
		clickOnElement(btnOtherDc);
		logger.info("Ending of clickOnbtnOthersDc method");
	}

	public void clickOnfeildToOtherDc() {
		logger.info("Starting of clickOnfeildToOtherDc method");
		clickOnElement(feildToOtherDc);
		logger.info("Ending of clickOnfeildToOtherDc method");

	}

	public void clickOnbtnManifest() {
		logger.info("Starting of clickOnbtnManifest method");
		clickOnElement(btnManifest);
		logger.info("Ending of clickOnbtnManifest method");
	}

	public void clickOnbtnManifestFeild() {
		logger.info("Starting of clickOnbtnManifestFeild method");
		clickOnElement(btnManifestFeild);
		logger.info("Ending of clickOnbtnManifestFeild method");
	}

	public void clickOnbtnDropDwn() {
		logger.info("Starting of clickOnbtnDropDwn method");
		clickOnElement(btnDropDwn);
		logger.info("Ending of clickOnbtnDropDwn method");
	}

	public void clickOnbtnBangaloreDc() {
		logger.info("Starting of clickOnbtnBangaloreDc method");
		clickOnElement(btnBangaloreDc);
		logger.info("Ending of clickOnbtnBangaloreDc method");
	}

	public void clickOnbtnSelectDropDwn() {
		logger.info("Starting of clickOnbtnSelectDropDwn method");
		clickOnElement(btnSelectDropDwn);
		logger.info("Ending of clickOnbtnSelectDropDwn method");
	}

	public void clickOnbtnDomlurHub() {
		logger.info("Starting of clickOnbtnDomlurHub method");
		clickOnElement(btnDomlurHub);
		logger.info("Ending of clickOnbtnDomlurHub method");
	}

	public void enterScanItem(String ScanItem) {
		logger.info("Starting of clickOntxtScanItem method");
		sendKeys(enterScanItem, ScanItem);
		enterScanItem.sendKeys(Keys.CONTROL + "a" + Keys.ENTER);
		logger.info("Ending of clickOntxtScanItem method");
	}

	public String gettxtMessageInvaild() {
		logger.info("Starting of gettxtMessageInvaild method");
		logger.info("Ending of gettxtMessageInvaild method");
		return getText(txtMessageInvaild);
	}

	public void clickOnbtnDshBrd() {
		logger.info("Starting of clickOnbtnDshBrd method");
		clickOnElement(btnDshBrd);
		logger.info("Ending of clickOnbtnDshBrd method");
	}

	public void clickOnbtnManifestForMm() {
		logger.info("Starting of clickOnbtnManifestForMm method");
		clickOnElement(btnManifestForMm);
		logger.info("Ending of clickOnbtnManifestForMm method");
	}

	public void enterWeight(String Weight) {
		logger.info("Starting of enterWeight method");
		clickOnElement(enterWeight);
		sendKeys(enterWeight, Weight);
		enterWeight.sendKeys(Keys.CONTROL + "a" + Keys.ENTER);
		logger.info("Ending of enterWeight method");
	}

	public void enterTxtSealNo(String SealNo) {
		logger.info("Starting of enterTxtSealNo method");
		clickOnElement(enterTxtSealNo);
		sendKeys(enterTxtSealNo, SealNo);
		enterTxtSealNo.sendKeys(Keys.CONTROL + "a" + Keys.ENTER);
		logger.info("Ending of enterTxtSealNo method");
	}

	public void clickOnbtnSave() {
		logger.info("Starting of clickOnbtnSave method");
		clickOnWebElementjs(btnSave);
		try {
			clickOnWebElementjs(btnSave);
		} catch (Exception e) {
		}
		logger.info("Ending of clickOnbtnSave method");
	}

	public void clickOnbtnManifestsForMm() {
		logger.info("Starting of clickOnbtnManifestsForMm method");
		clickOnElement(btnManifestsForMm);
		logger.info("Ending of clickOnbtnManifestsForMm method");
	}

	public String gettxtbtnBaggingDcAssert() {
		logger.info("Starting of gettxtbtnBaggingDcAssert method");
		logger.info("Ending of gettxtbtnBaggingDcAssert method");
		return getText(btnBaggingDcAssert);
	}

	public void enterBangaloreDcDrop(String dropDc) {
		logger.info("Starting of enterBangaloreDcDrop method");
		clickOnWebElementjs(btnBangaloreDcDrop);
		try {
			clickOnWebElementjs(btnBangaloreDcDrop);
		} catch (Exception e) {
		}
		sendKeys(btnBangaloreDcDrop, dropDc);
		logger.info("Ending of enterBangaloreDcDrop method");
	}

	public void clickOnbtnSelectBangaloreDc() {
		logger.info("Starting of clickOnbtnSelectBangaloreDc method");
		clickOnWebElementjs(btnSelectBangaloreDc);
		try {
			clickOnWebElementjs(btnSelectBangaloreDc);
		} catch (Exception e) {
		}
		logger.info("Ending of clickOnbtnSelectBangaloreDc method");
	}

	public void enterScanSealNo(String SealNo) {
		logger.info("Starting of enterScanSealNo method");
		sendKeys(enterScanSealNo, SealNo);
		try {
			clickOnWebElementjs(enterScanSealNo);
		} catch (Exception e) {
		}
		enterScanSealNo.sendKeys(Keys.CONTROL + "a" + Keys.ENTER);
		logger.info("Ending of enterScanSealNo method");
	}

	public void clickOnbtnSaveBox() {
		logger.info("Starting of clickOnbtnSaveBox method");
		clickOnWebElementjs(btnSaveBox);
		logger.info("Ending of clickOnbtnSaveBox method");
	}

	public void clickOnbtnTransit() {
		logger.info("Starting of enterScanSealNo method");
		clickOnWebElementjs(btnTransit);
		try {
			clickOnWebElementjs(btnTransit);
		} catch (Exception e) {
		}
		logger.info("Ending of enterScanSealNo method");
	}

	public String gettxtbtnConfirmTransit() {
		logger.info("Starting of gettxtbtnConfirmTransit method");
		logger.info("Ending of gettxtbtnConfirmTransit method");
		return getText(btnConfirmTransit);
	}

	public void clickOnbtnSelectType() {
		logger.info("Starting of clickOnbtnSelectType method");
		clickOnWebElementjs(btnSelectType);
		logger.info("Ending of clickOnbtnSelectType method");
	}

	public void clickOnbtnCoLoader() {
		logger.info("Starting of clickOnbtnCoLoader method");
		clickOnElement(btnCoLoader);
		logger.info("Ending of clickOnbtnCoLoader method");
	}

	public void clickOnbtnSelectCoLoader() {
		logger.info("Starting of clickOnbtnCoLoader method");
		clickOnElement(btnSelectCoLoader);
		logger.info("Ending of clickOnbtnCoLoader method");
	}

	public void clickOnbtnSelectThreeLines() {
		logger.info("Starting of clickOnbtnSelectThreeLines method");
		clickOnWebElementjs(btnSelectThreeLines);
		logger.info("Ending of clickOnbtnSelectThreeLines method");
	}

	public void clickOnbtnVehicleNo(String NUM) {
		logger.info("Starting of clickOnbtnVehicleNo method");
		clickOnElement(btnVehicleNo);
		sendKeys(btnVehicleNo, NUM);
		logger.info("Ending of clickOnbtnVehicleNo method");
	}

	public void enterLorNum(String LorNum) {
		logger.info("Starting of enterLorNum method");
		clickOnElement(enterLorNum);
		sendKeys(enterLorNum, LorNum);
		logger.info("Ending of enterLorNum method");

	}

	public void clickOnbtnUploadLorImg(String img) {
		logger.info("Starting of clickOnbtnUploadLorImg method");
		// clickOnElement(btnUploadLorImg);
		btnUploadLorImg.sendKeys(img);
		// sendKeys(btnUploadLorImg, img);
		logger.info("Ending of clickOnbtnUploadLorImg method");
	}

	public void clickOnbtnOrdersForManifests() {
		logger.info("Starting of clickOnbtnOrdersForManifests method");
		clickOnElement(btnOrdersForManifests);
		logger.info("Ending of clickOnbtnOrdersForManifests method");
	}

	public void clickOnbtnDestinationDc() {
		logger.info("Starting of clickOnbtnDestinationDc method");
		clickOnElement(btnDestinationDc);
		logger.info("Ending of clickOnbtnDestinationDc method");
	}

	public void clickOnbtnSelectHub() {
		logger.info("Starting of clickOnbtnSelectHub method");
		clickOnElement(btnSelectHub);
		logger.info("Ending of clickOnbtnSelectHub method");
	}

	public void clickOnbtnSelectBlrDomlur() {
		logger.info("Starting of clickOnbtnSelectBlrDomlur method");
		clickOnElement(btnSelectBlrDomlur);
		logger.info("Ending of clickOnbtnSelectBlrDomlur method");
	}

	public void clickOnbtnScanItemDomlur(String ScanDomlur) {
		logger.info("Starting of clickOnbtnScanItemDomlur method");
		clickOnElement(btnScanItemDomlur);
		sendKeys(btnScanItemDomlur, ScanDomlur);
		btnScanItemDomlur.sendKeys(Keys.CONTROL + "a" + Keys.ENTER);
		logger.info("Ending of clickOnbtnScanItemDomlur method");
	}

	public String gettxtMsgUploadLorImg() {
		logger.info("Starting of gettxtMsgUploadLorImg method");
		logger.info("Ending of gettxtMsgUploadLorImg method");
		return getText(txtMsgUploadLorImg);
	}

	public void clickOnbtnCirform() {
		logger.info("Starting of clickOnbtnCirform method");
		clickOnElement(btnCirform);
		logger.info("Ending of clickOnbtnCirform method");
	}

	public void clickOnbtnCancel() {
		logger.info("Starting of clickOnbtnCancel method");
		clickOnWebElementjs(btnCancel);
		logger.info("Ending of clickOnbtnCancel method");
	}

	public void clickOnbtnShowDetails1() {
		logger.info("Starting of clickOnbtnShowDetails1 method");
		clickOnWebElementjs(btnShowDetails1);
		logger.info("Ending of clickOnbtnShowDetails1 method");

	}

	public void clickOnbtnGurgaondc() {
		logger.info("Starting of clickOnbtnGurgaondc method");
		clickOnWebElementjs(btnGurgaondc);
		logger.info("Ending of clickOnbtnGurgaondc method");
	}

	public void clickOnbtnLogout() {
		logger.info("Starting of clickOnbtnLogout method");
		clickOnWebElementjs(btnLogout);
		logger.info("Ending of clickOnbtnLogout method");
	}

}