package com.datasphere.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.datasphere.page.constants.AdministrationPageConstants;
import com.datasphere.webelements.PageObject;

public class AdministrationPage extends LandingPage {

	WebDriver webDriver;
	PageObject administrationPage;

	public AdministrationPage(WebDriver driver) {
		super(driver);
		administrationPage = new PageObject(driver,
				"src/test/resources/AdministrationPageLocators.json");
	}

	public boolean isAdminPageViewDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_PAGE_VIEW).isDisplayed();
	}

	public String getAdminPageActualTitle() {
		return administrationPage.getLabel(
				AdministrationPageConstants.ADMIN_PAGE_TITLE).getText();
	}

	public String getAdminPageExpectedTitle() {
		return administrationPage
				.getExpectedData(AdministrationPageConstants.ADMIN_PAGE_TITLE);
	}

	/**
	 * System tab
	 */
	public void clickOnAdminSystemTab() {
		administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_SYSTEM).click();
		waitUntilPageDataLoads("Admin - System tab");
	}
	
	public boolean isAdminSystemTabActive() {
		String classAttribute = administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_SYSTEM).getAttribute("class");
		return classAttribute.contains("active");
	}
	
	public boolean isAdminTabSystemViewDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SYSTEM_BODY)
				.isDisplayed();
	}
	
	public String getAdminTabSystemClusterInfoTitle() {
		return administrationPage
				.getLabel(
						AdministrationPageConstants.ADMIN_TAB_SYSTEM_BODY_CLUSTER_INFO_HEADER)
				.getText();
	}
	
	public String getAdminTabSystemClusterNameInfo() {
		return administrationPage
				.getLabel(
						AdministrationPageConstants.ADMIN_TAB_SYSTEM_CLUSTER_NAME_INFO)
				.getText();
	}
	
	public String getAdminTabSystemClusterHealthInfo() {
		return administrationPage
				.getLabel(
						AdministrationPageConstants.ADMIN_TAB_SYSTEM_CLUSTER_HEADER_INFO)
				.getText();
	}
	
	public String getAdminTabSystemClusterIDInfo() {
		return administrationPage.getLabel(
				AdministrationPageConstants.ADMIN_TAB_SYSTEM_CLUSTER_ID_INFO)
				.getText();
	}
	

	public String getAdminTabSystemPrimaryNodeInfoTitle() {
		return administrationPage
				.getLabel(
						AdministrationPageConstants.ADMIN_TAB_SYSTEM_BODY_PRIMARY_NODE_INFO_HEADER)
				.getText();
	}
	

	public String getAdminTabSystemPrimaryNodeInfo() {
		return administrationPage.getLabel(
				AdministrationPageConstants.ADMIN_TAB_SYSTEM_PRIMARY_NODE_INFO)
				.getText();
	}
	public String getAdminTabSystemNodeHealthInfo() {
		return administrationPage.getLabel(
				AdministrationPageConstants.ADMIN_TAB_SYSTEM_NODE_HEALTH_INFO)
				.getText();
	}
	
	public String getAdminTabSystemIPAddressInfo() {
		return administrationPage.getLabel(
				AdministrationPageConstants.ADMIN_TAB_SYSTEM_IP_ADDRESS_INFO)
				.getText();
	}
	
	public String getAdminTabSystemSerialNumberInfo() {
		return administrationPage.getLabel(
				AdministrationPageConstants.ADMIN_TAB_SYSTEM_SERAIAL_NUMBER_INFO)
				.getText();
	}
	
	public String getAdminTabSystemVersionInfo() {
		return administrationPage.getLabel(
				AdministrationPageConstants.ADMIN_TAB_SYSTEM_VERSION_INFO)
				.getText();
	}
	
	public String getAdminTabSystemLocationInfo() {
		return administrationPage.getLabel(
				AdministrationPageConstants.ADMIN_TAB_SYSTEM_LOCATION_INFO)
				.getText();
	}
	
	/**
	 * Services tab
	 */
	public void clickOnAdminServicesTab() {
		administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_SERVICES).click();
		waitUntilPageDataLoads("Admin - Services tab");
	}
	
	public boolean isAdminServicesTabActive() {
		String classAttribute = administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_SERVICES).getAttribute("class");
		return classAttribute.contains("active");
	}
	
	public boolean isAdminTabServicesViewDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SERVICES_BODY)
				.isDisplayed();
	}
	
	public boolean isAdminTabServicesSearchSectionDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SERVICES_BODY_HEADER_SEARCH)
				.isDisplayed();
	}
	
	public boolean isAdminTabServicesSearchDisplayed() {
		return administrationPage.getImage(
				AdministrationPageConstants.ADMIN_TAB_SERVICES_HEADER_SEARCH_MAGNIFIER)
				.isDisplayed();
	}
	
	public boolean isAdminTabServicesSearchClearIconDisplayed() {
		return administrationPage.getImage(
				AdministrationPageConstants.ADMIN_TAB_SERVICES_HEADER_SEARCH_CLEAR)
				.isDisplayed();
	}
	
	
	public boolean isAdminTabServicesTablePaginationDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SERVICES_TABLE_FOOTER)
				.isDisplayed();
	}

	/**
	 * Network tab
	 */
	public boolean isAdminTabNetworkViewDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_NETWORK_BODY)
				.isDisplayed();
	}
	
	public void clickOnAdminNetworkTab() {
		administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_NETWORK).click();
		waitUntilPageDataLoads("Admin - Network tab");
	}
	
	public boolean isAdminNetworkTabActive() {
		String classAttribute = administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_NETWORK).getAttribute("class");
		return classAttribute.contains("active");
	}
	
	public boolean isAdminNetworkTabTablePaginationDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_NETWORK_TABLE_FOOTER)
				.isDisplayed();
	}

	

	/**
	 * SNMP tab
	 */
	public boolean isAdminSNMPTabViewDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SNMP_BODY).isDisplayed();
	}

	public void clickOnAdminSNMPTab() {
		administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_SNMP).click();
		waitUntilPageDataLoads("Admin - SNMP tab");
	}
	
	public boolean isAdminSNMPTabActive() {
		String classAttribute = administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_SNMP).getAttribute("class");
		return classAttribute.contains("active");
	}
	
	public boolean isAdminSNMPTabHeaderDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SNMP_HEADER_PART).isDisplayed();
	}
	
	public String getAdminSNMPTabTitle() {
		return administrationPage.getLabel(
				AdministrationPageConstants.ADMIN_TAB_SNMP_HEADER_TITLE)
				.getText();
	}
	
	public boolean isAdminSNMPTabDisabledCheckboxDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SNMP_HEADER_CHECKBOX).isDisplayed();
	}
	
	public void clickOnSNMPTabDisabledCheckbox(String flag) {
		Boolean state = Boolean.valueOf(flag);
		WebElement element = administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SNMP_HEADER_CHECKBOX)
				.getUnderlyingElement();
		if (state) {
			element.findElement(
					By.xpath("//*[@class='svg-icon smaller uncheck check-item']"))
					.click();
		} else {
			element.findElement(
					By.xpath("//*[@class='svg-icon smaller checked check-item']"))
					.click();
		}
		waitUntilTimeout(2);
	}
	
	public boolean isSNMPCheckboxDisabled() {
		WebElement element = administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SNMP_HEADER_CHECKBOX)
				.getUnderlyingElement();
		boolean isDisabled = element.findElement(
				By.xpath("//*[@class='svg-icon smaller uncheck check-item']")).isDisplayed();
		boolean isSelectedCheckboxHidden =  !element.findElement(
				By.xpath("//*[@class='svg-icon smaller checked check-item hide']"))
				.isDisplayed();
		return (isDisabled && isSelectedCheckboxHidden);
	}
	
	public boolean isSNMPCheckboxEnabled() {
		WebElement element = administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SNMP_HEADER_CHECKBOX)
				.getUnderlyingElement();
		boolean isEnabled = element.findElement(
				By.xpath("//*[@class='svg-icon smaller checked check-item']")).isDisplayed();
		boolean isUnselectedCheckboxHidden =  !element.findElement(
				By.xpath("//*[@class='svg-icon smaller uncheck check-item hide']"))
				.isDisplayed();
		return (isEnabled && isUnselectedCheckboxHidden);
	}
	
	public String getSNMPDownloadText() {
		return administrationPage.getLabel(
				AdministrationPageConstants.ADMIN_TAB_SNMP_DOWNLOAD_BUTTON)
				.getText();
	}
	
	public boolean isDownloadMIBFileButtonEnabled() {
		return administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_SNMP_DOWNLOAD_PART)
				.isEnabled();
	}
	
	public boolean isSNMPManagersSectionDisplayed() {
		return administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_SNMP_MANAGER_PART)
				.isDisplayed();
	}
	
	public String getSNMPManagersSectionTitle() {
		return administrationPage.getLabel(
				AdministrationPageConstants.ADMIN_TAB_SNMP_MANAGER_TITLE)
				.getText();
	}
	
	public boolean isSNMPManagersSubnetFieldsDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SNMP_MANAGER_SUBNET)
				.isDisplayed();
	}
	
	public boolean isSNMPManagersVersionFieldsDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SNMP_MANAGER_VERSION)
				.isDisplayed();
	}
	
	public boolean isSNMPManagersCommunityFieldsDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SNMP_MANAGER_COMMUNITY)
				.isDisplayed();
	}
	
	public boolean isSNMPManagersDeleteLinkEnabled() {
		return administrationPage.getLink(
				AdministrationPageConstants.ADMIN_TAB_SNMP_MANAGER_DELETE)
				.isEnabled();
	}
	
	public boolean isSNMPManagersAddManagerLinkEnabled() {
		return administrationPage.getLink(
				AdministrationPageConstants.ADMIN_TAB_SNMP_MANAGER_ADD_LINK)
				.isEnabled();
	}
	
	//===
	public boolean isSNMPTrapsDestinationSectionDisplayed() {
		return administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_SNMP_TRAP_PART)
				.isDisplayed();
	}
	
	public String getSNMPTrapDestinationSectionTitle() {
		return administrationPage.getLabel(
				AdministrationPageConstants.ADMIN_TAB_SNMP_TRAP_TITLE)
				.getText();
	}
	
	public boolean isSNMPTrapDestinationIPAddressFieldsDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SNMP_TRAP_IP_ADDRESS)
				.isDisplayed();
	}
	
	public boolean isSNMPTrapDestinationVersionFieldsDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SNMP_TRAP_VERSION)
				.isDisplayed();
	}
	
	public boolean isSNMPTrapDestinationCommunityFieldsDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SNMP_TRAP_COMMUNITY)
				.isDisplayed();
	}
	
	public boolean isSNMPTrapDestinationDeleteLinkEnabled() {
		return administrationPage.getLink(
				AdministrationPageConstants.ADMIN_TAB_SNMP_TRAP_DELETE)
				.isEnabled();
	}
	
	public boolean isSNMPTrapDestinationAddDestinationLinkEnabled() {
		return administrationPage.getLink(
				AdministrationPageConstants.ADMIN_TAB_SNMP_TRAP_ADD)
				.isEnabled();
	}
	
	
	//==
	public boolean isSNMPSystemDetailsSectionDisplayed() {
		return administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_SNMP_SYS_DETAILS_PART)
				.isDisplayed();
	}
	
	public String getSNMPSystemDetailsSectionTitle() {
		return administrationPage.getLabel(
				AdministrationPageConstants.ADMIN_TAB_SNMP_SYS_DETAILS_TITLE)
				.getText();
	}
	
	public boolean isSNMPSystemDeatilsContactNameFieldsDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SNMP_SYS_DETAILS_CONTACT_NAME)
				.isDisplayed();
	}
	
	public boolean isSNMPSystemDeatilsContactEmailFieldsDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SNMP_SYS_DETAILS_CONTACT_EMAIL)
				.isDisplayed();
	}
	
	public boolean isSNMPSystemDeatilsDescriptionFieldsDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SNMP_SYS_DETAILS_DESCRIPTION)
				.isDisplayed();
	}
	
	public boolean isSNMPSystemDeatilsLocationAddressFieldsDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SNMP_SYS_DETAILS_LOCATION_ADDRESS)
				.isDisplayed();
	}
	
	public boolean isSNMPTrapSaveButtonEnabled() {
		return administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_SNMP_BOTTOM_SAVE_PART)
				.isEnabled();
	}
	
	
	/**
	 * Software Update tab
	 */
	public void clickOnAdminSoftwareUpdateTab() {
		administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_SOFTWARE_UPDATE).click();
		waitUntilPageDataLoads("Admin - Software Update tab");
	}
	
	public boolean isAdminSoftwareUpdateTabActive() {
		String classAttribute = administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_SOFTWARE_UPDATE).getAttribute("class");
		return classAttribute.contains("active");
	}
	
	public boolean isAdminTabSoftwareUpdateViewDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_SOFTWARE_TAB_UPDATE_BODY)
				.isDisplayed();
	}

	public boolean isAdminSoftwareUpdateTabSWPackagesSectionDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_SOFTWARE_TAB_UPDATE_SW_PACKAGES_SECTION)
				.isDisplayed();
	}
	
	public String getAdminSoftwareUpdateTabSWHeader() {
		return administrationPage.getLabel(
				AdministrationPageConstants.ADMIN_SOFTWARE_TAB_UPDATE_SW_PACKAGES_HEADER
				).getText();
	}
	
	public boolean isAdminSoftwareUpdateTabSWPackagesUploadButtonEnabled() {
		return administrationPage.getButton(
				AdministrationPageConstants.ADMIN_SOFTWARE_TAB_UPDATE_UPLOAD_SW_BUTTON)
				.isDisplayed();
	}
	
	public boolean isAdminSoftwareUpdateTabSWPackagesCancelButtonEnabled() {
		return administrationPage.getButton(
				AdministrationPageConstants.ADMIN_SOFTWARE_TAB_UPDATE_CANCEL_BUTTON)
				.isDisplayed();
	}
	
	public boolean isAdminSoftwareUpdateTabSWPackagesTableHeadersDisplayed() {
		return administrationPage
				.getForm(
						AdministrationPageConstants.ADMIN_SOFTWARE_TAB_UPDATE_TABLE_HEADERS)
				.isDisplayed();
	}
	
	public boolean isAdminSoftwareUpdateTabSWPackagesPaginationDisplayed() {
		return administrationPage
				.getForm(
						AdministrationPageConstants.ADMIN_SOFTWARE_TAB_UPDATE_TABLE_FOOTERS)
				.isDisplayed();
	}
	
	public boolean isAdminSoftwareUpdateTabSWNodesSectionDisplayed() {
		return administrationPage
				.getForm(
						AdministrationPageConstants.ADMIN_SOFTWARE_TAB_UPDATE_NODES_SECTION)
				.isDisplayed();
	}
	
	public String getAdminSoftwareUpdateTabSWNodesTableHeader() {
		return administrationPage
				.getLabel(
						AdministrationPageConstants.ADMIN_SOFTWARE_TAB_UPDATE_NODES_HEADER)
				.getText();
	}
	
	public boolean isAdminSoftwareUpdateTabSWNodesUpdateAllButtonDisplayed() {
		String attribute = administrationPage
				.getButton(
						AdministrationPageConstants.ADMIN_SOFTWARE_TAB_UPDATE_UPDATE_ALL_BUTTON)
				.getAttribute("class");
		return attribute.contains("disabled");
	}
	
	public boolean isAdminSoftwareUpdateTabSWNodesTableHeadersDisplayed() {
		return administrationPage
				.getForm(
						AdministrationPageConstants.ADMIN_SOFTWARE_TAB_UPDATE_SW_NODES_HEADERS)
				.isDisplayed();
	}
	
	public boolean isAdminSoftwareUpdateTabSWNodesPaginationDisplayed() {
		return administrationPage
				.getForm(
						AdministrationPageConstants.ADMIN_SOFTWARE_TAB_UPDATE_SW_NODES_FOOTERS)
				.isDisplayed();
	}
	
	/**
	 * Support tab
	 */
	public void clickOnAdminSupportTab() {
		administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_SUPPORT).click();
		waitUntilPageDataLoads("Admin - Support tab");
	}
	
	public boolean isAdminSupportTabActive() {
		String classAttribute = administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_SUPPORT).getAttribute("class");
		return classAttribute.contains("active");
	}
	
	public boolean isAdminSupportTabViewDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SUPPORT_BODY)
				.isDisplayed();
	}
	
	public boolean isAdminSupportTabSendSectionDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SUPPORT_SEND_SECTION)
				.isDisplayed();
	}
	
	public String getAdminSupportTabSendActualTitle() {
		return administrationPage.getLabel(AdministrationPageConstants.ADMIN_TAB_SUPPORT_SEND_TITLE).getText();
	}
	
	public String getAdminSupportTabSendExpectedTitle() {
		return administrationPage.getExpectedData(AdministrationPageConstants.ADMIN_TAB_SUPPORT_SEND_TITLE);
	}
	
	public String getAdminSupportTabSendActualSubTitle() {
		return administrationPage.getLabel(AdministrationPageConstants.ADMIN_TAB_SUPPORT_SEND_SUB_TITLE).getText();
	}
	
	public String getAdminSupportTabSendExpectedSubTitle() {
		return administrationPage.getExpectedData(AdministrationPageConstants.ADMIN_TAB_SUPPORT_SEND_SUB_TITLE);
	}
	
	public boolean isAdminSupportTabSendButtonEnabled() {
		return administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_SUPPORT_SEND_BUTTON)
				.isEnabled();
	}
	
	
	public boolean isAdminSupportTabDownloadSectionDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_SUPPORT_DOWNLOAD_SECTION)
				.isDisplayed();
	}
	
	public String getAdminSupportTabDownloadActualTitle() {
		return administrationPage.getLabel(AdministrationPageConstants.ADMIN_TAB_SUPPORT_DOWNLOAD_TITLE).getText();
	}
	
	public String getAdminSupportTabDownloadExpectedTitle() {
		return administrationPage.getExpectedData(AdministrationPageConstants.ADMIN_TAB_SUPPORT_DOWNLOAD_TITLE);
	}
	
	public String getAdminSupportTabDownloadActualSubTitle() {
		return administrationPage.getLabel(AdministrationPageConstants.ADMIN_TAB_SUPPORT_DOWNLOAD_SUBTITLE).getText();
	}
	
	public String getAdminSupportTabDownloadExpectedSubTitle() {
		return administrationPage.getExpectedData(AdministrationPageConstants.ADMIN_TAB_SUPPORT_DOWNLOAD_SUBTITLE);
	}
	
	public boolean isAdminSupportTabDownloadButtonEnabled() {
		return administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_SUPPORT_DOWNLOAD_BUTTON)
				.isEnabled();
	}
	
	/**
	 * Active Directory tab
	 */
	public void clickOnAdminActiveDirectoryTab() {
		administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_ACTIVE_DIRECTORY).click();
		waitUntilPageDataLoads("Admin - Active Directory tab");
	}
	
	public boolean isAdminActiveDirectoryTabActive() {
		String classAttribute = administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_ACTIVE_DIRECTORY).getAttribute("class");
		return classAttribute.contains("active");
	}
	
	public boolean isAdminTabActiveDirectoryViewDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_ACTIVE_DIRECTORY_BODY)
				.isDisplayed();
	}
	
	public String getAdminTabActiveDirectoryActualTitle() {
		return administrationPage.getLabel(
				AdministrationPageConstants.ADMIN_TAB_ACTIVE_DIRECTORY_TITLE)
				.getText();
	}
	
	public String getAdminTabActiveDirectoryExpectedTitle() {
		return administrationPage
				.getExpectedData(AdministrationPageConstants.ADMIN_TAB_ACTIVE_DIRECTORY_TITLE);
	}
	
	public String getAdminTabActiveDirectoryDomainActualLabel() {
		return administrationPage.getLabel(
				AdministrationPageConstants.ADMIN_TAB_ACTIVE_DIRECTORY_DOMAIN_LABEL)
				.getText();
	}
	
	public boolean isAdminTabActiveDirectoryInputEnabled() {
		return administrationPage.getTextField(
				AdministrationPageConstants.ADMIN_TAB_ACTIVE_DIRECTORY_DOMAIN_INPUT
				).isEnabled();
	}
	
	public String getAdminTabActiveDirectoryOrgUnitActualLabel() {
		return administrationPage.getLabel(
				AdministrationPageConstants.ADMIN_TAB_ACTIVE_DIRECTORY_ORG_UNIT_LABEL)
				.getText();
	}
	
	public String getAdminTabActiveDirectoryOrgUnitHelpTextActualLabel() {
		return administrationPage.getLabel(
				AdministrationPageConstants.ADMIN_TAB_ACTIVE_DIRECTORY_ORG_UNIT_HELP_TEXT)
				.getText();
	}
	
	public boolean isAdminTabActiveDirectoryOrgUnitHelpTextIconDisplayed() {
		return administrationPage.getTextField(
				AdministrationPageConstants.ADMIN_TAB_ACTIVE_DIRECTORY_ORG_UNIT_ICON
				).isDisplayed();
	}
	
	public boolean isAdminTabActiveDirectoryOrgUnitInputEnabled() {
		return administrationPage.getTextField(
				AdministrationPageConstants.ADMIN_TAB_ACTIVE_DIRECTORY_ORG_UNIT_INPUT
				).isEnabled();
	}
	
	public String getAdminTabActiveDirectoryLoginLabel() {
		return administrationPage.getLabel(
				AdministrationPageConstants.ADMIN_TAB_ACTIVE_DIRECTORY_LOGIN_LABEL)
				.getText();
	}
	
	public boolean isAdminTabActiveDirectoryLoginInputEnabled() {
		return administrationPage.getTextField(
				AdministrationPageConstants.ADMIN_TAB_ACTIVE_DIRECTORY_LOGIN_INPUT
				).isEnabled();
	}
	
	public String getAdminTabActiveDirectoryPasswordLabel() {
		return administrationPage.getLabel(
				AdministrationPageConstants.ADMIN_TAB_ACTIVE_DIRECTORY_PASSWORD_LABEL)
				.getText();
	}
	
	public boolean isAdminTabActiveDirectoryPasswordInputEnabled() {
		return administrationPage.getTextField(
				AdministrationPageConstants.ADMIN_TAB_ACTIVE_DIRECTORY_PASSWORD_INPUT
				).isEnabled();
	}
	
	public boolean isAdminTabActiveDirectoryJoinButtonEnabled() {
		return administrationPage.getTextField(
				AdministrationPageConstants.ADMIN_TAB_ACTIVE_DIRECTORY_JOIN_BUTTON
				).isEnabled();
	}

	/**
	 * Users tab
	 */
	public void clickOnAdminUsersTab() {
		administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_USERS).click();
		waitUntilPageDataLoads("Admin - Users tab");
	}
	
	public boolean isAdminUsersTabActive() {
		String classAttribute = administrationPage.getButton(
				AdministrationPageConstants.ADMIN_TAB_USERS).getAttribute("class");
		return classAttribute.contains("active");
	}
	
	public boolean isAdminTabUsersViewDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_USERS_BODY).isDisplayed();
	}
	
	public boolean isAdminTabUsersBodyIconDisplayed() {
		return administrationPage.getImage(
				AdministrationPageConstants.ADMIN_TAB_USERS_BODY_HEADER_ICON)
				.isDisplayed();
	}
	
	public String getAdminTabUsersBodyHeader() {
		return administrationPage.getLabel(
				AdministrationPageConstants.ADMIN_TAB_USERS_BODY_HEADER).getText();
	}
	
	public boolean isAdminTabUsersBodySearchSectionDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_USERS_BODY_HEADER_SEARCH)
				.isDisplayed();
	}
	
	public boolean isAdminTabUsersBodyMagnifierIconDisplayed() {
		return administrationPage.getImage(
				AdministrationPageConstants.ADMIN_TAB_USERS_BODY_HEADER_SEARCH_MAGINIFIER)
				.isDisplayed();
	}
	
	public boolean isAdminTabUsersBodyClearIconDisplayed() {
		return administrationPage.getImage(
				AdministrationPageConstants.ADMIN_TAB_USERS_BODY_HEADER_SEARCH_CLEAR)
				.isDisplayed();
	}
	
	public boolean isAdminTabUsersBodyDownloadIconDisplayed() {
		return administrationPage.getImage(
				AdministrationPageConstants.ADMIN_TAB_USERS_BODY_HEADER_DOWNLOAD_BUTTON)
				.isDisplayed();
	}
	
	public boolean isAdminTabUsersBodyPaginationDisplayed() {
		return administrationPage.getForm(
				AdministrationPageConstants.ADMIN_TAB_USERS_BODY_TABLE_FOOTER)
				.isDisplayed();
	}

}
