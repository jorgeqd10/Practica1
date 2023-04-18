package PO.categories;

import PO.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Phones extends BasePage {

    @FindBy(css = "div.card")
    private List<WebElement> card;
    private String title = ".//h4[@class='card-title']";

    public Phones() {

        PageFactory.initElements(getDriver(), this);
    }

    public void getName(int index){
        wait.until(ExpectedConditions.visibilityOf(card.get(index)));
        System.out.println("el titulo es: " + card.get(index).findElement(By.xpath(title)).getText());
    }
}
