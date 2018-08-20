package step_definitions;

import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.datasphere.constants.PDConstants;
import com.datasphere.page.constants.UserConfigConstants;
import com.datasphere.utils.PropertiesFile;

final class WebDriverFactory {

	private WebDriverFactory() {
	}

	static WebDriver create() {
		loadProperties();
		String webDriverProperty = UserConfigConstants.BROWSER;//getProperty("webdriver");
		if (webDriverProperty == null || webDriverProperty.isEmpty()) {
			throw new IllegalStateException(
					"The webdriver system property must be set");
		}
		try {
			return Drivers.valueOf(webDriverProperty.toUpperCase()).newDriver();
		} catch (IllegalArgumentException e) {
			String msg = System.out
					.format("The webdriver system property '%s' did not match any "
							+ "existing browser or the browser was not supported on your operating system. "
							+ "Valid values are %s", webDriverProperty, Drivers.values()).toString();
			throw new IllegalStateException(msg, e);
		}
	}

	private static void loadProperties() {
		Properties data = PropertiesFile
				.ReadPropertyFile("data//configData.properties");
		UserConfigConstants.URL = data.getProperty("url");
		UserConfigConstants.BROWSER = data.getProperty("browserName");
	}

	public static String getURL() {
		return UserConfigConstants.URL;
	}
	
	private enum Drivers {
		FIREFOX {
			@Override
			public WebDriver newDriver() {
				DesiredCapabilities capabilities = DesiredCapabilities
						.firefox();
				return new FirefoxDriver(capabilities);
			}
		},
		CHROME {
			@Override
			public WebDriver newDriver() {
				System.setProperty("webdriver.chrome.driver", PDConstants.CHROME_DRIVER_PATH);
				
				HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
				chromePrefs.put("profile.default_content_settings.popups", 0);
				chromePrefs.put("download.default_directory", PDConstants.DOWNLOAD_PATH);
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("prefs", chromePrefs);
				options.addArguments("--disable-web-security");
				options.addArguments("--start-maximized");
				options.addArguments("disable-infobars");
				
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				
				return new ChromeDriver(capabilities);
			}
		},
		OPERA {
			@Override
			public WebDriver newDriver() {
				DesiredCapabilities capabilities = DesiredCapabilities
						.operaBlink();
				return new OperaDriver(capabilities);
			}
		},
		PHANTOMJS {
			@Override
			public WebDriver newDriver() {
				DesiredCapabilities capabilities = DesiredCapabilities
						.phantomjs();
				return new PhantomJSDriver(capabilities);
			}
		},
		IE {
			@Override
			public WebDriver newDriver() {
				DesiredCapabilities capabilities = DesiredCapabilities
						.internetExplorer();
				return new InternetExplorerDriver(capabilities);
			}
		},
		EDGE {
			@Override
			public WebDriver newDriver() {
				DesiredCapabilities capabilities = DesiredCapabilities.edge();
				return new EdgeDriver(capabilities);
			}
		};

		public abstract org.openqa.selenium.WebDriver newDriver();

	}
}