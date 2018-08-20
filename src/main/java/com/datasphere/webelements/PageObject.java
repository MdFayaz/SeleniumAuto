package com.datasphere.webelements;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.datasphere.internal.locators.Until;
import com.datasphere.pojos.JsonPageParser;
import com.datasphere.pojos.JsonWebElement;
import com.google.common.collect.Lists;

/**
 * This class represents the entry point to all page object building.
 * Houses all the logic required for loading a json file, parsing it, initialising location strategies
 * based on the values provided in the json file and also in constructing different html elements.
 */
public final class PageObject {
    private SearchContext context;
    private String jsonFileSource;
    private JsonPageParser page;
    private String locale;
    private ArrayList<String> expectedDataList = new ArrayList<String>();

    /**
     * Helps create a new instance.
     *
     * @param context        - A {@link WebDriver} instance which would be used to query the elements.
     * @param jsonFileSource - The location of the JSON file that contains the elements definition.
     */
    public PageObject(WebDriver context, String jsonFileSource) {
        this.context = context;
        this.jsonFileSource = jsonFileSource;
    }

    /**
     * @param locale - The locale for which the page object is being created.
     * @return - The current {@link PageObject} instance.
     */
    public PageObject forLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - A {@link Button} instance.
     */
    public final Button getButton(String fieldName) {
        return getElement(fieldName, Button.class);
    }

    /**
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - A {@link List} of {@link Button} instances.
     */
    public final List<Button> getButtons(String fieldName) {
        return getElements(fieldName, Button.class);
    }

    /**
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - A {@link Checkbox} instance.
     */
    public final Checkbox getCheckbox(String fieldName) {
        return getElement(fieldName, Checkbox.class);
    }

    /**
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - A {@link List} of {@link Checkbox} instances.
     */
    public final List<Checkbox> getCheckboxes(String fieldName) {
        return getElements(fieldName, Checkbox.class);
    }

    /**
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - A {@link Form} instance.
     */
    public final Form getForm(String fieldName) {
        return getElement(fieldName, Form.class);
    }

    /**
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - A {@link List} of {@link Form} instances.
     */
    public final List<Form> getForms(String fieldName) {
        return getElements(fieldName, Form.class);
    }
    
    /**
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - A {@link Popover} instance.
     */
    public final Popover getPopover(String fieldName) {
        return getElement(fieldName, Popover.class);
    }

    /**
     * This method is used, when dealing with custom html elements which doesn't have the required visualisation
     * built in by our page object model. E.g., for this could include controls such as date pickers for which
     * there are no built in objects provided by this library (similar to {@link Button} or {@link Link} etc.,)
     *
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - A {@link GenericWebElement} instance.
     */
    public final GenericWebElement getGenericElement(String fieldName) {
        return getElement(fieldName, GenericWebElement.class);
    }

    /**
     * This method is used, when dealing with custom html elements which doesn't have the required visualisation
     * built in by our page object model. E.g., for this could include controls such as date pickers for which
     * there are no built in objects provided by this library (similar to {@link Button} or {@link Link} etc.,)
     *
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - A {@link List} of {@link GenericWebElement} instances.
     */
    public final List<GenericWebElement> getGenericElements(String fieldName) {
        return getElements(fieldName, GenericWebElement.class);
    }

    /**
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - An {@link Image} object.
     */
    public final Image getImage(String fieldName) {
        return getElement(fieldName, Image.class);
    }

    /**
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - A {@link List} of {@link Image} instances.
     */
    public final List<Image> getImages(String fieldName) {
        return getElements(fieldName, Image.class);
    }

    /**
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - A {@link Label} instance.
     */
    public final Label getLabel(String fieldName) {
        return getElement(fieldName, Label.class);
    }

    /**
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - A {@link List} of {@link Label} instances.
     */
    public final List<Label> getLabels(String fieldName) {
        return getElements(fieldName, Label.class);
    }

    /**
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - A {@link Link} instance.
     */
    public final Link getLink(String fieldName) {
        return getElement(fieldName, Link.class);
    }

    /**
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - A {@link List} of {@link Link} instances.
     */
    public final List<Link> getLinks(String fieldName) {
        return getElements(fieldName, Link.class);
    }

    /**
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - A {@link RadioButton} instance.
     */
    public final RadioButton getRadioButton(String fieldName) {
        return getElement(fieldName, RadioButton.class);
    }

    /**
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - A {@link List} of {@link RadioButton} instances.
     */
    public final List<RadioButton> getRadioButtons(String fieldName) {
        return getElements(fieldName, RadioButton.class);
    }

    /**
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - A {@link SelectList} instance.
     */
    public final SelectList getSelectList(String fieldName) {
        return getElement(fieldName, SelectList.class);
    }

    /**
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - A {@link List} of {@link SelectList} instances.
     */
    public final List<SelectList> getSelectLists(String fieldName) {
        return getElements(fieldName, SelectList.class);
    }

    /**
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - A {@link TextField} instance.
     */
    public final TextField getTextField(String fieldName) {
        return getElement(fieldName, TextField.class);
    }

    /**
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - A {@link List} of {@link TextField} instances.
     */
    public final List<TextField> getTextFields(String fieldName) {
        return getElements(fieldName, TextField.class);
    }
    
    /**
     * @param fieldName - The name of the filed as defined in the JSON file.
     * @return - A {@link Table} instance.
     */
    public final Table getTable(String fieldName) {
    	return getElement(fieldName, Table.class);
    }
    
    /**
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - A {String} expected data.
     */
    public final String getExpectedData(String fieldName) {
    	return newRawElement(getJsonWebElement(fieldName)).getExpected();
    }
    
    /**
     * @param fieldName - The name of the field as defined in the JSON file.
     * @return - An expected mapped {String, String} data.
     */
    public final ArrayList<String> getExpectedDataList(String fieldName) {
    	Map<String, String> expectedDataMap = newRawElement(getJsonWebElement(fieldName)).getExpectedDataMap();
    	for(Map.Entry<String,String> expected : expectedDataMap.entrySet()) {
//    		String key = expected.getKey();
			String value = expected.getValue();
			expectedDataList.add(value);
//			System.out.println("Key: " + key + " Value: " + value);
		}
    	return expectedDataList;
    }
    
    private String getLocale() {
        if (StringUtils.isBlank(locale)) {
            locale = page.getDefaultLocale();
        }
        return locale;
    }
    
    public String getLocator() {
    	return page.getLocator();
    }
    
    @SuppressWarnings("unchecked")
	private final <E> E getElement(String fieldName, Class<E> clazz) {
        WebElement webElement = newRawElement(getJsonWebElement(fieldName)).getWebElement();
        return (E) newInstance(clazz, webElement);
    }
    
    @SuppressWarnings("unchecked")
	private final <E> List<E> getElements(String fieldName, Class<E> clazz) {
        List<WebElement> webElements = newRawElement(getJsonWebElement(fieldName)).getWebElements();
        List<E> elements = Lists.newArrayList();
        for (WebElement webElement : webElements) {
            E e = (E) newInstance(clazz, webElement);
            elements.add(e);
        }
        return elements;
    }

    private void initLazily() {
        if (page != null) {
            return;
        }
        synchronized (this) {
            if (page != null) {
                return;
            }
            page = JsonPageParser.getPage(jsonFileSource);
        }
    }

    private JsonWebElement getJsonWebElement(String fieldName) {
        initLazily();
        return page.getWebElement(fieldName);
    }

    private CustomWebElement newRawElement(JsonWebElement element) {
        DecoratedSearchContext context = new DecoratedSearchContext(this.context, element.getUntil(), element
            .getWaitForSeconds());
        return new CustomWebElement(context, element, getLocale());
    }

    private static Object newInstance(Class<?> clazz, WebElement webElement) {
        try {
            Constructor<?> constructor = Class.forName(clazz.getName()).getDeclaredConstructor(WebElement.class);
            return constructor.newInstance(webElement);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException
            | ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    private static class DecoratedSearchContext implements SearchContext {
        private SearchContext context;
        private Until until;
        private int timeInSeconds;

        DecoratedSearchContext(SearchContext context, Until until, int timeInSeconds) {
            this.context = context;
            this.until = until;
            this.timeInSeconds = timeInSeconds;
        }

        @Override
        public List<WebElement> findElements(By by) {
            List<WebElement> elementsToReturn = new ArrayList<>();
            switch (until) {
                case Clickable:
                    for (WebElement element : context.findElements(by)) {
                        elementsToReturn.add(apply(ExpectedConditions.elementToBeClickable(element)));
                    }
                    break;
                case Visible:
                    elementsToReturn = applyToList(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
                    break;
                default:
                    elementsToReturn = applyToList(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
            }
            return elementsToReturn;
        }

        @Override
        public WebElement findElement(By by) {
            WebElement elementToReturn;
            switch (until) {
                case Clickable:
                    elementToReturn = apply(ExpectedConditions.elementToBeClickable(by));
                    break;
                case Visible:
                    elementToReturn = apply(ExpectedConditions.visibilityOfElementLocated(by));
                    break;
                default:
                    elementToReturn = apply(ExpectedConditions.presenceOfElementLocated(by));
            }
            return elementToReturn;
        }

		private WebElement apply(ExpectedCondition<WebElement> condition) {
			WebElement webElement = null;
			try {
				webElement = new WebDriverWait((WebDriver) this.context,
						timeInSeconds).until(condition);
			} catch (NoSuchElementException nsee) {
				System.out.println("From PageObject.java#");
				nsee.printStackTrace();
			}
			return webElement;
		}

        private List<WebElement> applyToList(ExpectedCondition<List<WebElement>> condition) {
            return new WebDriverWait((WebDriver) this.context, timeInSeconds).until(condition);
        }
    }
}
