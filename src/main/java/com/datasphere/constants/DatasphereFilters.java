package com.datasphere.constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public enum DatasphereFilters {


	STORAGE_SYSTEM_EVENT(".NODE", ".title", ".count"), STORAGE_SYSTEM_TASK(
			".impactingType"), VOLUME_GROUP_EVENT(".VOLUME_GROUP", ".title",
			".count"), VOLUME_GROUP_TASK(".impactingType"), VOLUME_EVENT(
			".STORAGE_VOLUME", ".title", ".count"), VOLUME_TASK(
			".impactingType"), SHARE_EVENT(".SHARE", ".title", ".count"), SHARE_TASK(
			".impactingType"), CRITICAL(".CRITICAL", ".title", ".count"), WARNING(
			".WARNING", ".title", ".count"), INFORMATIONAL(".INFORMATIONAL",
			".title", ".count"), USER(
			"//*[@class='userType check-box']//*[contains(@class, 'checked')]");

	private String checkboxLocator;
	private final String titleLocator;
	private final String countLocator;
	private static String CHECKBOX_LOCATOR = " .checked";
	private static String USER_CHECKBOX_LOCATOR = "//*[@class='userType check-box']//*[contains(@class, 'uncheck')]";

	private DatasphereFilters(String locator) {
		this(locator, ".title", ".count");
	}

	private DatasphereFilters(String locator, String title, String count) {
		checkboxLocator = locator;
		titleLocator = title;
		countLocator = count;
	}

	public WebElement getStorageSystemCheckbox(WebElement element,
			boolean isUnChecked) {
		if (isUnChecked) {
			CHECKBOX_LOCATOR = " .uncheck";
		}
		return element.findElement(By.cssSelector(getCheckboxLocator()
				+ CHECKBOX_LOCATOR));
	}

	public String getStroageSystemName(WebElement element) {
		return element.findElement(By.cssSelector(getTitleLocator())).getText();
	}

	public String getStroageSystemCount(WebElement element) {
		return element.findElement(By.cssSelector(getCountLocator())).getText();
	}

	public WebElement getVolumeGroupCheckbox(WebElement element,
			boolean isUnChecked) {
		if (isUnChecked) {
			CHECKBOX_LOCATOR = " .uncheck";
		}
		return element.findElement(By.cssSelector(getCheckboxLocator()
				+ CHECKBOX_LOCATOR));
	}

	public String getVolumeGroupName(WebElement element) {
		return element.findElement(By.cssSelector(getTitleLocator())).getText();
	}

	public String getVolumeGroupCount(WebElement element) {
		return element.findElement(By.cssSelector(getCountLocator())).getText();
	}

	public WebElement getVolumeCheckbox(WebElement element, boolean isUnChecked) {
		if (isUnChecked) {
			CHECKBOX_LOCATOR = " .uncheck";
		}
		return element.findElement(By.cssSelector(getCheckboxLocator()
				+ CHECKBOX_LOCATOR));
	}

	public String getVolumeName(WebElement element) {
		return element.findElement(By.cssSelector(getTitleLocator())).getText();
	}

	public String getVolumeCount(WebElement element) {
		return element.findElement(By.cssSelector(getCountLocator())).getText();
	}

	public WebElement getShareCheckbox(WebElement element, boolean isUnChecked) {
		if (isUnChecked) {
			CHECKBOX_LOCATOR = " .uncheck";
		}
		return element.findElement(By.cssSelector(getCheckboxLocator()
				+ CHECKBOX_LOCATOR));
	}

	public String getShareName(WebElement element) {
		return element.findElement(By.cssSelector(getTitleLocator())).getText();
	}

	public String getShareCount(WebElement element) {
		return element.findElement(By.cssSelector(getCountLocator())).getText();
	}

	public WebElement getCriticalCheckbox(WebElement element,
			boolean isUnChecked) {
		if (isUnChecked) {
			CHECKBOX_LOCATOR = " .uncheck";
		}
		return element.findElement(By.cssSelector(getCheckboxLocator()
				+ CHECKBOX_LOCATOR));
	}

	public String getCriticalName(WebElement element) {
		return element.findElement(By.cssSelector(getTitleLocator())).getText();
	}

	public String getCriticalCount(WebElement element) {
		return element.findElement(By.cssSelector(getCountLocator())).getText();
	}

	public WebElement getWarningCheckbox(WebElement element, boolean isUnChecked) {
		if (isUnChecked) {
			CHECKBOX_LOCATOR = " .uncheck";
		}
		return element.findElement(By.cssSelector(getCheckboxLocator()
				+ CHECKBOX_LOCATOR));
	}

	public String getWarningName(WebElement element) {
		return element.findElement(By.cssSelector(getTitleLocator())).getText();
	}

	public String getWarningCount(WebElement element) {
		return element.findElement(By.cssSelector(getCountLocator())).getText();
	}

	public WebElement getInformationalCheckbox(WebElement element,
			boolean isUnChecked) {
		if (isUnChecked) {
			CHECKBOX_LOCATOR = " .uncheck";
		}
		return element.findElement(By.cssSelector(getCheckboxLocator()
				+ CHECKBOX_LOCATOR));
	}

	public String getInformationalName(WebElement element) {
		return element.findElement(By.cssSelector(getTitleLocator())).getText();
	}

	public String getInformationalCount(WebElement element) {
		return element.findElement(By.cssSelector(getCountLocator())).getText();
	}

	public WebElement getUserAdminCheckbox(WebElement element,
			boolean isChecked) {
		if (!isChecked) {
			checkboxLocator = USER_CHECKBOX_LOCATOR;
		}
		return element.findElement(By.xpath(getCheckboxLocator()));
	}

	public String getCheckboxLocator() {
		return checkboxLocator;
	}

	public String getTitleLocator() {
		return titleLocator;
	}

	public String getCountLocator() {
		return countLocator;
	}
}
