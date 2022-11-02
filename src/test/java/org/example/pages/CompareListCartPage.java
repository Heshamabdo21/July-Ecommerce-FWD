package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompareListCartPage extends CategoriesPage {
    WebDriver driver;

    private By Fristproduct= By.xpath("//div[@data-productid='38']");
    private By addFristtocart=By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[2]/button");
    private By Secondproduct= By.xpath("//div[@data-productid='20']");
    private By addSecondtocart=By.xpath("//button[@onclick='return AjaxCart.addproducttocomparelist(\"/compareproducts/add/20\"),!1']");
    private By successaddtocompare=By.xpath("//*[@id=\"bar-notification\"]/div/p");
    public CompareListCartPage(WebDriver driver) {
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
    public String getresultsuccessaddtocompare(){
        return driver.findElement(successaddtocompare).getText();
    }




}
