package reserved.de;

import static org.testng.Assert.assertTrue;

import com.beust.jcommander.Parameter;
import driver.RemoteWebDriverCreator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driver.WebDriverCreator;
import reserved.de.testdata.UserDataProvider;
import stores.reserved.commons.CommonTestSteps;
import stores.reserved.page.PageObjectManager;

import java.net.MalformedURLException;

public class LoginTest {

	private WebDriver driver;
	private CommonTestSteps commonTestSteps;
	private PageObjectManager manager;
	private static final String URL = "http://reserved.com/de/de";

	@BeforeMethod
	public void setUp() {
		driver = new WebDriverCreator().createDriver("firefox");
		commonTestSteps = new CommonTestSteps(driver);
		manager = new PageObjectManager(driver);
	}

	@Test(dataProvider = "loginTest", dataProviderClass = UserDataProvider.class)
	public void loginTest(String email, String password) {

		commonTestSteps.loadMainPage(URL);
		commonTestSteps.loginUser(email, password);
		manager.getNewsletterPopUpPage().closeNewsletterPopUp();
		manager.getUserMenuPage().clickAccountIcon();

		assertTrue(manager.getUserAccountPage().isUserAccountPageDisplayed());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}