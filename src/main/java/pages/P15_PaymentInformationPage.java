package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P15_PaymentInformationPage {
    //1- Define the Driver
    WebDriver driver;
    //2- Define the Constructor and initialize the driver
    public P15_PaymentInformationPage (WebDriver driver){
        this.driver = driver;
    }
    //3- Define the locators
    private final By creditCardType = By.id("CreditCardType");
    private final By cardHolderName = By.id("CardholderName");
    private final By cardNumber = By.id("CardNumber");
    private final By expirationMonth = By.id("ExpireMonth");
    private final By expirationYear = By.id("ExpireYear");
    private final By cardCode = By.id("CardCode");
    private final By continueBtn = By.xpath("//button[@class=\"button-1 payment-info-next-step-button\"]");

    //4- Define the Action Methods
    public P15_PaymentInformationPage selectCreditCardType (int index){
        Select cCType = new Select(driver.findElement(this.creditCardType));
        cCType.selectByIndex(index);
        return this;
    }
    public P15_PaymentInformationPage enterCardHolderName (String cardHolderName){
        driver.findElement(this.cardHolderName).sendKeys(cardHolderName);
        return this;
    }
    public P15_PaymentInformationPage enterCardNumber (String cardNumber){
        driver.findElement(this.cardNumber).sendKeys(cardNumber);
        return this;
    }
    public P15_PaymentInformationPage selectExpirationMonth (int index){
        Select expirationMonth = new Select(driver.findElement(this.expirationMonth));
        expirationMonth.selectByIndex(index);
        return this;
    }
    public P15_PaymentInformationPage selectExpirationYear (int index){
        Select expirationYear = new Select(driver.findElement(this.expirationYear));
        expirationYear.selectByIndex(index);
        return this;
    }
    public P15_PaymentInformationPage enterCardCode (String cardCode){
        driver.findElement(this.cardCode).sendKeys(cardCode);
        return this;
    }
    public P15_PaymentInformationPage clickContinueBtn (){
        driver.findElement(this.continueBtn).click();
        return this;
    }

}
