package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_LandingPage {
    //1- Define the Driver
    WebDriver driver;
    //2- Define the Constructor and initialize the driver
    public P01_LandingPage (WebDriver driver){
        this.driver = driver;
    }
    //3- Define the locators
    private final By loginTab = By.xpath("(//a)[2]");
    private final By registerTab = By.xpath("(//a)[1]");
    //4- Define the action methods
    public P01_LandingPage clickRegisterTab(){
        driver.findElement(this.registerTab).click();
        return this;
    }
    public P01_LandingPage clickLoginTab (){
        driver.findElement(this.loginTab).click();
        return this;
    }
}
