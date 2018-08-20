package com.datasphere.page;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.WebDriver;

import com.datasphere.page.constants.LoginPageConstants;
import com.datasphere.services.ServiceRequest;
import com.datasphere.webelements.PageObject;


public class LoginPage {

	WebDriver driver;
	PageObject loginPageObject;
	ServiceRequest serviceRequest;

	public LoginPage(WebDriver driver, String url) {
		if(this.driver == null) {
			this.driver = driver;
		}
		serviceRequest = new ServiceRequest(url);
		loginPageObject = new PageObject(driver, "src/test/resources/LoginPageLocators.json");
	}
	
	public void waitUntilLoginPageLoads() {
		System.out.println("Waiting for url "
				+ serviceRequest.getLoginServiceCall() + " to load");
		try {
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(serviceRequest.getLoginServiceCall());
			HttpResponse response = client.execute(request);
			boolean isRequestCompleted = response.getStatusLine()
					.getStatusCode() != 200;
			long endTime = System.currentTimeMillis() + 1000 * 60 * 2;
			System.out.println(serviceRequest.getLoginServiceCall()
					+ " - request success: " + isRequestCompleted);
			while (isRequestCompleted && endTime > System.currentTimeMillis()) {
				response = client.execute(request);
				isRequestCompleted = response.getStatusLine().getStatusCode() != 200;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean isUserDispalyed() {
		return loginPageObject.getTextField(LoginPageConstants.USERNAME).isDisplayed();
	}
	
	//TODO: expected data while reading from json file
	/*public ArrayList<String> getDataList() {
		return loginPage.getExpectedDataList(LoginPageConstants.USERNAME);
	}
	
	public String getExpectedPageTitle() {
		String expectedData = loginPage.getExpectedData(LoginPageConstants.USERNAME);
		return expectedData;
	}*/
	
	public LoginPage setUsername(String username) {
		loginPageObject.getTextField(LoginPageConstants.USERNAME).clearAndType(username);
		return this;
	}
	
	public LoginPage setPassword(String password) {
		loginPageObject.getTextField(LoginPageConstants.PASSWORD).clearAndType(password);
		return this;
	}
	
	public LandingPage submit() {
		loginPageObject.getButton(LoginPageConstants.SUBMIT).click();
		//TODO: wait for service request to complete
		return new LandingPage(driver);
	}
	
	/****
	 * 
	 */
	public boolean isLogoLoaded() {
		return loginPageObject.getImage(LoginPageConstants.LOGO).isDisplayed();
	}
	
	public boolean isInvalidCredentialsWarningDialogDisplayed() {
		return loginPageObject.getPopover(LoginPageConstants.POPOVER_DIALOG).isDisplayed();
	}
	
	public void clickOnInvalidCredentialsWarningDialogCloseIcon() {
		loginPageObject.getPopover(LoginPageConstants.POPOVER_CLOSE_ICON).closePopver();
	}
	
	public void clickOnInvalidCredentialsWarningDialogOKButton() {
		loginPageObject.getPopover(LoginPageConstants.POPOVER_OK_BUTTON).closePopver();
	}
	
	public boolean isRemeberPasswordChecked(){
		return loginPageObject.getCheckbox(LoginPageConstants.REMEMBER_ME_CHECKBOX).isSelected();
	}
	
	public void selectRememberMe(){
		loginPageObject.getCheckbox(LoginPageConstants.REMEMBER_ME_CHECKBOX).click();
	}
	
	public String getUsernamePlaceHolder(){
		return loginPageObject.getTextField(LoginPageConstants.USERNAME).getAttribute("placeholder");
	}
	
	public String getPasswordPlaceHolder(){
		return loginPageObject.getTextField(LoginPageConstants.PASSWORD).getAttribute("placeholder");
	}
	
	public String getInvalidWarningDialogTitle() {
		return loginPageObject.getLabel(LoginPageConstants.POPOVER_TITLE).getText();
	}
	
	public String getInvalidWarningDialogActualContent() {
		return loginPageObject.getTextField(LoginPageConstants.POPOVER_CONTENT).getText().trim();
	}
	
	public String getInvalidWarningDialogExpectedContent() {
		return "Incorrect Username or Password. Please try again. If you have problems logging in, or need to reset your credentials,"
				+ " please contact your administrator.";
	}
	
}
