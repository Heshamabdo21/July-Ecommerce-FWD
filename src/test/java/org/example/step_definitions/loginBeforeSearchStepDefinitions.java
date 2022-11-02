package org.example.step_definitions;

import org.example.pages.LoginPageBeforeSearch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class loginBeforeSearchStepDefinitions {
    LoginPageBeforeSearch loginPageBeforeSearch;

    @Given("user go to login page before sreach")
    public void go_to_login_page1()  {
        loginPageBeforeSearch =Hooks.homepage.LoginPageBeforeSearch1();
        loginPageBeforeSearch.loginBeforSearch();
    }


    @When("user login  before search with valid email and password")
    public void valid_username_password()
    {
        String email= registerStepDefinition.usernEmail;
        String password=registerStepDefinition.password;
        loginPageBeforeSearch.UserLogin(email,password);

    }


    @Then("user login to the system successfully before search")
    public void success_login1()
    {
        Assert.assertEquals(loginPageBeforeSearch.GetMyAccount(),"My account","Login successful");
        System.out.println("Hossam----------------"+loginPageBeforeSearch.GetMyAccount());
    }
}
