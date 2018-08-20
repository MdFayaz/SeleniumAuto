package step_definitions;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TiersPageStepDefinitions {

	@When("^Click on Create Tier Button$")
	public void clickOnCreateTierButton() {
		System.out.println("Tiers Page: " + SharedDriver.tiersPage);
		SharedDriver.tiersPage.clickOnCreateTierButton();
	}
	
	@Then("^Get Started tab view should load$")
	public void getStartedViewShouldLoad() {
		Assert.assertTrue("Create New Tier - Get started view - loaded",
				SharedDriver.tiersPage
						.isCreateNewTierGetStartedTabViewDisplayed());
	}
	
	@And("^Create New Tier title should display$")
	public void createNewTierTileShouldDisplay() {
		Assert.assertEquals("Create New Tier - title", SharedDriver.tiersPage
				.getCreateNewTierGetStartedTabViewExpectedTitle(),
				SharedDriver.tiersPage
						.getCreateNewTierGetStartedTabViewActualTitle());
	}
	
	@And("^Create New Tier instruction should display$")
	public void createNewTierInstructionShouldDisplay() {
		Assert.assertEquals(
				"Create New Tier - instruction",
				SharedDriver.tiersPage
						.getCreateNewTierGetStartedTabViewExpectedInstruction(),
				SharedDriver.tiersPage
						.getCreateNewTierGetStartedTabViewActualInstruction());
	}
	
	@Then("^Get Started select section should load$")
	public void getStartedSelectSectionShouldLoad() {
		Assert.assertTrue("Create New Tier - Select Section - loaded",
				SharedDriver.tiersPage
						.isCreateNewTierGetStratedSelectSelectionDisplayed());
	}
	
	@And("^Get Started name section should load$")
	public void getStartedNameSectionShouldLoad() {
		Assert.assertTrue("Create New Tier - Name Section - loaded",
				SharedDriver.tiersPage
						.isCreateNewTierGetStratedNameSelectionDisplayed());
	}
	
	@When("^Click on Create New Tier radio button$")
	public void clickOnCreateNewTierRadioButton() {
		SharedDriver.tiersPage.selectCreateNewTierRadioButton();
	}
	
	@When("^Click on Copy And Edit Existing tier radio button$")
	public void clickOnCopyAndEditExistingTierRadioButton() {
		SharedDriver.tiersPage.selectCopyAndEditExistingButton();
	}
	
	@Then("^Copy and edit choose existing dropdown display$")
	public void copyAndEditChooseExistingDropdownDisplay() {
		Assert.assertTrue(
				"Create New Tier - Get Started - choose existing dropdown",
				SharedDriver.tiersPage
						.isCreateNewTierCopyAndEditChooseDropdownDisplayed());
	}
	
	@Then("^Copy and edit choose existing dropdown wont display$")
	public void copyAndEditChooseExistingDropdownShouldNotDisplay() {
		Assert.assertFalse(
				"Create New Tier - Get Started - choose existing dropdown wont display",
				SharedDriver.tiersPage
						.isCreateNewTierCopyAndEditChooseDropdownDisplayed());
	}
	
	@And("^Get Started description section should load$")
	public void getStartedDescriptionSectionShouldLoad() {
		Assert.assertTrue("Create New Tier - Description Section - loaded",
				SharedDriver.tiersPage
						.isCreateNewTierGetStratedDescriptionSelectionDisplayed());
	}
	
	@And("^Get Started cost section should load$")
	public void getStartedCostSectionShouldLoad() {
		Assert.assertTrue("Create New Tier - Cost Section - loaded",
				SharedDriver.tiersPage
						.isCreateNewTierGetStratedCostSelectionDisplayed());
	}

	@Given("^Enter Tier Name \"([^\"]*)\"$")
	public void createTierWithName(String tierName) {
		SharedDriver.tiersPage.enterTierName(tierName);
	}

	@Given("^Enter Tier Description \"([^\"]*)\"$")
	public void createTierWithDescription(String tierDescription) {
		SharedDriver.tiersPage.enterTierDescription(tierDescription);
	}
	
	@When ("^Click on Get Started Next Step button")
	public void clickOnGetStartedNextStepButton() {
		SharedDriver.tiersPage.clickOnGetStartedTabNextStepButton();
	}
	
	@Then("^Create new tier Placement tab view display$")
	public void placementViewShouldLoad() {
		Assert.assertTrue("Create New Tier - Placement view - loaded",
				SharedDriver.tiersPage
						.isCreateNewTierPlacementViewDisplayed());
	}
	
	@And("^Create new tier Placement tab header fields display$")
	public void placementViewInstructionShouldLoad() {
		Assert.assertTrue("Create New Tier - Placement header fileds - loaded",
				SharedDriver.tiersPage
						.isCreateNewTierPlacementHeaderFieldsDisplayed());
	}
	
	@And("^Create new tier Placement tab header instruction display$")
	public void placementViewHeaderFieldsShouldLoad() {
		Assert.assertEquals(
				"Create New Tier - Placement tab - instruction",
				SharedDriver.tiersPage
						.getCreateNewTierPlacementExpectedInstruction(),
				SharedDriver.tiersPage
						.getCreateNewTierPlacementActualInstruction());
	}
	
	@And("^Create new tier Placement tab do not move display$")
	public void placementViewHeaderDoNotMoveLabelShouldLoad() {
		Assert.assertTrue("Create New Tier - Placement header fileds - loaded",
				SharedDriver.tiersPage
						.isCreateNewTierPlacementDoNotMoveDisplayed());
	}
	
	@And("^Create new tier Placement tab optimze for capacity display$")
	public void placementViewHeaderOptimzeForCapacityShouldLoad() {
		Assert.assertTrue("Create New Tier - Placement header fileds - loaded",
				SharedDriver.tiersPage
						.isCreateNewTierPlacementOptimizeForCapacityDisplayed());
	}
	
	@And("^Create new tier Placement tab confine data to section display$")
	public void placementViewConfineDataToSectionShouldLoad() {
		Assert.assertTrue(
				"Create New Tier - Placement confine data to section - loaded",
				SharedDriver.tiersPage
						.isCreateNewTierPlacementConfineDataSectionDisplayed());
	}
	
	@And("^Create new tier Placement tab confine data to section title display$")
	public void placementViewConfineDataToSectionTitleShouldLoad() {
		Assert.assertEquals(
				"Create New Tier - Placement tab - Confine to section - Title",
				SharedDriver.tiersPage
						.getCreateNewTierPlacementConfineDataSectionExpectedTitle(),
				SharedDriver.tiersPage
						.getCreateNewTierPlacementConfineDataSectionActualTitle());
	}
	
	@And("^Create new tier Placement tab confine data to section subtitle display$")
	public void placementViewConfineDataToSectionSubTitleShouldLoad() {
		Assert.assertEquals(
				"Create New Tier - Placement tab - Confine to section - SubTitle",
				SharedDriver.tiersPage
						.getCreateNewTierPlacementConfineDataSectionExpectedSubTitle(),
				SharedDriver.tiersPage
						.getCreateNewTierPlacementConfineDataSectionActualSubTitle());
	}
	
	@And("^Create new tier Placement tab confine data to empty section display$")
	public void placementViewConfineDataToEmptySectionShouldLoad() {
		Assert.assertTrue(
				"Create New Tier - Placement confine data to empty section - loaded",
				SharedDriver.tiersPage
						.getCreateNewTierPlacementConfineDataEmptySectionDisplayed());
	}
	
	@And("^Create new tier Placement tab confine data to empty section add icon display$")
	public void placementViewConfineDataToEmptySectionAddIconShouldLoad() {
		Assert.assertTrue(
				"Create New Tier - Placement confine data to empty section add icon - loaded",
				SharedDriver.tiersPage
						.getCreateNewTierPlacementConfineDataSectionAddIconDisplayed());
	}
	
	@And("^Create new tier Placement tab confine data to section add title display$")
	public void placementViewConfineDataToSectionAddTitleShouldLoad() {
		Assert.assertEquals(
				"Create New Tier - Placement tab - Confine to section - AddTitle",
				"Select Storage", SharedDriver.tiersPage
						.getCreateNewTierPlacementConfineDataAddTile());
	}
	
	
	
	/*//TODO: need to take input from feature file to distinguish between storage and volume to select
	@Given ("^Select Place On Storage \"([^\"]*)\"$")
	public void selectPlaceOnStorageCheckbox(String storageName) {
		SharedDriver.tiersPage.searchForPlaceDataOnStorageSystem(storageName)
				.selectPlaceOnStorageSystemCheckbox();
	}*/
	
	//Place Data on
	@And("^Create new tier Placement tab place data to section display$")
	public void placementViewPlaceDataToSectionShouldLoad() {
		Assert.assertTrue(
				"Create New Tier - Placement place data to section - loaded",
				SharedDriver.tiersPage
						.isCreateNewTierPlacementPlaceDataSectionDisplayed());
	}
	
	@And("^Create new tier Placement tab place data to section title display$")
	public void placementViewPlaceDataToSectionTitleShouldLoad() {
		Assert.assertEquals(
				"Create New Tier - Placement tab - Place to section - Title",
				SharedDriver.tiersPage
						.getCreateNewTierPlacementPlaceDataSectionExpectedTitle(),
				SharedDriver.tiersPage
						.getCreateNewTierPlacementPlaceDataSectionActualTitle());
	}
	
	@And("^Create new tier Placement tab place data to section subtitle display$")
	public void placementViewPlaceDataToSectionSubTitleShouldLoad() {
		Assert.assertEquals(
				"Create New Tier - Placement tab - Place to section - SubTitle",
				SharedDriver.tiersPage
						.getCreateNewTierPlacementPlaceDataSectionExpectedSubTitle(),
				SharedDriver.tiersPage
						.getCreateNewTierPlacementPlaceDataSectionActualSubTitle());
	}
	
	@And("^Create new tier Placement tab place data to empty section display$")
	public void placementViewPlaceDataToEmptySectionShouldLoad() {
		Assert.assertTrue(
				"Create New Tier - Placement place data to empty section - loaded",
				SharedDriver.tiersPage
						.getCreateNewTierPlacementPlaceDataEmptySectionDisplayed());
	}
	
	@And("^Create new tier Placement tab place data to empty section add icon display$")
	public void placementViewPlaceDataToEmptySectionAddIconShouldLoad() {
		Assert.assertTrue(
				"Create New Tier - Placement place data to empty section add icon - loaded",
				SharedDriver.tiersPage
						.getCreateNewTierPlacementPlaceDataSectionAddIconDisplayed());
	}
	
	@And("^Create new tier Placement tab place data to section add title display$")
	public void placementViewPlaceDataToSectionAddTitleShouldLoad() {
		Assert.assertEquals(
				"Create New Tier - Placement tab - Place to section - AddTitle",
				"Select Storage", SharedDriver.tiersPage
						.getCreateNewTierPlacementPlaceDataAddTile());
	}
	
	@Given ("^Select on Place On Storage$")
	public void selectPlaceOnStorageSystemLink() {
		SharedDriver.tiersPage.selectPlaceDataOnStorageLink();
	}
	
	@Given ("^Search Place On Storage \"([^\"]*)\"$")
	public void searchPlaceOnStorageSystem(String storageName) {
		SharedDriver.tiersPage.searchForPlaceDataOnStorageSystem(storageName);
	}

	@And("^Search Place On Storage Volume \"([^\"]*)\"$")
	public void selectPlaceOnStorageVolumeCheckbox(String volName) {
		SharedDriver.tiersPage.searchForPlaceDataOnStorageSystemVolume(volName);
	}

	@Then ("^Check the place on Storage System$")
	public void selectPlaceOnStorageCheckbox() {
		SharedDriver.tiersPage.selectPlaceOnStorageSystemCheckbox();
	}
	
	@And("^Click on save selection button$")
	public void clickOnSaveSelection() {
		SharedDriver.tiersPage.savePlaceOnStroageSystemSelection();
	}
	
	//Placement 
	@When("^Skip the Placement Section$") 
	public void skipThePlacementSection() {
		SharedDriver.tiersPage.skipPlacementStep();
	}
	
	@When("^Click on Placement Next Step button$")
	public void clickOnPlacementNextStepButton() {
		SharedDriver.tiersPage.clickOnPlacementTabNextStepButton();
	}
	
	//Performance
	@Then("^Create new tier Performance tab view display$")
	public void performanceViewShouldLoad() {
		Assert.assertTrue("Create New Tier - Performance view - loaded",
				SharedDriver.tiersPage
						.isCreateNewTierPerformanceViewDisplayed());
	}
	
	@And("^Create new tier Performance tab header display$")
	public void performanceViewHeaderShouldLoad() {
		Assert.assertEquals(
				"Create New Tier - Performance tab - Header",
				SharedDriver.tiersPage
						.getCreateNewTierPerformanceExpectedHeader(),
				SharedDriver.tiersPage
						.getCreateNewTierPerformanceActualHeader());
	}
	
	@And("^Create new tier Performance tab read bandwidth display$")
	public void performanceViewReadBandiwthSectionShouldDisplay() {
		Assert.assertTrue(
				"Create New Tier - Performance - Readbandwidth section",
				SharedDriver.tiersPage
						.isPerformanceTabReadBandwithSectionDisplayed());
	}
	
	@Given("^Set performance read bandwidth \"([^\"]*)\"$")
	public void setPerformanceReadBandwidth(String value) {
		SharedDriver.tiersPage.setReadBandwidth(value);
	}

	@And("^Create new tier Performance tab read iops display$")
	public void performanceViewReadIOPsSectionShouldDisplay() {
		Assert.assertTrue(
				"Create New Tier - Performance - IOPS section",
				SharedDriver.tiersPage
						.isPerformanceTabReadIOPsSectionDisplayed());
	}
	
	@Given("^Set performance read iops \"([^\"]*)\"$")
	public void setPerformanceReadIOPS(String value) {
		SharedDriver.tiersPage.setReadIOPS(value);
	}
	
	@And("^Create new tier Performance tab read latency display$")
	public void performanceViewReadLatencySectionShouldDisplay() {
		Assert.assertTrue(
				"Create New Tier - Performance - Read Latency section",
				SharedDriver.tiersPage
						.isPerformanceTabReadLatencySectionDisplayed());
	}
	
	@Given("^Set performance read latency \"([^\"]*)\"$")
	public void setPerformanceReadLatency(String value) {
		SharedDriver.tiersPage.setReadLatency(value);
	}
	
	@And("^Create new tier Performance tab write bandwidth display$")
	public void performanceViewWriteBandwidthSectionShouldDisplay() {
		Assert.assertTrue(
				"Create New Tier - Performance - Write Bandwidth section",
				SharedDriver.tiersPage
						.isPerformanceTabWriteBandwidthSectionDisplayed());
	}
	
	@Given("^Set performance write bandwidth \"([^\"]*)\"$")
	public void setPerformanceWriteBandwidth(String value) {
		SharedDriver.tiersPage.setWriteBandwidth(value);
	}
	
	@And("^Create new tier Performance tab write iops display$")
	public void performanceViewWriteIOPsSectionShouldDisplay() {
		Assert.assertTrue(
				"Create New Tier - Performance - Write IOPs section",
				SharedDriver.tiersPage
						.isPerformanceTabWriteIOPsSectionDisplayed());
	}

	@Given("^Set performance write iops \"([^\"]*)\"$")
	public void setPerformanceWriteIOPS(String value) {
		SharedDriver.tiersPage.setWriteIOPS(value);
	}
	
	@And("^Create new tier Performance tab write latency display$")
	public void performanceViewWriteLatencySectionShouldDisplay() {
		Assert.assertTrue(
				"Create New Tier - Performance - Write Latency section",
				SharedDriver.tiersPage
						.isPerformanceTabWriteLatencySectionDisplayed());
	}

	@Given("^Set performance write latency \"([^\"]*)\"$")
	public void setPerformanceWriteLatency(String value) {
		SharedDriver.tiersPage.setWriteLatency(value);
	}
	
	@When("^Skip the Performance Section$") 
	public void skipThePerformanceSection() {
		SharedDriver.tiersPage.skipPerformanceStep();
	}
	
	@When("^Click on Performance Next Step button$")
	public void clickOnPerformanceNextStepButton() {
		SharedDriver.tiersPage.clickOnPerformanceTabNextStepButton();
	}
	
	//Protection
	@Then("^Create new tier Protection tab view display$")
	public void protectionViewShouldLoad() {
		Assert.assertTrue("Create New Tier - Protection view - loaded",
				SharedDriver.tiersPage
						.isCreateNewTierProtectionViewDisplayed());
	}
	
	@And("^Create new tier Protection tab header display$")
	public void protectionViewHeaderShouldLoad() {
		Assert.assertEquals(
				"Create New Tier - Protection tab - Header",
				SharedDriver.tiersPage
						.getCreateNewTierProtectionExpectedHeader(),
				SharedDriver.tiersPage
						.getCreateNewTierProtectionActualHeader());
	}
	
	@Then("^Create new tier Protection tab Durability section display$")
	public void protectionViewDurabilitySectionShouldLoad() {
		Assert.assertTrue("Create New Tier - Protection view - loaded",
				SharedDriver.tiersPage
						.isProtectionTabDurabilityDisplayed());
	}
	
	@And("^Create new tier Protection tab Durability label display$")
	public void protectionViewDurabilityLabelDisplay() {
		Assert.assertEquals("Create New Tier - Protection - Durability label",
				"Durability (9s)", SharedDriver.tiersPage
						.getCreateNewTierProtectionLabelDurability());
	}
	
	@Then("^Create new tier Protection tab Availability section display$")
	public void protectionViewAvailabilitySectionShouldLoad() {
		Assert.assertTrue("Create New Tier - Protection view - loaded",
				SharedDriver.tiersPage
						.isProtectionTabAvailabilityDisplayed());
	}
	
	@And("^Create new tier Protection tab Availability label display$")
	public void protectionViewAvailabilityLabelDisplay() {
		Assert.assertEquals("Create New Tier - Protection - Availability label",
				"Availability (9s)", SharedDriver.tiersPage
						.getCreateNewTierProtectionLabelAvailability());
	}
	
	@Then("^Create new tier Protection tab Priority section display$")
	public void protectionViewPrioritySectionShouldLoad() {
		Assert.assertTrue(
				"Create New Tier - Protection view - Priority - loaded",
				SharedDriver.tiersPage.isProtectionTabPriorityDisplayed());
	}
	
	@And("^Create new tier Protection tab Priority label display$")
	public void protectionViewPriorityLabelDisplay() {
		Assert.assertEquals("Create New Tier - Protection - Priority label",
				"Priority", SharedDriver.tiersPage
						.getCreateNewTierProtectionLabelPriority());
	}
	
	@Then("^Create new tier Protection tab Online Delay section display$")
	public void protectionViewOnlineDelaySectionShouldLoad() {
		Assert.assertTrue(
				"Create New Tier - Protection view - Online Delay - loaded",
				SharedDriver.tiersPage.isProtectionTabOnlineDisplayed());
	}
	
	@And("^Create new tier Protection tab Online Delay label display$")
	public void protectionViewOnlineDelayLabelDisplay() {
		Assert.assertEquals("Create New Tier - Protection - Online Delay label",
				"Online Delay", SharedDriver.tiersPage
						.getCreateNewTierProtectionLabelOnlineDelay());
	}
	
	@And("^Create new tier Protection tab Forever radio button enabled$")
	public void protectionViewOnlineDelayForeverRadioButtonEnabled() {
		Assert.assertTrue(
				"Create New Tier - Protection - Online Delay Forever radio button",
				SharedDriver.tiersPage
						.isProtectionTabOnlineDelayForeverEnabled());
	} 
	
	@And("^Create new tier Protection tab Hours radio button enabled$")
	public void protectionViewOnlineDelayHoursRadioButtonEnabled() {
		Assert.assertTrue(
				"Create New Tier - Protection - Online Delay Hours radio button",
				SharedDriver.tiersPage
						.isProtectionTabOnlineDelayHoursEnabled());
	}
	
	@And("^Create new tier Protection tab Minutes radio button enabled$")
	public void protectionViewOnlineDelayMinutesRadioButtonEnabled() {
		Assert.assertTrue(
				"Create New Tier - Protection - Online Delay Minutes radio button",
				SharedDriver.tiersPage
						.isProtectionTabOnlineDelayMinutesEnabled());
	}
	
	@And("^Create new tier Protection tab Seconds radio button enabled$")
	public void protectionViewOnlineDelaySecondsRadioButtonEnabled() {
		Assert.assertTrue(
				"Create New Tier - Protection - Online Delay Seconds radio button",
				SharedDriver.tiersPage
						.isProtectionTabOnlineDelaySecondsEnabled());
	}
	
	@And("^Create new tier Protection tab Online Delay radio button enabled$")
	public void protectionViewOnlineDelayOnlineDelayRadioButtonEnabled() {
		Assert.assertTrue(
				"Create New Tier - Protection - Online Delay Online Delay radio button",
				SharedDriver.tiersPage
						.isProtectionTabOnlineDelayOnlineEnabled());
	}
	
	@And("^Create new tier Current Selections section display$")
	public void protectionViewCreateSideSectionDisplay() {
		Assert.assertTrue(
				"Create New Tier - tabs - Current Selections section",
				SharedDriver.tiersPage
						.isCreateSideSectionDisplayedInTabs());
	}
	
	
	@When("^Skip the Protection Section$") 
	public void skipTheProtectionSection() {
		SharedDriver.tiersPage.skipProtectionStep();
	}
	
	@When("^Click on Protection Next Step button$")
	public void clickOnProtectionNextStepButton() {
		SharedDriver.tiersPage.clickOnProtectionTabNextStepButton();
	}
	
	//Preview tab
	
	@And("^Create new tier preview should display$")
	public void previewTabViewShouldDisplayed() {
		Assert.assertTrue(
				"Create New Tier - Priview tab - view should display",
				SharedDriver.tiersPage
						.isPreviewTabViewDisplay());
	}
	
	@And("^Create new tier Preview tab header display$")
	public void previewViewHeaderShouldLoad() {
		Assert.assertEquals(
				"Create New Tier - Preview tab - Header",
				SharedDriver.tiersPage
						.getPreviewTabViewExpectedHeader(),
				SharedDriver.tiersPage
						.getPreviewTabViewActualHeader());
	}
	
	@And("^Create new tier preview tab name section should display$")
	public void previewTabNameSectionShouldDisplayed() {
		Assert.assertTrue(
				"Create New Tier - Priview tab - Name section should display",
				SharedDriver.tiersPage
						.isPreviewTabNameSectionDisplay());
	}
	
	@And("^Create new tier preview tab performance section should display$")
	public void previewTabPerformanceSectionShouldDisplayed() {
		Assert.assertTrue(
				"Create New Tier - Priview tab - Performance section should display",
				SharedDriver.tiersPage
						.isPreviewTabPerformanceSectionDisplay());
	}
	
	@And("^Create new tier preview tab protection section should display$")
	public void previewTabProtectionSectionShouldDisplayed() {
		Assert.assertTrue(
				"Create New Tier - Priview tab - Protection section should display",
				SharedDriver.tiersPage
						.isPreviewTabProtectionSectionDisplay());
	}
	
	@And("^Create new tier preview tab confine to section should display$")
	public void previewTabConfineToSectionShouldDisplayed() {
		Assert.assertTrue(
				"Create New Tier - Priview tab - Confine To section should display",
				SharedDriver.tiersPage
						.isPreviewTabConfineToSectionDisplay());
	}
	
	@And("^Create new tier preview tab confine to edit button should enabled$")
	public void previewTabConfineToEditButtonEnabled() {
		Assert.assertTrue(
				"Create New Tier - Priview tab - Confine To edit button enabled",
				SharedDriver.tiersPage
						.isPreviewTabConfineToSectionEditButtonEnable());
	}
	
	@And("^Create new tier preview tab place on edit button should enabled$")
	public void previewTabPlaceOnEditButtonEnabled() {
		Assert.assertTrue(
				"Create New Tier - Priview tab - Place On edit button enabled",
				SharedDriver.tiersPage
						.isPreviewTabPlaceOnSectionEditButtonEnable());
	}
	
	@And("^Create new tier preview tab cancel button enabled$")
	public void previewTabCancelButtonEnabled() {
		Assert.assertTrue(
				"Create New Tier - Priview tab - Cancel button enabled",
				SharedDriver.tiersPage
						.isPreviewTabCancelButtonEnable());
	}
	
	@When("^Click on preview cancel button$")
	public void clickOnCancelButton() {
		SharedDriver.tiersPage.clickOnPriviewTabCancelButton();
	}
	
	@When("^Click on Save Tier button$")
	public void clickOnSaveTierButton() {
		SharedDriver.tiersPage.clickOnSaveTierButton();
	}
}
