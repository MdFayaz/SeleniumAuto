package step_definitions;

import org.junit.Assert;

import com.datasphere.page.SharesPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SharesStepDefinitions {

	SharesPage sharesPage;
	
	@Then("^Shares view should display$")
	public void sharesViewDisplay() {
		Assert.assertTrue("Shares view displayed", 
				SharedDriver.shares.isSharesViewDisplayed());
	}

	@And("^Create Share button should display$")
	public void shareCreateShareButtonDisplay() {
		Assert.assertTrue("Shares - Create Share button displayed", 
				SharedDriver.shares.isCreateShareButtonDisplayed());
	}
	
	@And("^Create share button icon should display$")
	public void shareCreateShareButtonIconDisplay() {
		Assert.assertTrue("Shares - Create Share button icon displayed", 
				SharedDriver.shares.isSharesCreateShareIconDisplayed());
	}
	
	@And("^Apply objective or tier button icon should display$")
	public void shareApplyObjectiveOrTierButtonIconDisplay() {
		Assert.assertTrue("Shares - Apply objective or tier button icon displayed", 
				SharedDriver.shares.isSharesApplyObjectiveOrTierIconDisplayed());
	}
	
	@And("^Create shares button label should display$")
	public void createShareHeaderDisplay() {
		Assert.assertEquals(
				"Create share header displayed",
				"Create Share", SharedDriver.shares
						.getSharesCreateShareHeader());
	}
	
	@And("^Apply Objective or Tier button label should display$")
	public void applyObjectiveOrTierHeaderDisplay() {
		Assert.assertEquals(
				"Apply Objective or tier header displayed",
				"Apply Objective or Tier", SharedDriver.shares
						.getSharesApplyObjectiveOrTierHeader());
	}
	
	@And("^Shares search section should display$")
	public void createSharesSearchSectionDisplay() {
		Assert.assertTrue("Shares search section displayed", 
				SharedDriver.shares.isSharesSearchSectionDisplayed());
	}
	
	@And("^Shares search icon should display$")
	public void createSharesSearchIconDisplay() {
		Assert.assertTrue("Shares search icon displayed", 
				SharedDriver.shares.isSharesMagnifierIconDisplayed());
	}
	
	@And("^Shares clear icon should display$")
	public void createSharesSearchClearIconDisplay() {
		Assert.assertTrue("Shares search clear icon displayed", 
				SharedDriver.shares.isSharesClearIconDisplayed());
	}
	
	@And("^Shares download icon should display$")
	public void createSharesDownloadIconDisplay() {
		Assert.assertTrue("Shares download icon displayed", 
				SharedDriver.shares.isSharesDownloadIconDisplayed());
	}
	
	@And("^Shares pagination should display$")
	public void createSharesPaginationDisplay() {
		Assert.assertTrue("Shares pagination displayed", 
				SharedDriver.shares.isSharesTablePaginationDisplayed());
	}
	
	@When("^Click on Create Shares$")
	public void  clickOnCreateSharesButton() {
		SharedDriver.shares.clickOnCreateShareButton();
	}
	
	@And("^Create Share name label should display$")
	public void createSharesNameLabelDisplay() {
		Assert.assertEquals(
				"Create Shares popover - name label - displayed",
				"Name", SharedDriver.shares
						.getCreateShareLabelName());
	}
	
	@Given("^Create share with name \"([^\"]*)\"$")
	public void createShareWithName(String name) {
		SharedDriver.shares.setShareName(name);
	}
	
	@And("^Create Share export path label should display$")
	public void createSharesExportPathLabelDisplay() {
		Assert.assertEquals(
				"Create Shares popover - export path label - displayed",
				"Export Path", SharedDriver.shares
						.getCreateShareLabelExportPath());
	}
	
	@And("^Create Share export subnet section should display$")
	public void createShareSubnetSectionDisplay() {
		Assert.assertTrue("Create Share subnet section displayed", 
				SharedDriver.shares.isCreateShareExportSubnetSectionDisplayed());
	}
	
	@And("^Create Share export subnet label should display$")
	public void createSharesExportSubnetLabelDisplay() {
		Assert.assertEquals(
				"Create Shares popover - export subnet label - displayed",
				"Export Subnet", SharedDriver.shares
						.getCreateShareLabelExportSubnet());
	}
	
	@And("^Create Share permissions label should display$")
	public void createSharesPermissionsLabelDisplay() {
		Assert.assertEquals(
				"Create Shares popover - permissions label - displayed",
				"Permissions", SharedDriver.shares
						.getCreateShareLabelPermissions());
	}
	
	@And("^Create Share root squash label should display$")
	public void createSharesRootSquashLabelDisplay() {
		Assert.assertEquals(
				"Create Shares popover - root squash label - displayed",
				"Root Squash", SharedDriver.shares
						.getCreateShareLabelRootSquash());
	}
	
	@And("^Create Share add subnet link should enabled$")
	public void createShareAddSubnetLinkEnabled() {
		Assert.assertTrue("Create Share add subnet link enabled", 
				SharedDriver.shares.isCreateShareAddSubnetLinkEnabled());
	}
	
	@When("^Click on Add Subnet link$")
	public void clickOnAddSubnetLink() {
		SharedDriver.shares.clickOnAddSubnetLink();
	}
	
	@Then("^Add subnet section should display$")
	public void addSubnetSectionShouldDisplay() {
		Assert.assertTrue("Create Share add subsubnet should display", 
				SharedDriver.shares.isAddSubnetSectionDisplayed());
	}
	
	@And("^Add subnet section ipaddress input should enabled$")
	public void addSubnetSectionIPAddressShouldEnabled() {
		Assert.assertTrue("Create Share add subsubnet ipaddress should enabled", 
				SharedDriver.shares.isAddSubnetSectionIPAddressInputEnabled());
	}
	
	@And("^Add subnet section ipaddress label should display$")
	public void createSharesIPAddressLabelDisplay() {
		Assert.assertEquals(
				"Create Shares popover - ipaddress label - displayed",
				"IP Address", SharedDriver.shares
						.getAddSubnetSectionIPAddressLabel());
	}
	
	@And("^Add subnet section ipaddress helper label should display$")
	public void createSharesIPAddressHelperLabelDisplay() {
		Assert.assertEquals(
				"Create Shares popover - ipaddress helper label - displayed",
				"IP, CIDR Subnet, * Wildcard", SharedDriver.shares
						.getAddSubnetSectionIPAddressHelperLabel());
	}
	
	@And("^Add subnet section read only radio button should enabled$")
	public void addSubnetSectionRORadioButtonShouldEnabled() {
		Assert.assertTrue("Create Share add subnet r/o radio button should enabled", 
				SharedDriver.shares.isAddSubnetSectionRadioButtonReadOnlyEnabled());
	}
	
	@And("^Add subnet section read only radio button label should display$")
	public void addSubnetSectionRORadioButtonLabelDisplay() {
		Assert.assertEquals(
				"Create Shares popover - r/o radio button label - displayed",
				"Read Only", SharedDriver.shares
						.getAddSubnetSectionRadioButtonReadOnlyLabel());
	}
	
	@And("^Add subnet section read write radio button should enabled$")
	public void addSubnetSectionRWRadioButtonShouldEnabled() {
		Assert.assertTrue("Create Share add subnet r/w radio button should enabled", 
				SharedDriver.shares.isAddSubnetSectionRadioButtonReadWriteEnabled());
	}
	
	@And("^Add subnet section read write radio button label should display$")
	public void addSubnetSectionRWRadioButtonLabelDisplay() {
		Assert.assertEquals(
				"Create Shares popover - r/w radio button label - displayed",
				"Read Write", SharedDriver.shares
						.getAddSubnetSectionRadioButtonReadWriteLabel());
	}
	
	@And("^Add subnet section root suqash switch should enabled$")
	public void addSubnetSectionRootSquashButtonShouldEnabled() {
		Assert.assertTrue("Create Share add subnet root squash switch should enabled", 
				SharedDriver.shares.isRootSquashButtonEnabled());
	}
	
	@And("^Share quota section share size should enabled$")
	public void shareQuotaSectionShareSizeShouldEnabled() {
		Assert.assertTrue("Create Share share quota should enabled", 
				SharedDriver.shares.isShareQuotaSectionDisplayed());
	}
	
	@And("^Share quota section size alert should enabled$")
	public void shareQuotaSectionSizeAlertShouldEnabled() {
		Assert.assertTrue("Create Share size alert should enabled", 
				SharedDriver.shares.isShareQuotaSectionSizeAlertDisplayed());
	}
	
	@When("^Click on size alert \"([^\"]*)\"$")
	public void clickOnSizeAlert(String flag) {
		SharedDriver.shares.clickOnShareQuotaSizeAlertToOn(flag);
	}
	
	@Then("^Share quota section size alert should turn on$")
	public void shareQuotaSectionSizeAlertTurnedOn() {
		Assert.assertTrue("Create Share size alert should enabled", 
				SharedDriver.shares.isAlertSizeTurnedOn());
	}
	
	@Then("^Share quota section size alert should turn off$")
	public void shareQuotaSectionSizeAlertTurnedOff() {
		Assert.assertTrue("Create Share size alert should enabled", 
				SharedDriver.shares.isAlertSizeTurnedOff());
	}
	
	@And("^Create share with export path \"([^\"]*)\"$")
	public void createShareWithExportPath(String exportPath) {
		SharedDriver.shares.setShareExportPath(exportPath);
	}
	
	@And("^Create share with Applied Objective or Tier \"([^\"]*)\"$")
	public void createShareWithAppliedObjectiveOrTier(String appliedObjective) {
		SharedDriver.shares.selectApplyObjectiveOrTier(appliedObjective);
	}
	
	@Then("^Click on Create Share Button$")
	public void clickOnCreateShareButton() {
		SharedDriver.shares.clickOnPopoverCreateShareButton();
	}
	
	@Then("^Create share popover should display$")
	public void createSharePopoverShouldDisplay() {
		SharedDriver.shares.createSharePopoverDisplayed();
	}
	 
	@When("^Close create share popover$")
	public void closeSharesPopover() {
		SharedDriver.shares.clickOnCreateSharePopoverCloseIcon();
	}
	
	@Then("^Create share popover should close$")
	public void createSharePopoverShouldNotDisplay() {
		Assert.assertTrue("Create Share popover closed",
				SharedDriver.shares.createSharePopoverDisplayed());
	}
	
	@Given("^Connect to client \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"")
	public void connectToClientWithUserAndPassword(String clientIP, String username, String password) {
		sharesPage = new SharesPage(SharedDriver.getDriver());
		sharesPage.connect(clientIP, username, password);
	}
	
	@And("^Make a directory \"([^\"]*)\"$")
	public void createADirectory(String dirPath) {
		sharesPage.createDirectoryIfNotExistsAlready(dirPath);
	}
	
	@Then("^Mount the data portal \"([^\"]*)\" on share \"([^\"]*)\" with type \"([^\"]*)\"$")
	public void mountTheDataPortal(String dataportalIP, String sharePath, String mountType) {
		sharesPage.mountShare(dataportalIP, sharePath, mountType);
	}
	
	@When("^Create a file with name \"([^\"]*)\"$")
	public void createAFileWithName(String fileName) {
		sharesPage.createFile(fileName);
	}
	
	@When("^Create random number of files with type \"([^\"]*)\" and number of files \"([^\"]*)\"$")
	public void createRandomFilesOfType(String fileType, String filesCount) {
		sharesPage.createRandomNumberOfFiles(fileType, Integer.parseInt(filesCount));
	}
	
	@And("^Search for share \"([^\"]*)\"$")
	public void searchForShare(String shareName) {
		SharedDriver.shares.searchForShare(shareName);
	}
	
	@When("^Click on share \"([^\"]*)\"$")
	public void clickOnShare(String shareName) {
		SharedDriver.shares.clickOnShare(shareName);
	}
}