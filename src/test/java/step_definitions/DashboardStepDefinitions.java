package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.datasphere.page.DashboardPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DashboardStepDefinitions {

	WebDriver driver = SharedDriver.getDriver();
	DashboardPage dashboardPage;

	/**
	 * Performance tests
	 */
	@Then("^Performance section load$")
	public void dashboardPerformanceSectionShouldLoad() {
		System.out.println("###########");
		System.out.println(SharedDriver.dashboardPage);
		System.out.println("###########");
		Assert.assertTrue("Dashboard Performance section loaded",
				SharedDriver.dashboardPage.isDashboardPerfSectionLoaded());
	}

	@Then("^Performance title should be \"([^\"]*)\"$")
	public void dashboardPerformanceSectionTitle(String performanceSectionTitle) {
		Assert.assertEquals("Dashboard IOPS section title",
				performanceSectionTitle,
				SharedDriver.dashboardPage.getDashboardPerfHeaderName());
	}

	@When("^IOPS section load$")
	public void dashboardIOPSSectionShouldLoad() {
		Assert.assertTrue("Dashboard IOPS section loaded",
				SharedDriver.dashboardPage.isDashboardPerfSectionIOPSLoaded());
	}

	@Then("^IOPS section title should be \"([^\"]*)\"$")
	public void dashboardIOPSSectionTitle(String iopsTitle) {
//		Assert.assertEquals("Dashboard IOPS section title", iopsTitle,
//				SharedDriver.dashboardPage.getDashboardPerfSectionIOPSHeader());
		Assert.assertTrue("Dashboard IOPS section title", 
				SharedDriver.dashboardPage.getDashboardPerfSectionIOPSHeader().contains(iopsTitle));
	}

	@When("^Bandwidth section load$")
	public void dashboardBandwidthSectionShouldLoad() {
		Assert.assertTrue("Dashboard Bandwidth section loaded",
				SharedDriver.dashboardPage.isDashboardPerfBandwidthSectionLoaded());
	}

	@Then("^Bandwidth section title should be \"([^\"]*)\"$")
	public void dashboardBandwidthSectionTitle(String bandwidthTitle) {
//		Assert.assertEquals("Dashboard Bandwidth section title",
//				bandwidthTitle,
//				SharedDriver.dashboardPage.getDashboardPerfSectionBandwidthHeader());
		Assert.assertTrue("Dashboard IOPS section title", 
				SharedDriver.dashboardPage.getDashboardPerfSectionBandwidthHeader().contains(bandwidthTitle));
	}

	@When("^Metadata OPS section load$")
	public void dashboardMetadataOPSSectionShouldLoad() {
		Assert.assertTrue("Dashboard Metadata OPS section loaded",
				SharedDriver.dashboardPage.isDashboardPerfSectionMetadataLoaded());
	}

	@Then("^Metadata OPS section title should be \"([^\"]*)\"$")
	public void dashboardMetadataOPSSectionTitle(String metadataOPSTitle) {
		Assert.assertTrue("Dashboard Metadata OPS section title", 
				SharedDriver.dashboardPage.getDashboardPerfSectionMetadataHeader().contains(metadataOPSTitle));
	}

	@When("^Open File Performance section load$")
	public void dashboardOpenFilePerformanceSectionShouldLoad() {
		Assert.assertTrue("Dashboard Open File Performance section loaded",
				SharedDriver.dashboardPage.isDashboardPerfSectionOpenFilePerfLoaded());
	}

	@Then("^Open File Performance section title should be \"([^\"]*)\"$")
	public void dashboardOpenFilePerformanceSectionTitle(
			String openFilePerformanceTitle) {
//		Assert.assertEquals("Dashboard Open File Performance section title",
//				openFilePerformanceTitle,
//				SharedDriver.dashboardPage.getDashboardPerfOpenFilePerfHeader());
		Assert.assertTrue("Dashboard Open File Performance section title", 
				SharedDriver.dashboardPage.getDashboardPerfOpenFilePerfHeader().contains(openFilePerformanceTitle));
	}

	/**
	 * Capacity tests
	 */
	@Then("^Capacity should load$")
	public void dashboardCapacitySectionShouldLoad() {
		Assert.assertTrue("Dashboard Capacity section loaded",
				SharedDriver.dashboardPage.isDashboardCapacitySectionLoaded());
	}

	@Then("^Capacity section title should be \"([^\"]*)\"$")
	public void dashboardCapacitySectionTitle(String capacitySectionTitle) {
		Assert.assertEquals("Dashboard Capacity section title",
				capacitySectionTitle,
				SharedDriver.dashboardPage.getDashboardCapacityHeaderName());
	}

	@Then("^Storage section load$")
	public void dashboardStorageSectionShouldLoad() {
		Assert.assertTrue("Dashboard Storage section loaded",
				SharedDriver.dashboardPage.isDashboardCapacitySectionStorageLoaded());
	}

	@Then("^Storage section title should be \"([^\"]*)\"$")
	public void dashboardStorageSectionTitle(String storageTitle) {
		Assert.assertEquals("Dashboard Storage section title", storageTitle,
				SharedDriver.dashboardPage.getCapacitySectionStorageHeaderName());
	}

	@Then("^Total section load$")
	public void dashboardTotalSectionShouldLoad() {
		Assert.assertTrue("Dashboard Total section loaded",
				SharedDriver.dashboardPage.isCapacitySectionTotalLoaded());
	}

	@Then("^Total section title should be \"([^\"]*)\"$")
	public void dashboardTotalSectionTitle(String totalTitle) {
		Assert.assertEquals("Dashboard Total section title", totalTitle,
				SharedDriver.dashboardPage.getCapacityTotalHeaderName());
	}

	@Then("^Growth section load$")
	public void dashboardGrowthSectionShouldLoad() {
		Assert.assertTrue("Dashboard Growth section loaded",
				SharedDriver.dashboardPage.isDashboardCapacitySectionGrowthLoaded());
	}

	@Then("^Growth section title should be \"([^\"]*)\"$")
	public void dashboardGrowthSectionTitle(String growthTitle) {
		Assert.assertEquals("Dashboard Growth section title", growthTitle,
				SharedDriver.dashboardPage.getCapacityGrowthHeaderName());
	}

	@Then("^Cap section load$")
	public void dashboardCapSectionShouldLoad() {
		Assert.assertTrue("Dashboard Capacity's Capacity section loaded",
				SharedDriver.dashboardPage.isDashboardCapacitySectionCapacityLoaded());
	}

	@Then("^Cap section title should be \"([^\"]*)\"$")
	public void dashboardCapSectionTitle(String capacityTitle) {
		Assert.assertEquals("Dashboard Capacity's Capacity section title",
				capacityTitle,
				SharedDriver.dashboardPage.getCapacitySectionCapactityHeader());
	}

	/**
	 * Alignment tests
	 */
	@Then("^Alignment section load$")
	public void dashboardAlignmentSectionShouldLoad() {
		System.out.println("DashboardStepDefinitions [Line no: 159] " + SharedDriver.dashboardPage);
		Assert.assertTrue("Dashboard Alignment section loaded",
				SharedDriver.dashboardPage.isDashboardAlignmentSectionLoaded());
	}

	@Then("^Alignment section title should be \"([^\"]*)\"$")
	public void dashboardAlignmentSectionTitle(String alignmentSectionTitle) {
		Assert.assertEquals("Dashboard Alignment section title",
				alignmentSectionTitle,
				SharedDriver.dashboardPage.getDashboardAlignmentSectionHeader());
	}

	@Then("^Volume Exceeding Thresholds section load$")
	public void dashboardVolumeExceedingThresholdsSectionShouldLoad() {
		Assert.assertTrue(
				"Dashboard Volume Exceeding Thresholds section loaded",
				SharedDriver.dashboardPage.isDashboardAlignmentVolExceedingThresholdLoaded());
	}

	@Then("^Volume Exceeding Thresholds section title should be \"([^\"]*)\"$")
	public void dashboardVolumeExceedingThresholdsSectionTitle(
			String volumeExceedingThresholdsTitle) {
		Assert.assertEquals(
				"Dashboard Volume Exceeding Thresholds section title",
				volumeExceedingThresholdsTitle, SharedDriver.dashboardPage
						.getDashboardAlignmentVolExceedingThresholdHeader());
	}

	@Then("^Mobility Bandwidth section load$")
	public void dashboardMobilityBandwidthSectionShouldLoad() {
		Assert.assertTrue("Dashboard Mobility Bandwidth section loaded",
				SharedDriver.dashboardPage.isDashboardAlignmentMobilityBandwidthLoaded());
	}

	@Then("^Mobility Bandwidth section title should be \"([^\"]*)\"$")
	public void dashboardMobilityBandwidthSectionTitle(
			String mobilityBandwidthTitle) {
		Assert.assertEquals("Dashboard Mobility Bandwidth section title",
				mobilityBandwidthTitle,
				SharedDriver.dashboardPage.getDashboardAlignmentMobilityBandwidthHeader());
	}

	@Then("^File Alignment section load$")
	public void dashboardFileAlignmentSectionShouldLoad() {
		Assert.assertTrue("Dashboard File Alignment section loaded",
				SharedDriver.dashboardPage.isDashboardAlignmentFileAlignmentLoaded());
	}

	@Then("^File Alignment section title should be \"([^\"]*)\"$")
	public void dashboardFileAlignmentSectionTitle(String fileAlignmentTitle) {
		Assert.assertEquals("Dashboard File Alignment section title",
				fileAlignmentTitle,
				SharedDriver.dashboardPage.getDashboardAlignmentFileAlignmentHeader());
	}

	@Then("^Current Mobility Reasons section load$")
	public void dashboardCurrentMobilityReasonsSectionShouldLoad() {
		Assert.assertTrue("Dashboard Current Mobility Reasons section loaded",
				SharedDriver.dashboardPage.isDashboardCapacitySectionCapacityLoaded());
	}

	@Then("^Current Mobility Reasons section title should be \"([^\"]*)\"$")
	public void dashboardCurrentMobilityReasonsSectionTitle(
			String currentMobilityReasons) {
		Assert.assertEquals("Dashboard Current Mobility Reasons section title",
				currentMobilityReasons,
				SharedDriver.dashboardPage.getCapacitySectionCapactityHeader());
	}
}
