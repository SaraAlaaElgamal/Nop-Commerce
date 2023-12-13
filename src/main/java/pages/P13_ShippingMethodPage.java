package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P13_ShippingMethodPage {
    //1- Define the Driver
    WebDriver driver;
    //2- Define the Constructor and initialize the driver
    public P13_ShippingMethodPage (WebDriver driver){
        this.driver = driver;
    }
    //3- Define the locators
    private final By continueBtn = By.xpath("//button[@class=\"button-1 shipping-method-next-step-button\"]");
    //4- Define the Action Methods
    public P13_ShippingMethodPage clickContinueBtn (){
        driver.findElement(this.continueBtn).click();
        return this;
    }
}
