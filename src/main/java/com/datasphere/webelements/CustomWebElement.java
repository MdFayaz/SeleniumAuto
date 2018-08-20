package com.datasphere.webelements;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import com.datasphere.pojos.JsonWebElement;

final class CustomWebElement {
    private JsonWebElement jsonWebElement;
    private String locale;
    private SearchContext context;
    private Boolean isDisplayed;

    CustomWebElement(SearchContext context, JsonWebElement jsonWebElement, String locale) {
        this.context = context;
        this.jsonWebElement = jsonWebElement;
        this.locale = locale;
    }

	final WebElement getWebElement() {
		WebElement webElement = null;
		try {
			By by = jsonWebElement.getLocationStrategy(locale);
			webElement = context.findElement(by);
			isDisplayed = true;
		} catch (Exception nsee) {
			isDisplayed = false;
		}
		return webElement;
	}

    final List<WebElement> getWebElements() {
        By by = jsonWebElement.getLocationStrategy(locale);
        return context.findElements(by);
    }
    
    final String getExpected() {
    	return jsonWebElement.getExpectedData();
    }
    
    final boolean isDisplayed() {
    	return isDisplayed;
    }
    
    final Map<String, String> getExpectedDataMap() {
    	return jsonWebElement.getExpectedMap();
    }
}
