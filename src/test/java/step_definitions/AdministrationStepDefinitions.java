package step_definitions;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdministrationStepDefinitions {
	
	/**
	 * System
	 */
	@When("^Click on System tab$")
	public void  clickOnSystemTabButton() {
		SharedDriver.adminPage.clickOnAdminSystemTab();
	}
	
	@Then("^System tab should active$")
	public void systemTabActivated() {
		Assert.assertTrue("System tab activated",
				SharedDriver.adminPage.isAdminSystemTabActive());
	}
	
	@And("^System view loads$")
	public void systemTabViewLoad() {
		Assert.assertTrue("System view displayed",
				SharedDriver.adminPage.isAdminTabSystemViewDisplayed());
	}
	
	@And("^System tab cluster information title$")
	public void systemTabClusterInformationTitle() {
		Assert.assertEquals(
				"System tab cluster information title",
				"Cluster Information", SharedDriver.adminPage
						.getAdminTabSystemClusterInfoTitle());
	}

	@And("^System tab primary node information title$")
	public void systemTabPrimaryNodeInformationTitle() {
		Assert.assertEquals(
				"System tab primary node information title",
				"Primary Node Information", SharedDriver.adminPage
						.getAdminTabSystemPrimaryNodeInfoTitle());
	}
	
	/**
	 * Services 
	 */
	@When("^Click on Services tab$")
	public void  clickOnServicesTabButton() {
		SharedDriver.adminPage.clickOnAdminServicesTab();
	}
	
	@Then("^Services tab should active$")
	public void ServicesTabActivated() {
		Assert.assertTrue("Services tab activated",
				SharedDriver.adminPage.isAdminServicesTabActive());
	}
	
	@And("^Services view loads$")
	public void ServicesTabViewLoad() {
		Assert.assertTrue("Services view displayed",
				SharedDriver.adminPage.isAdminTabServicesViewDisplayed());
	}
	
	@And("^Services search section should display$")
	public void servicesTabSearchSectionShouldDisplay() {
		Assert.assertTrue("Services view displayed",
				SharedDriver.adminPage.isAdminTabServicesSearchSectionDisplayed());
	}
	
	@And("^Services search icon should loads$")
	public void servicesTabSearchIconShouldDisplay() {
		Assert.assertTrue("Services search icon displayed",
				SharedDriver.adminPage.isAdminTabServicesSearchDisplayed());
	}
	
	@And("^Services clear icon should display$")
	public void servicesTabClearIconShouldDisplay() {
		Assert.assertTrue("Services clear icon should displayed",
				SharedDriver.adminPage.isAdminTabServicesSearchClearIconDisplayed());
	}
	
	@And("^Services table pagination should display$")
	public void servicesTabPaginationShouldDisplay() {
		Assert.assertTrue("Services table pagination displayed",
				SharedDriver.adminPage.isAdminTabServicesTablePaginationDisplayed());
	}
	
	
	/**
	 * Network
	 */
	@When("^Click on Network tab$")
	public void  clickOnNetworkTabButton() {
		SharedDriver.adminPage.clickOnAdminNetworkTab();
	}
	
	@Then("^Network tab should active$")
	public void NetworkTabActivated() {
		Assert.assertTrue("SNMP tab activated",
				SharedDriver.adminPage.isAdminNetworkTabActive());
	}
	
	@And("^Network view loads$")
	public void NetworkTabViewLoad() {
		Assert.assertTrue("SNMP view displayed",
				SharedDriver.adminPage.isAdminTabNetworkViewDisplayed());
	}
	
	@And("^Network table pagination should display$")
	public void networkTabPaginationDisplay() {
		Assert.assertTrue("Network tab pagination displayed", 
				SharedDriver.adminPage.isAdminTabNetworkViewDisplayed());
	}
	
	/**
	 * SNMP
	 */
	@When("^Click on SNMP tab$")
	public void  clickOnSNMPTabButton() {
		SharedDriver.adminPage.clickOnAdminSNMPTab();
	}
	
	@Then("^SNMP tab should active$")
	public void SNMPTabActivated() {
		Assert.assertTrue("SNMP tab activated",
				SharedDriver.adminPage.isAdminSNMPTabActive());
	}
	
	@And("^SNMP view loads$")
	public void SNMPTabViewLoad() {
		Assert.assertTrue("SNMP view displayed",
				SharedDriver.adminPage.isAdminSNMPTabViewDisplayed());
	}
	
	@And("^SNMP header section should display$")
	public void SNMPTabHeaderSectionShouldDisplay() {
		Assert.assertTrue("SNMP Header section should display",
				SharedDriver.adminPage.isAdminSNMPTabHeaderDisplayed());
	}
	
	@And("^SNMP title should display$")
	public void SNMPTabSNMPTitle() {
		Assert.assertEquals("SNMP title should display",
				"SNMP",
				SharedDriver.adminPage.getAdminSNMPTabTitle());
	}
	
	@And("^SNMP disabled by default$")
	public void SNMPDisbaledByDefault() {
		Assert.assertTrue("SNMP disabled by default",
				SharedDriver.adminPage.isAdminSNMPTabDisabledCheckboxDisplayed());
	}
	
	@And("^SNMP download button enabled$")
	public void SNMPTabDownloadButtonEnabled() {
		Assert.assertTrue("SNMP download button enabled",
				SharedDriver.adminPage.isDownloadMIBFileButtonEnabled());
	}
	
	@And("^SNMP download text should display$")
	public void SNMPDownloadButtonText() {
		Assert.assertEquals("SNMP download button displayed",
				"Download MIB File",
				SharedDriver.adminPage.getSNMPDownloadText());
	}

	@When("^Click on SNMP checkbox \"([^\"]*)\"$")
	public void  clickOnSNMPCheckbox(String trueOrFalse) {
		SharedDriver.adminPage.clickOnSNMPTabDisabledCheckbox(trueOrFalse);
	}
	
	@Then("^SNMP should enabled") 
	public void snmpShouldEnable() {
		Assert.assertTrue("SNMP enabled",
				SharedDriver.adminPage.isSNMPCheckboxEnabled());
	}
	
	@Then("^SNMP should disabled$")
	public void snmpShouldDisable() {
		Assert.assertTrue("SNMP disabled",
				SharedDriver.adminPage.isSNMPCheckboxDisabled());
	}
	
	
	/**
	 * SNMP Add Managers
	 */
	@And("^SNMP managers section should display$")
	public void SNMPTabManagersSectionDisplayed() {
		Assert.assertTrue("SNMP managers section displayed",
				SharedDriver.adminPage.isSNMPManagersSectionDisplayed());
	}
	
	@And("^SNMP mangers section title should display$")
	public void SNMPTabManagersSectionTitleDisplayed() {
		Assert.assertEquals("SNMP managers section title displayed",
				"SNMP Managers",
				SharedDriver.adminPage.getSNMPManagersSectionTitle());
	}
	
	@And("^SNMP managers section subnet details should display$")
	public void SNMPTabManagersSubnetFieldsDisplayed() {
		Assert.assertTrue("SNMP managers subnet fields displayed",
				SharedDriver.adminPage.isSNMPManagersSubnetFieldsDisplayed());
	}

	@And("^SNMP managers section version details should display$")
	public void SNMPTabManagersVersionFieldsDisplayed() {
		Assert.assertTrue("SNMP managers version fields displayed",
				SharedDriver.adminPage.isSNMPManagersVersionFieldsDisplayed());
	}
	
	@And("^SNMP managers section community should display$")
	public void SNMPTabManagersCommunityFieldsDisplayed() {
		Assert.assertTrue("SNMP managers community fields displayed",
				SharedDriver.adminPage.isSNMPManagersCommunityFieldsDisplayed());
	}
	
	@And("^SNMP managers delete link should enabled$")
	public void SNMPTabManagersDeleteLinkEnabled() {
		Assert.assertTrue("SNMP managers delete link should enabled",
				SharedDriver.adminPage.isSNMPManagersDeleteLinkEnabled());
	}
	
	@And("^SNMP managers add manager link should enabled$")
	public void SNMPTabAddManagersLinkEnabled() {
		Assert.assertTrue("SNMP managers add managers link should enabled",
				SharedDriver.adminPage.isSNMPManagersAddManagerLinkEnabled());
	}
	
	/**
	 * Trap Destination
	 */
	@And("^SNMP trap destination section should display$")
	public void SNMPTabTrapDestinationSectionDisplayed() {
		Assert.assertTrue("SNMP trap destination displayed",
				SharedDriver.adminPage.isSNMPSystemDetailsSectionDisplayed());
	}
	
	@And("^SNMP trap destination section title should display$")
	public void SNMPTabTrapDestinationSectionTitleDisplayed() {
		Assert.assertEquals("SNMP system details section title displayed",
				"SNMP Trap Destinations",
				SharedDriver.adminPage.getSNMPTrapDestinationSectionTitle());
	}
	
	@And("^SNMP trap destination section IP address details should display$")
	public void SNMPTabTrapDestinationIPAddressFieldsDisplayed() {
		Assert.assertTrue("SNMP trap destination ip address fields displayed",
				SharedDriver.adminPage.isSNMPTrapDestinationIPAddressFieldsDisplayed());
	}

	@And("^SNMP trap destination section version details should display$")
	public void SNMPTabTrapDestinationVersionFieldsDisplayed() {
		Assert.assertTrue("SNMP trap destination version fields displayed",
				SharedDriver.adminPage.isSNMPTrapDestinationVersionFieldsDisplayed());
	}
	
	@And("^SNMP trap destination section community should display$")
	public void SNMPTabTrapDestinationCommunityFieldsDisplayed() {
		Assert.assertTrue("SNMP trap destination community fields displayed",
				SharedDriver.adminPage.isSNMPTrapDestinationCommunityFieldsDisplayed());
	}
	
	@And("^SNMP trap destination delete link should enabled$")
	public void SNMPTabDeleteLinkEnabled() {
		Assert.assertTrue("SNMP trap destination delete link should enabled",
				SharedDriver.adminPage.isSNMPTrapDestinationDeleteLinkEnabled());
	}
	
	@And("^SNMP trap destination add destination link should enabled$")
	public void SNMPTabAddDestinationLinkEnabled() {
		Assert.assertTrue("SNMP trap destination link should enabled",
				SharedDriver.adminPage.isSNMPTrapDestinationAddDestinationLinkEnabled());
	}
	
	/**
	 * System details
	 */
	@And("^SNMP system details section should display$")
	public void SNMPTabSysDetailsSectionDisplayed() {
		Assert.assertTrue("SNMP system section displayed",
				SharedDriver.adminPage.isSNMPSystemDetailsSectionDisplayed());
	}
	
	@And("^SNMP system details section title should display$")
	public void SNMPTabSysDetailsSectionTitleDisplayed() {
		Assert.assertEquals("SNMP system details section title displayed",
				"System Details",
				SharedDriver.adminPage.getSNMPSystemDetailsSectionTitle());
	}
	
	@And("^SNMP system details contact name details should display$")
	public void SNMPTabSysDetailsContactNameDisplayed() {
		Assert.assertTrue("SNMP system details contact name fields displayed",
				SharedDriver.adminPage.isSNMPSystemDeatilsContactNameFieldsDisplayed());
	}
	
	@And("^SNMP system details contact email details should display$")
	public void SNMPTabSysDetailsContactEmailDisplayed() {
		Assert.assertTrue("SNMP system details contact email fields displayed",
				SharedDriver.adminPage.isSNMPSystemDeatilsContactEmailFieldsDisplayed());
	}
	
	@And("^SNMP system details description details should display$")
	public void SNMPTabSysDetailsDescriptionDisplayed() {
		Assert.assertTrue("SNMP system details description fields displayed",
				SharedDriver.adminPage.isSNMPSystemDeatilsDescriptionFieldsDisplayed());
	}
	
	@And("^SNMP system details location address details should display$")
	public void SNMPTabSysDetailsLocationAddressDisplayed() {
		Assert.assertTrue("SNMP system details location address fields displayed",
				SharedDriver.adminPage.isSNMPSystemDeatilsLocationAddressFieldsDisplayed());
	}
	
	@And("^SNMP Save button should enabled$")
	public void SNMPTabSaveButtonEnabled() {
		Assert.assertTrue("SNMP save button enabled",
				SharedDriver.adminPage.isSNMPTrapSaveButtonEnabled());
	}
	
	/**
	 * Software Update
	 */
	@When("^Click on Software Update tab$")
	public void  clickOnSoftwareUpdateButton() {
		SharedDriver.adminPage.clickOnAdminSoftwareUpdateTab();
	}
	
	@Then("^Software update tab should active$")
	public void softwareUpdateTabActivated() {
		Assert.assertTrue("Software update tab activated",
				SharedDriver.adminPage.isAdminSoftwareUpdateTabActive());
	}
	
	@And ("^Software update view loads$")
	public void softwareUpdateViewLoad() {
		Assert.assertTrue("Software update view displayed",
				SharedDriver.adminPage.isAdminTabSoftwareUpdateViewDisplayed());
	}
	
	@And("^Software Packages section should display$")
	public void softwareUpdateTabSWPackageSectionDisplayed() {
		Assert.assertTrue("Software package section should display",
				SharedDriver.adminPage.isAdminSoftwareUpdateTabSWPackagesSectionDisplayed());
	}
	
	@And("^Software Packages section title should display$")
	public void softwareUpdateTabSWPackagesSectionHeaderDisplayed() {
		Assert.assertEquals("Software package section header should display",
				"Software Packages",
				SharedDriver.adminPage.getAdminSoftwareUpdateTabSWHeader());
	}
	
	@And("^Software Packages upload button should enabled$")
	public void softwareUpdateTabSWPackageUploadButtonEnabled() {
		Assert.assertTrue("Software package upload button should enabled",
				SharedDriver.adminPage.isAdminSoftwareUpdateTabSWPackagesUploadButtonEnabled());
	}
	
	
	@And("^Software Packages cancel button should enabled$")
	public void softwareUpdateTabSWPackageCancelButtonEnabled() {
		Assert.assertTrue("Software package cancel button should enabled",
				SharedDriver.adminPage.isAdminSoftwareUpdateTabSWPackagesCancelButtonEnabled());
	}
	
	@And("^Software Packages table should display$")
	public void softwareUpdateTabSWPackageTableShouldDisplayed() {
		Assert.assertTrue("Software package table should display",
				SharedDriver.adminPage.isAdminSoftwareUpdateTabSWPackagesTableHeadersDisplayed());
	}
	
	@And("^Software Packages table pagination should display$")
	public void softwareUpdateTabSWPackageTablePaginationDisplayed() {
		Assert.assertTrue("Software package section pagination should display",
				SharedDriver.adminPage.isAdminSoftwareUpdateTabSWPackagesPaginationDisplayed());
	}
	
	
	@And("^Software Nodes section should display$")
	public void softwareUpdateTabSWNodesSectionDisplayed() {
		Assert.assertTrue("Software nodes section should display",
				SharedDriver.adminPage.isAdminSoftwareUpdateTabSWNodesSectionDisplayed());
	}
	
	@And("^Software Nodes section title should display$")
	public void softwareUpdateTabSWNodesSectionHeaderDisplayed() {
		Assert.assertEquals("Software nodes section header should display",
				"DataSphere and DSX Node Software",
				SharedDriver.adminPage.getAdminSoftwareUpdateTabSWNodesTableHeader());
	}
	
	@And("^Software Node update all button should disabled$")
	public void softwareUpdateTabSWPackageUpdateAllButtonDisabled() {
		Assert.assertTrue(
				"Software package update button should disabled",
				SharedDriver.adminPage
						.isAdminSoftwareUpdateTabSWNodesUpdateAllButtonDisplayed());
	}
	
	@And("^Software Nodes table should display$")
	public void softwareUpdateTabSWNodesTableShouldDisplayed() {
		Assert.assertTrue("Software nodes table should display",
				SharedDriver.adminPage.isAdminSoftwareUpdateTabSWNodesTableHeadersDisplayed());
	}
	
	@And("^Software Nodes table pagination should display$")
	public void softwareUpdateTabSWNodeTablePaginationDisplayed() {
		Assert.assertTrue("Software nodes section pagination should display",
				SharedDriver.adminPage.isAdminSoftwareUpdateTabSWNodesPaginationDisplayed());
	}
	
	/**
	 * Support tab
	 */
	
	@When("^Click on Support tab$")
	public void  clickOnSupportTabButton() {
		SharedDriver.adminPage.clickOnAdminSupportTab();
	}
	
	@Then("^Support update tab should active$")
	public void suportTabActivated() {
		Assert.assertTrue("Support update tab activated",
				SharedDriver.adminPage.isAdminSupportTabActive());
	}
	
	@And("^Support update view loads$")
	public void supportTabViewLoad() {
		Assert.assertTrue("Support tab view displayed",
				SharedDriver.adminPage.isAdminSupportTabViewDisplayed());
	}
	
	@And("^Support update send section should loads$")
	public void supportTabSendSectionShouldLoad() {
		Assert.assertTrue("Support tab send section displayed",
				SharedDriver.adminPage.isAdminSupportTabSendSectionDisplayed());
	}
	
	@And("^Support tab send section title should display$") 
	public void supportTabSendTitleShouldDisplay() {
		Assert.assertEquals("Support tab send title should display",
				SharedDriver.adminPage.getAdminSupportTabSendExpectedTitle(),
				SharedDriver.adminPage.getAdminSupportTabSendActualTitle()
				);
	}
	
	@And("^Support tab send section sub title should display$") 
	public void supportTabSendSubTitleShouldDisplay() {
		Assert.assertEquals("Support tab send sub title should display",
				SharedDriver.adminPage.getAdminSupportTabSendExpectedSubTitle(),
				SharedDriver.adminPage.getAdminSupportTabSendActualSubTitle()
				);
	}
	
	@And("^Support update send button should enabled$")
	public void supportTabSendButtonShouldEnabled() {
		Assert.assertTrue("Support tab send section displayed",
				SharedDriver.adminPage.isAdminSupportTabSendButtonEnabled());
	}
	
	
	@And("^Support update download section should loads$")
	public void supportTabDownloadSectionShouldLoad() {
		Assert.assertTrue("Support tab download section displayed",
				SharedDriver.adminPage.isAdminSupportTabDownloadSectionDisplayed());
	}
	
	@And("^Support tab download section title should display$") 
	public void supportTabDownloadTitleShouldDisplay() {
		Assert.assertEquals("Support tab download title should display",
				SharedDriver.adminPage.getAdminSupportTabDownloadExpectedTitle(),
				SharedDriver.adminPage.getAdminSupportTabDownloadActualTitle()
				);
	}
	
	@And("^Support tab download section sub title should display$") 
	public void supportTabDownloadSubTitleShouldDisplay() {
		Assert.assertEquals("Support tab download sub title should display",
				SharedDriver.adminPage.getAdminSupportTabDownloadExpectedSubTitle(),
				SharedDriver.adminPage.getAdminSupportTabDownloadActualSubTitle()
				);
	}
	
	@And("^Support update download button should enabled$")
	public void supportTabDownloadButtonShouldEnabled() {
		Assert.assertTrue("Support tab download section displayed",
				SharedDriver.adminPage.isAdminSupportTabDownloadButtonEnabled());
	}
	
	/**
	 * Active Directory tab
	 */
	@When("^Click on Active Directory tab$")
	public void  clickOnActiveDirectoryTabButton() {
		SharedDriver.adminPage.clickOnAdminActiveDirectoryTab();
	}
	
	@Then("^Active directory tab should active$")
	public void activeDirectoryTabActivated() {
		Assert.assertTrue("Active directory tab activated",
				SharedDriver.adminPage.isAdminActiveDirectoryTabActive());
	}
	
	@And("^Active directory tab view loads$")
	public void activeDirectoryTabViewLoad() {
		Assert.assertTrue("Active directory tab view displayed",
				SharedDriver.adminPage.isAdminTabActiveDirectoryViewDisplayed());
	}
	
	@And("^Active directory title should display$") 
	public void activeDirectoryTabTitleShouldDisplay() {
		Assert.assertEquals("Active directory title should display",
				SharedDriver.adminPage
						.getAdminTabActiveDirectoryExpectedTitle(),
				SharedDriver.adminPage.getAdminTabActiveDirectoryActualTitle());
	}
	
	@And("^Active directory domain label should display$") 
	public void activeDirectoryTabDomainLabelShouldDisplay() {
		Assert.assertEquals("Active directory domain label should display",
				"Active Directory Domain",
				SharedDriver.adminPage.getAdminTabActiveDirectoryDomainActualLabel());
	}
	
	@And("^Active directory domain input enabled$")
	public void activeDirectoryTabDomainInputEnabled() {
		Assert.assertTrue("Active directory domain input enabled",
				SharedDriver.adminPage.isAdminTabActiveDirectoryInputEnabled());
	}
	
	@And("^Active directory organizational unit label should display$") 
	public void activeDirectoryTabOrgUnitLabelShouldDisplay() {
		Assert.assertEquals("Active directory organization unit label should display",
				"Organizational Unit",
				SharedDriver.adminPage.getAdminTabActiveDirectoryOrgUnitActualLabel());
	}
	
	@And("^Active directory organizational unit helper text should display$") 
	public void activeDirectoryTabOrgUnitHelperTextShouldDisplay() {
		Assert.assertEquals("Active directory organization unit helper text should display",
				"Please Escape any Special / Reserved characters",
				SharedDriver.adminPage.getAdminTabActiveDirectoryOrgUnitHelpTextActualLabel());
	}
	
	@And("^Active directory organizational unit input enabled$")
	public void activeDirectoryTabOrgUnitInputEnabled() {
		Assert.assertTrue("Active directory organizational unit input enabled",
				SharedDriver.adminPage.isAdminTabActiveDirectoryOrgUnitInputEnabled());
	}
	
	@And("^Active directory organizational unit icon displayed$")
	public void activeDirectoryTabOrgUnitIconDisplayed() {
		Assert.assertTrue("Active directory organizational unit icon displayed",
				SharedDriver.adminPage.isAdminTabActiveDirectoryOrgUnitHelpTextIconDisplayed());
	}
	
	@And("^Active directory login label should display$") 
	public void activeDirectoryTabLoginLabelShouldDisplay() {
		Assert.assertEquals("Active directory login label should display",
				"Administrator Login",
				SharedDriver.adminPage.getAdminTabActiveDirectoryLoginLabel());
	}
	
	@And("^Active directory login input enabled$")
	public void activeDirectoryTabLoginInputEnabled() {
		Assert.assertTrue("Active directory login input enabled",
				SharedDriver.adminPage.isAdminTabActiveDirectoryLoginInputEnabled());
	}
	
	@And("^Active directory password label should display$") 
	public void activeDirectoryTabPasswordLabelShouldDisplay() {
		Assert.assertEquals("Active directory password label should display",
				"Administrator Password",
				SharedDriver.adminPage.getAdminTabActiveDirectoryPasswordLabel());
	}
	
	@And("^Active directory password input enabled$")
	public void activeDirectoryTabPasswordInputEnabled() {
		Assert.assertTrue("Active directory password input enabled",
				SharedDriver.adminPage.isAdminTabActiveDirectoryPasswordInputEnabled());
	}
	
	@And("^Active directory join button enabled$")
	public void activeDirectoryTabJoinButtonEnabled() {
		Assert.assertTrue("Active directory join button enabled",
				SharedDriver.adminPage.isAdminTabActiveDirectoryJoinButtonEnabled());
	}
	
	/**
	 * Users tab
	 */
	@When("^Click on Users tab$")
	public void  clickOnUsersTabButton() {
		SharedDriver.adminPage.clickOnAdminUsersTab();
	}
	
	@Then("^Users tab should active$")
	public void adminUsersTabActive() {
		Assert.assertTrue("Users tab activated",
				SharedDriver.adminPage.isAdminUsersTabActive());
	}
	
	@And("^Users tab view loads$")
	public void usersTabViewLoad() {
		Assert.assertTrue("Users tab view displayed",
				SharedDriver.adminPage.isAdminTabUsersViewDisplayed());
	}
	
	@And("^Create user icon should display$")
	public void usersTabCreateUserIconShouldDisplay() {
		Assert.assertTrue("Create user plus icon should display",
				SharedDriver.adminPage.isAdminTabUsersBodyIconDisplayed());
	}
	
	@And("^Create user label should display$") 
	public void usersTabCreateUserLabelShouldDisplay() {
		Assert.assertEquals("Create User label should display",
				"Create User",
				SharedDriver.adminPage.getAdminTabUsersBodyHeader());
	}
	
	@And("^Create user search section should display$")
	public void usersTabCreateUserSearchEnabled() {
		Assert.assertTrue("Create user search section display",
				SharedDriver.adminPage.isAdminTabUsersBodySearchSectionDisplayed());
	}
	
	@And("^Create user search icon should display$")
	public void addStorageSystemSearchIconDisplay() {
		Assert.assertTrue("Storage system search icon displayed", 
				SharedDriver.adminPage.isAdminTabUsersBodyMagnifierIconDisplayed());
	}
	
	@And("^Create user search clear icon should display$")
	public void addUsersSearchClearIconDisplay() {
		Assert.assertTrue("Users search clear icon displayed", 
				SharedDriver.adminPage.isAdminTabUsersBodyClearIconDisplayed());
	}
	
	@And("^Create users table download icon should display$")
	public void addUsersDownloadIconDisplay() {
		Assert.assertTrue("Users download icon displayed", 
				SharedDriver.adminPage.isAdminTabUsersBodyDownloadIconDisplayed());
	}
	
	@And("Create users table pagination should display$")
	public void addUsersPaginationDisplay() {
		Assert.assertTrue("Users pagination displayed", 
				SharedDriver.adminPage.isAdminTabUsersBodyPaginationDisplayed());
	}
}
