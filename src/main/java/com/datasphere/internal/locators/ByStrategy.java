package com.datasphere.internal.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ByIdOrName;

/**
 * This enum houses all the locating strategies and its associated identifying and parsing logic.
 */
public enum ByStrategy implements StrategyTraits {
    /**
     * Represents the xPath locating strategy.
     */
    XPATH {
        @Override
        public boolean typeMatches(String locator) {
            return ByStrategy.isNotNullAndEmpty(locator) &&
                (locator.startsWith("/") || locator.startsWith("//") || locator.startsWith("."));
        }

        @Override
        public By getStrategy(String locator) {
            return By.xpath(locator);
        }
    },
    /**
     * Represents the css locating strategy.
     */
    CSS {
        @Override
        public boolean typeMatches(String locator) {
            return ByStrategy.isNotNullAndEmpty(locator) && locator.startsWith("css");
        }

        @Override
        public By getStrategy(String locator) {
        	locator = locator.substring(locator.indexOf("=") + 1, locator.length());
            return By.cssSelector(locator);
        }
    },
    /**
     * Represents the Id/Name locating strategy.
     */
    ID_NAME {
        @Override
        public boolean typeMatches(String locator) {
            return ByStrategy.isNotNullAndEmpty(locator) && ((! XPATH.typeMatches(locator)) && (! CSS.typeMatches
                (locator)));
        }

        @Override
        public By getStrategy(String locator) {
            return new ByIdOrName(locator);
        }
    },/**
     * Represents the tagName locating strategy.
     */
    TAG_NAME {
        @Override
        public boolean typeMatches(String locator) {
            return ByStrategy.isNotNullAndEmpty(locator) &&  locator.startsWith("tag");
        }

        @Override
        public By getStrategy(String locator) {
        	locator = locator.substring(locator.indexOf("=") + 1, locator.length());
            return By.tagName(locator);
        }
    },
    /**
     * Represents the linkText locating strategy.
     */
    LINK_TEXT {
        @Override
        public boolean typeMatches(String locator) {
            return ByStrategy.isNotNullAndEmpty(locator) &&  locator.startsWith("link");
        }

        @Override
        public By getStrategy(String locator) {
        	locator = locator.substring(locator.indexOf("=") + 1, locator.length());
            return By.linkText(locator);
        }
    },/**
     * Represents the class name locating strategy.
     */
    CLASSNAME {
    	@Override
        public boolean typeMatches(String locator) {
            return ByStrategy.isNotNullAndEmpty(locator) && locator.startsWith("class");
        }

        @Override
        public By getStrategy(String locator) {
        	locator = locator.substring(locator.indexOf("=") + 1, locator.length());
            return By.className(locator);
        }
    };

    private static boolean isNotNullAndEmpty(String locator) {
        return locator != null && ! locator.trim().isEmpty();
    }

    /**
     * A utility method which helps identify the corresponding location strategy based on the input locator.
     *
     * @param locator - The locator that needs to be parsed.
     * @return - A {@link ByStrategy} object that represents the location strategy
     * and its associated identifying and parsing logic.
     */
    public static ByStrategy identifyStrategy(String locator) {
        for (ByStrategy value : values()) {
            if (value.typeMatches(locator)) {
                return value;
            }
        }
        throw new IllegalStateException("Encountered an unparseable locator : " + locator);
    }
}