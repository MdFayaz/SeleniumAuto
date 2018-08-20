package com.datasphere.page;

import org.openqa.selenium.WebDriver;

import step_definitions.SharedDriver;

import com.datasphere.page.constants.DataProfilerPageConstants;
import com.datasphere.page.constants.ObjectivesPageConstants;
import com.datasphere.page.constants.TiersPageConstants;
import com.datasphere.webelements.PageObject;

public class ObjectivesAndTiersPage extends LandingPage {

	WebDriver webDriver;
	PageObject objectivesAndTiersPage;
	PageObject objectivesPage;
	PageObject tiersPage;
	PageObject dataProfilerPage;
	
	public ObjectivesAndTiersPage(WebDriver driver) {
		super(driver);
		objectivesAndTiersPage = new PageObject(driver,
				"src/test/resources/ObjectivesAndTiersPageLocators.json");
		objectivesPage = new PageObject(driver,
				"src/test/resources/ObjectivesPageLocators.json");
		tiersPage = new PageObject(driver,
				"src/test/resources/TiersPageLocators.json");
		dataProfilerPage = new PageObject(driver,
				"src/test/resources/DataProfilerPageLocators.json");
	}
	
	public ObjectivesAndTiersPage switchToTab(String tabName) {
		System.out.println("Switching to: " + tabName);
		switch (tabName) {
		case "Objectives":
			selectObjectives();
			SharedDriver.objectivesPage = new ObjectivesPage(this.driver);
			break;
		case "Tiers":
			selectTiers();
			SharedDriver.tiersPage = new TiersPage(this.driver);
			break;
		case "Data Profiler":
			selectDataProfiler();
			SharedDriver.dataProfiler = new DataProfilerPage(this.driver);
			break;
		}
		return this;
	}
	
	private void selectObjectives() {
		objectivesAndTiersPage.getLink(ObjectivesPageConstants.OBJECTIVES_TAB).click();
	}
	
	private void selectTiers() {
		objectivesAndTiersPage.getLink(TiersPageConstants.TIERS_TAB).click();
	}
	
	private void selectDataProfiler() {
		objectivesAndTiersPage.getLink(DataProfilerPageConstants.DATA_PROFILER_TAB).click();
	}
	

	public boolean isObjectivesViewDisplayed() {
		return objectivesPage.getForm(ObjectivesPageConstants.OBJECTIVES_VIEW)
				.isDisplayed();
	}

	public boolean isObjectivesActiveSectionDisplayed() {
		return objectivesPage.getForm(
				ObjectivesPageConstants.OBJECTIVES_ACTIVE_SECTION)
				.isDisplayed();
	}

	public boolean isObjectivesActiveSectionMaginifierDisplayed() {
		return objectivesPage.getButton(
				ObjectivesPageConstants.OBJECTIVES_ACTIVE_SECTION_MAGINIFIER)
				.isDisplayed();
	}

	public boolean isObjectivesActiveSectionSearchInputDisplayed() {
		return objectivesPage.getTextField(
				ObjectivesPageConstants.OBJECTIVES_ACTIVE_SECTION_SEARCH_INPUT)
				.isDisplayed();
	} 

	public boolean isObjectivesActiveSectionSearchClearDisplayed() {
		return objectivesPage.getButton(
				ObjectivesPageConstants.OBJECTIVES_ACTIVE_SECTION_SEARCH_CLEAR)
				.isDisplayed();
	}

	public boolean isObjectiveActiveTableDownloadButtonDisplayed() {
		return objectivesPage.getButton(
				ObjectivesPageConstants.OBJECTIVES_ACTIVE_DOWNLOAD)
				.isDisplayed();
	}
	
	public boolean isObjectivesActiveTableDisplayed() {
		return objectivesPage.getTable(ObjectivesPageConstants.OBJECTIVES_ACTIVE_TABLE).isDisplayed();
	}
	
	public boolean isObjectivesActiveTableFooterDisplayed() {
		return objectivesPage.getTable(ObjectivesPageConstants.OBJECTIVES_ACTIVE_TABLE_FOOTER).isDisplayed();
	}
	
	/**
	 * Inactive section
	 */
	public boolean isObjectivesInActiveSectionDisplayed() {
		return objectivesPage.getForm(
				ObjectivesPageConstants.OBJECTIVES_INACTIVE_SECTION)
				.isDisplayed();
	}

	public boolean isObjectivesInActiveSectionMaginifierDisplayed() {
		return objectivesPage.getButton(
				ObjectivesPageConstants.OBJECTIVES_INACTIVE_SECTION_MAGINIFIER)
				.isDisplayed();
	}

	public boolean isObjectivesInActiveSectionSearchInputDisplayed() {
		return objectivesPage.getTextField(
				ObjectivesPageConstants.OBJECTIVES_INACTIVE_SECTION_SEARCH_INPUT)
				.isDisplayed();
	}

	public boolean isObjectivesInActiveSectionSearchClearDisplayed() {
		return objectivesPage.getButton(
				ObjectivesPageConstants.OBJECTIVES_INACTIVE_SECTION_SEARCH_CLEAR)
				.isDisplayed();
	}

	public boolean isObjectiveInActiveTableDownloadButtonDisplayed() {
		return objectivesPage.getButton(
				ObjectivesPageConstants.OBJECTIVES_INACTIVE_DOWNLOAD)
				.isDisplayed();
	}
	
	public boolean isObjectivesInActiveTableDisplayed() {
		return objectivesPage.getTable(ObjectivesPageConstants.OBJECTIVES_INACTIVE_TABLE).isDisplayed();
	}
	
	public boolean isObjectivesInActiveTableFooterDisplayed() {
		return objectivesPage.getTable(ObjectivesPageConstants.OBJECTIVES_INACTIVE_TABLE_FOOTER).isDisplayed();
	}
	
	/**
	 * Tiers tab
	 */
	public boolean isTiersSectionDisplayed() {
		return tiersPage.getForm(TiersPageConstants.TIERS_VIEW)
				.isDisplayed();
	}

	public boolean isTiersTableMaginifierDisplayed() {
		return tiersPage.getButton(
				TiersPageConstants.TIERS_VIEW_SECTION_MAGINIFIER)
				.isDisplayed();
	}

	public boolean isTiersTableSearchInputDisplayed() {
		return tiersPage.getTextField(
				TiersPageConstants.TIERS_VIEW_SECTION_SEARCH_INPUT)
				.isDisplayed();
	}

	public boolean isTiersTableSearchClearDisplayed() {
		return tiersPage.getButton(
				TiersPageConstants.TIERS_VIEW_SECTION_SEARCH_CLEAR)
				.isDisplayed();
	}

	public boolean isTiersTableDownloadButtonDisplayed() {
		return tiersPage.getButton(
				TiersPageConstants.TIERS_VIEW_DOWNLOAD)
				.isDisplayed();
	}
	
	public boolean isTiersTableDisplayed() {
		return tiersPage.getTable(TiersPageConstants.TIERS_VIEW_TABLE).isDisplayed();
	}
	
	public boolean isTiersTableFooterDisplayed() {
		return tiersPage.getTable(TiersPageConstants.TIERS_VIEW_TABLE_FOOTER).isDisplayed();
	}
}
