package step_definitions;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VolumeGroupsStepDefinitions {


	@When("^Click on Create Volume Group Button$")
	public void  clickOnAddStorageSystemButton() {
		SharedDriver.volumeGroups.clickOnCreateVolumeGroupButton();
	}
	
	@Then("^Create volume group popover should display$")
	public void createAVolumeGroupPopoverShouldDisplay(){
		Assert.assertTrue("Create Vol Group popover displayed", 
				SharedDriver.volumeGroups.isCreateVolGroupPopoverDisplay());
	}
	
	@And("^Create volume group popover title$")
	public void createAVolGroupPopoverTitle() {
		Assert.assertEquals("Create vol group popover title", 
				"Create a Volume Group With Any of the Following Objects",
				SharedDriver.volumeGroups.getCreateVolGroupPopoverTitle());
	}
	
	@Then("^Create volume group name section should display$")
	public void createAVolumeGroupNameSectionShouldDisplay(){
		Assert.assertTrue("Create Vol Group name tab section displayed", 
				SharedDriver.volumeGroups.isCreateVolGroupNameTabSectioDisplayed());
	}
	
	public void enterVolumeGroupName() {
		
	}
	
	public void enterVolumeGroupDescription() {
		
	}
	
	public void clickOnNamesTabNextButton() {
		
	}
}
