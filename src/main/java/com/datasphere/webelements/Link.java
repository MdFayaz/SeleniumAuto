package com.datasphere.webelements;

import org.openqa.selenium.WebElement;

/**
 * A wrapper class that represents the html link elements.
 */
public final class Link extends GenericWebElement {

    Link(WebElement underlyingElement) {
        super(underlyingElement);
    }
}
