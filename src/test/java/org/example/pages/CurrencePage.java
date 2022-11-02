package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CurrencePage {
    private WebDriver driver;
    private By customerCurrency= By.id("customerCurrency");
    public CurrencePage(WebDriver d) {
        this.driver = d;
    }
    Select select;
    //HomePage homePage;
    public void switchBetweenCurrency(String optionselect){

        Select select=new Select(driver.findElement(customerCurrency));
        select.selectByVisibleText(optionselect);
    }
    public void changeCurrency() {
            select = new Select(driver.findElement(customerCurrency));
            select.selectByIndex(1);
            //homePage.scrollTo("400");
        }
    }

