package step_definitions;

import org.openqa.selenium.WebDriver;

import com.datasphere.page.ObjectivesAndTiersPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ObjectivesAndTiersStepDefinitions {

	WebDriver driver = SharedDriver.getDriver();
	ObjectivesAndTiersPage objectivesAndTiers = SharedDriver.objectivesAndTiers;

	@Then("^Select Objectives and Tiers \"([^\"]*)\" tab$")
	public void selectObjectivesAndTiersTab(String tabName) {
		SharedDriver.objectivesAndTiers.switchToTab(tabName.trim());
	}
	
	/**
	 * Objectives Tab
	 */
	@And("^Objective page should load$")
	public void isObjectiveViewDisplayed() {
		SharedDriver.objectivesPage.isObjectivesViewDisplayed();
	}
	
	@And("^Active objectives section display$")
	public void activeSectionShouldDisplay() {
		SharedDriver.objectivesPage.isObjectivesActiveSectionDisplayed();
	}
	
	@And("^Active table maginifier display$")
	public void activeTableMaginifierShouldDisplay() {
		SharedDriver.objectivesPage.isObjectivesActiveSectionMaginifierDisplayed();
	}
	
	@And("^Active table search input display$")
	public void activeTableSearchInputDisplay() {
		SharedDriver.objectivesPage.isObjectivesActiveSectionSearchInputDisplayed();
	}
	
	@And("^Active table clear search display$")
	public void activeTableClearSearchShouldDisplay() {
		SharedDriver.objectivesPage.isObjectivesActiveSectionSearchClearDisplayed();
	}
	
	@And("^Active table download button display$")
	public void activeTableDownloadShouldDisplay() {
		SharedDriver.objectivesPage.isObjectiveActiveTableDownloadButtonDisplayed();
	}
	
	@And("^Active table display$")
	public void activeTableShouldDisplay() {
		SharedDriver.objectivesPage.isObjectivesActiveTableDisplayed();
	}
	
	@And("^Active table pagination display$")
	public void activeTablePaginationShouldDisplay() {
		SharedDriver.objectivesPage.isObjectivesActiveTableFooterDisplayed();
	}
	
	@And("^Inactive objectives section display$")
	public void inActiveSectionShouldDisplay() {
		SharedDriver.objectivesPage.isObjectivesInActiveSectionDisplayed();
	}
	
	@And("^Inactive table maginifier display$")
	public void inActiveTableMaginifierShouldDisplay() {
		SharedDriver.objectivesPage.isObjectivesInActiveSectionMaginifierDisplayed();
	}
	
	@And("^Inactive table search input display$")
	public void inActiveTableSearchInputDisplay() {
		SharedDriver.objectivesPage.isObjectivesInActiveSectionSearchInputDisplayed();
	}
	
	@And("^Inactive table clear search display$")
	public void inActiveTableClearSearchShouldDisplay() {
		SharedDriver.objectivesPage.isObjectivesInActiveSectionSearchClearDisplayed();
	}
	
	@And("^Inactive table download button display$")
	public void inActiveTableDownloadShouldDisplay() {
		SharedDriver.objectivesPage.isObjectiveInActiveTableDownloadButtonDisplayed();
	}
	
	@And("^Inactive table display$")
	public void inActiveTableShouldDisplay() {
		SharedDriver.objectivesPage.isObjectivesInActiveTableDisplayed();
	}
	
	@And("^Inactive table pagination display$")
	public void inActiveTablePaginationShouldDisplay() {
		SharedDriver.objectivesPage.isObjectivesInActiveTableFooterDisplayed();
	}
	/**
	 * Tiers tab
	 */
	@And("^Tiers section should load$")
	public void isTiersSectionDisplayed() {
		System.out.println("SharedDriver.tiersPage: " + SharedDriver.tiersPage);
		SharedDriver.tiersPage.isTiersSectionDisplayed();
	}
	
	@And("^Tiers table maginifier display$")
	public void tiersTableMaginifierShouldDisplay() {
		SharedDriver.tiersPage.isTiersTableMaginifierDisplayed();
	}
	
	@And("^Tiers table search input display$")
	public void tiersTableSearchInputDisplay() {
		SharedDriver.tiersPage.isTiersTableSearchInputDisplayed();
	}
	
	@And("^Tiers table clear search display$")
	public void tiersTableClearSearchShouldDisplay() {
		SharedDriver.tiersPage.isTiersTableSearchClearDisplayed();
	}
	
	@And("^Tiers table download button display$")
	public void tiersTableDownloadShouldDisplay() {
		SharedDriver.tiersPage.isTiersTableDownloadButtonDisplayed();
	}
	
	@And("^Tiers table display$")
	public void tiersTableShouldDisplay() {
		SharedDriver.tiersPage.isTiersTableDisplayed();
	}
	
	@And("^Tiers table pagination display$")
	public void tiersTablePaginationShouldDisplay() {
		SharedDriver.tiersPage.isTiersTableFooterDisplayed();
	}
	
}
