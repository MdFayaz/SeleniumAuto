package com.datasphere.pojos;

import static com.datasphere.pojos.JsonWebElement.MandatoryKeys.LOCALE;
import static com.datasphere.pojos.JsonWebElement.MandatoryKeys.NAME;
import static com.datasphere.pojos.JsonWebElement.OptionalKeys.EXPECTED_DATA;
import static com.datasphere.pojos.JsonWebElement.OptionalKeys.EXPECTED_DATA_MAP;
import static com.datasphere.pojos.JsonWebElement.OptionalKeys.WAIT;
import static com.datasphere.pojos.JsonWebElement.WaitAttributes.FOR;
import static com.datasphere.pojos.JsonWebElement.WaitAttributes.UNTIL;
import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkState;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

import com.datasphere.internal.locators.Until;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class JsonWebElement {

    private static final String defaultValue = System.getProperty("default.wait.time", "10");
    static final int DEFAULT_WAIT_TIME = Integer.parseInt(defaultValue);
    static final String ATTRIBUTE_IS_MISSING = " attribute is missing.";
    private String name;
    private String expected;
    private String locator;
    private Map<String, By> locationStrategy = Maps.newHashMap();
    private Map<String, String> expectedMap = Maps.newHashMap();
    private Until until;
    private int forSeconds;
    private String defaultLocale;

    String getName() {
        return name;
    }
    
    String getLocator() {
    	return locator;
    }
    
    public String getExpectedData() {
    	return expected;
    }
    
    public Map<String, String> getExpectedMap() {
    	return expectedMap;
    }

    public Until getUntil() {
        return until;
    }

    public int getWaitForSeconds() {
        return forSeconds;
    }

    public By getLocationStrategy(String whichLocale) {
        checkArgument(StringUtils.isNotBlank(whichLocale), "Querying locale cannot be empty (or) null.");
        checkState(locationStrategy.containsKey(defaultLocale), "Un-recognized default locale [" + defaultLocale + "]"
            + " provided.");
        if (locationStrategy.containsKey(whichLocale)) {
            return locationStrategy.get(whichLocale);
        }
        return locationStrategy.get(defaultLocale);
    }

    static JsonWebElement newElement(JsonObject json, String defaultLocale) {
        ensureMandatoryKeysArePresent(json);
        JsonWebElement element = new JsonWebElement();
        element.name = json.get(NAME).getAsString();
        List<LocaleDefinition> localeDefinitions = LocaleDefinition.newDefinition(json.get(LOCALE).getAsJsonArray());
        for (LocaleDefinition localeDefinition : localeDefinitions) {
            element.locationStrategy.put(localeDefinition.getLocale(), localeDefinition.getLocationStrategy());
            element.locator = localeDefinition.getLocator();
        }
        JsonElement waitNode = json.get(WAIT);
        if (waitNode == null) {
            element.until = Until.Available;
            element.forSeconds = DEFAULT_WAIT_TIME;
        } else {
        	parseWaitObject(element, waitNode);
        	//TODO: remove below code after Aug 15, 2017
            /*JsonObject waitObject = waitNode.getAsJsonObject();
            Until until = Until.Available;
            if (waitObject.has(UNTIL)) {
                until = Until.parse(waitNode.getAsJsonObject().get(UNTIL).getAsString());
            }
            element.until = until;
            int wait = DEFAULT_WAIT_TIME;
            if (waitObject.has(FOR) && waitObject.get(FOR).getAsInt() > 0) {
                wait = waitObject.get(FOR).getAsInt();
            }
            element.forSeconds = wait;*/
        }
        JsonElement expectedData = json.get(EXPECTED_DATA);
        JsonElement expectedDataMap = json.get(EXPECTED_DATA_MAP);
        if(expectedDataMap != null) {
        	JsonObject expectedMapObject = expectedDataMap.getAsJsonObject();
        	parseExpectedDataMap(element, expectedMapObject);
        } else {
        	element.expectedMap.put("expecedDataMap", "expected data format incorrect."
        			+ " Allowed only 'expectedDataMap' and 'expected' as json object");
        }
        element.expected = expectedData == null ? "" : expectedData.getAsString();
        element.defaultLocale = defaultLocale;
        return element;
    }

    private static void parseWaitObject(JsonWebElement element, JsonElement waitNode) {
    	JsonObject waitObject = waitNode.getAsJsonObject();
        Until until = Until.Available;
        if (waitObject.has(UNTIL)) {
            until = Until.parse(waitNode.getAsJsonObject().get(UNTIL).getAsString());
        }
        element.until = until;
        int wait = DEFAULT_WAIT_TIME;
        if (waitObject.has(FOR) && waitObject.get(FOR).getAsInt() > 0) {
            wait = waitObject.get(FOR).getAsInt();
        }
        element.forSeconds = wait;
    }
    
    private static void parseExpectedDataMap(JsonWebElement element,
			JsonObject expectedDataMap) {
		@SuppressWarnings("unchecked")
		Map<String, String> map = new Gson().fromJson(expectedDataMap,
				Map.class);
		element.expectedMap.putAll(map);
	}

    private static void ensureMandatoryKeysArePresent(JsonObject json) {
        checkArgument(json.has(NAME), NAME + ATTRIBUTE_IS_MISSING);
        checkArgument(json.has(LOCALE), LOCALE + ATTRIBUTE_IS_MISSING);
        //        checkArgument(json.has(LOCATOR), LOCATOR + ATTRIBUTE_IS_MISSING);
    }

    interface MandatoryKeys {
        String NAME = "name";
        String LOCALE = "locale";
        String LOCATOR = "locator";
    }

    interface OptionalKeys {
        String WAIT = "wait";
        String EXPECTED_DATA = "expectedData";
        String EXPECTED_DATA_MAP = "expectedDataList";
    }


    interface WaitAttributes {
        String UNTIL = "until";
        String FOR = "for";
    }
    
    interface ExpectedData {
    	String LABEL = "Label";
    	String PLACEHOLDER = "PlaceHolder";
    	String STATE = "State";
    }
}
