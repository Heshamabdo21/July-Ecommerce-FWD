package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RestPasswordPage {
    private WebDriver driver;

    private By EmailToRestPassword =By.id("Email");
    private By coverBtn =By.xpath("//button[@name='send-email']");
    private By resultfromRest=By.xpath("//p[@class='content']");


    public RestPasswordPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setEmailToRestPassword(String email){
        driver.findElement(EmailToRestPassword).sendKeys(email);
    }
    public void clickOnBtuuonRest(){
        driver.findElement(coverBtn).click();
    }
    public String getResultfromRest(){

        return driver.findElement(resultfromRest).getText();
    }

}
