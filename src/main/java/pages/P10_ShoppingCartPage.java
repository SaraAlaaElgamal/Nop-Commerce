package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P10_ShoppingCartPage {
    //1- Define the Driver
    WebDriver driver;
    //2- Define the Constructor and initialize the driver
    public P10_ShoppingCartPage (WebDriver driver){
        this.driver = driver;
    }
    //3- Define the locators
    private final By agreeTermsAndConditionsBtn = By.id("termsofservice");
    private final By checkOutBtn = By.id("checkout");
    //4- Define the Action Methods
    public P10_ShoppingCartPage clickAgreeTermsAndConditions (){
        driver.findElement(this.agreeTermsAndConditionsBtn).click();
        return this;
    }
    public P10_ShoppingCartPage clickCheckOutBtn (){
        driver.findElement(this.checkOutBtn).click();
        return this;
    }
}
