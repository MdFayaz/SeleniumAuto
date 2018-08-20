package com.datasphere.page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.datasphere.page.constants.InfrastructureAndDataPageConstants;
import com.datasphere.page.constants.StorageSystemConstants;
import com.datasphere.webelements.GenericWebElement;
import com.datasphere.webelements.PageObject;

import cucumber.api.DataTable;

public class StorageSystemsPage extends InfrastructureAndDataPage {

	WebDriver webDriver;
	PageObject storageSystemsPage;
	
	public StorageSystemsPage(WebDriver driver) {
		super(driver);
		storageSystemsPage = new PageObject(driver,
				"src/test/resources/StorageSystemsPageLocators.json");
	}
	
	public boolean isStorageSystemsViewDisplayed() {
		return storageSystemsPage.getForm(
				StorageSystemConstants.STORAGE_SYSTEM_VIEW).isDisplayed();
	}
	
	public boolean isStorageSystemsAddStorageSytemsIconDisplayed() {
		return storageSystemsPage.getImage(
				StorageSystemConstants.STORAGE_SYSTEM_TABLE_HEADER_ICON)
				.isDisplayed();
	}
	
	public String getStorageSystemsAddStorageSystemHeader() {
		return storageSystemsPage.getLabel(
				StorageSystemConstants.STORAGE_SYSTEM_TABLE_HEADER).getText();
	}
	
	public boolean isStorageSystemsSearchSectionDisplayed() {
		return storageSystemsPage.getForm(
				StorageSystemConstants.STORAGE_SYSTEM_TABLE_HEADER_SEARCH_SECTION)
				.isDisplayed();
	}
	
	public boolean isStorageSystemsMagnifierIconDisplayed() {
		return storageSystemsPage.getImage(
				StorageSystemConstants.STORAGE_SYSTEM_TABLE_SEARCH_MAGNIFIER)
				.isDisplayed();
	}
	
	public boolean isStorageSystemsClearIconDisplayed() {
		return storageSystemsPage.getImage(
				StorageSystemConstants.STORAGE_SYSTEM_TABLE_SEARCH_CLEAR)
				.isDisplayed();
	}
	
	public boolean isStorageSystemsDownloadIconDisplayed() {
		return storageSystemsPage.getImage(
				StorageSystemConstants.STORAGE_SYSTEM_TABLE_DOWNLOAD_BUTTON)
				.isDisplayed();
	}
	
	public boolean isStorageSystemsTablePaginationDisplayed() {
		return storageSystemsPage.getForm(
				StorageSystemConstants.STORAGE_SYSTEM_TABLE_FOOTER)
				.isDisplayed();
	}
	
	public void clickOnAddStorageSystemButton() {
		storageSystemsPage.getButton(StorageSystemConstants.ADD_STORAGE_SYSTEM_BUTTON).click();
	}

	public boolean addStorageSystemPopoverDisplayed() {
		return storageSystemsPage.getPopover(
				StorageSystemConstants.ADD_STORAGE_SYSTEM_POPOVER)
				.isDisplayed();
	}
	
	public void clickOnStorageSystemPopoverCloseIcon() {
		storageSystemsPage.getButton(
				StorageSystemConstants.STORAGE_SYSTEM_POPOVER_CLOSE_ICON)
				.click();
	}
	
	public String getStorageSystemPopoverTitle() {
		return storageSystemsPage.getLabel(
				StorageSystemConstants.STORAGE_SYSTEM_POPOVER_TITLE).getText();
	}
	
	public boolean isNameTextFieldDisplayed() {
		return storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_INPUT_NAME).isDisplayed();
	}
	
	public String getNameLabel() {
		WebElement element = storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_INPUT_NAME)
				.getUnderlyingElement();
		return element.findElement(By.xpath("//..//parent::div/label"))
				.getText().trim();
	}
	
	public void addNameToStorageSystem(String storageName) {
		storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_INPUT_NAME).type(
				storageName);
		userProvidedStorageTypeName = storageName;
	}
	
	public boolean isStorageTypeDropdownDisplayed() {
		return storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_TYPE_DROPDOWN).isDisplayed();
	}
	
	public String getStorageTypeLabel() {
		WebElement element = storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_TYPE_DROPDOWN)
				.getUnderlyingElement();
		WebElement typeLabelElement = element.findElement(By.xpath("//ancestor::div//*[contains(text(), 'Type:')]"));
		System.out.println("typeLabelElement: " + typeLabelElement);
		return typeLabelElement.getText().trim();
	}
	
	public void addTypeToStorageSystem(String storageType) {
		storageSystemsPage.getGenericElement(
				StorageSystemConstants.STORAGE_SYSTEM_TYPE_DROPDOWN).click();
		GenericWebElement typeDropdown = storageSystemsPage
				.getGenericElement(StorageSystemConstants.STORAGE_SYSTEM_TYPE_DROPDOWN_CONTENT);
		WebElement optionStorageType = typeDropdown.getUnderlyingElement(
				StorageSystemConstants.STORAGE_SYSTEM_TYPE_DROPDOWN_CONTENT)
				.findElement(
						By.xpath("//*[contains(text(), '"
								+ getInternalName(storageType)
								+ "') and not(contains(@class, 'hide'))]"));
		optionStorageType.click();
	}
	
	String internalStorageTypeName = "";
	String userProvidedStorageTypeName = "";
	/**
	 * Mapping the name provided by user in feature file to the text used in UI
	 * to locate the element
	 * 
	 * @param storageType
	 * @return
	 */
	private String getInternalName(String storageType) {
		String lowercaseStorageType = storageType.toLowerCase();
		switch (lowercaseStorageType) {
		case "netapp c-mode":
		case "c-mode":
		case "cmode":
		case "netapp cmode":
			internalStorageTypeName = "NetApp C-Mode";
			break;
		case "netapp 7-mode":
		case "7-mode":
		case "7mode":
		case "netapp 7mode":
			internalStorageTypeName = "NetApp 7-Mode";
			break;
		case "emc-isilon":
		case "emc isilon":
		case "isilon":
		case "emc":
			internalStorageTypeName = "EMC Isilon";
			break;
		case "other":
			internalStorageTypeName = "Other";
			break;
		case "amazon":
		case "s3":
		case "cloud":
			internalStorageTypeName = "S3";
			break;
		
		}
		return internalStorageTypeName;
	}
	
	public boolean isAddIPAddressTextFieldDisplayed() {
		return storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_IP_ADDRESS).isDisplayed();
	}
	
	public String getAddIPAddressLabel() {
		WebElement element = storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_IP_ADDRESS)
				.getUnderlyingElement();
		return element.findElement(By.xpath("//ancestor::div//*[contains(text(), 'IP Add')]"))
				.getText().trim();
	}
	
	public void addIPAddress(String ipAddress) {
		storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_IP_ADDRESS).type(
				ipAddress);
	}
	
	public boolean isUserTextFieldDisplayed() {
		return storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_USER).isDisplayed();
	}
	
	public String getUserLabel() {
		WebElement element = storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_USER)
				.getUnderlyingElement();
		return element.findElement(By.xpath("//ancestor::div//*[contains(text(), 'User:')]"))
				.getText().trim();
	}
	
	public void addUser(String user) {
		storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_USER).type(user);
	}
	
	public boolean isPasswordTextFieldDisplayed() {
		return storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_PASSWORD).isDisplayed();
	}
	
	public String getPasswordLabel() {
		WebElement element = storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_PASSWORD)
				.getUnderlyingElement();
		return element.findElement(By.xpath("//ancestor::div//*[contains(text(), 'Password:')]"))
				.getText().trim();
	}
	
	public void addPassword(String password) {
		storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_PASSWORD).type(password);
	}
	
	public boolean isSNMPTextFieldDisplayed() {
		return storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_SNMP).isDisplayed();
	}
	
	public String getSNMPLabel() {
		WebElement element = storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_SNMP)
				.getUnderlyingElement();
		return element.findElement(By.xpath("//ancestor::div//*[contains(text(), 'SNMP:')]"))
				.getText().trim();
	}
	
	public void addSNMP(String snmp) {
		storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_SNMP).type(snmp);
	}
	
	public boolean isDescriptionTextFieldDisplayed() {
		return storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_OTHER_DESC).isDisplayed();
	}
	
	public String getDescriptionLabel() {
		WebElement element = storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_OTHER_DESC)
				.getUnderlyingElement();
		return element.findElement(By.xpath("//ancestor::div//*[contains(text(), 'Description:')]"))
				.getText().trim();
	}
	
	public void addDescription(String description) {
		storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_OTHER_DESC).type(description);
	}
	
	public boolean isAccessKeyTextFieldDisplayed() {
		return storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_ACCESS_KEY).isDisplayed();
	}
	
	public String getAccessKeyLabel() {
		WebElement element = storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_ACCESS_KEY)
				.getUnderlyingElement();
		return element.findElement(By.xpath("//ancestor::div//*[contains(text(), 'Access Key:')]"))
				.getText().trim();
	}
	
	public void addAccessKey(String accessKey) {
		storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_ACCESS_KEY).type(accessKey);
	}
	
	public boolean isSecretKeyTextFieldDisplayed() {
		return storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_SECRET_KEY).isDisplayed();
	}
	
	public String getSecretKeyLabel() {
		WebElement element = storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_SECRET_KEY)
				.getUnderlyingElement();
		return element.findElement(By.xpath("//ancestor::div//*[contains(text(), 'Secret Key:')]"))
				.getText().trim();
	}
	
	public void addSecretKey(String secretKey){
		storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_SECRET_KEY).type(secretKey);
	}
	
	public boolean isEndPointDropdownDisplayed() {
		return storageSystemsPage.getSelectList(
				StorageSystemConstants.STORAGE_SYSTEM_END_POINT).isDisplayed();
	}
	
	public String getEndPointLabel() {
		WebElement element = storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_END_POINT)
				.getUnderlyingElement();
		return element.findElement(By.xpath("//ancestor::div//*[contains(text(), 'Endpoint:')]"))
				.getText().trim();
	}
	
	public void enterEndPoint(String endpoint) {
		storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_END_POINT).type(endpoint);
	}
	
	public boolean isProxyHostTextFieldDisplayed() {
		return storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_PROXY_HOST).isDisplayed();
	}
	
	public String getProxyHostLabel() {
		WebElement element = storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_PROXY_HOST)
				.getUnderlyingElement();
		return element.findElement(By.xpath("//ancestor::div//*[contains(text(), 'Proxy Host:')]"))
				.getText().trim();
	}
	
	public void addProxyHost(String proxyHost) {
		storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_PROXY_PORT).type(proxyHost);
	}
	
	public boolean isProxyPortTextFieldDisplayed() {
		return storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_PROXY_PORT).isDisplayed();
	}
	
	public String getProxyPortLabel() {
		WebElement element = storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_PROXY_HOST)
				.getUnderlyingElement();
		return element.findElement(By.xpath("//ancestor::div//*[contains(text(), 'Proxy Port:')]"))
				.getText().trim();
	}
	
	public void addProxyPort(String proxyPort) {
		storageSystemsPage.getTextField(
				StorageSystemConstants.STORAGE_SYSTEM_PROXY_PORT).type(proxyPort);
	}
	
	public void clickAddStorageSystemButtonOnPopover() {
		storageSystemsPage.getButton(
				StorageSystemConstants.STORAGE_SYSTEM_ADD_BUTTON_ON_POPOVER).click();
		waitUntilAddStroageProgressCompletes();
		waitForProgressBarWith5Attempts();
		waitUntilTimeout(90);
	}
	
	public HashMap<String, String> actualDataMap = new HashMap<String, String>();
	public HashMap<String, String> expectedDataMap = new HashMap<String, String>();
	
	public void storageSystemExpectedData(DataTable expectedData) {
		for(String key : expectedDataMap.keySet()) {
			System.out.println("key: " + key);
			getActualDataMap(key);
		}
		if(!actualDataMap.isEmpty())
			for(String s : actualDataMap.keySet()) {
				System.out.println(s + " == " + actualDataMap.get(s));
			}
	}
	
	public Map<String, String> getExpectedDataMap(DataTable expectedData) {
		List<List<String>> data = expectedData.raw();
		List<String> firstRow = data.get(0);
		for(String colHeaders : firstRow) {
			System.out.println("colHeaders: " + colHeaders);
		}
		data.get(0).get(0);
		Map<String, String> expectedMap = expectedData.asMap(String.class, String.class);
		for(String key : expectedMap.keySet()) {
			String value = expectedMap.get(key);
			System.out.println("expected key: " + key + " == value: " + value);
			expectedDataMap.put(key, expectedMap.get(key));
			getActualDataMap(key);
		}
		return expectedDataMap;
	}
	
	public boolean isStroageSystemAdded() {
		String name = getColToValue();
		return name.equalsIgnoreCase(userProvidedStorageTypeName);
	}
	
	public void getStorageSystemDetails() {
		storageSystemsPage.getTable(StorageSystemConstants.STORAGE_SYSTEM_TABLE).mapColToName();
	}
	
	public void searchStorageSystem(String searchKey) {
		System.out.println("Searching for storage system: " + searchKey);
		storageSystemsPage.getTextField(StorageSystemConstants.SEARCH_STORAGE_SYSTEM_TABLE).type(searchKey);
		waitUntilTimeout(5);
	}
	
	public void clickOnVolumeButton(String volumeAddToNode) {
		try {
		WebElement searchedRow = storageSystemsPage.getTable(
				StorageSystemConstants.STORAGE_SYSTEM_TABLE).getFirstRow();
		searchedRow.findElement(By.tagName("button")).click();}
		catch(NoSuchElementException nsee) {
			System.out.println("Clicking on Volume Button failed. Finding Second method");
			storageSystemsPage.getButton(StorageSystemConstants.STORAGE_SYSTEM_ADD_VOLUME).click();
		}
		infrastructureAndDataPage.getPopover(
				InfrastructureAndDataPageConstants.ADD_VOLUMES_POPOVER).click();
		waitUntilTimeout(2);
		waitUntilPageDataLoads("Storage Systems - Add Volumes popover");
	}
	
	public void getTableColumnNames() {
		List<String> headers = storageSystemsPage.getTable(
				StorageSystemConstants.STORAGE_SYSTEM_TABLE).getTableHeaders();
		System.out.println("Headers: " + headers);
	}
	
	public String getColToValue() {
		searchStorageSystem(userProvidedStorageTypeName);
		return storageSystemsPage.getTable(
				StorageSystemConstants.STORAGE_SYSTEM_TABLE).getTableColData(
				internalStorageTypeName);
	}
	
	public Map<String, String> getActualDataMap(String colName) {
		String value = storageSystemsPage.getTable(
				StorageSystemConstants.STORAGE_SYSTEM_TABLE).getTableColData(colName);
		System.out.println("Value: " + value);
		if(value != "") {
			actualDataMap.put(colName, value);
		}
		return actualDataMap;
	}
	
	private void waitUntilAddStroageProgressCompletes() {
		String progressElementLocator = "//*[contains(@class, 'table table-bordered')]"
				+ "//*[contains(@class, 'creating-progress')]";
		boolean isProgressBarExists = storageSystemsPage.getGenericElement(
				StorageSystemConstants.STORAGE_SYSTEM_PROGRESS_BAR)
				.isDisplayed();
		System.out.println("isProgressBarExists: " + isProgressBarExists);
		try {
			WebElement loader = driver.findElement(By
					.xpath("//*[contains(@class, 'table table-bordered')]"
							+ "//*[contains(@class, 'creating-progress')]"));
			// Waiting for 5 minutes
			long endTime = System.currentTimeMillis() + 1000 * 60 * 5;
			System.out.println("Loader: " + loader.isDisplayed());
			while (isProgressBarExists && endTime > System.currentTimeMillis()) {
				waitUntilTimeout(2);
				loader = driver.findElement(By.xpath(progressElementLocator));
				System.out.println("loader element locator: " + loader);
				System.out.println("in while: " + loader.isDisplayed());
				isProgressBarExists = loader.isDisplayed();
			}
			waitUntilTimeout(10);
		} catch (NoSuchElementException nsee) {
			nsee.printStackTrace();
			isProgressBarExists = false;
		} catch (StaleElementReferenceException sere) {
			sere.printStackTrace();
			isProgressBarExists = false;
		}
	}
	
	int count = 0;
	private void waitForProgressBarWith5Attempts() {
		if(count < 5) {
			String progressElementLocator = "//*[contains(@class, 'table table-bordered')]"
					+ "//*[contains(@class, 'creating-progress')]";
			boolean isProgressBarExists = storageSystemsPage.getGenericElement(
					StorageSystemConstants.STORAGE_SYSTEM_PROGRESS_BAR)
					.isDisplayed();
			try {
				WebElement loader = driver.findElement(By
						.xpath("//*[contains(@class, 'table table-bordered')]"
								+ "//*[contains(@class, 'creating-progress')]"));
				// Waiting for 5 minutes
				long endTime = System.currentTimeMillis() + 1000 * 60 * 5;
				System.out.println("Loader: " + loader.isDisplayed());
				while (isProgressBarExists && endTime > System.currentTimeMillis()) {
					waitUntilTimeout(10);
					loader = driver.findElement(By.xpath(progressElementLocator));
					System.out.println("loader element locator: " + loader);
					System.out.println("in while: " + loader.isDisplayed());
					isProgressBarExists = loader.isDisplayed();
				}
				waitUntilTimeout(15);
			} catch (NoSuchElementException nsee) {
				nsee.printStackTrace();
				isProgressBarExists = false;
			} catch (StaleElementReferenceException sere) {
				sere.printStackTrace();
				isProgressBarExists = false;
				count++;
				waitForProgressBarWith5Attempts();
			}
		}
	}
}
