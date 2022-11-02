package org.example.step_definitions;

import org.example.pages.WishListCartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddProductToWishListCartStepDefinition {
    WishListCartPage wishListCartPage=Hooks.homepage.WishListCartPage1();
    @Given("Logged user could add different products to Wishlist cart")
    public void logged_user_could_add_different_products_to_wishlist_cart() {

    }
    @When("user add Frist products to Wishlist cart")
    public void user_add_frist_products_to_wishlist_cart() {

        wishListCartPage.addFristproducte();
    }
    @When("user add Scoend products to Wishlist cart")
    public void user_add_scoend_products_to_wishlist_cart() {

        wishListCartPage.addSecondproducte();
    }
    @Then("assert Wishlist cart have two product")
    public void assert_wishlist_cart_have_two_product() {
        Assert.assertEquals(wishListCartPage.getresultsuccessaddtowishlist(),"The product has been added to your wishlist");
        System.out.println("Hossam---------------Two product ----"+wishListCartPage.getresultsuccessaddtowishlist());
    }

}
