package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class FliterColorPage {
    private WebDriver driver;
    Actions actions;
    private By ApparelCategory = By.cssSelector("a[href=\"/apparel\"]");
    private By ApparelSub_Category = By.cssSelector("a[href=\"/shoes\"]");
    private By BlueColor = By.id("attribute-option-16");


    public FliterColorPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
    }

    public void selectSubCategory() {
        actions.moveToElement(driver.findElement(ApparelCategory)).moveToElement(driver.findElement(ApparelSub_Category)).click().build().perform();
    }
    public void FilterBlueColor(){
        driver.findElement(BlueColor).click();
    }

}
