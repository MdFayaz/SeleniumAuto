package com.datasphere.webelements;

import org.openqa.selenium.WebElement;

public class Popover extends GenericWebElement {

	Popover(WebElement underlyingElement) {
		super(underlyingElement);
	}
	
	/**
     * Helps to close the pop over.
     */
	public void closePopver() {
		getUnderlyingElement().click();
	}

}
