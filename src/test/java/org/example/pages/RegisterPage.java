package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

    private WebDriver driver;

    private By gendermale= By.id("gender-male" );
    private By Fristname=  By.id("FirstName" );
    private By LastName=  By.id("LastName" );
    private By Email= By.id("Email" );
    private By Password= By.id("Password" );
    private By ConfirmPassword= By.id("ConfirmPassword" );
    private By registerBtn= By.id("register-button" );
    private By resRegister= By.className("result");
    private  By logout=By.linkText("Log out");

    public RegisterPage(WebDriver d){
        this.driver=d;
    }
    public void registerNewUser(String fristName,String lastName ,String email ,String password){

        clickButton(driver.findElement(gendermale));
        setTextToField(Fristname,fristName);
        setTextToField(LastName,lastName);
        setTextToField(Email,email);
        setTextToField(Password,password);
        setTextToField(ConfirmPassword,password);

    }
    public void clickBtnregister(){
        clickButton(driver.findElement(registerBtn));
    }
    public String resulteRegister(){
        return driver.findElement(resRegister).getText();
    }
    public void logOutUser(){
        clickButton(driver.findElement(logout));
    }
    public void setTextToField(By element ,String s){
        driver.findElement(element).sendKeys(s);
    }
    protected static void clickButton(WebElement button)
    {
        button.click();
    }


}
