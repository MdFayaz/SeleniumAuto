package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class VolumesStepDefinitions {

	@When("^Click on Add Volumes$")
	public void  clickOnAddStorageSystemButton() {
		SharedDriver.volumes.clickOnAddVolumesButton();
	}
	
	@And("^Browse for volumes$")
	public void browseForVolumes() {
		SharedDriver.volumes.clickOnBrowseVolumesButton();
	}
}
