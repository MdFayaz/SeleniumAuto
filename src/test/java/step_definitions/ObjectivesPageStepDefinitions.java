package step_definitions;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ObjectivesPageStepDefinitions {

	@When("^Click on Create Objective Button$")
	public void clickOnCreateObjectiveButton() {
		SharedDriver.objectivesPage.clickOnCreateObjectiveButton();
	}
	
	@Given("^Enter Objective Name \"([^\"]*)\"$")
	public void createObjectiveWithName(String objectiveName) {
		SharedDriver.objectivesPage.setObjectiveName(objectiveName);
	}
	
	@And("^Create new objective title should display$")
	public void createNewObjectiveHeader() {
		Assert.assertTrue("", SharedDriver.objectivesPage
				.isNameTabCreateNewObjectiveTitleDisplayed());
		Assert.assertEquals("Create New Objective - Name tab - title",
				SharedDriver.objectivesPage.getCreateNewObjectiveExpectedTitle(),
				SharedDriver.objectivesPage.getCreateNewObjectiveActualTitle());
	}
	
	@And("^Name tab instruction should display$")
	public void createNewObjectiveTitleDisplay() {
		Assert.assertTrue("", SharedDriver.objectivesPage
				.isNameTabCreateNewObjectiveInstructionDisplayed());
		Assert.assertEquals("Create New Objective - Name tab - instruction",
				SharedDriver.objectivesPage
						.getCreateNewObjectiveExpectedInstruction(),
				SharedDriver.objectivesPage
						.getCreateNewObjectiveActualInstruction());
	}
	
	@And("^Name tab Select label should display$")
	public void createNewObjectiveSelectLabelDisplay() {
		Assert.assertTrue("Name tab 'Select' label should display",
				SharedDriver.objectivesPage.isNameTabCreateNewObjectiveLabelSelectDisplayed());
	}
	
	@And("^Name tab Name label should display$")
	public void createNewObjectiveNameLabelDisplay() {
		Assert.assertTrue("Name tab 'Name' label should display",
				SharedDriver.objectivesPage.isNameTabCreateNewObjectiveLabelNameDisplayed());
	}
	
	@And("^Name tab Description label should display$")
	public void createNewObjectiveDescriptionLabelDisplay() {
		Assert.assertTrue("Name tab 'Description' label should display",
				SharedDriver.objectivesPage.isNameTabCreateNewObjectiveLabelDescriptionDisplayed());
	}
	
	@And("^Name tab Choose Existing label should not display$")
	public void createNewObjectiveInstructionNotDisplay() {
		Assert.assertFalse("Name tab 'Choose Existing' label should not display",
				SharedDriver.objectivesPage.isNameTabCreateNewObjectiveLabelChooseExistingDisplayed());
	}
	
	@And("^Select Create New radio button$")
	public void selectNewObjectiveRadioButton() {
		SharedDriver.objectivesPage.clickOnNameTabCreateNewRadioButton();
	}
	
	@And("^Select Copy and Edit Existing radio button$")
	public void selectCopyAndEditExistingRadioButton() {
		SharedDriver.objectivesPage.clickOnNameTabCreateNewCopyRadioButton();
	}
	
	@And("^Name tab Choose Existing label should display$")
	public void createNewObjectiveInstructionDisplay() {
		Assert.assertTrue("Name tab 'Choose Existing' label should display",
				SharedDriver.objectivesPage.isNameTabCreateNewObjectiveLabelChooseExistingDisplayed());
	}

	@Given("^Enter Objective Description \"([^\"]*)\"$")
	public void createObjectiveWithDescription(String objectiveDescription) {
		SharedDriver.objectivesPage.setObjectiveDescription(objectiveDescription);
	}

	@When("^Click on Name tab Next Step button$")
	public void clickOnNameTabNextStepButton() {
		SharedDriver.objectivesPage.clickOnNameTabNextStepButton();
	}
	

	/**
	 * Define Rules tab
	 * 
	 * @param attributeValue
	 */
	@When("^Select If attribute as \"([^\"]*)\"$")
	public void selectIfAttributeAs(String attributeValue) {
		SharedDriver.objectivesPage.selectIfAttribute(attributeValue);
	}

	@And("^Select If comparator \"([^\"]*)\"$")
	public void selectIfComparator(String compartorValue) {
		SharedDriver.objectivesPage.selectIfComparatorAttribute(compartorValue);
	}

	@And("^Enter if attribute value \"([^\"]*)\"$")
	public void setIfAttribute(String attributeInput) {
		SharedDriver.objectivesPage.ifStatementTextField(attributeInput);
	}
	
	@And("^Click on Add Statement button$")
	public void clickOnAddStatementButton() {
		SharedDriver.objectivesPage.clickOnAddStatementButton();
	}
	
	@And("^Define rules basic view should display$")
	public void basicViewShouldDisplay() {
		Assert.assertTrue("Define rules basic view display",
				SharedDriver.objectivesPage.isDefineRulesBasicViewDisplayed());
	}
	
	@And("^Basic button should display$")
	public void defineRulesBasicButtonShouldDisplay() {
		Assert.assertTrue("Define rules basic button display",
				SharedDriver.objectivesPage.isDefineRulesHeaderDisplayed());
	}
	
	@When("^Click on Basic button$")
	public void clickOnDefineRulesBasicButton() {
		SharedDriver.objectivesPage.clickOnBasicButton();
	}
	
	@And("^Define rules header should display$")
	public void defineRulesHeaderShouldDisplay() {
		Assert.assertTrue("Define rules header should display",
				SharedDriver.objectivesPage.isDefineRulesHeaderDisplayed());
	}
	
	@And("^If section should display$")
	public void defineRuleIfSectionShouldDisplay() {
		Assert.assertTrue("Define rule If section should display",
				SharedDriver.objectivesPage.isDefineRulesIfSectionDisplayed());
	}
	
	@And("^Activity Range section should display$")
	public void defineRuleActivityRangeSectionShouldDisplay() {
		Assert.assertTrue("Define rule Activity Range should display",
				SharedDriver.objectivesPage.isDefineRulesActivityRangeDisplayed());
	}
	
	@And("^Additional Rules button should display$")
	public void defineRuleAdditionalRulesButtonShouldDisplay() {
		Assert.assertTrue("Define rules Define Additional Rules button display",
				SharedDriver.objectivesPage.isDefineRulesAdditionalRulesButtonDisplayed());
	} 
	
	@And("^Advanced button should display$")
	public void defineRuleAdvancedButtonShouldDisplay() {
		Assert.assertTrue("Define rules Advanced button display",
				SharedDriver.objectivesPage.isDefineRulesAdvancedButtonDisplayed());
	}
	
	@When("^Click on Advanced button$")
	public void clickOnDefineRulesAdvancedButton() {
		SharedDriver.objectivesPage.clickOnAdvancedButton();
	}
	
	@And("^Advanced view should display$")
	public void defineRulesAdvancedViewShouldDisplay() {
		Assert.assertTrue("Define rules Advanced view should display",
				SharedDriver.objectivesPage.isDefineRulesAdvancedViewDisplayed());
	}

	@And("^Advanced view instruction should display$")
	public void defineRulesAdvancedRuleInstructionShouldDisplay() {
		Assert.assertTrue("Define rules Advanced instruction should display",
				SharedDriver.objectivesPage.isDefineRulesAdvancedViewInstructionDisplayed());
	}
	
	@And("^Advanced view text area should display$")
	public void defineRulesAdvancedRuleTextareaShouldDisplay() {
		Assert.assertTrue("Advanced text area should display",
				SharedDriver.objectivesPage.isDefineRulesAdvancedTextAreaDisplayed());
	}
	
	@And("^Advanced view text area error should display$")
	public void defineRulesAdvancedRuleTextareaErrorShouldDisplay() {
		Assert.assertTrue("Advanced view text area error should display",
				SharedDriver.objectivesPage.isDefineRulesAdvancedTextAreaErrorDisplayed());
	} 
	
	@And("^Advanced view Cancel and Revert to Basic Editor should display$")
	public void defineRulesAdvancedViewCancelAndRevertButtonShouldDisplay() {
		Assert.assertTrue("Advanced view Cancel and Revert to Basic Editor button display",
				SharedDriver.objectivesPage.isDefineRulesAdvancedToBasicSwitchButtonDisplayed());
	}
	
	@When("^Click on Cancel and Revert to Basic Editor button$")
	public void clickOnAdvancedToBasicSwitchButtonDisplayed() {
		SharedDriver.objectivesPage.clickOnAdvancedToBasicSwitchButtonDisplayed();
	}
	
	@Then("^If statement is added$")
	public void addedIfStatement() {
		Assert.assertTrue("If Statements added",
				SharedDriver.objectivesPage.isIfStatementsAdded());
	}
	
	@And("^Add activity range button should display$")
	public void addActivityRangeButtonDisplay() {
		Assert.assertTrue("Add activity range button display",
				SharedDriver.objectivesPage.isAddRangeButtonDisplayed());
	}
	
	@When("^Click on Add Activity Range$")
	public void clickOnAddActivityRangeButton() {
		SharedDriver.objectivesPage.clickOnAddRangeButton();
	}
	
	@When("^Remove a tier \"([^\"]*)\"$")
	public void removeAActivityTier(String tierNameToRemove) {
		SharedDriver.objectivesPage.removeTier(tierNameToRemove);
	}
	
	//TODO: 12/07 remove the following code based on comments PD-34738
	/*@And("^Add first activity range with lowerbound \"([^\"]*)\" and assigned tier \"([^\"]*)\"$")
	public void setFirstLowerBoundWithTierValue(String lowerBoundValue) {
		SharedDriver.objectivesPage.setLowerBound(lowerBoundValue);
	}
	
	@And("^Add first activity range with assigned tier \"([^\"]*)\"$")
	public void setFirstUpperBoundWithTierValue(String tierName) {
		SharedDriver.objectivesPage.setUpperBound(tierName);
	}
	
	@And("^Add new activity range with lowerbound \"([^\"]*)\" and upper bound \"([^\"]*)\" with assigned tier \"([^\"]*)\"$")
	public void setNewActivityRange(String lowerBound, String upperBound, String tierName) {
		SharedDriver.objectivesPage.clickOnAddRangeButton();
		SharedDriver.objectivesPage.addRanges(lowerBound, upperBound, tierName);
	}*/
	
	@And("^Set activity tier value to \"([^\"]*)\"$")
	public void setActivityTierValueTo(String activityTier) {
		SharedDriver.objectivesPage.selectTier(activityTier);
	}
	
	@When("^Click on Define Rules tab Next Step button$")
	public void clickOnDefineRulesNextStepButton() {
		SharedDriver.objectivesPage.clickOnDefineRulesTabNextStep();
	}
	
	/**
	 * Review tab
	 */
	@And("^Review tab section display$")
	public void reviewTabViewShouldLoad() {
		Assert.assertTrue("Review tab view section loaded",
				SharedDriver.objectivesPage.isReviewTabSectionDisplayed());
	}
	
	@And("^Review tab Name section display$")
	public void reviewTabNameSectionShouldLoad() {
		Assert.assertTrue("Review tab Name section loaded",
				SharedDriver.objectivesPage.isReviewTabNameSectionDisplayed());
	}
	
	@And("^Review tab Name edit icon display$")
	public void reviewTabNameEditShouldDisplay() {
		Assert.assertTrue("Review tab Name edit icon display",
				SharedDriver.objectivesPage.isReviewTabNameSectionEditIconDisplayed());
	}
	
	@And("^Review tab Description section display$")
	public void reviewTabDescriptionShouldLoad() {
		Assert.assertTrue("Review tab description section loaded",
				SharedDriver.objectivesPage.isReviewTabDescriptionSectionDisplayed());
	}
	
	@And("^Review tab Description edit icon display$")
	public void reviewTabDescriptionEditShouldDisplay() {
		Assert.assertTrue("Review tab description edit icon display",
				SharedDriver.objectivesPage.isReviewTabDescriptionSectionEditIconDisplayed());
	}
	
	@And("^Review tab Rules section display$")
	public void reviewTabRulesShouldLoad() {
		Assert.assertTrue("Review tab rules section loaded",
				SharedDriver.objectivesPage.isReviewTabRulesSectionDisplayed());
	}
	
	@And("^Review tab Rules edit icon display$")
	public void reviewTabRulesEditIconShouldDisplay() {
		Assert.assertTrue("Review tab rules edit icon display",
				SharedDriver.objectivesPage.isReviewTabRulesSectionEditIconDisplayed());
	}
	
	@And("^Review tab Rules delete icon display$")
	public void reviewTabRulesDeleteIconShouldDisplay() {
		Assert.assertTrue("Review tab rules delete icon display",
				SharedDriver.objectivesPage.isReviewTabRulesSectionDeleteIconDisplayed());
	}
	
	@And("^Review tab Cancel Objective button display$")
	public void reviewTabCancelButtonDisplay() {
		Assert.assertTrue("Review tab cancel button display",
				SharedDriver.objectivesPage.isReviewTabCancelButtonDisplayed());
	}
	
	@When("^Click on Review tab Save Objective button$")
	public void clickOnReviewTabSaveButton() {
		SharedDriver.objectivesPage.clickOnSaveObjectiveButton();
	}
	
	@When("^Click on Review tab Cancel Objective button$")
	public void clickOnReviewTabCancelButton() {
		SharedDriver.objectivesPage.clickOnCancelObjectiveButton();
	}
	
}
