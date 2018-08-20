package step_definitions;

import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.datasphere.page.AdministrationPage;
import com.datasphere.page.DashboardPage;
import com.datasphere.page.DataProfilerPage;
import com.datasphere.page.InfrastructureAndDataPage;
import com.datasphere.page.LandingPage;
import com.datasphere.page.LoginPage;
import com.datasphere.page.ObjectivesAndTiersPage;
import com.datasphere.page.ObjectivesPage;
import com.datasphere.page.SharesPage;
import com.datasphere.page.StorageSystemsPage;
import com.datasphere.page.TiersPage;
import com.datasphere.page.VolumeGroupsPage;
import com.datasphere.page.VolumesPage;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedDriver extends EventFiringWebDriver {
	private static final WebDriver REAL_DRIVER = WebDriverFactory.create();
	private static boolean isBrowserAlreadyLaunched = false;

	private static final Thread CLOSE_THREAD = new Thread() {
		@Override
		public void run() {
			REAL_DRIVER.quit();
		}
	};

	static {
		Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
	}

	public SharedDriver() {
		super(REAL_DRIVER);
	}

	@Override
	public void quit() {
		if (Thread.currentThread() != CLOSE_THREAD) {
			throw new UnsupportedOperationException(
					"You shouldn't quit this WebDriver. It's shared and will quit when the JVM exits.");
		}
		super.quit();
	}

	@Before
	public void deleteAllCookies() {
		manage().deleteAllCookies();
	}

	@After
	public void embedScreenshot(Scenario scenario) {
		try {
			byte[] screenshot = getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		} catch (WebDriverException somePlatformsDontSupportScreenshots) {
			System.err
					.println(somePlatformsDontSupportScreenshots.getMessage());
		}
	}

	public static WebDriver getDriver() {
		return REAL_DRIVER;
	}

	public void get(String url) {
		System.out.println("Driver: " + REAL_DRIVER);
		if(REAL_DRIVER != null && !isBrowserAlreadyLaunched) {
			REAL_DRIVER.get(url);
			isBrowserAlreadyLaunched = true;
		}
	}

	public void maximize() {
		manage().window().maximize();
	}
	
	public String getCurrentUrl() {
		return WebDriverFactory.getURL();
	}

	public String getTitle() {
		return REAL_DRIVER.getTitle();
	}

	public String getPageSource() {
		return REAL_DRIVER.getPageSource();
	}

	public void close() {
		REAL_DRIVER.close();
	}

	public Set<String> getWindowHandles() {
		return REAL_DRIVER.getWindowHandles();
	}

	public String getWindowHandle() {
		return REAL_DRIVER.getWindowHandle();
	}

	public TargetLocator switchTo() {
		return REAL_DRIVER.switchTo();
	}

	public Navigation navigate() {
		return REAL_DRIVER.navigate();
	}

	public Options manage() {
		return REAL_DRIVER.manage();
	}
	
	public static LoginPage loginPage;
	public static LandingPage landingPage;
	public static DashboardPage dashboardPage;
	public static ObjectivesAndTiersPage objectivesAndTiers;
	public static ObjectivesPage objectivesPage;
	public static TiersPage tiersPage;
	public static DataProfilerPage dataProfiler;
	public static InfrastructureAndDataPage infrastructureAndDataPage;
	public static StorageSystemsPage storageSystem;
	public static SharesPage shares;
	public static VolumesPage volumes;
	public static VolumeGroupsPage volumeGroups;
	public static AdministrationPage adminPage;

}
