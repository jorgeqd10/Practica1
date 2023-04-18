package PO;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class BasePage {

    protected WebDriverWait wait;
    public BasePage() {
        PageFactory.initElements(getDriver(), this);
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
    }
}
