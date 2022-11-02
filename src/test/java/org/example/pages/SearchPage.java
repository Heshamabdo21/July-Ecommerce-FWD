package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    WebDriver driver;
    private By searchbtn=By.id("small-searchterms");
    private By SearchBooks=By.id("small-searchterms");
    private By SearchClick=By.cssSelector("button[class=\"button-1 search-box-button\"]");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }
    public void Search(){
        driver.findElement(searchbtn).click();
    }
    public void SearchBtn(String search){
        driver.findElement(SearchBooks).sendKeys(search);
        driver.findElement(SearchClick).click();
    }

}
