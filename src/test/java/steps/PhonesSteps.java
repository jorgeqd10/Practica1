package steps;

import PO.categories.Phones;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class PhonesSteps {

    private Phones phones = new Phones();

    @Given("I open devices page")
    public void iOpenDevicesPage() {
        getDriver().manage().window().maximize();
        getDriver().get("https://www.demoblaze.com/index.html");
    }

    @Then("Print device name {int}")
    public void printDeviceName(int index) {
        phones.getName(index);
    }
}
