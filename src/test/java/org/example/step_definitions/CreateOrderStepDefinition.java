package org.example.step_definitions;

import org.example.pages.CheckOutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CreateOrderStepDefinition {
    CheckOutPage checkOutPage=Hooks.homepage.CheckOutPage1();
    @Given("User Go to Shopping cart")
    public void user_got_to_shopping_cart() {
        checkOutPage.GotoCart();
    }
    @When("user Complete Data to create order")
    public void user_complete_data_to_create_order() throws InterruptedException {
        checkOutPage.CheckoutProduct("Joe", "Jack", "Egypt", "7ooda@email.com", "le2bal", "12345", "5487459655", "Edmonton");

    }
    @Then("assert user created order successful")
    public void assert_user_created_order_successful() throws InterruptedException {
        checkOutPage.confirmOrder();
        Assert.assertTrue(checkOutPage.ThankYoulbl.isDisplayed());
        checkOutPage.viewOrderDetails();
        System.out.println(checkOutPage.getorderinfo());
        Assert.assertEquals(checkOutPage.getorderinfo(),"Order information","order not compete");
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("orderdetails"));

    }

}
