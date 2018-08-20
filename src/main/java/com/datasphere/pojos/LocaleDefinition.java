package com.datasphere.pojos;

import static com.datasphere.pojos.JsonWebElement.ATTRIBUTE_IS_MISSING;
import static com.datasphere.pojos.JsonWebElement.MandatoryKeys.LOCATOR;
import static com.datasphere.pojos.JsonWebElement.MandatoryKeys.NAME;
import static com.google.common.base.Preconditions.checkArgument;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;

import com.datasphere.internal.locators.ByStrategy;
import com.datasphere.internal.locators.StrategyTraits;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class LocaleDefinition {

	private String locale;
	private String locator;
    private By locationStrategy;

    private LocaleDefinition() {

    }

    static List<LocaleDefinition> newDefinition(JsonArray json) {
        List<LocaleDefinition> definitionList = Lists.newArrayList();
        Iterator<JsonElement> iterator = json.iterator();
        while (iterator.hasNext()) {
            JsonObject locale = iterator.next().getAsJsonObject();
            ensureMandatoryKeysArePresent(locale);
            LocaleDefinition definition = new LocaleDefinition();
            definition.locale = locale.get(NAME).getAsString();
            String locator = locale.get(LOCATOR).getAsString();
            definition.locator = locator;
            StrategyTraits traits = ByStrategy.identifyStrategy(locator);
            definition.locationStrategy = traits.getStrategy(locator);
            definitionList.add(definition);
        }
        return definitionList;
    }

    String getLocator() {
    	return locator;
    }
    
    By getLocationStrategy() {
        return locationStrategy;
    }

    String getLocale() {
        return locale;
    }

    private static void ensureMandatoryKeysArePresent(JsonObject json) {
        checkArgument(json.has(NAME), NAME + ATTRIBUTE_IS_MISSING);
        checkArgument(json.has(LOCATOR), LOCATOR + ATTRIBUTE_IS_MISSING);
    }

}
