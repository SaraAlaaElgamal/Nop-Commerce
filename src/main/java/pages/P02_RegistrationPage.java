package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static util.Utility.generateRandomInt;

public class P02_RegistrationPage {
    //1- Define the Webdriver
    WebDriver driver;
    //2- Define the Constructor and initialize the driver
    public P02_RegistrationPage(WebDriver driver){
        this.driver = driver;
    }
    //3- Define the Locators
    private final By firstName = By.id("FirstName");
    private final By lastName = By.id("LastName");
    private final By day = By.xpath("//select[@name =\"DateOfBirthDay\"]");
    private final By month = By.xpath("//select[@name =\"DateOfBirthMonth\"]");
    private final By year = By.xpath("//select[@name =\"DateOfBirthYear\"]");
    private final By email = By.xpath("(//input)[7]");
    private final By companyName = By.xpath("(//input)[8]");
    private final By newSleter = By.xpath("(//input)[9]");
    private final By password = By.id("Password");
    private final By confirmPassword = By.id("ConfirmPassword");
    private final By registerBtn = By.xpath("(//button)[2]");
    //4- Define the Action Methods
    public P02_RegistrationPage chooseGender() {
        driver.findElement(By.xpath("(//input[@type=\"radio\"])["+generateRandomInt(2)+"]")).click();
        return this;
    }
    public P02_RegistrationPage enterFirstName(String firstName){
        driver.findElement(this.firstName).sendKeys(firstName);
        return this;
    }
    public P02_RegistrationPage enterLastName(String lastName){
        driver.findElement(this.lastName).sendKeys(lastName);
        return this;
    }
    public P02_RegistrationPage selectDay(int index){
        Select day= new Select(driver.findElement(this.day));
        day.selectByIndex(index);
        return this;
    }
    public P02_RegistrationPage selectMonth(int index){
        Select month = new Select(driver.findElement(this.month));
        month.selectByIndex(index);
        return this;
    }
    public P02_RegistrationPage selectYear(int index){
        Select year = new Select(driver.findElement(this.year));
        year.selectByIndex(index);
        return this;
    }
    public P02_RegistrationPage enterEmail(String email){
        driver.findElement(this.email).sendKeys(email);
        return this;
    }
    public P02_RegistrationPage enterCompanyName(String companyName){
        driver.findElement(this.companyName).sendKeys(companyName);
        return this;
    }
    public P02_RegistrationPage enterPassword(String password){
        driver.findElement(this.password).sendKeys(password);
        return this;
    }
    public P02_RegistrationPage enterConfirmPassword(String confirmPassword){
        driver.findElement(this.confirmPassword).sendKeys(confirmPassword);
        return this;
    }
    public P02_RegistrationPage clickRegisterBtn(){
        driver.findElement(this.registerBtn).click();
        return this;
    }
}

