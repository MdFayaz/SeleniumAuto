package com.datasphere.page;

import org.openqa.selenium.WebDriver;

import com.datasphere.constants.DatasphereFilters;
import com.datasphere.page.constants.EventPageConstants;
import com.datasphere.webelements.PageObject;

public class EventsPage extends LandingPage {
	
	WebDriver driver;
	PageObject eventPageElements;
	
	public EventsPage(WebDriver driver) {
		super(driver);
		eventPageElements = new PageObject(driver, "src/test/resources/EventsPage.json");
	}
	
	public String getPageTitle() {
		return eventPageElements.getLabel(EventPageConstants.EVENTS_PAGE_TITLE).getText();
//		return eventPageElements.eventsPageTitle.getText();
	}

	public String getFilterTitle() {
		return eventPageElements.getLabel("").getText();
//		return eventPageElements.filterTitle.getText();
	}

	public boolean is2HrsButtonEnabled() {
		return eventPageElements.getButton("").isEnabled();
//		return eventPageElements.button2Hrs.isEnabled();
	}

	public void select2HrsButton() {
		eventPageElements.getButton("").click();
//		eventPageElements.button2Hrs.click();
	}

	public boolean is24HrsButtonEnabled() {
		return eventPageElements.getButton("").isEnabled();
//		return eventPageElements.button24Hrs.isEnabled();
	}

	public void select24HrsButton() {
		eventPageElements.getButton("").click();
//		eventPageElements.button24Hrs.click();
	}

	public boolean is31DaysButtonEnabled() {
		return eventPageElements.getButton("").isEnabled();
//		return eventPageElements.button31days.isEnabled();
	}

	public void select31DaysAgoButton() {
		eventPageElements.getButton("").click();
//		eventPageElements.button31days.click();
	}

	public boolean isCustomButtonEnabled() {
		return eventPageElements.getButton("").isEnabled();
//		return eventPageElements.buttonCustom.isEnabled();
	}

	// INFO: date format yyyy-MM-DD
	public void selectCustomButton(String fromDate, String toDate) {
//		eventPageElements.buttonCustom.click();
		eventPageElements.getButton("").click();
		/*WebElement customTime = eventPageElements.customTimeInput;
		if (isElementExist(customTime) && customTime.isEnabled()) {
			eventPageElements.startTime.sendKeys(fromDate);
			PDUtils.waitUntilTimeout(2);
			eventPageElements.endTime.sendKeys(toDate);
		}*/
	}

	/**
	 * Impacting Section
	 */
	public String getImpactingHeader() {
		return eventPageElements.getLabel("").getText();
//		return eventPageElements.impactingTitle.getText();
	}

	public boolean isImpactingClearAllEnabled() {
//		eventPageElements.impactingPanel.click();
		eventPageElements.getButton("").click();
		return eventPageElements.getLink("").isEnabled();
//		return eventPageElements.impactingClearAll.isEnabled();
	}

	public void clearAllImpacting() {
		eventPageElements.getLink("").click();
//		eventPageElements.impactingClearAll.click();
	}

	public int getImpactingFields() {
		return eventPageElements.getLinks("").size();
//		return eventPageElements.impactingFields.size();
	}

	public boolean isImpactingStroageSystemSelected(boolean isSelectExpected) {
		return DatasphereFilters.STORAGE_SYSTEM_EVENT.getStorageSystemCheckbox(
				eventPageElements.getCheckbox("").getUnderlyingElement(), isSelectExpected)
				.isDisplayed();
	}

	public String getImpactingStorageSystemCount() {
		return DatasphereFilters.STORAGE_SYSTEM_EVENT
				.getStroageSystemCount(eventPageElements.getGenericElement("").getUnderlyingElement());
	}

	public boolean isImpactingVolumeGroupSelected(boolean isSelectExpected) {
		return DatasphereFilters.VOLUME_GROUP_EVENT.getVolumeGroupCheckbox(
				eventPageElements.getCheckbox("").getUnderlyingElement(), isSelectExpected)
				.isDisplayed();
	}

	public String getImpactingVolumeGroupCount() {
		return DatasphereFilters.VOLUME_GROUP_EVENT
				.getVolumeGroupCount(eventPageElements.getGenericElement("").getUnderlyingElement());
	}

	public boolean isImpactingVolumeSelected(boolean isSelectExpected) {
		return DatasphereFilters.VOLUME_EVENT.getVolumeCheckbox(
				eventPageElements.getGenericElement("").getUnderlyingElement(), isSelectExpected)
				.isDisplayed();
	}

	public String getImpactingVolumeCount() {
		return DatasphereFilters.VOLUME_EVENT.getVolumeCount(eventPageElements.getGenericElement("").getUnderlyingElement());
	}

	public boolean isImpactingShareSelected(boolean isSelectExpected) {
		return DatasphereFilters.SHARE_EVENT.getVolumeCheckbox(eventPageElements.getGenericElement("").getUnderlyingElement(),
				isSelectExpected).isDisplayed();
	}

	public String getImpactingShareCount() {
		return DatasphereFilters.SHARE_EVENT.getShareCount(eventPageElements.getGenericElement("").getUnderlyingElement());
	}

	public void selectImpactingStorageSystem(boolean doUncheck) {
		DatasphereFilters.STORAGE_SYSTEM_EVENT.getStorageSystemCheckbox(
				eventPageElements.getGenericElement("").getUnderlyingElement(), doUncheck).click();
	}

	public void selectImpactingVolumeGroup(boolean doUncheck) {
		DatasphereFilters.VOLUME_GROUP_EVENT.getVolumeGroupCheckbox(
				eventPageElements.getGenericElement("").getUnderlyingElement(), doUncheck).click();
	}

	public void selectImpactingVolume(boolean doUncheck) {
		DatasphereFilters.VOLUME_EVENT.getVolumeCheckbox(eventPageElements.getGenericElement("").getUnderlyingElement(),
				doUncheck).click();
	}

	public void selectImpactingShare(boolean doUncheck) {
		DatasphereFilters.SHARE_EVENT.getShareCheckbox(eventPageElements.getGenericElement("").getUnderlyingElement(),
				doUncheck).click();
	}

	/**
	 * Severity Section
	 */
	public String getSeverityHeader() {
		return eventPageElements.getLabel(EventPageConstants.SEVERITY_TITLE).getText();
	}

	public boolean isSeverityClearAllEnabled() {
		return eventPageElements.getLink(EventPageConstants.SEVERITY_CLEAR_ALL).isEnabled();
	}

	public void clearAllSeverity() {
		eventPageElements.getLink(EventPageConstants.SEVERITY_CLEAR_ALL).click();
	}

	public int getSeverityFields() {
		return eventPageElements.getGenericElements(EventPageConstants.SEVERITY_FIELDS).size();
	}

	public boolean isSeverityCriticalSelected(boolean isSelectExpected) {
		return DatasphereFilters.CRITICAL.getCriticalCheckbox(
				eventPageElements.getCheckbox(EventPageConstants.SEVERITY_CRITICAL).getUnderlyingElement(), isSelectExpected)
				.isDisplayed();
	}

	public String getSeverityCriticalCount() {
		return DatasphereFilters.CRITICAL
				.getCriticalCount(eventPageElements.getCheckbox(EventPageConstants.SEVERITY_CRITICAL).getUnderlyingElement());
	}

	public boolean isSeverityWarningSelected(boolean isSelectExpected) {
		return DatasphereFilters.WARNING.getWarningCheckbox(
				eventPageElements.getCheckbox(EventPageConstants.SEVERITY_WARNING).getUnderlyingElement(), isSelectExpected)
				.isDisplayed();
	}

	public String getSeverityWarningCount() {
		return DatasphereFilters.WARNING
				.getWarningCount(eventPageElements.getCheckbox(EventPageConstants.SEVERITY_WARNING).getUnderlyingElement());
	}

	public boolean isSeverityInformationalSelected(boolean isSelectExpected) {
		return DatasphereFilters.INFORMATIONAL.getInformationalCheckbox(
				eventPageElements.getCheckbox(EventPageConstants.SEVERITY_INFORMATIONAL).getUnderlyingElement(), isSelectExpected)
				.isDisplayed();
	}

	public String getSeverityInformationalCount() {
		return DatasphereFilters.INFORMATIONAL
				.getInformationalCount(eventPageElements.getCheckbox(EventPageConstants.SEVERITY_INFORMATIONAL).getUnderlyingElement());
	}

	public void selectSeverityCritical(boolean doUnCheck) {
		DatasphereFilters.CRITICAL.getCriticalCheckbox(eventPageElements.getCheckbox(EventPageConstants.SEVERITY_CRITICAL).getUnderlyingElement(),
				doUnCheck).click();
	}

	public void selectSeverityWarning(boolean doUnCheck) {
		DatasphereFilters.WARNING.getWarningCheckbox(eventPageElements.getCheckbox(EventPageConstants.SEVERITY_WARNING).getUnderlyingElement(),
				doUnCheck).click();
	}

	public void selectSeverityInformational(boolean doUnCheck) {
		DatasphereFilters.INFORMATIONAL.getInformationalCheckbox(
				eventPageElements.getCheckbox(EventPageConstants.SEVERITY_INFORMATIONAL).getUnderlyingElement(), doUnCheck).click();
	}
	

}
