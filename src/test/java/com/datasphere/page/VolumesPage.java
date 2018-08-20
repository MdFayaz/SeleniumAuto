package com.datasphere.page;

import org.openqa.selenium.WebDriver;

import com.datasphere.page.constants.VolumesPageConstants;
import com.datasphere.webelements.PageObject;

public class VolumesPage extends InfrastructureAndDataPage {

	WebDriver webDriver;
	PageObject volumesPage;
	
	public VolumesPage(WebDriver driver) {
		super(driver);
		volumesPage = new PageObject(driver,
				"src/test/resources/VolumesPageLocators.json");
	}
	
	public void clickOnAddVolumesButton() {
		System.out.println("Clicking Add Volumes Button");
		volumesPage.getButton(VolumesPageConstants.ADD_VOLUMES_BUTTON).click();
	}
	
	public void clickOnBrowseVolumesButton() {
		volumesPage.getButton(VolumesPageConstants.VOLUMES_BROWSE_BUTTON).click();
		waitUntilTimeout(3);
		waitUntilPageDataLoads("Browing volumes. Waiting until volumes load...");
	}
}
