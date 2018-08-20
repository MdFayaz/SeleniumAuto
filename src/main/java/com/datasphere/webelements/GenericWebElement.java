package com.datasphere.webelements;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

/**
 * A wrapper class that represents a generic/custom html elements.
 */
public class GenericWebElement {
    private WebElement underlyingElement;

    GenericWebElement(WebElement underlyingElement) {
        this.underlyingElement = underlyingElement;
    }

    /**
     * @return - The underlying actual Selenium's {@link WebElement}
     */
	public final WebElement getUnderlyingElement() {
		System.out
				.println("Returning underlying element: " + underlyingElement);
		return underlyingElement;
	}
	
	/**
	 * Overloaded method for debugging purpose
	 */
	public final WebElement getUnderlyingElement(String elementName) {
		System.out.println(elementName + "-> underlying element: "
				+ underlyingElement);
		return underlyingElement;
	}

    /**
     * @return - <code>true</code> if the current element is enabled.
     */
	public final boolean isEnabled() {
		boolean isEnabled = false;
		if (getUnderlyingElement() != null) {
			isEnabled = getUnderlyingElement().isEnabled();
		}
		return isEnabled;
	}

    /**
     * @return - <code>true</code> if the current element is displayed.
     */
    public final boolean isDisplayed() {
		boolean isDisplayed = false;
		if (getUnderlyingElement() != null) {
			isDisplayed = getUnderlyingElement().isDisplayed();
		}
		return isDisplayed;
	}
	

    /**
     * @return - <code>true</code> if the current element is selected.
     */
    public final boolean isSelected() {
    	boolean isSelected = false;
    	if (getUnderlyingElement() != null) {
    		isSelected = getUnderlyingElement().isSelected();
		}
		return isSelected;
    }

    /**
     * Helps click the current element.
     */
	public final boolean click() {
		try {
			if (getUnderlyingElement() != null
					&& getUnderlyingElement().isDisplayed()) {
				getUnderlyingElement().click();
				return true;
			}
		} catch (NoSuchElementException nsee) {
			System.out.println("NO SUCH ELEMENT EXCEPTION");
		}
		return false;
	}
	

    public String getAttribute(String attributeName) {
    	return getUnderlyingElement().getAttribute(attributeName);
    }
}
