package com.datasphere.webelements;

import org.openqa.selenium.WebElement;

public class Form extends GenericWebElement {

    Form(WebElement underlyingElement) {
        super(underlyingElement);
    }

    /**
     * Helps submit a form.
     */
    public void submit() {
        getUnderlyingElement().submit();
    }
}
