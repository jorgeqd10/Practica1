package steps;

import PO.categories.Laptops;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class LaptopsSteps {

    private Laptops laptop = new Laptops();

    @Given("I open laptop page")
    public void iOpenLaptopPage() {
        getDriver().manage().window().maximize();
        getDriver().get("https://www.demoblaze.com/index.html#");
    }

    @Then("Print device price of the position {int}")
    public void printDevicePriceOfThePosition(int index) {
        laptop.getPrice(index);
    }


}
