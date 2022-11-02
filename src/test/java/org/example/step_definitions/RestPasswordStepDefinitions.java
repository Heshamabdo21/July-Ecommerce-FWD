package org.example.step_definitions;

import org.example.pages.RestPasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RestPasswordStepDefinitions {

    RestPasswordPage restPasswordPage;
    //LoginPage loginPage=Hooks.homepage.loginPage1();
   @Given("user go to Rest page")
    public void user_go_to_rest_page() {
     //  loginPage.logOutUser();
      Hooks.homepage.loginPage1();
       restPasswordPage =Hooks.homepage.restPasspage();
    }
    @When("user rest with valid email")
    public void user_rest_with_valid_email() {
       String email=registerStepDefinition.usernEmail;
       restPasswordPage.setEmailToRestPassword(email);
    }
    @And("user press on Recover button")
    public void user_press_on_recover_button() {
       restPasswordPage.clickOnBtuuonRest();
    }
    @Then("user rest password successfully")
    public void user_rest_password_successfully() throws InterruptedException {
       Assert.assertEquals(restPasswordPage.getResultfromRest(),"Email with instructions has been sent to you.","incorrect message");
       System.out.println("Nancy----------------"+restPasswordPage.getResultfromRest());
       Thread.sleep(3000);
     }


}
