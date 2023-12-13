package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P03_LoginPage {
    //1- Define Web Driver
    WebDriver driver;
    //2- Define Constructor and Initialize the driver
    public P03_LoginPage(WebDriver driver){
        this.driver = driver;
    }
    //3- Define the Locators
    private final By email = By.id("Email");
    private final By password = By.id ("Password");
    private final By rememberMe = By.id("RememberMe");
    private final By loginBtn = By.xpath("//button[@class=\"button-1 login-button\"]");
    private final By forgotPasswordBtn = By.xpath("//a[@href=\"/passwordrecovery\"]");
    //4- Define the Action Methods
    public P03_LoginPage enterEmail(String email) {

        driver.findElement(this.email).sendKeys(email);
        return this;
    }
    public P03_LoginPage enterPassword(String password) {

        driver.findElement(this.password).sendKeys(password);
        return this;
    }
    public P03_LoginPage clickRememberMe()
    {
        driver.findElement(this.rememberMe).click();
        return this;
    }
    public P03_LoginPage clickForgotPassword() {
        driver.findElement(this.forgotPasswordBtn).click();
        return this;
    }
    public P03_LoginPage clickLoginBtn() {

        driver.findElement(this.loginBtn).click();
        return this;
    }
}
