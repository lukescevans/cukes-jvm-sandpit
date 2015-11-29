package step_defs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import support.VehicleModel;

import static junit.framework.Assert.assertTrue;

/**
 * Created by lukescevans on 21/11/15.
 */
public class HomePageStepDefs {
    public VehicleModel vehicleModel;
    public HomePage hp;

    public HomePageStepDefs(VehicleStepDefs vehicleStepDefs) {
        this.vehicleModel = vehicleStepDefs.vehicleModel;
    }

    @Then("^the page title should contain \"([^\"]*)\"$")
    public void the_page_title_should_contain(String expectedPageTitle) throws Throwable {
        if (hp.getTitle().contains(expectedPageTitle.toLowerCase())) {
            System.out.println("Korrect");
        }
        else {
            System.out.println("nada");
        }
    }

    @Given("^I am on the Home page$")
    public void I_am_on_the_Home_page() throws Throwable {
        hp = new HomePage();
        hp.goToPage();
    }

    @When("^I enter the search term \"([^\"]*)\"$")
    public void I_enter_the_search_term(String arg1) throws Throwable {
        hp.getTitle();
        hp.enterSearchTerm();
    }
}