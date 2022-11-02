package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends CategoriesPage {
    WebDriver driver;

    private By Fristproduct= By.xpath("//div[@data-productid='39']");
    private By addFristtocart=By.id("add-to-cart-button-39");
    private By Secondproduct= By.xpath("//div[@data-productid='19']");
    private By addSecondtocart=By.id("add-to-cart-button-19");
    private By successaddtoshopping=By.xpath("//*[@id=\"bar-notification\"]/div/p");

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
    public void addFristproducte(){
        selectCategoryBook();
        driver.findElement(Fristproduct).click();
        driver.findElement(addFristtocart).click();
    }

    public void addSecondproducte(){
        selectSubCategory();
        driver.findElement(Secondproduct).click();
        driver.findElement(addSecondtocart).click();
    }
    public String getresulttoaddtocart(){
        return driver.findElement(successaddtoshopping).getText();
    }


}
