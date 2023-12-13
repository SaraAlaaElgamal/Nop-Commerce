package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static util.Utility.generateRandomInt;

public class P05_HomePage {
    //1- Define the Webdriver
    WebDriver driver;
    //2- Define the constructor and initialize the driver
    public P05_HomePage (WebDriver driver){
        this.driver = driver;
    }
    //3- Define the Locators
    private final By searchField = By.id("small-searchterms");
    private final By searchBtn = By.xpath("//button[@type=\"submit\"]");

    private final By computers = By.xpath("(//div/ul[@class=\"top-menu notmobile\"]/li/a)[@href=\"/computers\"]");
    private final By desktops = By.xpath("//html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a");
    private final By notebooks = By.xpath("//html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a");
    private final By software = By.xpath("//html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[3]/a");
    private final By electronics = By.xpath("(//div/ul[@class=\"top-menu notmobile\"]/li/a)[@href=\"/electronics\"]");
    private final By cameraPhoto = By.xpath("//html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[1]/a");
    private final By cellPhones = By.xpath("///html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[2]/a");
    private final By others = By.xpath("//html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[3]/a");
    private final By apparel = By.xpath("(//div/ul[@class=\"top-menu notmobile\"]/li/a)[@href=\"/apparel\"]");
    private final By shoes = By.xpath("//html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a");
    private final By clothing = By.xpath("//html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[2]/a");
    private final By accessories = By.xpath("//html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[3]/a");
    private final By digitalDownloads = By.xpath("(//div/ul[@class=\"top-menu notmobile\"]/li/a)[@href=\"/digital-downloads\"]");
    private final By books = By.xpath("(//div/ul[@class=\"top-menu notmobile\"]/li/a)[@href=\"/books\"]");
    private final By jewelry = By.xpath("(//div/ul[@class=\"top-menu notmobile\"]/li/a)[@href=\"/jewelry\"]");
    private final By giftCards = By.xpath("(//div/ul[@class=\"top-menu notmobile\"]/li/a)[@href=\"/gift-cards\"]");
    private final By shoppingCart = By.xpath("//li[@id=\"topcartlink\"]/a[@href=\"/cart\"]");
    //4- Define the action Methods
    public P05_HomePage enterSearchKeyword (String searchKeyword){
        driver.findElement(this.searchField).sendKeys(searchKeyword);
        return this;
    }
    public P05_HomePage clickSearchBtn (){
        driver.findElement(this.searchBtn).click();
        return this;
    }
    public P05_HomePage switchCurrency() {
        driver.findElement(By.xpath("//select[@id=\"customerCurrency\"]/option["+generateRandomInt(2)+"]")).click();
        return this;
    }
    public P05_HomePage hoverOnRandomCategory(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//html/body/div[6]/div[2]/ul[1]/li["+generateRandomInt(7)+"]/a"))).build().perform();
        return this;
    }
    public P05_HomePage hoverOnComputers(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(this.computers)).build().perform();
        return this;
    }
    public P05_HomePage selectComputersRandomTag(){
        driver.findElement(By.xpath("//html/body/div[6]/div[2]/ul[1]/li[1]/ul/li["+generateRandomInt(3)+"]/a")).click();
        return this;
    }
    public P05_HomePage hoverOnApparels(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(this.apparel)).build().perform();
        return this;
    }
    public P05_HomePage selectShoesTag(){
        driver.findElement(this.shoes).click();
        return this;
    }
    public P05_HomePage hoverAndClickOnBooks(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(this.books)).build().perform();
        driver.findElement(this.books).click();
        return this;
    }
    public P05_HomePage hoverAndClickOnJewelry(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(this.jewelry)).build().perform();
        driver.findElement(this.jewelry).click();
        return this;
    }
    public P05_HomePage clickShoppingCart (){
        driver.findElement(this.shoppingCart).click();
        return this;
    }
}
