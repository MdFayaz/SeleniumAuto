package com.datasphere.page;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.List;
import java.util.Vector;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.datasphere.constants.PDConstants;
import com.datasphere.page.constants.SharesPageConstants;
import com.datasphere.webelements.PageObject;
import com.datasphere.webelements.SelectList;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.ChannelSftp.LsEntry;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class SharesPage extends InfrastructureAndDataPage {

	WebDriver driver;
	PageObject sharesPage;
	SharesPage sharesObj;
	
	static ChannelSftp channel;
	static Session session;
	static final String DATAPORTAL_IP = "";
	
//	private HashMap<String, ArrayList<String>> existingObjectives = new HashMap<String, ArrayList<String>>();
//	private HashMap<String, ArrayList<String>> existingTiers = new HashMap<String, ArrayList<String>>();
	
	public SharesPage(WebDriver driver) {
		super(driver);
		this.driver  = driver;
		sharesPage = new PageObject(driver, "src/test/resources/SharesPageLocators.json");
	}

	public void clickOnCreateShareButton() {
		sharesPage.getButton(SharesPageConstants.CREATE_SHARE_BUTTON).click();
	}
	
	
	
	
	
	public boolean isSharesViewDisplayed() {
		return sharesPage.getForm(SharesPageConstants.SHARES_TABLE).isDisplayed();
	}
	
	public boolean isCreateShareButtonDisplayed() {
		return sharesPage.getButton(SharesPageConstants.CREATE_SHARE_BUTTON).isDisplayed();
	}
	
	public boolean isSharesCreateShareIconDisplayed() {
		return sharesPage.getImage(
				SharesPageConstants.SHARES_VIEW_HEADER_CREATE_SHARE_ICON)
				.isDisplayed();
	}
	
	public boolean isSharesApplyObjectiveOrTierIconDisplayed() {
		return sharesPage.getImage(
				SharesPageConstants.SHARES_VIEW_HEADER_APPLY_OBJECTIVE_OR_TIER_ICON)
				.isDisplayed();
	}
	
	public String getSharesCreateShareHeader() {
		return sharesPage.getLabel(
				SharesPageConstants.SHARES_VIEW_HEADER_CREATE_SHARE_LABEL).getText();
	}
	
	public String getSharesApplyObjectiveOrTierHeader() {
		return sharesPage.getLabel(
				SharesPageConstants.SHARES_VIEW_HEADER_APPLY_OBJECTIVE_OR_TIER_LABEL).getText();
	}
	
	public boolean isSharesSearchSectionDisplayed() {
		return sharesPage.getForm(
				SharesPageConstants.SHARES_VIEW_HEADER_SEARCH)
				.isDisplayed();
	}
	
	public boolean isSharesMagnifierIconDisplayed() {
		return sharesPage.getImage(
				SharesPageConstants.SHARES_VIEW_HEADER_SEARCH_MAGNIFIER)
				.isDisplayed();
	}
	
	public boolean isSharesClearIconDisplayed() {
		return sharesPage.getImage(
				SharesPageConstants.SHARES_VIEW_HEADER_SEARCH_CLEAR)
				.isDisplayed();
	}
	
	public boolean isSharesDownloadIconDisplayed() {
		return sharesPage.getImage(
				SharesPageConstants.SHARES_VIEW_HEADER_DOWNLOAD_BUTTON)
				.isDisplayed();
	}
	
	public boolean isSharesTablePaginationDisplayed() {
		return sharesPage.getForm(
				SharesPageConstants.SHARES_TABLE_FOOTER)
				.isDisplayed();
	}
	
	public boolean createSharePopoverDisplayed() {
		return sharesPage.getPopover(
				SharesPageConstants.CREATE_SHARE_POPOVER)
				.isDisplayed();
	}
	
	public String getCreateShareLabelName() {
		return sharesPage.getLabel(SharesPageConstants.SHARES_CREATE_SHARE_NAME_LABEL).getText();
	}
	
	public String getCreateShareLabelExportPath() {
		return sharesPage.getLabel(SharesPageConstants.SHARES_CREATE_SHARE_EXPORT_LABEL).getText();
	}
	
	public boolean isCreateShareExportSubnetSectionDisplayed() {
		return sharesPage.getForm(
				SharesPageConstants.SHARES_CREATE_SHARE_EXPORT_SUBNET_SECTION)
				.isDisplayed();
	}
	
	public String getCreateShareLabelExportSubnet() {
		return sharesPage.getLabel(SharesPageConstants.SHARES_CREATE_SHARE_EXPORT_SUBNET_LABEL).getText();
	}
	
	public String getCreateShareLabelPermissions() {
		return sharesPage.getLabel(SharesPageConstants.SHARES_CREATE_SHARE_PERMISSION_LABEL).getText();
	}
	
	public String getCreateShareLabelRootSquash() {
		return sharesPage.getLabel(SharesPageConstants.SHARES_CREATE_SHARE_ROOT_SQUASH_LABEL).getText();
	}
	
	public boolean isCreateShareAddSubnetLinkEnabled() {
		return sharesPage.getLink(
				SharesPageConstants.SHARES_CREATE_SHARE_ADD_SUBNET_LINK)
				.isEnabled();
	}
	
	public void clickOnAddSubnetLink() {
		sharesPage.getLink(
				SharesPageConstants.SHARES_CREATE_SHARE_ADD_SUBNET_LINK)
				.click();
	}
	
	public boolean isAddSubnetSectionDisplayed() {
		return sharesPage.getForm(
				SharesPageConstants.SHARES_CREATE_SHARE_ADD_SUBNET_DETAILS_FORM)
				.isDisplayed();
	}
	
	public boolean isAddSubnetSectionIPAddressInputEnabled() {
		WebElement element = sharesPage.getForm(
				SharesPageConstants.SHARES_CREATE_SHARE_ADD_SUBNET_DETAILS_FORM)
				.getUnderlyingElement();
		return element.findElement(By.xpath("//input")).isEnabled();
	}
	
	public String getAddSubnetSectionIPAddressLabel() {
		WebElement element = sharesPage.getForm(
				SharesPageConstants.SHARES_CREATE_SHARE_ADD_SUBNET_DETAILS_FORM)
				.getUnderlyingElement();
		return element.findElement(By.xpath("//input/preceding-sibling::label")).getText();
	}
	
	public String getAddSubnetSectionIPAddressHelperLabel() {
		WebElement element = sharesPage.getForm(
				SharesPageConstants.SHARES_CREATE_SHARE_ADD_SUBNET_DETAILS_FORM)
				.getUnderlyingElement();
		return element.findElement(By.xpath("//input/following-sibling::div")).getText();
	}
	
	public boolean isAddSubnetSectionRadioButtonReadOnlyEnabled() {
		WebElement element = sharesPage.getForm(
				SharesPageConstants.SHARES_CREATE_SHARE_ADD_SUBNET_DETAILS_FORM)
				.getUnderlyingElement();
		return element.findElement(By.xpath("//*[contains(@class, 'read-only')]")).isEnabled();
	}
	
	public String getAddSubnetSectionRadioButtonReadOnlyLabel() {
		WebElement element = sharesPage.getForm(
				SharesPageConstants.SHARES_CREATE_SHARE_ADD_SUBNET_DETAILS_FORM)
				.getUnderlyingElement();
		return element.findElement(By.xpath("//*[contains(@class, 'read-only')]//span")).getText();
	}
	
	public void selectAddSubnetSectionRadioButtonReadOnly() {
		WebElement element = sharesPage
				.getForm(
						SharesPageConstants.SHARES_CREATE_SHARE_ADD_SUBNET_DETAILS_FORM)
				.getUnderlyingElement();
		WebElement childElement = element.findElement(By
				.xpath("//*[contains(@class, 'read-only')]"));
		String classAttribute = childElement.getAttribute("class");
		if (!classAttribute.contains("checked")) {
			childElement.findElement(
					By.xpath("//i[contains(@class, 'uncheck')]")).click();
		}
	}
	
	public boolean isAddSubnetSectionRadioButtonReadWriteEnabled() {
		WebElement element = sharesPage.getForm(
				SharesPageConstants.SHARES_CREATE_SHARE_ADD_SUBNET_DETAILS_FORM)
				.getUnderlyingElement();
		return element.findElement(By.xpath("//*[contains(@class, 'read-write')]")).isEnabled();
	}
	
	public String getAddSubnetSectionRadioButtonReadWriteLabel() {
		WebElement element = sharesPage.getForm(
				SharesPageConstants.SHARES_CREATE_SHARE_ADD_SUBNET_DETAILS_FORM)
				.getUnderlyingElement();
		return element.findElement(By.xpath("//*[contains(@class, 'read-write')]//span")).getText();
	}
	
	public void selectAddSubnetSectionRadioButtonReadWrite() {
		WebElement element = sharesPage
				.getForm(
						SharesPageConstants.SHARES_CREATE_SHARE_ADD_SUBNET_DETAILS_FORM)
				.getUnderlyingElement();
		WebElement childElement = element.findElement(By
				.xpath("//*[contains(@class, 'read-write')]"));
		String classAttribute = childElement.getAttribute("class");
		if (!classAttribute.contains("checked")) {
			childElement.findElement(
					By.xpath("//i[contains(@class, 'uncheck')]")).click();
		}
	}
	
	public boolean isRootSquashButtonEnabled() {
		WebElement element = sharesPage
				.getForm(
						SharesPageConstants.SHARES_CREATE_SHARE_ADD_SUBNET_DETAILS_FORM)
				.getUnderlyingElement();
		return element.findElement(By.xpath("//*[@class='c-switch for-tier']"))
				.isEnabled();
	}
	
	public void selectRadioButtonRootSquash(boolean turnOn) {
		WebElement element = sharesPage
				.getForm(
						SharesPageConstants.SHARES_CREATE_SHARE_ADD_SUBNET_DETAILS_FORM)
				.getUnderlyingElement();
		WebElement childElement = null;
		try {
			if (turnOn) {
				childElement = element.findElement(By
						.xpath("//*[@class='c-switch for-tier']"));
			} else {
				childElement = element.findElement(By
						.xpath("//*[@class='c-switch for-tier on']"));
			}
		} catch (NoSuchElementException nsee) {
		}
		if(childElement != null) {
			childElement.click();
		}
	}
	
	public boolean isShareQuotaSectionDisplayed() {
		return sharesPage.getForm(
				SharesPageConstants.SHARES_CREATE_SHARE_QUOTA_SECTION)
				.isDisplayed();
	}
	
	public boolean isShareQuotaSectionShareSizeDisplayed() {
		return sharesPage.getForm(
				SharesPageConstants.SHARES_CREATE_SHARE_QUOTA_SECTION_SHARE_SIZE)
				.isDisplayed();
	}
	
	public boolean isShareQuotaSectionSizeAlertDisplayed() {
		return sharesPage.getForm(
				SharesPageConstants.SHARES_CREATE_SHARE_QUOTA_SECTION_SIZE_ALERT)
				.isDisplayed();
	}
	
	public boolean isAlertSizeTurnedOff() {
		return sharesPage
				.getButton(
						SharesPageConstants.SHARES_CREATE_SHARE_QUOTA_SECTION_SIZE_ALERT_OFF_SWITCH)
				.isDisplayed();
	}
	
	public boolean isAlertSizeTurnedOn() {
		return sharesPage
				.getButton(
						SharesPageConstants.SHARES_CREATE_SHARE_QUOTA_SECTION_SIZE_ALERT_ON_SWITCH)
				.isDisplayed();
	}
	
	public void clickOnShareQuotaSizeAlertToOn(String flag) {
		boolean turnOn = false;
		if(flag != null) {
			turnOn = Boolean.valueOf(flag);
		}
		try {
			if (turnOn) {
				sharesPage
						.getButton(
								SharesPageConstants.SHARES_CREATE_SHARE_QUOTA_SECTION_SIZE_ALERT_OFF_SWITCH)
						.click();
			} else {
				sharesPage
						.getButton(
								SharesPageConstants.SHARES_CREATE_SHARE_QUOTA_SECTION_SIZE_ALERT_ON_SWITCH)
						.click();
			}
		} catch (NoSuchElementException nsee) {
		}
	}

	public void clickOnCreateSharePopoverCloseIcon() {
		sharesPage.getButton(
				SharesPageConstants.CREATE_SHARE_POPOVER_CLOSE_ICON).click();
	}
	
	public void setShareName(String value) {
		sharesPage.getTextField(SharesPageConstants.CREATE_SHARE_NAME).type(value);
	}
	
	public void setShareExportPath(String value) {
		sharesPage.getTextField(SharesPageConstants.CREATE_SHARES_EXPORT_PATH).type(value);
	}
	
	public void selectApplyObjectiveOrTier(String value) {
		WebElement element = sharesPage.getButton(
				SharesPageConstants.CREATE_SHARES_APPLY_OBJECTIVE_OR_TIER)
				.getUnderlyingElement();
		element.click();
		String actualVal = getAppliedObjectiveOrTiersOptions(value);
		waitUntilTimeout(5);
		element.click();
		/*WebElement expectedAOT = element.findElement(By.xpath("//following-sibling::div//*[@title='"
				+ value + "']"));
		((Locatable) expectedAOT).getCoordinates().inViewPort();
		System.out.println("Dropdown: " + expectedAOT);
		waitUntilTimeout(10);*/
//		makeWebElementEditable((JavascriptExecutor)this.driver, "search-input choose-objective choose-item");
		injectJavascriptValue((JavascriptExecutor)this.driver,
				"c-select-dropdown input-group objective-group dropdown-group", "data-value", actualVal );
		waitUntilTimeout(5);
//		element.findElement(By.xpath("//following-sibling::span[contains(@class, 'addon')]")).click();
		/*sharesPage.getButton(SharesPageConstants.CREATE_SHARES_APPLY_OBJECTIVE_OR_TIER_OPTIONS).click();
		WebElement dropdown = element.findElement(By
				.xpath("//..//*[contains(text(), '" + value.trim() + "')]"));
		System.out.println("Dropdown: " + dropdown);
		dropdown.click();
		waitUntilTimeout(10);
		sharesPage.getForm(SharesPageConstants.CREATE_SHARE_POPOVER_FORM).click();*/
	}
	
	private String getAppliedObjectiveOrTiersOptions(String value) {
		List<SelectList> selectedLists = sharesPage
				.getSelectLists(SharesPageConstants.CREATE_SHARES_APPLY_OBJECTIVE_OR_TIER_OPTIONS);
		SelectList objectives = selectedLists.get(0);
		String actualValue = getExistingObjectives(objectives, value);
		System.out.println("Value: " + actualValue);
		return actualValue;
	}
	
	private String getExistingObjectives(SelectList objectives, String expectedValue) {
		String actualValue = "";
		WebElement objectiveElement = objectives.getUnderlyingElement();
		List<WebElement> existingObjectives = objectiveElement.findElements(By.xpath("//*[@class='item']"));
		for(WebElement existingObjective : existingObjectives) {
			String objective = existingObjective.getText().trim();
			if(objective != null && !objective.isEmpty() && objective != "" && objective.equalsIgnoreCase(expectedValue)) {
				actualValue = objective;
				System.out.println("Actaulvalue: " + actualValue);
				break;
			}
		}
		return actualValue;
	}
	
	/*private void setExistingObjectives(SelectList objectives) {
		ArrayList<String> existingObjectivesList = new ArrayList<String>();
		WebElement objectiveElement = objectives.getUnderlyingElement();
		List<WebElement> existingObjectives = objectiveElement.findElements(By.xpath("//*[@class='item']"));
		for(WebElement existingObjective : existingObjectives) {
			String objective = existingObjective.getText().trim();
			if(objective != null && !objective.isEmpty() && objective != "" && objective.length() > 2) {
				System.out.println("Objective Text: " + objective);
				existingObjectivesList.add(objective);
			}
		}
		this.existingObjectives.put("Objectives", existingObjectivesList);
	}
	
	private void setExistingTiers(SelectList tiers) {
		ArrayList<String> existingTiersList = new ArrayList<String>();
		WebElement tierElement = tiers.getUnderlyingElement();
		List<WebElement> existingTiers = tierElement.findElements(By.xpath("//*[@class='item']"));
		for(WebElement existingTier : existingTiers) {
			String tier = existingTier.getText().trim();
			if(tier != null && !tier.isEmpty() || tier != "") {
				System.out.println("Tier text: " + tier);
				existingTiersList.add(tier);
			}
		}
		this.existingTiers.put("Tiers", existingTiersList);
	}*/
	
	public void clickOnPopoverCreateShareButton() {
		sharesPage.getPopover(
				SharesPageConstants.CREATE_SHARE_POPOVER_BOTTOM).click();
		sharesPage.getButton(SharesPageConstants.CREATE_SHARES_CREATE_BUTTON).click();
		waitUntilTimeout(15);
	}
	
	public void searchForShare(String shareName) {
		waitUntilTimeout(30);
		sharesPage.getTable(SharesPageConstants.SHARES_TABLE).search(shareName);
		waitUntilTimeout(3);
	}
	
	public void clickOnShare(String shareName) {
		WebElement tableRow = sharesPage.getTable(SharesPageConstants.SHARES_TABLE).getFirstRow();
		tableRow.findElement(By.xpath("//a[contains(text(), '" + shareName + "')]")).click();
		waitUntilTimeout(5);
		waitUntilPageDataLoads("Shares files are loading");
	}
	
	public SharesPage getInstance() {
		return this;
	}
	
	public void connect(String clientIP, String username, String password) {
		try {
			JSch jsch = new JSch();
			session = jsch.getSession(username, clientIP, 22);
			session.setPassword(password);
			java.util.Properties config = new java.util.Properties();
			config.put("StrictHostKeyChecking", "no");
			session.setConfig(config);
			session.connect();
			channel = (ChannelSftp) session.openChannel("sftp");
			channel.connect();
			System.out.println("Channel has been opened to communicate with client machine.");
		} catch (JSchException je) {
		}
	}
	
	String clientSharePath = "";

	public void createDirectoryIfNotExistsAlready(String dirPath) { //dirPath: /mnt/share/
		try {
			String newDirPath = "";
			clientSharePath = dirPath;
			if (!dirPath.endsWith("/")) {
				newDirPath = dirPath + "/";
			}

			if (!isDirectoryAlreadyExists(newDirPath)) {
				System.out.println("Share director not exist already");
				ChannelExec channelExec = (ChannelExec) session
						.openChannel("exec");
				InputStream in = null;
				if (in == null) {
					in = channelExec.getInputStream();
				}
				channelExec.setCommand("mkdir " + dirPath);
				channelExec.connect();
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(in));
				String line;
				int index = 0;
				while ((line = reader.readLine()) != null) {
					System.out.println(++index + " : " + line);
				}
				channelExec.disconnect();
				System.out.println("Create share directory. Done!");
				channel.cd("share");
			} else {
				System.out.println("Directory path may already exists.");
			}
		} catch (SftpException | IOException | JSchException es) {

		}
	}
	
	/**
	 * We are changing the working directory if already exists
	 * 
	 * @param dirPath
	 * @return
	 */
	public boolean isDirectoryAlreadyExists(String dirPath) {
		changeDirectories(dirPath);
		return isDirAlreadyExist;
	}
	
	boolean isDirAlreadyExist = false;
	boolean doesReachedLastDir = false;
	
	/**
	 * Complicated method switching the directories recursively with provided path
	 * 
	 * @param dirPath
	 */
	private void changeDirectories(String dirPath) {
		String parentDir = "";
		boolean dirSwitched = false;
		try {
			if (dirPath.contains("/")) {
				System.out.println(dirPath + " - changedDirectories: " + dirPath.contains("/"));
				parentDir = dirPath.substring(0, dirPath.indexOf("/"));
				String pwd = channel.pwd();
				channel.cd("/");
				pwd = channel.pwd();
				System.out.println("PWD: " + pwd);
				@SuppressWarnings("rawtypes")
				Vector vector = channel.ls(pwd);
				for (Object dirs : vector) {
					LsEntry entry = (LsEntry) dirs;
					String fileName = entry.getFilename();
					System.out.println("fileName: " + fileName);
					if (fileName.equals(parentDir)) {
						channel.cd(parentDir);
						dirSwitched = true;
						System.out.println("Switched dir: " + parentDir);
						break;
					}
				}
				System.out.println("dirSwitched: " + dirSwitched);
				if (dirSwitched) {
					changeDirectories(dirPath.substring(
							dirPath.indexOf("/") + 1, dirPath.length()));
				}
			} else {
				boolean condition =	!dirSwitched && dirPath.contains("/");
				System.out.println("Condition for dir reached last folder: " + condition);
				if (condition) {
					doesReachedLastDir = false;
				}
				isDirAlreadyExist = true;
			}
		} catch (SftpException e) {
			e.printStackTrace();
		}
	}
	
	
	public void mountShare(String dataportalIP, String sharePath, String mountType) {
		String command = "";
		try {
			Channel channelExec = (Channel) session.openChannel("shell");
			channelExec.setOutputStream(System.out);
			command = "mount -o vers=3.0 "+dataportalIP+":/mnt/data-portal"+sharePath+" "+clientSharePath+"";
			System.out.println("constructed mount cmd: " + command);
			if(!mountType.equals("nfs")) {
				command = "";
			}
			// Create a Shell Script
			File shellScript = mountShareWithShellScript(command);
			// Convert the shell script to byte stream
			@SuppressWarnings("resource")
			FileInputStream fin = new FileInputStream(shellScript);
			byte fileContent[] = new byte[(int) shellScript.length()];
			fin.read(fileContent);
			InputStream in = new ByteArrayInputStream(fileContent);
			// Set the shell script to the channel as input stream
			channelExec.setInputStream(in);
			// Connect and have fun!
			channelExec.connect();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JSchException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private File mountShareWithShellScript(String cmd) {
	     String filename = PDConstants.PWD + "\\data\\shell_scripts\\shellscript.sh";
	     File fstream = new File(filename);
	     try{
	          // Create file 
	         PrintStream out = new PrintStream(new FileOutputStream(fstream));
//	         out.println("mkdir /mnt/share");
	         out.println(cmd);
	         out.print("Executed mount command");
	         out.println("mount");
	         //Close the output stream
	         out.close();
	     }catch (Exception e){//Catch exception if any
	         System.err.println("Error: " + e.getMessage());
	     }
	     return fstream;
	}
	
	private File createAFile(String cmd, String fileName) {
		String scriptName = PDConstants.PWD + "\\data\\shell_scripts\\" + fileName + ".sh";
		File scriptFile = new File(scriptName);
	     try{
	          //Create file 
	         PrintStream out = new PrintStream(new FileOutputStream(scriptFile));
	         out.println(cmd);
	         out.close();
	     }catch (Exception e){//Catch exception if any
	         System.err.println("Error: " + e.getMessage());
	     }
	     return scriptFile;
	}
	
	/**
	 * Create a File
	 * 
	 * @param fileName
	 * @throws JSchException
	 * @throws IOException
	 */
	public void createFile(String fileName) {
		FileInputStream fin = null;
		try {
			System.out.println("Session: " + session);
			Channel channelExec = (Channel) session.openChannel("shell");
			channelExec.setOutputStream(System.out);
			String command = "dd if=/dev/zero of=" + clientSharePath + "/" + (fileName) + " bs=1024k count=100";
			File shellScript = createAFile(command, "createFile");
			fin = new FileInputStream(shellScript);
			byte fileContent[] = new byte[(int) shellScript.length()];
			fin.read(fileContent);
			InputStream in = new ByteArrayInputStream(fileContent);
			channelExec.setInputStream(in);
			channelExec.connect();
		} catch (JSchException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 
	 * @param filesCount
	 */
	public void createRandomNumberOfFiles(String fileType, int fileCount) {
		try {
			Channel channelExec = (Channel) session.openChannel("shell");
			channelExec.setOutputStream(System.out);
			// create random files with perl code
			String command = "for($i=0; $i < " + (fileCount)
					+ "; $i++) {" + "system(\"dd if=/dev/zero of="
					+ (clientSharePath) + "/file_$i" + (fileType)
					+ " bs=1024 count=100\"); " + "sleep(1);"
					+ "}";
			System.out.println("Perl code: " + command);
			String pwd = channel.pwd();
			WriteFileToLinux(command, pwd, "createRandomFiles.pl");
			changeDirectories(clientSharePath);
			command = "perl /createRandomFiles.pl";
			File shellScript = createAFile(command, "runPerlScript");
			runShellScript(shellScript, channelExec);
		} catch (JSchException e) {
			e.printStackTrace();
		} catch (SftpException e) {
			e.printStackTrace();
		}
	}
	
	public void WriteFileToLinux(String str_Content,
			String str_FileDirectory, String str_FileName) {
		try {
//			session.connect();
			Channel obj_Channel = session.openChannel("sftp");
			obj_Channel.connect();
			ChannelSftp obj_SFTPChannel = (ChannelSftp) obj_Channel;
			obj_SFTPChannel.cd(str_FileDirectory);
			InputStream obj_InputStream = new ByteArrayInputStream(
					str_Content.getBytes());
			obj_SFTPChannel.put(obj_InputStream, str_FileDirectory
					+ str_FileName);
			obj_SFTPChannel.exit();
			obj_InputStream.close();
			obj_Channel.disconnect();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	private void runShellScript(File shellScript, Channel channelExec) {
		FileInputStream fin = null;
		try {
//			PipedInputStream in = new PipedInputStream();
//			PipedOutputStream out = new PipedOutputStream(in);
			fin = new FileInputStream(shellScript);
			byte fileContent[] = new byte[(int) shellScript.length()];
			fin.read(fileContent);
			InputStream in = new ByteArrayInputStream(fileContent);
			channelExec.setInputStream(in);
			channelExec.connect();
		} catch (JSchException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/*private int getRandomNumber() {
		int number = (int)Math.ceil(Math.random() * 100);
		return number;
	}
	
	private int randomWithRange(int min, int max) {
		int range = Math.abs(max - min) + 1;
		return (int) (Math.random() * range) + (min <= max ? min : max);
	}*/
	
}
