package com.datasphere.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.datasphere.page.constants.VolumeGroupsConstants;
import com.datasphere.webelements.Button;
import com.datasphere.webelements.PageObject;

public class VolumeGroupsPage extends InfrastructureAndDataPage {

	WebDriver driver;
	PageObject volumesGroupPage;

	public VolumeGroupsPage(WebDriver driver) {
		super(driver);
		volumesGroupPage = new PageObject(driver,
				"src/test/resources/VolumeGroupsPageLocators.json");
	}
	
	public void clickOnCreateVolumeGroupButton() {
		System.out.println("Clicking Create Volumes Button");
		volumesGroupPage.getButton(
				VolumeGroupsConstants.CREATE_VOLUME_GROUPS_BUTTON).click();
	}

	public boolean isCreateVolGroupPopoverDisplay() {
		return volumesGroupPage.getButton(
				VolumeGroupsConstants.CREATE_VOLUME_GROUPS_POPOVER).isDisplayed();
	}
	
	public String getCreateVolGroupPopoverTitle() {
		WebElement element = volumesGroupPage.getLabel(
				VolumeGroupsConstants.CREATE_GROUPS_POPOVER_TITLE).getUnderlyingElement();
		return element.findElement(By.xpath("//span[@class='title']")).getText();
	}
	
	public boolean isCreateVolGroupNameTabSectioDisplayed() {
		return volumesGroupPage.getForm(
				VolumeGroupsConstants.VOLUME_GROUPS_POPOVER_NAME_TAB_SECTION)
				.isDisplayed();
	}
	
	public void setVolumeGroupsName(String name) {
		volumesGroupPage.getTextField(
				VolumeGroupsConstants.VOLUME_GROUPS_POPOVER_NAME_TAB_TEXTFIELD)
				.clearAndType(name);
	}

	public void setVolumeGroupDescription(String description) {
		volumesGroupPage.getTextField(
				VolumeGroupsConstants.VOLUME_GROUPS_POPOVER_NAME_TAB_TEXTAREA)
				.clearAndType(description);

	}

	public void clickOnNameTabsNextStepButton() {
		volumesGroupPage
				.getButton(
						VolumeGroupsConstants.VOLUME_GROUPS_POPOVER_NAME_TAB_NEXT_STEP_BUTTON)
				.click();
	}
	
	/**
	 * Add Storage Systems
	 */
	public void searchForAllStorageSystems(String storageSystems) {
		volumesGroupPage
				.getTextField(
						VolumeGroupsConstants.VOLUME_GROUPS_ADD_STORAGE_SYSTEMS_SEARCH_FIELD)
				.clearAndType(storageSystems);
		waitUntilTimeout(3);
		waitUntilPageDataLoads("Searching for storage systems. Waiting until storage system load...");
	}

	public void selectTheStorageSystems() {
		volumesGroupPage.getCheckbox(VolumeGroupsConstants.VOLUME_GROUPS_SELECT_CHECKBOX).click();
	}
	
	public boolean isStorageSystemSelected() {
		List<Button> selectedStorageSystems = volumesGroupPage
				.getButtons(VolumeGroupsConstants.VOLUME_GROUPS_SELECTED_STORAGE_SYSTEMS);
		return (selectedStorageSystems.size() > 0);
	}
	
	public void clickOnAddStorageSystemsTabsNextStepButton() {
		volumesGroupPage
				.getButton(
						VolumeGroupsConstants.VOLUME_GROUPS_POPOVER_ADD_STORAGE_SYSTEMS_TAB_NEXT_STEP_BUTTON)
				.click();
	}
	
	/**
	 * Add Volume Groups
	 */
	public void searchForAllVolumeGroups(String volumeGroup) {
		volumesGroupPage
				.getTextField(
						VolumeGroupsConstants.VOLUME_GROUPS_POPOVER_ADD_VOLUME_GROUPS_TAB_SEARCH_FIELD)
				.clearAndType(volumeGroup);
		waitUntilTimeout(3);
		waitUntilPageDataLoads("Browing volume groups. Waiting until volume groups load...");
	}
	
	public void clickOnBrowseVolumeGroupsVolumesButton() {
		volumesGroupPage
				.getButton(
						VolumeGroupsConstants.VOLUME_GROUPS_ADD_STORAGE_SYSTEMS_BROWSE_VOLUMES)
				.click();
		waitUntilTimeout(3);
		waitUntilPageDataLoads("Browing volumes. Waiting until volumes load...");
	}
	
	public void selectTheVolumeGroups() {
		volumesGroupPage.getCheckbox(VolumeGroupsConstants.VOLUME_GROUPS_SELECT_CHECKBOX).click();
	}
	
	public void clickOnAddVolumeGroupsTabsNextStepButton() {
		volumesGroupPage
				.getButton(
						VolumeGroupsConstants.VOLUME_GROUPS_POPOVER_ADD_VOLUME_GROUPS_TAB_NEXT_STEP_BUTTON)
				.click();
	}

	/**
	 * Add Volumes
	 */
	public void searchForAllVolumes(String volumes) {
		volumesGroupPage
				.getTextField(
						VolumeGroupsConstants.VOLUME_GROUPS_POPOVER_ADD_VOLUMES_TAB_SEARCH_FIELD)
				.clearAndType(volumes);
		waitUntilTimeout(3);
		waitUntilPageDataLoads("Browing volumes. Waiting until volumes load...");
	}
	
	public void selectTheVolumes() {
		volumesGroupPage.getCheckbox(VolumeGroupsConstants.VOLUME_GROUPS_SELECT_CHECKBOX).click();
	}
	
	public void clickOnAddVolumesTabsNextStepButton() {
		volumesGroupPage
				.getButton(
						VolumeGroupsConstants.VOLUME_GROUPS_POPOVER_ADD_VOLUMES_TAB_NEXT_STEP_BUTTON)
				.click();
	}

	/**
	 * Review & Save
	 */
	public void clickOnReviewAndSaveTabsNextStepButton() {
		volumesGroupPage
				.getButton(
						VolumeGroupsConstants.VOLUME_GROUPS_POPOVER_REVIEW_AND_SAVE_TAB_SAVE_VOLUME_GROUP_BUTTON)
				.click();
	}


}
