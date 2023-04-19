package steps;

import PO.BasePage;
import io.cucumber.java.en.Then;

public class BaseSteps {
    private BasePage basePage = new BasePage();

    @Then("Click on Laptops option")
    public void clickOnLaptopsOption() throws InterruptedException {
        basePage.clickLaptop();
        Thread.sleep(2000);
    }
}
