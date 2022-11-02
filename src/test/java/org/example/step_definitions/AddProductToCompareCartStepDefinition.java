package org.example.step_definitions;

import org.example.pages.CompareListCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddProductToCompareCartStepDefinition {
    CompareListCartPage compareListCartPage=Hooks.homepage.CompareListCartPage1();

    @Given("Logged user could add different products to compare cart")
    public void logged_user_could_add_different_products_to_compare_cart() {

    }
    @When("user add Frist products to compare cart")
    public void user_add_frist_products_to_compare_cart() {
       compareListCartPage.addFristproducte();
    }
    @And("user add Scoend products to compare cart")
    public void user_add_scoend_products_to_compare_cart() {
        compareListCartPage.addSecondproducte();
    }
    @Then("assert compare cart have two product")
    public void assert_compare_cart_have_two_product() throws InterruptedException {
        Assert.assertEquals(compareListCartPage.getresultsuccessaddtocompare(),"The product has been added to your product comparison");
        System.out.println("Hossam---------------Two product ----"+compareListCartPage.getresultsuccessaddtocompare());
        Thread.sleep(3000);
    }


}
