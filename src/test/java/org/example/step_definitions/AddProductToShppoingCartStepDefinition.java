package org.example.step_definitions;

import org.example.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddProductToShppoingCartStepDefinition {
    ShoppingCartPage shoppingCartPage=Hooks.homepage.ShoppingCartPage1();
    @Given("Logged user could add different products to Shopping cart")
    public void logged_user_could_add_different_products_to_shopping_cart() {


    }
    @When("user add Frist products to Shopping cart")
    public void user_add_frist_products_to_shopping_cart() {
        shoppingCartPage.addFristproducte();
    }
    @Then("assert shopping cart have Frist product")
    public void assert_shopping_cart_have_two_product2() {
        Assert.assertEquals(shoppingCartPage.getresulttoaddtocart(),"The product has been added to your shopping cart");
        System.out.println("Hossam---------------Frist product ----"+shoppingCartPage.getresulttoaddtocart());
    }
    @And("user add Scoend products to Shopping cart")
    public void user_add_scoend_products_to_shopping_cart() {
        shoppingCartPage.addSecondproducte();
    }
    @Then("assert shopping cart have Scoend product")
    public void assert_shopping_cart_have_two_product() {
        Assert.assertEquals(shoppingCartPage.getresulttoaddtocart(),"The product has been added to your shopping cart");
        System.out.println("Hossam---------------Sceond product ----"+shoppingCartPage.getresulttoaddtocart());
    }
}
