package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataProfilerStepDefinitions {

	@And("^Refresh button should exist$")
	public void refreshButtonDisplayed() {
		SharedDriver.dataProfiler.isRefreshButtonDisplayed();
	}
	
	@And("^Share dropdown should exist$")
	public void shareDropdownDisplayed() {
		SharedDriver.dataProfiler.isSelectShareDropdownDisplayed();
	}
	
	@And("^Data dropdown should exist$")
	public void dataDropdownDispalyed() {
		SharedDriver.dataProfiler.isDataDropdownDisplayed();
	}
	
	@And("^Cost Input should exist$")
	public void costInputDisplayed() {
		SharedDriver.dataProfiler.isCostInputDisplayed();
	}
	
	@And("^Baseline dropdown should exist$")
	public void baselineDropdownDisplayed() {
		SharedDriver.dataProfiler.isBaselineDropdownDisplayed();
	}
	
	@And("^Savings dollar value should exist$")
	public void savingDollarsDisplayed() {
		SharedDriver.dataProfiler.isSavingsDollarsDisplayed();
	}
	
	@And("^Savings percent value should exist$")
	public void savingPercentageDisplayed() {
		SharedDriver.dataProfiler.isSavingsPercentDisplayed();
	}
	
	@And("^Instruction to Selecting share icon should exist$")
	public void instructionToSelectAShareIconDisplayed() {
		SharedDriver.dataProfiler.isSelectAShareToBeginIconDisplayed();
	}
	
	@When("^Select data profilers share \"([^\"]*)\"$")
	public void selectShare(String shareName) {
		SharedDriver.dataProfiler.selectAShare(shareName);
	}
	
	@Then("^Data Profiler section should display$")
	public void dataProfilerSectionDisplayed() {
		SharedDriver.dataProfiler.isDataProfilerSectionDisplayed();
	}
	
	@And("^Add Tier section Files button should exist$")
	public void addTierSectionFilesButtonDisplayed() {
		SharedDriver.dataProfiler.isFilesButtonDisplayed();
	}
	
	@And("^Add Tier section Capacity button should exist$")
	public void addTierSectionCapacityButtonDisplayed() {
		SharedDriver.dataProfiler.isCapacityButtonDisplayed();
	}
	
	@And("^Add Tier section Cost button should exist$")
	public void addTierSectionCostButtonDisplayed() {
		SharedDriver.dataProfiler.isCostButtonDisplayed();
	}
	
	@And("^Slider to add tier should exist$")
	public void sliderToAddTierDisplayed() {
		SharedDriver.dataProfiler.isSliderToAddTierDisplayed();
	}
	
	@And("^One Histogram chart should exist by default$")
	public void isHistogramChartDisplayedByDefault() {
		SharedDriver.dataProfiler.isHistogramChart1Displayed();
	}
	
}
