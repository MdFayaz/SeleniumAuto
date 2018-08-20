package com.datasphere.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import step_definitions.SharedDriver;

import com.datasphere.page.constants.InfrastructureAndDataPageConstants;
import com.datasphere.page.constants.SharesPageConstants;
import com.datasphere.page.constants.StorageSystemConstants;
import com.datasphere.page.constants.VolumeGroupsConstants;
import com.datasphere.page.constants.VolumesPageConstants;
import com.datasphere.webelements.PageObject;

public class InfrastructureAndDataPage extends LandingPage {

	WebDriver webDriver;
	PageObject infrastructureAndDataPage;
	
	public InfrastructureAndDataPage(WebDriver driver) {
		super(driver);
		infrastructureAndDataPage = new PageObject(driver,
				"src/test/resources/InfrastructureAndDataPageLocators.json");
	}
	
	public InfrastructureAndDataPage switchToTab(String tabName) {
		switch (tabName) {
		case "Shares":
			selectSharesPage();
			SharedDriver.shares = new SharesPage(this.driver);
			break;
		case "Storage Systems":
			selectStorageSystems();
			SharedDriver.storageSystem = new StorageSystemsPage(this.driver);
			break;
		case "Volumes":
			selectVolumes();
			SharedDriver.volumes = new VolumesPage(this.driver);
			break;
		case "Volume Groups":
			selectVolumeGroups();
			SharedDriver.volumeGroups = new VolumeGroupsPage(this.driver);
			break;
		}
		return this;
	}
	
	private void selectSharesPage() {
		infrastructureAndDataPage.getLink(SharesPageConstants.SHARES_TAB).click();
		waitUntilTimeout(10);
		waitUntilPageDataLoads("Shares tab");
	}
	
	private void selectStorageSystems() {
		infrastructureAndDataPage.getLink(StorageSystemConstants.STORAGE_SYSTEM_TAB).click();
		waitUntilPageDataLoads("Storage Systems tab");
	}
	
	private void selectVolumes(){
		infrastructureAndDataPage.getLink(VolumesPageConstants.VOLUMES_TAB).click();
		waitUntilTimeout(10);
		waitUntilPageDataLoads("Volumes tab");
	}
	
	private void selectVolumeGroups(){
		infrastructureAndDataPage.getLink(VolumeGroupsConstants.VOLUMES_GROUPS_TAB).click();
		waitUntilTimeout(10);
		waitUntilPageDataLoads("Volume Groups tab");
	}

	/**
	 * Add Volumes Common functionalities for Storage Systems and Volumes tab
	 * @return
	 */
	public boolean addVolumesPopoverDisplay() {
		return infrastructureAndDataPage.getPopover(
				InfrastructureAndDataPageConstants.ADD_VOLUMES_POPOVER)
				.isDisplayed();
	}
	
	public InfrastructureAndDataPage searchForVolume(String valueToSearch) {
		waitUntilTimeout(10);
		infrastructureAndDataPage.getTextField(
				InfrastructureAndDataPageConstants.ADD_VOLUMES_SEARCH_STORAGE_SYSTEMS_INPUT).click();
		waitUntilTimeout(10);
		infrastructureAndDataPage.getTextField(
				InfrastructureAndDataPageConstants.ADD_VOLUMES_SEARCH_STORAGE_VOLUMES_INPUT).type(
				valueToSearch);
		waitUntilTimeout(20);
		return this;
	}
	
	public void selectCheckbox() {
		infrastructureAndDataPage.
		getCheckbox(InfrastructureAndDataPageConstants.VOLUMES_SELECTION_CHECKBOX_UNCHECKED).click();
	}
	
	public void unSelectCheckbox() {
		infrastructureAndDataPage.
		getCheckbox(InfrastructureAndDataPageConstants.VOLUMES_SELECTION_CHECKBOX_CHECKED).click();
	}
	
	public void clickOnAddVolumesNextStepButton() {
		infrastructureAndDataPage.getButton(
				InfrastructureAndDataPageConstants.VOLUMES_SELECTION_NEXT_STEP)
				.click();
	}
	
	WebElement activeAssimilatePopover = null;
	
	public void assimilateDataTo(String value) {
		System.out.println("Assimilate data: " + value);
		if (value != null && value.equalsIgnoreCase("yes")) {
			infrastructureAndDataPage
					.getRadioButton(
							InfrastructureAndDataPageConstants.ADD_VOLUMES_ASSIMILATE_DATA_YES)
					.click();
			waitUntilTimeout(3);
			/*WebElement assimilateGlassPopover = infrastructureAndDataPage
					.getPopover(
							InfrastructureAndDataPageConstants.ADD_VOLUMES_CONFIRM_ASSIMILATE_POPOVER)
					.getUnderlyingElement("Confirm popover");
			assimilateGlassPopover.click();
			activeAssimilatePopover = assimilateGlassPopover.findElement(By.xpath("//following-sibling::div"));
			System.out.println("activeAssimilatePopover: " + activeAssimilatePopover);*/
//			activeAssimilatePopover = assimilatePopover.findElement(By.xpath("//*[@class[normalize-space(.)='modal']]"));
		} else {
			infrastructureAndDataPage
			.getRadioButton(
					InfrastructureAndDataPageConstants.ADD_VOLUMES_ASSIMILATE_DATA_NO)
			.click();
		}
	}
	
	public boolean isConfirmAssimilatePopoverDisplayed() {
		return infrastructureAndDataPage
				.getPopover(
						InfrastructureAndDataPageConstants.ADD_VOLUMES_CONFIRM_ASSIMILATE_POPOVER)
				.isDisplayed();
	}
	
	public String getConfirmAssimilatePopoverTitle() {
		String title = infrastructureAndDataPage
				.getLabel(
						InfrastructureAndDataPageConstants.ADD_VOLUMES_CONFIRM_ASSIMILATE_POPOVER).getText();
		return title.trim();
	}
	
	public void confirmAssimilation(String negativeOrAffirmative) {
		System.out.println("Confirm Assimilation: " + negativeOrAffirmative);
		Actions action = new Actions(driver);
		if (negativeOrAffirmative.equalsIgnoreCase("assimilate")) {
//			activeAssimilatePopover.findElement(By.xpath("//*[text()[.='Assimilate']]")).click();
			action.sendKeys(Keys.ENTER);
			System.out.println("Clicked Enter");
			waitUntilTimeout(3);
			driver.switchTo().activeElement().click();
			System.out.println("Clicked active Element");
		} else {
//			activeAssimilatePopover.findElement(By.xpath("//*[text()[.='Cancel']]")).click();
			action.sendKeys(Keys.ESCAPE);
			System.out.println("clicked Escape");
		}
		waitUntilTimeout(5);
		infrastructureAndDataPage.getPopover(
				InfrastructureAndDataPageConstants.ADD_VOLUMES_POPOVER)
				.click();
	}
	
	public boolean isAddToShareLinkDisplayed() {
		return infrastructureAndDataPage
				.getLink(
						InfrastructureAndDataPageConstants.ADD_VOLUMES_ASSIMILATE_DATA_ADD_TO_SHARE_LINK)
				.isDisplayed();
	}
	
	public void clickOnAddToShareLink() {
		infrastructureAndDataPage
				.getLink(
						InfrastructureAndDataPageConstants.ADD_VOLUMES_ASSIMILATE_DATA_ADD_TO_SHARE_LINK)
				.click();
		waitUntilTimeout(2);
		waitUntilPageDataLoads("Add Volumes - Assimilation - Yes - Add to Existing Share");
	}
	
	public boolean isAddToExistingShareSectionDisplayed() {
		return infrastructureAndDataPage
				.getForm(
						InfrastructureAndDataPageConstants.ADD_VOLUMES_ASSIMILATE_DATA_ADD_TO_EXISTING_SHARE)
				.isDisplayed();
	}
	
	public void clickOnSelectShareDropdown() {
		infrastructureAndDataPage
				.getLink(
						InfrastructureAndDataPageConstants.ADD_VOLUMES_ASSIMILATE_DATA_ADD_TO_EXISTING_SHARE_SELECT_SHARE)
				.click();
		waitUntilTimeout(2);
	}
	
	public void selectShareFromExisting(String shareName) {
		WebElement shareOptions = infrastructureAndDataPage
				.getSelectList(
						InfrastructureAndDataPageConstants.ADD_VOLUMES_ASSIMILATE_DATA_ADD_TO_EXISTING_SHARE_SELECT_SHARE_OPTIONS)
				.getUnderlyingElement();
		waitUntilTimeout(2);
		String customLocator = "//*[@class='item'][@data-share-name[.='" + shareName + "']]";
		System.out.println("Custom locator: " + customLocator);
		shareOptions.findElement(By.xpath(customLocator)).click();
		waitUntilTimeout(2);
		waitUntilPageDataLoads("Add Volumes - Assimilation - Yes - Add to Existing Share - Selecting share");
	}
	
	public void enterSharePath(String sharePath) {
		infrastructureAndDataPage
				.getTextField(
						InfrastructureAndDataPageConstants.ADD_VOLUMES_ASSIMILATE_DATA_ADD_TO_EXISTING_SHARE_TYPE_PATH)
				.clearAndType(sharePath);
		waitUntilTimeout(2);
	}
	
	public void clickOnAddToExistingShareSaveButton() {
		infrastructureAndDataPage
				.getButton(
						InfrastructureAndDataPageConstants.ADD_VOLUMES_ASSIMILATE_DATA_ADD_TO_EXISTING_SHARE_SAVE_BUTTON)
				.click();
		waitUntilTimeout(2);
	}
	
	public boolean isAssimilateDataByDefaultedCheckedNo() {
		WebElement checkBox = infrastructureAndDataPage
				.getRadioButton(
						InfrastructureAndDataPageConstants.ADD_VOLUMES_ASSIMILATE_DATA_NO)
				.getUnderlyingElement(InfrastructureAndDataPageConstants.ADD_VOLUMES_ASSIMILATE_DATA_NO);
		String checkedValue = checkBox.getAttribute("checked");
		return Boolean.valueOf(checkedValue);
	}
	
	public void setManageCapacityThreshold(String value) {
		infrastructureAndDataPage.getTextField(
				InfrastructureAndDataPageConstants.ADD_VOLUMES_MANAGE_CAPACITY_THRESHOLD).clearAndType(
				value);
		waitUntilTimeout(3);
	}
	
	public void clickOnAddVolumesButton() {
		infrastructureAndDataPage
				.getButton(
						InfrastructureAndDataPageConstants.ADD_VOLUMES_BUTTON_IN_REVIEW_AND_ADD_TAB)
				.click();
		waitUntilTimeout(30);
		waitUntilAddVolumeProgressCompletes();
		waitForProgressBarWith3Attempts();
		waitUntilTimeout(10);
	}
	
	private void waitUntilAddVolumeProgressCompletes() {
		String progressElementLocator = "//*[@class='progress-col creating-progress']//*[@class='score-bar-used']";
		boolean isProgressBarExists = infrastructureAndDataPage.getGenericElement(
				VolumesPageConstants.VOLUME_PROGRESS)
				.isDisplayed();
		System.out.println("isProgressBarExists: " + isProgressBarExists);
		try {
			WebElement loader = driver.findElement(By
					.xpath("//*[@class='progress-col creating-progress']//*[@class='score-bar-used']"));
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
	private void waitForProgressBarWith3Attempts() {
		if(count < 3) {
			String progressElementLocator = "//*[@class='progress-col creating-progress']//*[@class='score-bar-used']";
			boolean isProgressBarExists = infrastructureAndDataPage.getGenericElement(
					VolumesPageConstants.VOLUME_PROGRESS)
					.isDisplayed();
			try {
				WebElement loader = driver.findElement(By
						.xpath("//*[@class='progress-col creating-progress']"
								+ "//*[@class='score-bar-used']"));
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
				waitForProgressBarWith3Attempts();
			}
		}
	}
	
	/**
	 * While adding volumes from Storage System tab or from Volumes tab, We need
	 * to search for storage system in Add Volume pop over, thus this a common
	 * method
	 * 
	 * @param searchKey
	 */
	public void searchStorageSystem(String searchKey) {
		System.out.println("Searching for storage system: " + searchKey);
		infrastructureAndDataPage.getTextField(InfrastructureAndDataPageConstants.ADD_VOLUMES_SEARCH_STORAGE_SYSTEMS_INPUT).type(searchKey);
		waitUntilTimeout(5);
	}
}
