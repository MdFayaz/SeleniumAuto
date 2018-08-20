package com.datasphere.constants;

import java.util.HashMap;
import java.util.Locale;

public class PDConstants {


	public final static int PAGELOAD_TIMEOUT_THRESHOLD = 10;
	public final static int DRIVER_TIMEOUT = 30;
	
	public static long START_TIME;
	
	public static String UI_URL;

	public final static String GUID = "guid";
	public final static String TAG_NAME = "tagName";
	public final static String LINEAGE_DATA = "lineageData";
	public final static String SEARCH_STRING = "searchDataFeed";
	public final static String INVALID_SEARCH_STRING = "invalidSearchDataFeed";
	public final static String SEARCH_TABLE_HEADERS = "searchTableHeaders";
	
	public final static String BUTTON_ATTRIBUTE_AS_DISBALED = "disabled";
	public final static String PWD = System.getProperty("user.dir");
	public final static String HANDLE_UPLOAD_DIALOG = PWD+"\\lib\\HandleDialog.exe";
	public final static String SCREENSHOTS_DIR = PWD + "\\test-output\\screenshots\\";
	public final static String REPORT_FILE_PATH = PWD + "\\test-output\\emailable-report.html";
	public final static String CHROME_DRIVER_PATH = PWD + "\\lib\\chromedriver.exe";
	public final static String FIREFOX_DRIVER_PATH = PWD + "\\lib\\geckodriver.exe";
	public final static String IE_DRIVER_PATH = PWD + "\\lib\\IEDriverServer.exe";
	
	public static final String LINK_CLICKED = "link clicked";
	public static final String BROWSER_TYPE = "firefox";
	
	public static final String LEFT_NAV_MENU_ITEM_NAMES = "leftNavMenuItemsName";
	public static String SCREENSHOT_PATH = "";
	public static final HashMap<String, String> FAILED_METHODS_WITH_SCREENSHOT = new HashMap<String, String>();
	
	public final static String DOWNLOAD_PATH = PWD + "\\downloads\\";
	public static String UPGRADER_FILE_PATH = "http://jenkees.corp.primarydata.com/builds/products/datasphere/";
	public static String CD_VERSION = "";
	public static String BUILD_NUMBER = "";
	public static String UPD_FILE_NAME = "";
	public static Locale LOCALE = Locale.ENGLISH;
	public static String LOGIN_LOCATOR_FILE = "";
	
	
	public final static String CREDENTIALS = PWD+"\\data\\credentials";
	public final static String DATA_PROVIDER_LOGIN_DETAILS = "loginDetails";
	
	public final static String USERNAME = "Username";
	public final static String PASSWORD = "Password";
	
	public final static String DEFAULT_USER = "admin";
	public final static String DEFAULT_PASSWORD = "admin";
	
	public final static String OS = System.getProperty("os.name");
	public final static String WIN_OS_CHROME_DRIVER = PWD + "\\lib\\chromedriver.exe";
	public final static String IOS_CHROME_DRIVER = PWD + "\\lib\\chromedriver";


}
