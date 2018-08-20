package com.datasphere.webelements;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

/**
 * A wrapper class that represents the html image elements.
 */
public final class Image extends GenericWebElement {

    Image(WebElement underlyingElement) {
        super(underlyingElement);
    }

    /**
     * @return - A {@link Dimension} object that represent's the current image's size.
     */
    public Dimension getSize() {
        return getUnderlyingElement().getSize();
    }
}
