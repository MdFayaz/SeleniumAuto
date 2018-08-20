package com.datasphere.webelements;

import org.openqa.selenium.WebElement;

/**
 * A wrapper class that represents the html button elements.
 */
public final class Button extends GenericWebElement {

    Button(WebElement underlyingElement) {
        super(underlyingElement);
    }
}