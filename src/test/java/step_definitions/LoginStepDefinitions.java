package step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.datasphere.page.LoginPage;
import com.datasphere.page.constants.UserConfigConstants;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions {

	WebDriver driver = SharedDriver.getDriver();
	LoginPage loginPage;

	@Given("^Launch application \"([^\"]*)\"$")
	public void launch_application(String url) {
		driver.get(url);
		SharedDriver.loginPage = new LoginPage(driver, url);
	}
	
	@Given("^Launch application$")
	public void launchApplication() {
		driver.get(UserConfigConstants.URL);
		SharedDriver.loginPage = new LoginPage(driver, UserConfigConstants.URL);
	}

	@Then("^Page title should be \"([^\"]*)\"$")
	public void validate_page_title(String pageTitle) {
		Assert.assertEquals("Page title", pageTitle, driver.getTitle());
	}

	@When("^Login user with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_user_with_credentails(String username, String password) {
		SharedDriver.landingPage = SharedDriver.loginPage.setUsername(username)
				.setPassword(password).submit();
	}

	@And("^Select remember me$")
	public void select_remember_me_checkbox() {
		SharedDriver.loginPage.selectRememberMe();
		Assert.assertTrue("Remember password checked",
				SharedDriver.loginPage.isRemeberPasswordChecked());
	}

	@Then("^System should allow user to logs in$")
	public void validate_user_should_logs_in() {
		Assert.assertTrue("Landing page title dispalyed",
				SharedDriver.landingPage.isLandingPageTitleDisplayed());
		Assert.assertTrue("Landing page menu bar diaplyed",
				SharedDriver.landingPage.isMenuBarDisplayed());
	}

	@Given("^Default active page should be Dashboard$")
	public void defaultActivePageShouldBe() {
		Assert.assertTrue("Dashboard active by default",
				SharedDriver.landingPage.isDashboardActiveByDefault());
	}
	
	@Then("^System should not allow user to logs in$")
	public void validate_user_should_not_logs_in() {
		Assert.assertTrue("Invalid Credentials warning dialog displayed",
				SharedDriver.loginPage.isInvalidCredentialsWarningDialogDisplayed());
	}

	@And("^By default dashboard page should display$")
	public void validate_default_user_landing_page() {
		Assert.assertTrue("Landed on Dashboard page",
				SharedDriver.landingPage.isMenuBarDisplayed());
	}

	@And("^Invalid credentials warning dialog should display with title \"([^\"]*)\"$")
	public void invalid_credentials_warning_dialog_should_display(
			String invalidLoginDialogTitle) {
		Assert.assertTrue("Invalid credentials popup displayed",
				SharedDriver.loginPage.isInvalidCredentialsWarningDialogDisplayed());
		Assert.assertEquals("Popover title", invalidLoginDialogTitle,
				SharedDriver.loginPage.getInvalidWarningDialogTitle());
	}

	@Then("^Closing warning popup with \"([^\"]*)\" should close dialog")
	public void close_warning_popup_with_close_icon(String closeUsing) {
		if (closeUsing.equalsIgnoreCase("closeIcon")) {
			SharedDriver.loginPage.clickOnInvalidCredentialsWarningDialogCloseIcon();
		} else {
			SharedDriver.loginPage.clickOnInvalidCredentialsWarningDialogOKButton();
		}
		Assert.assertFalse("Invalid credentials popup not displayed",
				SharedDriver.loginPage.isInvalidCredentialsWarningDialogDisplayed());
	}
	
	@And("^Click on \"([^\"]*)\" button$")
	public void clickOnLogout() {
		
	}

}