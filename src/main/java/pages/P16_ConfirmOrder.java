package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class P16_ConfirmOrder {
    //1- Define the Driver
    WebDriver driver;
    //2- Define the Constructor and initialize the driver
    public P16_ConfirmOrder (WebDriver driver){
        this.driver = driver;
    }
    //3- Define the locators
    private final By continueBtn = By.xpath("//button[@class=\"button-1 confirm-order-next-step-button\"]");
    //4- Define the Action Methods
    public P16_ConfirmOrder clickContinueBtn (){
        driver.findElement(this.continueBtn).click();
        return this;
    }

}
