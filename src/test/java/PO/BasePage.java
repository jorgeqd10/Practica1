package PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class BasePage {


    @FindBy(xpath = "//a[contains(text(), 'Laptops')]")
    private WebElement laptopLink;

    protected WebDriverWait wait;
    public BasePage() {
        PageFactory.initElements(getDriver(), this);
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
    }

    public void clickLaptop(){
        wait.until(ExpectedConditions.visibilityOf(laptopLink)).click();
    }



}
