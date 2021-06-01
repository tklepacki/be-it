package stores.reserved.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ScrollToElement;
import utils.Wait;

public class NewsletterPopUpPage {

	private final By newsletterPopUpLocator = By.xpath("//*[@id='newsletterContainer']/div[@class='close']");

	private WebDriver driver;
	private ScrollToElement scroll;

	public NewsletterPopUpPage(WebDriver driver) {
		this.driver = driver;
		this.scroll = new ScrollToElement(driver);
	}

	public void closeNewsletterPopUp() {
		Wait.waitForThreeSeconds();
		if (!driver.findElements(newsletterPopUpLocator).isEmpty()) {
			WebElement newsletterPopUp = driver.findElement(newsletterPopUpLocator);
			scroll.scrollToElement(newsletterPopUp);
			newsletterPopUp.click();
		}
	}
}