package com.datasphere.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import step_definitions.SharedDriver;

import com.datasphere.page.constants.LandingPageConstants;
import com.datasphere.webelements.GenericWebElement;
import com.datasphere.webelements.PageObject;

public class LandingPage /*extends LoginPage implements NavigateTo*/ {

	WebDriver driver;
	LandingPage landingPage;
	PageObject landingPageObject;

	public LandingPage(WebDriver driver) {
//		super(driver);
		this.driver = driver;
		landingPageObject = new PageObject(driver,
				"src/test/resources/LandingPageLocators.json");
		landingPage = this;
	}

	public boolean isMenuBarDisplayed() {
		waitUntilTimeout(15);
		return landingPageObject.getLabel(LandingPageConstants.HEADER_MENU)
				.isDisplayed();
	}

	public boolean isDashboardActiveByDefault() {
		return landingPageObject.getLink(LandingPageConstants.DASHBOARD_ACTIVE_BY_DEFAULT).isDisplayed();
	}

	public boolean isLandingPageTitleDisplayed() {
		waitUntilTimeout(30);
		waitUntilPageDataLoads("Landing Page");
		return landingPageObject.getLabel(LandingPageConstants.DATASPHERE_TITLE)
				.isDisplayed();
	}

	public void getHeaderMenuItems() {
		List<GenericWebElement> listOfHeaderMenuItems = landingPageObject
				.getGenericElements(LandingPageConstants.HEADER_MENU_ITEMS);
	}

	public void getLeftMenuItems() {
		List<GenericWebElement> listOfLeftMenuItems = landingPageObject
				.getGenericElements(LandingPageConstants.LEFT_MENU_ITEMS);
	}

	public void getLeftNavMenuNames() {
		List<GenericWebElement> listOfLeftMenuNames = landingPageObject
				.getGenericElements(LandingPageConstants.LEFT_NAV_MENU_NAMES);
	}

	private void clickOnUserDropdown() {
		landingPageObject.getGenericElement(LandingPageConstants.USER_DROPDOWN)
				.click();
	}

	private void clickOnLogOut() {
		clickOnUserDropdown();
		landingPageObject.getLink(LandingPageConstants.SIGN_OUT).click();
	}

	public void clickOnHamburgerToExpand() {
		if (!isHamburgerExpanded()) {
			landingPageObject.getGenericElement(LandingPageConstants.HAMBURGER)
					.click();
		}
	}

	public boolean isHamburgerExpanded() {
		return landingPageObject.getGenericElement(
				LandingPageConstants.HAMBURGER_EXPANDED).isDisplayed();
	}

	public boolean isDashboardSelected() {
		return landingPageObject.getLink(LandingPageConstants.DASHBORAD_LINK_ACTIVE)
				.isDisplayed();
	}
	
	public boolean isMobilityActive() {
		return landingPageObject.getLink(LandingPageConstants.MOBILITY_LINK_ACTIVE)
				.isDisplayed();
	}
	
	public boolean isObjectivesAndTiersActive() {
		return landingPageObject.getLink(LandingPageConstants.OBJECTIVES_LINK_ACTIVE)
				.isDisplayed();
	}
	
	public boolean isInfrastructureAndDataActive() {
		return landingPageObject.getLink(LandingPageConstants.INFRASTRUCTURE_LINK_ACTIVE)
				.isDisplayed();
	}
	
	public boolean isSettingsActive() {
		return landingPageObject.getLink(LandingPageConstants.SETTINGS_LINK_ACTIVE)
				.isDisplayed();
	}
	
	public LandingPage navigateTo(String menuName) {
		return navigateTo(menuName, false);
	}

	public LandingPage navigateTo(String menuName, boolean fromHamburger) {
		LandingPage landingPage = null;
		System.out.println("Landing Page switching To: " + menuName);
		if (fromHamburger) {
			clickOnHamburgerToExpand();
		}
		switch (menuName) {
		case "Dashboard":
			selectDashboard();
			break;
		case "Mobility":
			selectMobility();
			break;
		case "Objectives & Tiers":
			selectObjectivesAndTiers();
			break;
		case "Infrastructure & Data":
			selectInfrastrucreAndData();
			break;
		case "Settings":
			selectSettings();
			break;
		case "Administration":
			selectAdministration();
			break;
		case "Events":
			selectInfrastrucreAndData();
			break;
		case "Tasks":
			selectSettings();
			break;
		case "Change Password":
			loadChangePassword();
			break;
		case "About Datasphere":
			loadAboutDatasphere();
			break;
		case "User":
			clickOnUserDropdown();
		}
		waitUntilPageDataLoads("Waiting for page to load: " + menuName);
		return landingPage;
	}

	private void loadChangePassword() {
		landingPageObject.getGenericElement(LandingPageConstants.CHANGE_PASSWORD)
				.click();
	}

	private void loadAboutDatasphere() {
		landingPageObject.getGenericElement(LandingPageConstants.ABOUT_DATASPHERE)
				.click();
	}

	private void selectDashboard() {
		if (!isDashboardSelected()) {
			landingPageObject.getLink(LandingPageConstants.DASHBOARD_LINK).click();
		} else {
			System.out.println("unable to click Dashboard");
		}
		SharedDriver.dashboardPage = new DashboardPage(driver);
	}

	private void selectMobility() {
		if(!isMobilityActive()) {
			landingPageObject.getLink(LandingPageConstants.MOBILITY_LINK).click();
		}
	}

	private void selectObjectivesAndTiers() {
		if(!isObjectivesAndTiersActive()) {
			landingPageObject.getLink(LandingPageConstants.OBJECTIVES_LINK).click();
		}
		SharedDriver.objectivesAndTiers = new ObjectivesAndTiersPage(this.driver);
		System.out.println("Objectives And Tiers clicked");
	}

	private void selectInfrastrucreAndData() {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ESCAPE);
		if(!isInfrastructureAndDataActive()) {
			landingPageObject.getLink(LandingPageConstants.INFRASTRUCTURE_LINK).click();
		}
		SharedDriver.infrastructureAndDataPage = new InfrastructureAndDataPage(this.driver);
		System.out.println("Infrastrucure and Data clicked");
	}
	
	private void selectSettings() {
		if(!isSettingsActive()) {
			landingPageObject.getLink(LandingPageConstants.SETTINGS_LINK).click();
		}
	}
	
	private void selectAdministration() {
		if(!isSettingsActive()) {
			landingPageObject.getLink(LandingPageConstants.ADMINISTRATION_LINK).click();
		}
		SharedDriver.adminPage = new AdministrationPage(this.driver);
		System.out.println("Administration link clicked");
	}
	
	/*public boolean waitUntilPageDataLoads(String pageName) {
		waitUntilTimeout(2);
		boolean isLoaderExists = false;
		long timeOUt = System.currentTimeMillis() * 1000 * 60 * 2;
		try {
			WebElement loader = this.driver.findElement(
					By.cssSelector(".PdIcon--loadingSpinner"));
			isLoaderExists = loader.isDisplayed();
//			log.info("Waiting for page '" + pageName + "' to load");
			// Waiting for 2 minutes
			while (isLoaderExists) {
				loader = this.driver.findElement(By.cssSelector(".PdIcon--loadingSpinner"));
				waitUntilTimeout(1);
				isLoaderExists = loader.isDisplayed();
				if(timeOUt < System.currentTimeMillis()) {
//					log.error(pageName + "didn't load even after waiting for 2 mins. Subsequent tests may fail.");
					isLoaderExists = false;
					break;
				}
			}
		} catch (NoSuchElementException nsee) {
		} catch (StaleElementReferenceException sere) {
		}
		waitUntilTimeout(2);
		return isLoaderExists;
	}*/
	
	public boolean waitUntilPageDataLoads(String pageName) {
		waitUntilTimeout(2);
		System.out.println("Waiting for " + pageName + " to load");
		boolean isLoaderExists = false;
		try {
			WebElement loader = driver.findElement(By.xpath("//*[contains(@class, 'loading-icon')]"));
			isLoaderExists = loader.isDisplayed();
			// Waiting for 2 minutes
			long endTime = System.currentTimeMillis() + 1000 * 60 * 2;
			while (isLoaderExists && endTime > System.currentTimeMillis()) {
				loader = driver.findElement(By.className("loading-icon"));
				isLoaderExists = loader.isDisplayed();
			}
		} catch (NoSuchElementException nsee) {
			isLoaderExists = false;
		} catch (StaleElementReferenceException sere) {
			isLoaderExists = false;
		}
		return isLoaderExists;
	}
	
	long timeout = System.currentTimeMillis() + 1000 * 60 * 2;
	public void waitUntilElementAppears(WebElement element) {
		waitUntilTimeout(1);
		try {
			boolean isElementNotDisplayed = !element.isDisplayed();
			while (isElementNotDisplayed
					&& timeout > System.currentTimeMillis()) {
				break;
			}
			long waitedTime = timeout < System.currentTimeMillis() ? (System
					.currentTimeMillis() - timeout) : (timeout - System
					.currentTimeMillis());
			System.out.println("Element appeared after waiting " + waitedTime / 1000 * 60 );
		} catch (NoSuchElementException nsee) {
			waitUntilElementAppears(element);
		}
		
		
		boolean isLoaderExists = false;
		try {
			WebElement loader = driver.findElement(By.xpath("//*[contains(@class, 'loading-icon')]"));
			isLoaderExists = loader.isDisplayed();
			// Waiting for 2 minutes
			long endTime = System.currentTimeMillis() + 1000 * 60 * 2;
			while (isLoaderExists && endTime > System.currentTimeMillis()) {
				loader = driver.findElement(By.className("loading-icon"));
				isLoaderExists = loader.isDisplayed();
			}
		} catch (NoSuchElementException nsee) {
			isLoaderExists = false;
		} catch (StaleElementReferenceException sere) {
			isLoaderExists = false;
		}
	}
	
	public static void waitUntilTimeout(int sec) {
		try {
			Thread.sleep(1000 * sec);
		} catch (InterruptedException ie) {
		}
	}
	
	public void scrollUp() {
		((JavascriptExecutor) driver).executeScript("scroll(250,0)");
		waitUntilTimeout(2);
	}

	public void makeWebElementEditable(JavascriptExecutor executor,
			String elementClassName) {
		executor.executeScript("document.getElementsByClassName('"
				+ elementClassName
				+ "')[0].setAttribute('contentEditable', true)");
		waitUntilTimeout(3);
	}
	
	public void injectJavascriptValue(JavascriptExecutor executor,
			String elementClassName, String attribKey, String attribValue) {
		String customScript = "document.getElementsByClassName('"
				+ elementClassName + "')[0].setAttribute('" + attribKey
				+ "', '" + attribValue + "')";
		System.out.println("Custom javascript: " + customScript);
		executor.executeScript(customScript);
		waitUntilTimeout(3);
	}
	
	public void injectJavascriptValueWithIndex(JavascriptExecutor executor,
			String elementClassName, int index, String attribKey,
			String attribValue) {
		executor.executeScript("document.getElementsByClassName('"
				+ elementClassName + "')[" + index + "].setAttribute('"
				+ attribKey + "', '" + attribValue + "')");
		waitUntilTimeout(3);
	}
	
/*	@Override
	public NavigateTo navigate() {
		if (!isDashboardSelected()) {
			landingPage.getLink(LandingPageConstants.DASHBOARD_LINK).click();
		} else {
			System.out.println("unable to click Dashboard");
		}
		return this;
	}*/
}
