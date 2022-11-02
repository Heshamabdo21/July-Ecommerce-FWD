package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListCartPage extends CategoriesPage {
    WebDriver driver;

    private By Fristproduct= By.xpath("//div[@data-productid='37']");
    private By addFristtocart=By.id("add-to-wishlist-button-37");
    private By Secondproduct= By.xpath("//div[@data-productid='18']");
    private By addSecondtocart=By.id("add-to-wishlist-button-18");
    private By successaddtowishlist=By.xpath("//*[@id=\"bar-notification\"]/div/p");

    public WishListCartPage(WebDriver driver) {
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
    public String getresultsuccessaddtowishlist(){
        return driver.findElement(successaddtowishlist).getText();
    }



}
