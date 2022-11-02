package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    public JavascriptExecutor jse;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    private void ClickLink(String Linkttext){
        driver.findElement(By.linkText(Linkttext)).click();
    }

    public RegisterPage redirectedToregisterPage(){
        ClickLink("Register");
        return new RegisterPage(driver);
    }
    public LoginPage loginPage1(){
        ClickLink("Log in");
        return new LoginPage(driver);
    }
    public LoginPageBeforeSearch LoginPageBeforeSearch1(){
        return new LoginPageBeforeSearch(driver);
    }
    public CurrencePage currencePage1(){
       // ClickLink("Log in");
        return new CurrencePage(driver);
    }
    public SearchPage SearchPage1(){
        // ClickLink("Log in");
        return new SearchPage(driver);
    }
    public CategoriesPage CategoriesPage1(){
        return new CategoriesPage(driver);
    }
    public ShoppingCartPage ShoppingCartPage1(){
        return new ShoppingCartPage(driver);
    }
    public WishListCartPage WishListCartPage1(){
        return new WishListCartPage(driver);
    }
    public CompareListCartPage CompareListCartPage1(){
        return new CompareListCartPage(driver);
    }
    public CheckOutPage CheckOutPage1(){
        return new CheckOutPage(driver);
    }
    public FliterColorPage FliterColorPage1(){
        return new FliterColorPage(driver);
    }
    public ProducTag ProducTag1(){
        return new ProducTag(driver);
    }
    public RestPasswordPage restPasspage(){
        ClickLink("Forgot password?");
        return new RestPasswordPage(driver);
    }
    public void scrollTo(String scroll) {
        jse = (JavascriptExecutor) driver;
        jse.executeScript("scrollBy(0," + scroll + ")");
    }

}
