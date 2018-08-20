package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.datasphere.page.InfrastructureAndDataPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class InfrastructureAndDataStepDefinitions {

	WebDriver driver = SharedDriver.getDriver();
	InfrastructureAndDataPage iadp = SharedDriver.infrastructureAndDataPage;

	@Then("^Select Managed Objects \"([^\"]*)\" tab$")
	public void selectInfrastructureAndDataTab(String tabName) {
		SharedDriver.infrastructureAndDataPage.switchToTab(tabName);
	}

	@Then("^Add Volume Popover should display")
	public void validateVolumePopover() {
		Assert.assertTrue("Storage Systems - Add volumes popover displayed",
				SharedDriver.infrastructureAndDataPage.addVolumesPopoverDisplay());
	}
	
	/**
	 * While adding volumes from Stroage System tab or from Volumes tab, We need
	 * to search for storage system in Add Volume popover, thus this a common
	 * method
	 * 
	 * @param storageSystemName
	 */
	@And("^Search for Storage System \"([^\"]*)\"$")
	public void selectStorageSystemsTab(String storageSystemName) {
		SharedDriver.infrastructureAndDataPage
				.searchStorageSystem(storageSystemName);
	}
}
