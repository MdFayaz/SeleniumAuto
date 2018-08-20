package com.datasphere.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.datasphere.page.constants.DataProfilerPageConstants;

public class DataProfilerPage extends ObjectivesAndTiersPage {

	WebDriver driver;

	public DataProfilerPage(WebDriver driver) {
		super(driver);
	}

	public void isRefreshButtonDisplayed() {
		dataProfilerPage.getButton(DataProfilerPageConstants.REFRESH_BUTTON).isDisplayed();
	}

	public void isSelectShareDropdownDisplayed() {
		dataProfilerPage.getButton(DataProfilerPageConstants.SELECT_SHARE_DROPDOWN).isDisplayed();
	}

	public void isDataDropdownDisplayed() {
		dataProfilerPage.getButton(DataProfilerPageConstants.DATA_DROPDOWN).isDisplayed();
	}

	public void isCostInputDisplayed() {
		dataProfilerPage.getButton(DataProfilerPageConstants.COST_INPUT).isDisplayed();
	}

	public void isBaselineDropdownDisplayed() {
		dataProfilerPage.getButton(DataProfilerPageConstants.BASELINE_DROPDOWN).isDisplayed();
	}

	public void isSavingsDollarsDisplayed() {
		dataProfilerPage.getButton(DataProfilerPageConstants.SAVINGS_DOLLAR).isDisplayed();
	}

	public void isSavingsPercentDisplayed() {
		dataProfilerPage.getButton(DataProfilerPageConstants.SAVINGS_PERCENT).isDisplayed();
	}

	public void isSelectAShareToBeginIconDisplayed() {
		dataProfilerPage.getButton(DataProfilerPageConstants.SELECT_A_SHARE_TO_BEGIN_ICON).isDisplayed();
	}

	public void isFilesButtonDisplayed() {
		dataProfilerPage.getButton(DataProfilerPageConstants.FILES_BUTTON).isDisplayed();
	}

	public void isCapacityButtonDisplayed() {
		dataProfilerPage.getButton(DataProfilerPageConstants.CAPACITY_BUTTON).isDisplayed();
	}

	public void isCostButtonDisplayed() {
		dataProfilerPage.getButton(DataProfilerPageConstants.COST_BUTTON).isDisplayed();
	}

	public void isSliderToAddTierDisplayed() {
		dataProfilerPage.getButton(DataProfilerPageConstants.CLICK_SLIDER_TO_ADD_TIER).isDisplayed();
	}

	public void isHistogramChart1Displayed() {
		dataProfilerPage.getButton(DataProfilerPageConstants.HISTOGRAM_CHART1).isDisplayed();
	}
	
	public void isHistogramChart2Displayed() {
		dataProfilerPage.getButton(DataProfilerPageConstants.HISTOGRAM_CHART2).isDisplayed();
	}
	
	public void isHistogramChart3Displayed() {
		dataProfilerPage.getButton(DataProfilerPageConstants.HISTOGRAM_CHART3).isDisplayed();
	}
	
	public void isHistogramChart4Displayed() {
		dataProfilerPage.getButton(DataProfilerPageConstants.HISTOGRAM_CHART4).isDisplayed();
	}
	
	public void isHistogramChart5Displayed() {
		dataProfilerPage.getButton(DataProfilerPageConstants.HISTOGRAM_CHART5).isDisplayed();
	}

	public void selectAShare(String shareName) {
		WebElement shareDropdown = dataProfilerPage.getButton(
				DataProfilerPageConstants.SELECT_SHARE_DROPDOWN)
				.getUnderlyingElement(shareName);
		shareDropdown.click();
		waitUntilTimeout(3);
		WebElement dropdownOption = shareDropdown.findElement(By
				.xpath("//*[text()[normalize-space(.)='" + shareName + "']]"));
		dropdownOption.click();
	}
	
	public void isDataProfilerSectionDisplayed() {
		dataProfilerPage.getForm(DataProfilerPageConstants.PROFILER_BODY).isDisplayed();
	}

}
