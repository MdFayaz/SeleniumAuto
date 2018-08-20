package com.datasphere.webelements;

import org.openqa.selenium.WebElement;

/**
 * A wrapper class that represents the html textfield elements.
 */
public final class TextField extends GenericWebElement {

    TextField(WebElement underlyingElement) {
        super(underlyingElement);
    }

    /**
     * Helps clear the contents of the current text field.
     */
    public void clear() {
        getUnderlyingElement().clear();
    }

    /**
     * @return - <code>true</code> if the current text field is editable.
     */
    public boolean canType() {
        return getUnderlyingElement().isEnabled();
    }

    /**
     * @return - returns the contents of the text field as a string.
     */
    public String getText() {
        String text = getUnderlyingElement().getText();
        if (text.isEmpty()) {
            text = getUnderlyingElement().getAttribute("value");
        }
        return text.trim();
    }
    
    /**
     * @return - returns the contents of the text field as a string.
     */
    public String getAttribute(String placeholder) {
        String text = getUnderlyingElement().getAttribute(placeholder);
        return text.trim();
    }

    /**
     * @param text - The string that needs to be typed on the text field.
     */
    public void type(String text) {
    	getUnderlyingElement().click();
        getUnderlyingElement().sendKeys(text);
    }
    
    /**
     * @param text - Clears the content on text field before typing the string
     */
    public void clearAndType(String text) {
    	clear();
    	type(text);
    }

}
