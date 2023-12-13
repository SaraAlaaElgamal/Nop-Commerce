package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P14_PaymentMethodPage {
    //1- Define the Driver
    WebDriver driver;
    //2- Define the Constructor and initialize the driver
    public P14_PaymentMethodPage (WebDriver driver){
        this.driver = driver;
    }
    //3- Define the locators
    private final By creditCard = By.id("paymentmethod_1");
    private final By continueBtn = By.xpath("//button[@class=\"button-1 payment-method-next-step-button\"]");
    //4- Define the Action Methods
    public P14_PaymentMethodPage selectCreditCard (){
        driver.findElement(this.creditCard).click();
        return this;
    }
    public P14_PaymentMethodPage clickContinueBtn (){
        driver.findElement(this.continueBtn).click();
        return this;
    }

}
