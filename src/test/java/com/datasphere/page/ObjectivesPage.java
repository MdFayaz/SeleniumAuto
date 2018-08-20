package com.datasphere.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.datasphere.page.constants.ObjectivesPageConstants;
import com.datasphere.webelements.Button;
import com.datasphere.webelements.Form;
import com.datasphere.webelements.GenericWebElement;
import com.datasphere.webelements.PageObject;
import com.datasphere.webelements.TextField;

public class ObjectivesPage extends ObjectivesAndTiersPage {

	WebDriver driver;
	PageObject objectivesPage;
	
	public ObjectivesPage(WebDriver driver) {
		super(driver);
		this.driver  = driver;
		objectivesPage = new PageObject(driver,
				"src/test/resources/ObjectivesPageLocators.json");
	}
	
	public void clickOnCreateObjectiveButton() {
		objectivesPage.getButton(
				ObjectivesPageConstants.CREATE_OBJECTIVE_BUTTON).click();
	}
	
	/**
	 * Name tab
	 */
	public void clickOnNameTabCreateNewRadioButton() {
		objectivesPage.getButton(ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_RADIO_BUTTON).click();
	}
	
	public boolean isNameTabCreateNewObjectiveTitleDisplayed() {
		return objectivesPage.getButton(ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_TITLE).isDisplayed();
	}
	
	public String getCreateNewObjectiveExpectedTitle() {
		return objectivesPage.getExpectedData(ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_TITLE).trim();
	}
	
	public String getCreateNewObjectiveActualTitle() {
		return objectivesPage
				.getLabel(ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_TITLE)
				.getText();
	}
	
	public boolean isNameTabCreateNewObjectiveInstructionDisplayed() {
		return objectivesPage.getLabel(ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_INSTRUCTION).isDisplayed();
	}
	
	public String getCreateNewObjectiveExpectedInstruction() {
		return objectivesPage.getExpectedData("CreateNewObjectiveInstruction").trim();
	}
	
	public String getCreateNewObjectiveActualInstruction() {
		return objectivesPage
				.getLabel(ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_INSTRUCTION)
				.getText();
	}
	
	public boolean isNameTabCreateNewObjectiveLabelSelectDisplayed() {
		return objectivesPage.getLabel(ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_LABEL_SELECT).isDisplayed();
	}
	
	public boolean isNameTabCreateNewObjectiveLabelNameDisplayed() {
		return objectivesPage.getLabel(ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_LABEL_NAME).isDisplayed();
	}
	
	public boolean isNameTabCreateNewObjectiveLabelDescriptionDisplayed() {
		return objectivesPage.getLabel(ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_LABEL_DESCRIPTION).isDisplayed();
	}
	
	public void clickOnNameTabCreateNewCopyRadioButton() {
		objectivesPage.getButton(ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_COPY_RADIO_BUTTON).click();
		waitUntilTimeout(2);
	}
	
	public boolean isNameTabCreateNewObjectiveLabelChooseExistingDisplayed() {
		return objectivesPage.getLabel(ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_LABEL_CHOOSE_EXISTING).isDisplayed();
	}

	public void setObjectiveName(String value) {
		objectivesPage.getTextField(ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_NAME).type(value);
	}
	
	public void setObjectiveDescription(String value) {
		objectivesPage.getTextField(ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DESCRIPTION).type(value);
	}
	
	public void clickOnNameTabNextStepButton() {
		objectivesPage.getButton(ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_NAME_TAB_NEXT_BUTTON).click();
	}
	
	/**
	 * Define Rules tab
	 * 
	 * @param value
	 */
	public boolean isDefineRulesBasicViewDisplayed() {
		return objectivesPage
				.getForm(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_BASIC_VIEW)
				.isDisplayed();
	}
	
	public boolean isDefineRulesBasicButtonDisplayed() {
		return objectivesPage
				.getButton(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_BASIC_BUTTON)
				.isDisplayed();
	}
	
	public void clickOnBasicButton() {
		 objectivesPage
			.getButton(
					ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_BASIC_BUTTON)
			.click();
		 waitUntilTimeout(3);
	}
	
	public boolean isDefineRulesHeaderDisplayed() {
		return objectivesPage
				.getForm(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_TAB_HEADER)
				.isDisplayed();
	}
	
	public boolean isDefineRulesIfSectionDisplayed() {
		return objectivesPage
				.getForm(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_TAB_IF_STATEMENT_SECTION)
				.isDisplayed();
	}
	
	public boolean isDefineRulesActivityRangeDisplayed() {
		return objectivesPage
				.getForm(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_TAB_ADDED_ACTIVITY_RANGE_SECTION)
				.isDisplayed();
	}
	
	public boolean isDefineRulesAdditionalRulesButtonDisplayed() {
		return objectivesPage
				.getButton(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_TAB_DEFINE_ADDITIONAL_RULES_BUTTON)
				.isDisplayed();
	}
	
	public boolean isDefineRulesAdvancedButtonDisplayed() {
		return objectivesPage
				.getButton(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_ADVANCED_BUTTON)
				.isDisplayed();
	}
	
	public void clickOnAdvancedButton() {
		 objectivesPage
			.getButton(
					ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_ADVANCED_BUTTON)
			.click();
		 waitUntilTimeout(3);
	}
	
	public boolean isDefineRulesAdvancedViewDisplayed() {
		return objectivesPage
				.getLabel(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_ADVANCED_VIEW)
				.isDisplayed();
	}

	public boolean isDefineRulesAdvancedViewInstructionDisplayed() {
		return objectivesPage
				.getLabel(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_TAB_ADVANCED_VIEW_INSTRUCTION)
				.isDisplayed();
	}
	
	public boolean isDefineRulesAdvancedTextAreaDisplayed() {
		return objectivesPage
				.getForm(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_ADVANCED_TEXT_AREA)
				.isDisplayed();
	}
	
	public boolean isDefineRulesAdvancedTextAreaErrorDisplayed() {
		return objectivesPage
				.getForm(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_ADVANCED_TEXT_AREA_ERROR)
				.isDisplayed();
	}
	
	public boolean isDefineRulesAdvancedToBasicSwitchButtonDisplayed() {
		return objectivesPage
				.getButton(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_TAB_ADVANCED_TO_BASIC_REVERT_BUTTON)
				.isDisplayed();
	}
	
	public void clickOnAdvancedToBasicSwitchButtonDisplayed() {
		objectivesPage
				.getButton(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_TAB_ADVANCED_TO_BASIC_REVERT_BUTTON)
				.click();
	}
	
	public void selectIfAttribute(String value) {
		WebElement ifAttributeDropdown = objectivesPage
				.getButton(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_IF_DROPDOWN)
				.getUnderlyingElement(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_IF_DROPDOWN);
		ifAttributeDropdown.click();
		ifAttributeDropdown.findElement(
				By.xpath("//div[contains(text(), '" + value + "')]")).click();
		waitUntilTimeout(3);
	}
	
	public void selectIfComparatorAttribute(String value) {
		//TODO: Generalize later
		/*
		WebElement ifComparatorDropdown = objectivesPage
				.getButton(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_IF_COMPARATOR)
				.getUnderlyingElement();
		ifComparatorDropdown.click();
		WebElement dropdown = ifComparatorDropdown.findElement(
				By.xpath("//div[@data-entity-value='" + value + "']"));
		System.out.println("if dropdown locator: " + dropdown);
		dropdown.click();
	*/}
	
	public void ifStatementTextField(String value) {
		objectivesPage
				.getTextField(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_IF_TEXTFIELD)
				.type(value);
	}
	
	public void clickOnAddStatementButton() {
		objectivesPage
				.getButton(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_IF_ADD_STATEMENT)
				.click();
	}
	
	public boolean isIfStatementsAdded() {
		List<GenericWebElement> listOfAddedStatements = objectivesPage
				.getGenericElements(ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_IF_ADDED_STATEMENTS);
		return (listOfAddedStatements.size() > 0);
	}
	
	public boolean isAddRangeButtonDisplayed() {
		return objectivesPage
				.getForm(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_ADD_A_NEW_RANGE_BUTTON)
				.isDisplayed();
	}
	
	
	public void clickOnAddRangeButton() {
		objectivesPage
				.getButton(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_ADD_A_NEW_RANGE_BUTTON)
				.click();
	}
	
	public void setLowerBound(String value) {
		List<TextField> element = objectivesPage
				.getTextFields(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_ACTIVITY_LOWER_BOUND);
		element.get(0).clearAndType(value);
	}
	
	//TODO: make generalize
	public void setUpperBound(String value) {
		List<TextField> element = objectivesPage
				.getTextFields(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_ACTIVITY_UPPER_BOUND);
		element.get(1).clearAndType(value);
	}
	
	//TODO: make generalize
	public void selectTier(String tierValue) {
		List<Button> buttons = objectivesPage
				.getButtons(ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_ACTIVITY_TIERS);
		WebElement tier = buttons.get(0).getUnderlyingElement("Create Obj - Define Rules - Tier");
		tier.click();
		/*tier.findElement(By.xpath("//div[contains(text() , 'default-objective')]")).click();
		tier.click();*/
		WebElement actualTier = tier.findElement(By.xpath("//div[contains(text(), '" + tierValue + "')]"));
		actualTier.click();
		/*List<WebElement> parent = actualTier.findElements(By.xpath("//parent::div[@class='item']"));
		String data_entity_id = "";
		for(WebElement p : parent) {
			String text = p.getText().trim();
			if(!text.isEmpty() && text.equalsIgnoreCase(tierValue)) {
				 data_entity_id = p.getAttribute("data-entity-id");
				System.out.println("DEI: " + data_entity_id);
				break;
			}
		}
		injectJavascriptValue((JavascriptExecutor)this.driver,
				"root-search placeholder-gray","data-entity-id", data_entity_id);
		waitUntilTimeout(5);
		tier.findElement(By.xpath("//following-sibling::span[contains(@class, 'addon show-tier')]")).click();
		waitUntilPageDataLoads("Creating new objective");*/
	}
	
	public int getActivityRangesCount() {
		List<Form> listOfRanges = objectivesPage
				.getForms(ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_LIST);
		return listOfRanges.size();
	}
	
	public void removeTier(String tierValue) {
		WebElement tier, removeTier = null;
		List<Button> buttons = objectivesPage
				.getButtons(ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_ACTIVITY_TIERS);
		try {
			tier = buttons.get(0).getUnderlyingElement(
					"Create Obj - Define Rules - Tier");
			removeTier = tier.findElement(By.xpath("//span[contains(text(), '"
					+ tierValue + "')]//ancestor::div/button"));
		} catch (Exception e) {
			System.out
					.println("Does the tier selected.? Only selected tiers can be removable.");
		}
		removeTier.click();
	}
	
	public void clickOnDefineRulesTabNextStep() {
		objectivesPage
				.getButton(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_NEXT_STEP_BUTTON)
				.click();
	}
	
	public void addRanges(String lowerBoundValue, String upperBoundValue, String tierValue) {
		List<Form> listOfRanges = objectivesPage
				.getForms(ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_DEFINE_RULES_LIST);
		int rangeLength = listOfRanges.size() - 1;
		for (int index = 1; index < rangeLength; index++) {
			WebElement range = listOfRanges.get(index).getUnderlyingElement();
			WebElement lowerBound = range.findElement(By.xpath("//*[contains(@class, 'choose-min')][" + index + "]"));
			WebElement upperBound = range.findElement(By.xpath("//*[contains(@class, 'choose-max')][" + index + "]"));
			WebElement tier = range.findElement(By.xpath("//*[contains(@class, 'choose-tier')][" + index + "]"));
			tier.click();
			WebElement actualTier = tier.findElement(By.xpath("//div[contains(text(), '"+tierValue+"')]"));
			WebElement tierParentElement = actualTier.findElement(By.xpath("//parent::div[contains(@class, 'item')]"));
			String entityId = tierParentElement.getAttribute("data-entity-id");
			
			
			lowerBound.clear();
			lowerBound.sendKeys(lowerBoundValue);
			
			upperBound.clear();
			upperBound.sendKeys(upperBoundValue);
			
			injectJavascriptValueWithIndex((JavascriptExecutor)this.driver,
					"root-search",index, "data-entity-id", entityId);
			waitUntilTimeout(5);
			
		}
	}
	
	/**
	 * Review tab
	 * @return
	 */
	public boolean isReviewTabSectionDisplayed() {
		return objectivesPage.getForm(
				ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_REVIEW_TAB_VIEW)
				.isDisplayed();
	}
	
	public boolean isReviewTabNameSectionDisplayed() {
		return objectivesPage.getForm(
				ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_REVIEW_TAB_NAME_SECTION)
				.isDisplayed();
	}
	
	public boolean isReviewTabNameSectionEditIconDisplayed() {
		WebElement nameSection = objectivesPage
				.getForm(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_REVIEW_TAB_NAME_SECTION)
				.getUnderlyingElement();
		WebElement nameEditIcon = nameSection.findElement(By.tagName("button"));
		return nameEditIcon.isDisplayed();
	}
	
	public boolean isReviewTabDescriptionSectionDisplayed() {
		return objectivesPage.getForm(
				ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_REVIEW_TAB_DESCRIPTION_SECTION)
				.isDisplayed();
	}
	
	public boolean isReviewTabDescriptionSectionEditIconDisplayed() {
		WebElement descriptionSection = objectivesPage
				.getForm(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_REVIEW_TAB_DESCRIPTION_SECTION)
				.getUnderlyingElement();
		WebElement descriptionEditIcon = descriptionSection.findElement(By.tagName("button"));
		return descriptionEditIcon.isDisplayed();
	}
	
	public boolean isReviewTabRulesSectionDisplayed() {
		return objectivesPage.getForm(
				ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_REVIEW_TAB_RULES_SECTION)
				.isDisplayed();
	}
	
	public boolean isReviewTabRulesSectionEditIconDisplayed() {
		WebElement rulesSection = objectivesPage
				.getForm(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_REVIEW_TAB_RULES_SECTION)
				.getUnderlyingElement();
		WebElement rulesEditIcon = rulesSection.findElement(By.xpath("//button[@class='edit-rule']"));
		return rulesEditIcon.isDisplayed();
	}
	
	public boolean isReviewTabRulesSectionDeleteIconDisplayed() {
		WebElement rulesSection = objectivesPage
				.getForm(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_REVIEW_TAB_RULES_SECTION)
				.getUnderlyingElement();
		WebElement rulesDeleteIcon = rulesSection.findElement(By.xpath("//button[@class='delete-rule']"));
		return rulesDeleteIcon.isDisplayed();
	}
	
	public boolean isReviewTabCancelButtonDisplayed() {
		return objectivesPage.getForm(
				ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_REVIEW_TAB_CANCEL_OBJECTIVE_BUTTON)
				.isDisplayed();
	}
	
	public void clickOnSaveObjectiveButton() {
		objectivesPage
				.getButton(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_REVIEW_TAB_SAVE_OBJECTIVE_BUTTON)
				.click();
		waitUntilTimeout(5);
	}
	
	public void clickOnCancelObjectiveButton() {
		objectivesPage
				.getButton(
						ObjectivesPageConstants.CREATE_NEW_OBJECTIVE_REVIEW_TAB_CANCEL_OBJECTIVE_BUTTON)
				.click();
		waitUntilTimeout(5);
	}
	
}
