package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P04_ForgotPasswordPage {
    //1- Define Webdriver
    WebDriver driver;
    //2- Define Constructor and initialize the driver
    public P04_ForgotPasswordPage (WebDriver driver){
        this.driver = driver;
    }
    //3- Define the Locators
    private final By email = By.id("Email");
    private final By recoverBtn = By.xpath("//button[@name=\"send-email\"]");
    //4- Define the Action Methods
    public P04_ForgotPasswordPage enterEmail(String email){
        driver.findElement(this.email).sendKeys(email);
        return this;
    }
    public P04_ForgotPasswordPage clickRecoverBtn(){
        driver.findElement(this.recoverBtn).click();
        return this;
    }
}
