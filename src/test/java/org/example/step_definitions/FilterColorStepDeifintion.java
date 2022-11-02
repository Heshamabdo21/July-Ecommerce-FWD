package org.example.step_definitions;

import org.example.pages.FliterColorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilterColorStepDeifintion {
    FliterColorPage fliterColorPage=Hooks.homepage.FliterColorPage1();
    @Given("Logged user in home page to Filter")
    public void logged_user_in_home_page_to_filter() {

    }
    @When("user determined to Categories like Apparel > Shoes")
    public void user_detierment_to_categories_like_apparel_shoes() {
        fliterColorPage.selectSubCategory();
    }
    @And("Filter with blue color")
    public void filter_with_blue_color() {
        fliterColorPage.FilterBlueColor();
    }
    @Then("filtertion successfully")
    public void filtertion_successfully() {

    }

}
