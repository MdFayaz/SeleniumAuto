package step_definitions;

import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StorageSystemsStepDefinitions {
	
	@Then("^Storage System view should display$")
	public void storageSystemViewDisplay() {
		Assert.assertTrue("Storage system view displayed", 
				SharedDriver.storageSystem.isStorageSystemsViewDisplayed());
	}
	
	@And("^Add Storage System icon should display$")
	public void addStorageSystemPlusIconDisplay() {
		Assert.assertTrue("Storage system add storage system plus icon displayed", 
				SharedDriver.storageSystem.isStorageSystemsAddStorageSytemsIconDisplayed());
	}
	
	@And("^Add Storage System header should display$")
	public void addStorageSystemHeaderDisplay() {
		Assert.assertEquals(
				"Storage system add storage system header displayed",
				"Add Storage System", SharedDriver.storageSystem
						.getStorageSystemsAddStorageSystemHeader());
	}
	
	@And("^Storage System search section should display$")
	public void addStorageSystemSearchSectionDisplay() {
		Assert.assertTrue("Storage system search section displayed", 
				SharedDriver.storageSystem.isStorageSystemsSearchSectionDisplayed());
	}
	
	@And("^Storage System search icon should display$")
	public void addStorageSystemSearchIconDisplay() {
		Assert.assertTrue("Storage system search icon displayed", 
				SharedDriver.storageSystem.isStorageSystemsMagnifierIconDisplayed());
	}
	
	@And("^Storage System clear icon should display$")
	public void addStorageSystemSearchClearIconDisplay() {
		Assert.assertTrue("Storage system search clear icon displayed", 
				SharedDriver.storageSystem.isStorageSystemsClearIconDisplayed());
	}
	
	@And("^Storage System download icon should display$")
	public void addStorageSystemDownloadIconDisplay() {
		Assert.assertTrue("Storage system download icon displayed", 
				SharedDriver.storageSystem.isStorageSystemsDownloadIconDisplayed());
	}
	
	@And("^Storage System pagination should display$")
	public void addStorageSystemPaginationDisplay() {
		Assert.assertTrue("Storage system pagination displayed", 
				SharedDriver.storageSystem.isStorageSystemsTablePaginationDisplayed());
	}
	
	@When("^Click on Add Storage System$")
	public void  clickOnAddStorageSystemButton() {
		SharedDriver.storageSystem.clickOnAddStorageSystemButton();
	}
	
	@Then("^Add Storage System popover should display$")
	public void addStorageSystemPopoverDisplay() {
		Assert.assertTrue("Popover 'Add Storage System' displayed", 
				SharedDriver.storageSystem.addStorageSystemPopoverDisplayed());
	}
	
	@And("^Add storage system popover title$")
	public void addStorageSystemPopoverTitle() {
		Assert.assertEquals("Add storage system - type label", "Add Storage System",
				SharedDriver.storageSystem.getStorageSystemPopoverTitle());
	}
	
	@When("^Close Add Storage System popover$")
	public void clickOnAddStorageSystemPopoverCloseButton() {
		SharedDriver.storageSystem.clickOnStorageSystemPopoverCloseIcon();
	}
	
	@Then("^Add Storage System popover should not display$")
	public void addStorageSystemPopoverNotDisplay() {
		Assert.assertFalse("Popover 'Add Storage System' not displayed", 
				SharedDriver.storageSystem.addStorageSystemPopoverDisplayed());
	}
	
	@And("^Add Storage System with name \"([^\"]*)\"$" )
	public void addStorageSystemWithName(String name) {
		SharedDriver.storageSystem.addNameToStorageSystem(name);
	}
	
	@And("Add storage system name label display$")
	public void addStorageSystemNameLabel() {
		Assert.assertEquals("Add storage system - name label", "Name:",
				SharedDriver.storageSystem.getNameLabel());
	}
	
	@And("Add storage system name textfield display")
	public void addStorageSystemNameTextfieldDisplay() {
		Assert.assertTrue("Add storage system - name textfield",
				SharedDriver.storageSystem.isNameTextFieldDisplayed());
	}
	
	@And("^Add Storage System with type \"([^\"]*)\"$" )
	public void addStorageSystemWithType(String type) {
		SharedDriver.storageSystem.addTypeToStorageSystem(type);
	}
	
	@And("^Add storage system type label display$")
	public void addStorageSystemTypeLabel() {
		Assert.assertEquals("Add storage system - type label", "Type:",
				SharedDriver.storageSystem.getStorageTypeLabel());
	}
	
	@And("^Add storage system type dropdown display$")
	public void addStorageSystemTypeDropdownDisplay() {
		Assert.assertTrue("Add storage system - type dropdown",
				SharedDriver.storageSystem.isStorageTypeDropdownDisplayed());
	}
	
	@Given("^IP Address \"([^\"]*)\"$")
	public void addIPAddress(String ipAddress) {
		SharedDriver.storageSystem.addIPAddress(ipAddress);
	}
	
	@And("^Add storage system ip address label display$")
	public void addStorageSystemIPAddressLabel() {
		Assert.assertEquals("Add storage system - ip address label", "IP Address:",
				SharedDriver.storageSystem.getAddIPAddressLabel());
	}
	
	@And("^Add storage system ip address textfield display$")
	public void addStorageSystemIPAddressTextfieldDisplay() {
		Assert.assertTrue("Add storage system - ip address textfield",
				SharedDriver.storageSystem.isAddIPAddressTextFieldDisplayed());
	}

	@Given("^User \"([^\"]*)\"$")
	public void addUser(String user) {
		SharedDriver.storageSystem.addUser(user);
	}
	
	@And("^Add storage system user label display$")
	public void addStorageSystemUserLabel() {
		Assert.assertEquals("Add storage system - user label", "User:",
				SharedDriver.storageSystem.getUserLabel());
	}
	
	@And("^Add storage system user textfield display$")
	public void addStorageSystemUserTextfieldDisplay() {
		Assert.assertTrue("Add storage system - user textfield",
				SharedDriver.storageSystem.isUserTextFieldDisplayed());
	}

	@Given("^Password \"([^\"]*)\"$")
	public void addPassword(String password) {
		SharedDriver.storageSystem.addPassword(password);
	}
	
	@And("^Add storage system password label display$")
	public void addStorageSystemPasswordLabel() {
		Assert.assertEquals("Add storage system - password label", "Password:",
				SharedDriver.storageSystem.getPasswordLabel());
	}
	
	@And("^Add storage system password textfield display$")
	public void addStorageSystemPasswordTextfieldDisplay() {
		Assert.assertTrue("Add storage system - password textfield",
				SharedDriver.storageSystem.isPasswordTextFieldDisplayed());
	}

	@Given("^SNMP \"([^\"]*)\"$")
	public void addSNMP(String snmp) {
		SharedDriver.storageSystem.addSNMP(snmp);
	}
	
	@And("^Add storage system snmp label display$")
	public void addStorageSystemSNMPLabel() {
		Assert.assertEquals("Add storage system - snmp label", "SNMP:",
				SharedDriver.storageSystem.getSNMPLabel());
	}
	
	@And("^Add storage system snmp textfield display$")
	public void addStorageSystemSNMPTextfieldDisplay() {
		Assert.assertTrue("Add storage system - snmp textfield",
				SharedDriver.storageSystem.isSNMPTextFieldDisplayed());
	}
	
	@Given("^Description \"([^\"]*)\"$")
	public void addDescription(String description) {
		System.out.println("in Description");
		SharedDriver.storageSystem.addDescription(description);
	}
	
	@And("^Add storage system description label display$")
	public void addStorageSystemDescriptionLabel() {
		Assert.assertEquals("Add storage system - password label", "Description:",
				SharedDriver.storageSystem.getDescriptionLabel());
	}
	
	@And("^Add storage system description textfield display$")
	public void addStorageSystemDescriptionTextfieldDisplay() {
		Assert.assertTrue("Add storage system - password textfield",
				SharedDriver.storageSystem.isDescriptionTextFieldDisplayed());
	}
	
	@Given("^Access Key \"([^\"]*)\"$")
	public void addAccessKey(String accessKey) {
		System.out.println("in accessKey");
		SharedDriver.storageSystem.addAccessKey(accessKey);
	}
	
	@And("^Add storage system access key label display$")
	public void addStorageSystemAccessKeyLabel() {
		Assert.assertEquals("Add storage system - access key label", "Access Key:",
				SharedDriver.storageSystem.getAccessKeyLabel());
	}
	
	@And("^Add storage system access key textfield display$")
	public void addStorageSystemAccessKeyTextfieldDisplay() {
		Assert.assertTrue("Add storage system - access key textfield",
				SharedDriver.storageSystem.isAccessKeyTextFieldDisplayed());
	}
	
	@Given("^Secret Key \"([^\"]*)\"$")
	public void addSecretKey(String secretKey) {
		System.out.println("in secretKey");
		SharedDriver.storageSystem.addSecretKey(secretKey);
	}
	
	@And("^Add storage system secret key label display$")
	public void addStorageSystemSecretKeyLabel() {
		Assert.assertEquals("Add storage system - secret key label", "Secret Key:",
				SharedDriver.storageSystem.getSecretKeyLabel());
	}
	
	@And("^Add storage system secret key textfield display$")
	public void addStorageSystemSecretKeyTextfieldDisplay() {
		Assert.assertTrue("Add storage system - secret key textfield",
				SharedDriver.storageSystem.isSecretKeyTextFieldDisplayed());
	}
	
	@Given("^Endpoint \"([^\"]*)\"$")
	public void addEndPoint(String endPoint) {
		System.out.println("in endPoint");
		SharedDriver.storageSystem.enterEndPoint(endPoint);
	}
	
	@And("^Add storage system endpoint label display$")
	public void addStorageSystemEndPointLabel() {
		Assert.assertEquals("Add storage system - endpoint label", "Endpoint:",
				SharedDriver.storageSystem.getEndPointLabel());
	}
	
	@And("^Add storage system endpoint dropdown display$")
	public void addStorageSystemEndPointTextfieldDisplay() {
		Assert.assertTrue("Add storage system - endpoint dropdown",
				SharedDriver.storageSystem.isEndPointDropdownDisplayed());
	}
	
	@Given("^Proxy Host \"([^\"]*)\"$")
	public void addProxyHost(String proxyHost) {
		System.out.println("in proxyHost");
		SharedDriver.storageSystem.addProxyHost(proxyHost);
	}
	
	@And("^Add storage system proxy host label display$")
	public void addStorageSystemProxyHostLabel() {
		Assert.assertEquals("Add storage system - proxy host label", "Proxy Host:",
				SharedDriver.storageSystem.getProxyHostLabel());
	}
	
	@And("^Add storage system proxy host textfield display$")
	public void addStorageSystemProxyHostTextfieldDisplay() {
		Assert.assertTrue("Add storage system - proxy host textfield",
				SharedDriver.storageSystem.isProxyHostTextFieldDisplayed());
	}
	
	@Given("^Proxy Port \"([^\"]*)\"$")
	public void addProxyPort(String proxyPort) {
		System.out.println("in proxyPort");
		SharedDriver.storageSystem.addProxyPort(proxyPort);
	}
	
	@And("^Add storage system proxy port label display$")
	public void addStorageSystemProxyPortLabel() {
		Assert.assertEquals("Add storage system - proxy port label", "Proxy Port:",
				SharedDriver.storageSystem.getProxyPortLabel());
	}
	
	@And("^Add storage system proxy port textfield display$")
	public void addStorageSystemProxPortTextfieldDisplay() {
		Assert.assertTrue("Add storage system - proxy port textfield",
				SharedDriver.storageSystem.isProxyPortTextFieldDisplayed());
	}
	
	@And("^Add Storage System$")
	public void addStorageSystem() {
		System.out.println("in addStorageSystem Button");
		SharedDriver.storageSystem.clickAddStorageSystemButtonOnPopover();
	}
	
	@Then("^Storage system should added with below details$")
	public void validateAddedStorageSystem(DataTable expectedData) {
		System.out.println("in added storage validation");
		SharedDriver.storageSystem.getExpectedDataMap(expectedData);
		SharedDriver.storageSystem.getActualDataMap("");
		/*Assert.assertTrue("Storage system " + storageSystemName
				+ " added successfully",
				SharedDriver.storageSystem.isStroageSystemAdded());
		Assert.assertEquals("", "expected", "actuals"); */
	}
	
	@And("^Search storage system table \"([^\"]*)\"$")
	public void searchStorageSystemTable(String storageSystemName) {
		SharedDriver.storageSystem
				.searchStorageSystem(storageSystemName);
	}
	
	@When("^Click on Volume button \"([^\"]*)\"$")
	public void clickOnVolumeButton(String volumeToStorageSystem) {
		SharedDriver.storageSystem.clickOnVolumeButton(volumeToStorageSystem);
	}
	
	@And("^Search and Select for volume \"([^\"]*)\"$")
	public void searchForVolume(String volumeNameToSearch) {
		SharedDriver.infrastructureAndDataPage.searchForVolume(
				volumeNameToSearch);
		SharedDriver.infrastructureAndDataPage.selectCheckbox();
	}
	
	@And("^Click on Next Step button on Selections$")
	public void clickOnSelectionsNextStepButton(){
		SharedDriver.infrastructureAndDataPage.clickOnAddVolumesNextStepButton();
	}
	
	@Then("^Select Assimilate Data to \"([^\"]*)\"$")
	public void selectAssimilateDataTo(String assimilateDataTo) {
		/*Assert.assertTrue("By default assmilated data to No",
				SharedDriver.infrastructureAndDataPage
						.isAssimilateDataByDefaultedCheckedNo());*/
		SharedDriver.infrastructureAndDataPage
				.assimilateDataTo(assimilateDataTo);
	}
		
	@And("^Assimilate popover title should be \"([^\"]*)\"$")
	public void validateAssimilateDataPopoverTitle(String expectedData) {
		Assert.assertEquals(expectedData,
				SharedDriver.infrastructureAndDataPage
						.getConfirmAssimilatePopoverTitle(),
				"Confirm assimilation popover title");
	}
	
	@And("^Confirm Assimilate popover should displayed$")
	public void confirmAssimilationPopoverDisplayed() {
		Assert.assertTrue("Confirm assimilation popover displayed", SharedDriver.infrastructureAndDataPage
				.isConfirmAssimilatePopoverDisplayed());
	}
	
	@And("^Confirm Assimilate \"([^\"]*)\"$") 
	public void confirmAssimilation(String cancelOrAssimilate) {
		SharedDriver.infrastructureAndDataPage.confirmAssimilation(cancelOrAssimilate);
	}
	
	@Then ("^Add to share link should display$")
	public void addToShareLinkDisplayed() {
		Assert.assertTrue("Add to share link for assimilation displayed",
				SharedDriver.infrastructureAndDataPage
						.isAddToShareLinkDisplayed());
	}
	
	@When("^Click on Add to Share link$")
	public void clickOnAddToShareLink() {
		SharedDriver.infrastructureAndDataPage
		.clickOnAddToShareLink();
	}
	
	@Then ("^Add To Existing Share section should display$")
	public void addToShareLinkFormDisplayed() {
		Assert.assertTrue("Add to share link for assimilation displayed",
				SharedDriver.infrastructureAndDataPage
						.isAddToExistingShareSectionDisplayed());
	}
	
	@When("^Select an existing share \"([^\"]*)\"$") 
	public void selectAShareFromExisting(String shareName) {
		SharedDriver.infrastructureAndDataPage
		.clickOnSelectShareDropdown();
		SharedDriver.infrastructureAndDataPage
		.selectShareFromExisting(shareName);
	}
	
	@And("^Type share path \"([^\"]*)\"$") 
	public void typeSharePath(String sharePath) {
		SharedDriver.infrastructureAndDataPage.enterSharePath(sharePath);
	}
	
	@And("^Click on Add to Existing Share save button$")
	public void clickOnAddToExisintShareSaveButton() {
		SharedDriver.infrastructureAndDataPage
				.clickOnAddToExistingShareSaveButton();
	}
	
	@And("^Click on Next Step button on Assimilate Data$")
	public void clickOnAssimilateDataNextStepButton() {
		SharedDriver.infrastructureAndDataPage
				.clickOnAddVolumesNextStepButton();
	}
	
	@Then("^Manage Capacity threshold to \"([^\"]*)\"$")
	public void manageCapacityThreshold(String mobilityPercentage) {
		SharedDriver.infrastructureAndDataPage
				.setManageCapacityThreshold(mobilityPercentage);
	}
	
	@And("^Click on Next Step button on Manage Capacity$")
	public void clickOnManageCapacityNextStepButton() {
		SharedDriver.infrastructureAndDataPage
				.clickOnAddVolumesNextStepButton();
	}
	
	@And("^Click on Add Volumes button$")
	public void clickOnAddVolumesButton() {
		SharedDriver.infrastructureAndDataPage.clickOnAddVolumesButton();
	}
	
	@Then("^Validate Added Volume$")
	public void validateAddedVolumes() {
		
	}
}