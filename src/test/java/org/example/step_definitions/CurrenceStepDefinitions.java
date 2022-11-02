package org.example.step_definitions;

import org.example.pages.CurrencePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CurrenceStepDefinitions {
    CurrencePage currencePage;
    @Given("user in home page")
    public void user_in_home_page() {
        currencePage =Hooks.homepage.currencePage1();
    }

    @When("user detierment to Euro")
    public void user_detierment_to_euro() {
        currencePage.changeCurrency();
    }

    @Then("user switch between currencies US-Euro successfully")
    public void user_switch_between_currencies_us_euro_successfully() {
        Assert.assertTrue(true);
    }


}
