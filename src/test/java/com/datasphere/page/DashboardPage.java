package com.datasphere.page;

import org.openqa.selenium.WebDriver;

import com.datasphere.page.constants.DashboardPageConstants;
import com.datasphere.webelements.PageObject;

public class DashboardPage extends LandingPage /*implements NavigateTo*/ {
	
	WebDriver driver;
	PageObject dashboardPage;

	public DashboardPage(WebDriver driver) {
		super(driver);
		dashboardPage = new PageObject(driver, "src/test/resources/DashboardPageLocators.json");
	}
	
	
	/**
	 * Performance
	 * @return
	 */
	public boolean  isDashboardPerfSectionLoaded() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_PERF_SECITON).isDisplayed();
	}
	
	public String getDashboardPerfHeaderName() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_PERF_SECTION_TITLE).getText();
	}
	
	public boolean isDashboardPerfSectionIOPSLoaded() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_PERF_IOPS).isDisplayed();
	}
	
	public String getDashboardPerfSectionIOPSHeader() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_PERF_IOPS_TITLE).getText();
	}
	
	public boolean isDashboardPerfBandwidthSectionLoaded() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_PERF_BANDWIDTH).isDisplayed();
	}
	
	public String getDashboardPerfSectionBandwidthHeader() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_PERF_BANDWIDTH_TITLE).getText();
	}
	
	public boolean isDashboardPerfSectionMetadataLoaded() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_PERF_METADATA_OPS).isDisplayed();
	}
	
	public String getDashboardPerfSectionMetadataHeader() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_PERF_METADATA_OPS_TITLE).getText();
	}

	public boolean isDashboardPerfSectionOpenFilePerfLoaded() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_PERF_OPEN_FILE_PERF).isDisplayed();
	}
	
	public String getDashboardPerfOpenFilePerfHeader() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_PERF_OPEN_FILE_PERF_TITLE).getText();
	}
	/**
	 * Capacity
	 * @return
	 */
	public boolean isDashboardCapacitySectionLoaded() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_CAP_SECTION).isDisplayed();
	}

	public String getDashboardCapacityHeaderName() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_CAP_SECTION_HEADER).getText();
	}
	
	public boolean isDashboardCapacitySectionHeader() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_CAP_SECTION_HEADER).isDisplayed();
	}

	public boolean isDashboardCapacitySectionStorageLoaded() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_CAP_STORAGE).isDisplayed();
	}
	
	public String getCapacitySectionStorageHeaderName() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_CAP_STORAGE_HEADER).getText();
	}
	
	public boolean isCapacitySectionTotalLoaded() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_CAP_TOTAL).isDisplayed();
	}
	
	public String getCapacityTotalHeaderName() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_CAP_TOTAL_HEADER).getText();
	}
	
	public boolean isDashboardCapacitySectionGrowthLoaded() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_CAP_GROWTH).isDisplayed();
	}
	
	public String getCapacityGrowthHeaderName() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_CAP_GROWTH_HEADER).getText();
	}
	
	public boolean isDashboardCapacitySectionCapacityLoaded() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_CAP_CAPACITY_SECTION).isDisplayed();
	}
	
	public String getCapacitySectionCapactityHeader() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_CAP_HEADER).getText();
	}
	
	/**
	 * Alignment
	 * @return
	 */
	public String getDashboardAlignmentSectionHeader() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_ALIGN_SECITON_HEADER).getText();
	}
	
	public boolean isDashboardAlignmentSectionLoaded() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_ALIGN_SECITON).isDisplayed();
	}
	
	public String getDashboardAlignmentVolExceedingThresholdHeader() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_ALIGN_SECITON_VOL_THRESHOLD_HEADER).getText();
	}
	
	public boolean isDashboardAlignmentVolExceedingThresholdLoaded() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_ALIGN_SECITON_VOL_THRESHOLD).isDisplayed();
	}
	
	public boolean isDashboardAlignmentMobilityBandwidthLoaded() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_ALIGN_SECITON_MOBILITY_BANDWIDTH).isDisplayed();
	}
	
	public String getDashboardAlignmentMobilityBandwidthHeader() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_ALIGN_SECITON_MOBILITY_BANDWIDTH_HEADER).getText();
    }
	
	public boolean isDashboardAlignmentFileAlignmentLoaded() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_ALIGN_SECITON_FILE_COMPLIANCE).isDisplayed();
	}
	
	public String getDashboardAlignmentFileAlignmentHeader() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_ALIGN_SECITON_FILE_COMPLIANCE_HEADER).getText();
    }
	
	public boolean isDashboardAlignmentCurrentMobilityReasonsLoaded() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_ALIGN_SECITON_MOBILITY_REASONS_LOADED).isDisplayed();
	}
	
    public String getDashboardAlignmentCurrentMobilityReasonsHeader() {
    	return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_ALIGN_SECITON_MOBILITY_REASONS_HEADER).getText();
    }
	
	public String getDashboardAlignmentCurrentMobilityReasonsPerf() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_ALIGN_SECITON_MOBILITY_REASONS_PERF).getText();
	}
	
	public String getDashboardAlignmentCurrentMobilityReasonsLocation() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_ALIGN_SECITON_MOBILITY_REASONS_LOCATION).getText();
	}
	
	public String getDashboardAlignmentCurrentMobilityReasonsContention() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_ALIGN_SECITON_MOBILITY_REASONS_CONTENTION).getText();
	}
	
	public String getDashboardAlignmentCurrentMobilityReasonsProtection() {
		return dashboardPage.getLabel(DashboardPageConstants.DASHBOARD_ALIGN_SECITON_MOBILITY_REASONS_PREOTECTION).getText();
	}

	/*@Override
	public NavigateTo navigate() {
		
		return this;
	}*/

}
