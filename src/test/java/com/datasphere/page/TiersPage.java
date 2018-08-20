package com.datasphere.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.datasphere.page.constants.TiersPageConstants;

public class TiersPage extends ObjectivesAndTiersPage {

	WebDriver driver;

	public TiersPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnCreateTierButton() {
		tiersPage.getButton(TiersPageConstants.CREATE_TIER).click();
	}
	
	public boolean isCreateSideSectionDisplayedInTabs() {
		return tiersPage.getForm(
				TiersPageConstants.TIERS_VIEW_CREATE_SIDE_SECTION)
				.isDisplayed();
	}

	/**
	 * GET STARTED TAB
	 */
	public boolean  isCreateNewTierGetStartedTabViewDisplayed() {
		return tiersPage.getForm(
				TiersPageConstants.CREATE_TIER_GET_STARTED_VIEW).isDisplayed();
	}

	public String getCreateNewTierGetStartedTabViewActualTitle() {
		return tiersPage.getLabel(
				TiersPageConstants.CREATE_TIER_GET_STARTED_TITLE).getText();
	}
	
	public String getCreateNewTierGetStartedTabViewExpectedTitle() {
		return tiersPage.getExpectedData(TiersPageConstants.CREATE_TIER_GET_STARTED_TITLE);
	}

	public String getCreateNewTierGetStartedTabViewActualInstruction() {
		return tiersPage.getLabel(
				TiersPageConstants.CREATE_TIER_GET_STARTED_INSTRUCTION).getText();
	}
	
	public String getCreateNewTierGetStartedTabViewExpectedInstruction() {
		return tiersPage.getExpectedData(TiersPageConstants.CREATE_TIER_GET_STARTED_INSTRUCTION);
	}
	
	public boolean isCreateNewTierGetStratedSelectSelectionDisplayed() {
		return tiersPage.getForm(
				TiersPageConstants.CREATE_TIER_GET_STARTED_SELECT_SECTION).isDisplayed();
	}
	
	public boolean isCreateNewTierGetStratedNameSelectionDisplayed() {
		return tiersPage.getForm(
				TiersPageConstants.CREATE_TIER_GET_STARTED_NAME_SECTION).isDisplayed();
	}
	

	public boolean isCreateNewTierGetStratedDescriptionSelectionDisplayed() {
		return tiersPage.getForm(
				TiersPageConstants.CREATE_TIER_GET_STARTED_DESCRIPTION_SECTION).isDisplayed();
	}

	public boolean isCreateNewTierGetStratedCostSelectionDisplayed() {
		return tiersPage.getForm(
				TiersPageConstants.CREATE_TIER_GET_STARTED_COST_SECTION).isDisplayed();
	}
	
	public void selectCreateNewTierRadioButton() {
		tiersPage.getRadioButton(
				TiersPageConstants.CREATE_NEW_TIER_RADIO_BUTTON).click();
	}

	public void selectCopyAndEditExistingButton() {
		tiersPage.getRadioButton(
				TiersPageConstants.CREATE_NEW_TIER_COPY_RADIO_BUTTON).click();
	}

	public boolean isCreateNewTierCopyAndEditChooseDropdownDisplayed() {
		return tiersPage.getForm(
				TiersPageConstants.CREATE_NEW_TIER_CHOOSE_EXISTING_DROPDOWN).isDisplayed();
	}
	
	public void enterTierName(String value) {
		tiersPage.getTextField(TiersPageConstants.CREATE_NEW_TIER_TIER_NAME)
				.type(value);
	}

	public void enterTierDescription(String value) {
		tiersPage.getTextField(
				TiersPageConstants.CREATE_NEW_TIER_TIER_DESCRIPTION)
				.type(value);
	}

	public void clickOnGetStartedTabNextStepButton() {
		tiersPage
				.getButton(
						TiersPageConstants.CREATE_NEW_TIER_GET_STARTED_NEXT_STEP_BUTTON)
				.click();
	}

	/**
	 * PLACEMENT TAB
	 */
	public boolean isCreateNewTierPlacementViewDisplayed() {
		return tiersPage.getForm(
				TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_VIEW).isDisplayed();
	}
	
	public boolean isCreateNewTierPlacementHeaderFieldsDisplayed() {
		return tiersPage.getForm(
				TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_HEADER).isDisplayed();
	}
	
	public String getCreateNewTierPlacementExpectedInstruction() {
		return tiersPage.getExpectedData(
				TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_HEADER_INSTRUCTION);
	}
	
	public String getCreateNewTierPlacementActualInstruction() {
		return tiersPage.getLabel(
				TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_HEADER_INSTRUCTION).getText();
	}
	
	public boolean isCreateNewTierPlacementDoNotMoveDisplayed() {
		boolean  label = tiersPage.getLabel(
				TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_DO_NOT_MOVE_LABEL).isDisplayed();
		boolean button =  tiersPage.getLabel(
				TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_DO_NOT_MOVE_BUTTON).isDisplayed();
		return (label && button);
	}
	
	public boolean isCreateNewTierPlacementOptimizeForCapacityDisplayed() {
		boolean  label = tiersPage.getLabel(
				TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_OPTIMIZE_FOR_CAPACITY_LABEL).isDisplayed();
		boolean button =  tiersPage.getLabel(
				TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_OPTIMIZE_FOR_CAPACITY_BUTTON).isDisplayed();
		return (label && button);
	}
	
	public boolean isCreateNewTierPlacementConfineDataSectionDisplayed() {
		return tiersPage.getForm(
				TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_CONFINE_DATA_SECTION).isDisplayed();
	}

	public String getCreateNewTierPlacementConfineDataSectionExpectedTitle() {
		return tiersPage.getExpectedData(
				TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_CONFINE_DATA_SECTION_TITLE);
	}
	
	public String getCreateNewTierPlacementConfineDataSectionActualTitle() {
		return tiersPage.getLabel(
				TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_CONFINE_DATA_SECTION_TITLE).getText();
	}
	
	public String getCreateNewTierPlacementConfineDataSectionExpectedSubTitle() {
		return tiersPage.getExpectedData(
				TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_CONFINE_DATA_SECTION_SUBTITLE);
	}
	
	public String getCreateNewTierPlacementConfineDataSectionActualSubTitle() {
		return tiersPage.getLabel(
				TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_CONFINE_DATA_SECTION_SUBTITLE).getText();
	}
	
	public boolean getCreateNewTierPlacementConfineDataEmptySectionDisplayed() {
		return tiersPage
				.getForm(
						TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_CONFINE_DATA_EMPTY_SELECTION)
				.isDisplayed();
	}
	
	public boolean getCreateNewTierPlacementConfineDataSectionAddIconDisplayed() {
		return tiersPage
				.getForm(
						TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_CONFINE_DATA_ADD_ICON)
				.isDisplayed();
	}
	
	public String getCreateNewTierPlacementConfineDataAddTile() {
		return tiersPage
				.getLabel(
						TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_CONFINE_DATA_ADD_TITLE)
				.getText();
	}
	
	public void selectConfineDataToStorage() {
		tiersPage
				.getLink(
						TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_CONFINE_DATA_SELECT_STORAGE)
				.click();
	}

	//Place Data on
	public boolean isCreateNewTierPlacementPlaceDataSectionDisplayed() {
		return tiersPage.getForm(
				TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_PLACE_DATA_SECTION).isDisplayed();
	}

	public String getCreateNewTierPlacementPlaceDataSectionExpectedTitle() {
		return tiersPage.getExpectedData(
				TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_PLACE_DATA_SECTION_TITLE);
	}
	
	public String getCreateNewTierPlacementPlaceDataSectionActualTitle() {
		return tiersPage.getLabel(
				TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_PLACE_DATA_SECTION_TITLE).getText();
	}
	
	public String getCreateNewTierPlacementPlaceDataSectionExpectedSubTitle() {
		return tiersPage.getExpectedData(
				TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_PLACE_DATA_SECTION_SUBTITLE);
	}
	
	public String getCreateNewTierPlacementPlaceDataSectionActualSubTitle() {
		return tiersPage.getLabel(
				TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_PLACE_DATA_SECTION_SUBTITLE).getText();
	}
	
	public boolean getCreateNewTierPlacementPlaceDataEmptySectionDisplayed() {
		return tiersPage
				.getForm(
						TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_PLACE_DATA_EMPTY_SELECTION)
				.isDisplayed();
	}
	
	public boolean getCreateNewTierPlacementPlaceDataSectionAddIconDisplayed() {
		return tiersPage
				.getForm(
						TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_PLACE_DATA_ADD_ICON)
				.isDisplayed();
	}
	
	public String getCreateNewTierPlacementPlaceDataAddTile() {
		return tiersPage
				.getLabel(
						TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_PLACE_DATA_ADD_TITLE)
				.getText();
	}
	
	public void selectPlaceDataOnStorageLink() {
		tiersPage
				.getLink(
						TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_PLACE_DATA_SELECT_STORAGE)
				.click();
		waitUntilTimeout(3);
		waitUntilPageDataLoads("Waiting for Storage systems to place on..");
	}

	public TiersPage searchForPlaceDataOnStorageSystem(String value) {
		tiersPage
				.getTextField(
						TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_PLACE_ON_POPOVER_SEARCH)
				.type(value);
		return this;
	}

	public TiersPage searchForPlaceDataOnStorageSystemVolume(String volName) {
		tiersPage
				.getButton(
						TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_PLACE_ON_STORAGE_SYSTEM_BROWSE_VOLS)
				.click();
		waitUntilTimeout(2);
		waitUntilPageDataLoads("Waiting for Volumes to load..");
		tiersPage
				.getTextField(
						TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_PLACE_ON_POPOVER_SEARCH)
				.clearAndType(volName);
		return this;
	}

	public void selectPlaceOnStorageSystemCheckbox() {
		waitUntilTimeout(2);
		tiersPage
				.getCheckbox(
						TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_PLACE_ON_STROAGE_SYSTEM_CHECKBOX_UNCHECKED)
				.click();
	}

	public void savePlaceOnStroageSystemSelection() {
		tiersPage
				.getButton(
						TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_PLACE_ON_SAVE_SELECTIONS_BUTTON)
				.click();
		waitUntilTimeout(2);
	}

	public void clickOnPlacementTabNextStepButton() {
		tiersPage.getButton(
				TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_NEXT_STEP_BUTTON)
				.click();
	}

	public void skipPlacementStep() {
		tiersPage.getLink(
				TiersPageConstants.CREATE_NEW_TIER_PLACEMENT_SKIP_THIS_STEP)
				.click();
	}

	/**
	 * PERFORMANCE TAB
	 */
	public boolean isCreateNewTierPerformanceViewDisplayed() {
		return tiersPage.getForm(
				TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_VIEW).isDisplayed();
	}
	
	public String getCreateNewTierPerformanceExpectedHeader() {
		return tiersPage.getExpectedData(
				TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_VIEW_HEADER);
	}
	
	public String getCreateNewTierPerformanceActualHeader() {
		return tiersPage.getLabel(
				TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_VIEW_HEADER).getText();
	}
	
	public boolean isPerformanceTabReadBandwithSectionDisplayed() {
		return tiersPage
				.getForm(
						TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_READ_BANDWIDTH_SECTION)
				.isDisplayed();
	}
	
	public void setReadBandwidth(String value) {
		WebElement element = tiersPage
				.getTextField(
						TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_READ_BANDWIDTH_INPUT)
				.getUnderlyingElement(
						TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_READ_BANDWIDTH_INPUT);
		clearAndFillValue(element, value);
	}
	
	public boolean isPerformanceTabReadIOPsSectionDisplayed() {
		return tiersPage
				.getForm(
						TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_READ_IOPS_SECTION)
				.isDisplayed();
	}

	public void setReadIOPS(String value) {
		WebElement element = tiersPage
				.getTextField(
						TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_READ_IOPS_INPUT)
				.getUnderlyingElement(
						TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_READ_IOPS_INPUT);
		clearAndFillValue(element, value);
	}

	public boolean isPerformanceTabReadLatencySectionDisplayed() {
		return tiersPage
				.getForm(
						TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_READ_LATENCY_SECTION)
				.isDisplayed();
	}
	
	public void setReadLatency(String value) {
		WebElement element = tiersPage
				.getTextField(
						TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_READ_LATENCY_INPUT)
				.getUnderlyingElement(
						TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_READ_LATENCY_INPUT);
		clearAndFillValue(element, value);
	}
	
	public boolean isPerformanceTabWriteBandwidthSectionDisplayed() {
		return tiersPage
				.getForm(
						TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_WRITE_BANDWIDTH_SECTION)
				.isDisplayed();
	}

	public void setWriteBandwidth(String value) {
		WebElement element = tiersPage
				.getTextField(
						TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_WRITE_BANDWIDTH_INPUT)
				.getUnderlyingElement(
						TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_WRITE_BANDWIDTH_INPUT);
		clearAndFillValue(element, value);
	}

	public boolean isPerformanceTabWriteIOPsSectionDisplayed() {
		return tiersPage
				.getForm(
						TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_WRITE_IOPS_SECTION)
				.isDisplayed();
	}
	
	public void setWriteIOPS(String value) {
		WebElement element = tiersPage
				.getTextField(
						TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_WRITE_IOPS_INPUT)
				.getUnderlyingElement(
						TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_WRITE_IOPS_INPUT);
		clearAndFillValue(element, value);
	}

	public boolean isPerformanceTabWriteLatencySectionDisplayed() {
		return tiersPage
				.getForm(
						TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_WRITE_LATENCY_SECTION)
				.isDisplayed();
	}
	
	public void setWriteLatency(String value) {
		WebElement element = tiersPage
				.getTextField(
						TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_WRITE_LATENCY_INPUT)
				.getUnderlyingElement(
						TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_WRITE_LATENCY_INPUT);
		clearAndFillValue(element, value);
		waitUntilTimeout(2);
	}

	public void clickOnPerformanceTabNextStepButton() {
		tiersPage
				.getButton(
						TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_NEXT_STEP_BUTTON)
				.click();
	}

	public void skipPerformanceStep() {
		landingPage.scrollUp();
		tiersPage.getLink(
				TiersPageConstants.CREATE_NEW_TIER_PERFORMANCE_SKIP_THIS_STEP)
				.click();
	}

	private void clearAndFillValue(WebElement element, String value) {
		element.clear();
		element.sendKeys(Keys.chord(Keys.CONTROL, "a"), value);
	}

	/**
	 * PROTECTION TAB
	 */
	public boolean isCreateNewTierProtectionViewDisplayed() {
		return tiersPage.getForm(
				TiersPageConstants.CREATE_NEW_TIER_PROTECTION_VIEW).isDisplayed();
	}
	
	public String getCreateNewTierProtectionExpectedHeader() {
		return tiersPage.getExpectedData(
				TiersPageConstants.CREATE_NEW_TIER_PROTECTION_HEADER);
	}
	
	public String getCreateNewTierProtectionActualHeader() {
		return tiersPage.getLabel(
				TiersPageConstants.CREATE_NEW_TIER_PROTECTION_HEADER).getText();
	}
	
	public String getCreateNewTierProtectionLabelDurability() {
		return tiersPage.getLabel(
				TiersPageConstants.CREATE_NEW_TIER_PROTECTION_DURABILITY).getText();
	}
	
	public String getCreateNewTierProtectionLabelAvailability() {
		return tiersPage.getLabel(
				TiersPageConstants.CREATE_NEW_TIER_PROTECTION_AVAILABILITY).getText();
	}

	public String getCreateNewTierProtectionLabelPriority() {
		return tiersPage.getLabel(
				TiersPageConstants.CREATE_NEW_TIER_PROTECTION_PRIORITY).getText();
	}

	public String getCreateNewTierProtectionLabelOnlineDelay() {
		return tiersPage.getLabel(
				TiersPageConstants.CREATE_NEW_TIER_PROTECTION_ONLINE_DELAY).getText();
	}
	
	public void clickOnProtectionTabNextStepButton() {
		tiersPage.getButton(
				TiersPageConstants.CREATE_NEW_TIER_PROTECTION_NEXT_STEP_BUTTON)
				.click();
	}

	public void skipProtectionStep() {
		landingPage.scrollUp();
		tiersPage.getLink(
				TiersPageConstants.CREATE_NEW_TIER_PROTECTION_SKIP_THIS_STEP)
				.click();
	}

	public String getProtectionTabActualHeader() {
		return tiersPage.getLabel(
				TiersPageConstants.CREATE_NEW_TIER_PROTECTION_HEADER).getText();
	}

	public String getProtectionTabExpectedHeader() {
		return tiersPage.getExpectedData(
				TiersPageConstants.CREATE_NEW_TIER_PROTECTION_HEADER).trim();
	}

	public boolean isProtectionTabDurabilityDisplayed() {
		WebElement genericElement = tiersPage.getLabel(TiersPageConstants.CREATE_NEW_TIER_PROTECTION_DURABILITY).getUnderlyingElement();
		WebElement protectionDurability = genericElement.findElement(By.xpath("//parent::div[@class='selection-item']"));
		return protectionDurability.isDisplayed();
	}

	public boolean isProtectionTabAvailabilityDisplayed() {
		WebElement genericElement = tiersPage.getLabel(TiersPageConstants.CREATE_NEW_TIER_PROTECTION_AVAILABILITY).getUnderlyingElement();
		WebElement protectionAvailability = genericElement.findElement(By.xpath("//parent::div[@class='selection-item']"));
		return protectionAvailability.isDisplayed();
	}

	public boolean isProtectionTabPriorityDisplayed() {
		WebElement genericElement = tiersPage.getLabel(TiersPageConstants.CREATE_NEW_TIER_PROTECTION_PRIORITY).getUnderlyingElement();
		WebElement protectionPriority = genericElement.findElement(By.xpath("//parent::div[@class='selection-item']"));
		return protectionPriority.isDisplayed();
	}

	public boolean isProtectionTabOnlineDisplayed() {
		WebElement genericElement = tiersPage.getLabel(TiersPageConstants.CREATE_NEW_TIER_PROTECTION_ONLINE_DELAY).getUnderlyingElement();
		WebElement protectionOnlineDelay = genericElement.findElement(By.xpath("//parent::div[@class='selection-item']"));
		return protectionOnlineDelay.isDisplayed();
	}
	
	public boolean isProtectionTabOnlineDelayForeverEnabled() {
		return tiersPage.getRadioButton(TiersPageConstants.CREATE_NEW_TIER_PROTECTION_ONLINE_FOREVER).isEnabled();
	}
	
	public boolean isProtectionTabOnlineDelayHoursEnabled() {
		return tiersPage.getRadioButton(TiersPageConstants.CREATE_NEW_TIER_PROTECTION_ONLINE_HOURS).isEnabled();
	}
	
	public boolean isProtectionTabOnlineDelayMinutesEnabled() {
		return tiersPage.getRadioButton(TiersPageConstants.CREATE_NEW_TIER_PROTECTION_ONLINE_MINUTES).isEnabled();
	}
	
	public boolean isProtectionTabOnlineDelaySecondsEnabled() {
		return tiersPage.getRadioButton(TiersPageConstants.CREATE_NEW_TIER_PROTECTION_ONLINE_SECONDS).isEnabled();
	}
	
	public boolean isProtectionTabOnlineDelayOnlineEnabled() {
		return tiersPage.getRadioButton(TiersPageConstants.CREATE_NEW_TIER_PROTECTION_ONLINE_ONLINE).isEnabled();
	}

	/**
	 * PREIVEW TAB
	 */
	public boolean isPreviewTabViewDisplay() {
		return tiersPage.getForm(
				TiersPageConstants.CREATE_NEW_TIER_PREVIEW_VIEW).isDisplayed();
	}
	
	public String getPreviewTabViewExpectedHeader() {
		return tiersPage.getLabel(TiersPageConstants.CREATE_NEW_TIER_PREVIEW_HEADER).getText();
	}
	
	public String getPreviewTabViewActualHeader() {
		return tiersPage.getLabel(TiersPageConstants.CREATE_NEW_TIER_PREVIEW_HEADER).getText();
	}
	
	public boolean isPreviewTabNameSectionDisplay() {
		return tiersPage.getRadioButton(TiersPageConstants.CREATE_NEW_TIER_PREVIEW_NAME_SECTION).isDisplayed();
	}
	public boolean isPreviewTabPerformanceSectionDisplay() {
		return tiersPage.getRadioButton(TiersPageConstants.CREATE_NEW_TIER_PREVIEW_PERFORMANCE_SECTION).isDisplayed();
	}
	
	public boolean isPreviewTabProtectionSectionDisplay() {
		return tiersPage.getRadioButton(TiersPageConstants.CREATE_NEW_TIER_PREVIEW_PROTECTION_SECTION).isDisplayed();
	}
	
	public boolean isPreviewTabConfineToSectionDisplay() {
		return tiersPage.getRadioButton(TiersPageConstants.CREATE_NEW_TIER_PREVIEW_CONFINE_TO_SECTION).isDisplayed();
	}
	
	public boolean isPreviewTabConfineToSectionEditButtonEnable() {
		return tiersPage.getRadioButton(TiersPageConstants.CREATE_NEW_TIER_PREVIEW_CONFINE_TO_SECTION_EDIT_BUTTON).isEnabled();
	}
	
	public boolean isPreviewTabPlaceOnSectionEditButtonEnable() {
		return tiersPage.getRadioButton(TiersPageConstants.CREATE_NEW_TIER_PREVIEW_PLACE_ON_SECTION_EDIT_BUTTON).isEnabled();
	}
	
	public boolean isPreviewTabCancelButtonEnable() {
		return tiersPage.getRadioButton(TiersPageConstants.CREATE_NEW_TIER_PREVIEW_CANCEL_BUTTON).isEnabled();
	}
	
	public void clickOnPriviewTabCancelButton() {
		tiersPage.getButton(
				TiersPageConstants.CREATE_NEW_TIER_PREVIEW_CANCEL_BUTTON)
				.click();
		waitUntilTimeout(10);
	}
	
	public void clickOnSaveTierButton() {
		tiersPage.getButton(
				TiersPageConstants.CREATE_NEW_TIER_PREVIEW_SAVE_TIER_BUTTON)
				.click();
		waitUntilTimeout(10);
	}

}
