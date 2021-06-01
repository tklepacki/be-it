package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollToElement {

    private WebDriver driver;

    public ScrollToElement (WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].scrollIntoView()", element);
    }
}
