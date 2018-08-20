package step_definitions;

import com.datasphere.page.LandingPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class LandingPageStepDefinitions {

	LandingPage landingPage = SharedDriver.landingPage;

	@Given("^Navigate to \"([^\"]*)\"$")
	public void navigate_to_dashboard(String menu) {
		SharedDriver.landingPage.navigateTo(menu);
//		SharedDriver.dashboardPage = new DashboardPage(SharedDriver.getDriver());
	}
	
	@Given("^Quickly navigate to \"([^\"]*)\"$")
	public void quickly_navigate_to(String menu) {
		SharedDriver.landingPage.navigateTo(menu, false);
	}
	
	@And("^Log Out$")
	public void log_out_user() {
		SharedDriver.landingPage.navigateTo("Log Out", false);
	}
	
	
	
}
