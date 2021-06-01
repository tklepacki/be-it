package stores.mohito.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.CustomFluentWait;
import utils.ScrollToElement;

public class LoginPage {

	@FindBy(id = "login[username]_id")
	private WebElement emailTextField;

	@FindBy(id = "login[password]_id")
	private WebElement passwordTextField;

	@FindBy(xpath = "//div[@id='loginRegisterRoot']/div/div/div/form/button")
	private WebElement loginSubmitBtn;

	private ScrollToElement scroll;

	public LoginPage (WebDriver driver) {
		scroll = new ScrollToElement(driver);
	}

	public void sendLogin(String email) {
		emailTextField.clear();
		emailTextField.sendKeys(email);
	}

	public void sendPassword(String password) {
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
	}

	public void clickLoginBtn(WebDriver driver) {
		scroll.scrollToElement(loginSubmitBtn);
		loginSubmitBtn.click();
	}

}